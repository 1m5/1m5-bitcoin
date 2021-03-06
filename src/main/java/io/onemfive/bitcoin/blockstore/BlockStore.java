package io.onemfive.bitcoin.blockstore;

import io.onemfive.bitcoin.blockchain.StoredBlock;
import io.onemfive.data.Hash;

/**
 * Persists StoredBlock objects to disk.
 * MemoryBlockStore is only used for testing.
 *
 * A BlockStore is a map of hashes to StoredBlock. The hash is the double digest of the Bitcoin serialization
 * of the block header, <b>not</b> the header with the extra data as well.<p>
 *
 * BlockStores are thread safe.
 *
 * @author objectorange
 */
public abstract class BlockStore {

//    protected NetworkParameters params;

    /**
     * Saves the given block header+extra data. The key isn't specified explicitly as it can be calculated from the
     * StoredBlock directly. Can throw if there is a problem with the underlying storage layer such as running out of
     * disk space.
     */
    public void put(StoredBlock block) {

    };

    /**
     * Returns the StoredBlock given a hash. The returned values block.getHash() method will be equal to the
     * parameter. If no such block is found, returns null.
     */
    public StoredBlock get(Hash hash) {
        StoredBlock sb = null;

        return sb;
    };

    /**
     * Returns the {@link StoredBlock} that represents the top of the chain of greatest total work. Note that this
     * can be arbitrarily expensive, you probably should use {@link BlockChain#getChainHead()}
     * or perhaps {@link BlockChain#getBestChainHeight()} which will run in constant time and
     * not take any heavyweight locks.
     */
    public StoredBlock getChainHead() {
        StoredBlock ch = null;

        return ch;
    };

    /**
     * Sets the {@link StoredBlock} that represents the top of the chain of greatest total work.
     */
    public void setChainHead(StoredBlock chainHead) {

    };

    /** Closes the store. */
    public void close() {

    };

    /**
     * Get the {@link NetworkParameters} of this store.
     * @return The network params.
     */
//    public NetworkParameters getParams() {
//        return params;
//    }
}
