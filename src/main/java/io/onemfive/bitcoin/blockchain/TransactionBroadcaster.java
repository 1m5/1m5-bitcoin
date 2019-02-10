package io.onemfive.bitcoin.blockchain;

/**
 * TODO: Add Description
 *
 * @author objectorange
 */
public interface TransactionBroadcaster {
    TransactionBroadcast broadcastTransaction(final Transaction tx);
}
