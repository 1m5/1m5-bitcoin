package io.onemfive.bitcoin.wallet;

import io.onemfive.bitcoin.Satoshi;
import io.onemfive.bitcoin.blockchain.Transaction;

/**
 * TODO: Add Description
 *
 * @author objectorange
 */
public interface SatoshisReceived {
    void onSatoshisReceived(Wallet wallet, Transaction tx, Satoshi prevBalance, Satoshi newBalance);
}
