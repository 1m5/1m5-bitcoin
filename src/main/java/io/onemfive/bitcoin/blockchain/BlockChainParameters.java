package io.onemfive.bitcoin.blockchain;

import io.onemfive.bitcoin.network.DevNetParams;
import io.onemfive.bitcoin.network.MainNetParams;
import io.onemfive.bitcoin.network.TestNetParams;

/**
 * TODO: Add Description
 *
 * @author objectorange
 */
public class BlockChainParameters {

    public static BlockChainParameters buildParams(String name) {
        if("main".equals(name)) {
            return new MainNetParams().buildParams();
        } else if("test".equals(name)) {
            return new TestNetParams().buildParams();
        } else {
            return new DevNetParams().buildParams();
        }
    }
}
