package io.onemfive.bitcoin.network;

import io.onemfive.bitcoin.blockchain.BlockChainParameters;
import io.onemfive.data.BaseMessage;

/**
 * TODO: Add Description
 *
 * @author objectorange
 */
public abstract class BitcoinMessage extends BaseMessage {

    protected byte[] payload;
    protected BitcoinMessage parent;
    protected BlockChainParameters parameters;

}
