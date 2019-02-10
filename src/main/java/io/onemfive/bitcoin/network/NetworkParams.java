package io.onemfive.bitcoin.network;

import io.onemfive.bitcoin.blockchain.BlockChainParameters;

/**
 * TODO: Add Description
 *
 * @author objectorange
 */
abstract class NetworkParams {
    abstract  BlockChainParameters buildParams();
}
