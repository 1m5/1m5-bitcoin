# 1m5-bitcoin
A censorship resistant and private Simple Payment Verification (SPV) client for Bitcoin.

It uses Tor for accessing the Bitcoin blockchain until blocked then sidesteps blocks using
I2P to get to a 1M5 node that has access to Tor using that node.

It's a lightweight client to verify that a transaction is included in the Bitcoin blockchain, 
without downloading the entire blockchain. The client only needs to download the block headers, 
which are much smaller than the full blocks. To verify that a transaction is in a block, it requests 
a proof of inclusion, in the form of a Merkle branch.

https://github.com/bitcoinj/bitcoinj would have been a great start except that it makes direct connections via HTTP 
instead of Tor and it also uses a lot of Google and Android code which we prefer to avoid.