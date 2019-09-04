package io.onemfive.bitcoin.vendor;

import io.onemfive.bitcoin.requests.SendRequest;
import org.bitcoinj.core.Coin;
import org.bitcoinj.core.InsufficientMoneyException;
import org.bitcoinj.core.LegacyAddress;
import org.bitcoinj.core.NetworkParameters;
import org.bitcoinj.kits.WalletAppKit;
import org.bitcoinj.params.TestNet3Params;
import org.bitcoinj.wallet.Wallet;

import java.io.File;
import java.util.logging.Logger;

public class BitcoinJ implements BitcoinVendor {

    private Logger LOG = Logger.getLogger(BitcoinJ.class.getName());

    @Override
    public boolean send(SendRequest request) {
        NetworkParameters params = TestNet3Params.get();
        WalletAppKit kit = new WalletAppKit(params, new File("."), "sendrequest");
//        kit.startAsync();
//        kit.awaitRunning();
        Coin btc = Coin.valueOf(request.satoshis);
        LegacyAddress to = LegacyAddress.fromBase58(params, request.base58To);
        try {
            Wallet.SendResult result = kit.wallet().sendCoins(kit.peerGroup(), to, btc);
        } catch (InsufficientMoneyException e) {
            LOG.info("Not enough coins in your wallet.");
            if(e.missing != null) {
                LOG.info("Missing " + e.missing.getValue() + " satoshis are missing (including fees)");
            }
            LOG.info("Send money to: " + kit.wallet().currentReceiveAddress().toString());
        }
        return false;
    }
}
