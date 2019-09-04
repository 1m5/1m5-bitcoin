package io.onemfive.bitcoin.vendor;

import io.onemfive.bitcoin.requests.SendRequest;

public interface BitcoinVendor {
    boolean send(SendRequest request);
}
