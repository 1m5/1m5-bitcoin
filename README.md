# 1m5-bitcoin
Bitcoin integration via Tor using a Simple Payment Verification (SPV) client.

It's a lightweight client to verify that a transaction is included in the Bitcoin blockchain, 
without downloading the entire blockchain. The client only needs download the block headers, 
which are much smaller than the full blocks. To verify that a transaction is in a block, it requests 
a proof of inclusion, in the form of a Merkle branch.

https://github.com/bitcoinj/bitcoinj would have been a great start except that it makes direct connections via HTTP 
instead of Tor and it also uses a lot of Google and Android code which we prefer to avoid.