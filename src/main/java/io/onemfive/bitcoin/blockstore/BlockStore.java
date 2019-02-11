package io.onemfive.bitcoin.blockstore;

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
}
