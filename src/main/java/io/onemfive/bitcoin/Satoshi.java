package io.onemfive.bitcoin;

import io.onemfive.data.currency.Coin;

/**
 * TODO: Add Description
 *
 * @author objectorange
 */
public class Satoshi implements Coin {

    private long value = 0L;

    @Override
    public boolean limitedSupply() {
        return true;
    }

    /**
     * 2.1 Quadrillion Satoshis (21 Million Bitcoin)
     * @return long max supply
     */
    @Override
    public long maxSupply() {
        return 2100000000000000L;
    }

    @Override
    public long value() {
        return value;
    }

    @Override
    public String symbol() {
        return "里";
    }

    public Satoshi(long value) {
        this.value = value;
    }
}
