# 1m5-bitcoin
Bitcoin integration via Tor.
https://github.com/bitcoinj/bitcoinj would have been a great start except that it makes direct connections via HTTP instead of Tor. This will require forking and replacing the HTTP portion with 1M5 routing to the Tor service.
It also uses a lot of Google and Android code which we prefer to avoid.