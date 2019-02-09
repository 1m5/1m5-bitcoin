package io.onemfive.bitcoin;

import io.onemfive.bitcoin.blockstore.SPVBlockStore;
import io.onemfive.bitcoin.blockchain.SPVBlockChain;
import io.onemfive.bitcoin.network.PeerGroup;
import io.onemfive.bitcoin.wallet.Wallet;
import io.onemfive.core.BaseService;
import io.onemfive.data.Envelope;
import io.onemfive.data.Route;

import java.util.Properties;
import java.util.logging.Logger;

/**
 * TODO: Add Description
 *
 * @author objectorange
 */
public class BitcoinService extends BaseService {

    private static final Logger LOG = Logger.getLogger(BitcoinService.class.getName());

    public static final String OPERATION_SEND = "SEND";

    private SPVBlockChain blockChain;
    private SPVBlockStore blockStore;
    private PeerGroup peerGroup;
    private Wallet wallet;

    @Override
    public void handleDocument(Envelope e) {
        Route route = e.getRoute();
        String operation = route.getOperation();
        switch(operation) {
            case OPERATION_SEND: {
                send(e);
                break;
            }
            default: deadLetter(e); // Operation not supported
        }
    }

    private void send(Envelope e) {

    }

    @Override
    public boolean start(Properties properties) {


        return true;
    }

    @Override
    public boolean shutdown() {


        return true;
    }

    @Override
    public boolean gracefulShutdown() {


        return true;
    }
}
