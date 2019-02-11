package io.onemfive.bitcoin.config;

import java.util.logging.Logger;

/**
 * Configuration parameters based on network in use.
 *
 * @author objectorange
 */
public abstract class Config {

    private static Logger LOG = Logger.getLogger(Config.class.getName());

    protected String[] dnsSeeds;
    protected int[] addrSeeds;

    /**
     *
     * @param networkName Must be one of dev | test | main
     * @return
     */
    public static Config getConfig(String networkName) {
        Config c = null;
        switch (networkName) {
            case "dev": {c = new DevNetConfig();break;}
            case "test": {c = new TestNetConfig();break;}
            case "main": {c = new MainNetConfig();break;}
            default: LOG.severe("Must provide a network name of: dev | test | main");
        }
        return c;
    }

}
