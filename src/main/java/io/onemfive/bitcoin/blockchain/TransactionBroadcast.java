package io.onemfive.bitcoin.blockchain;

import io.onemfive.bitcoin.packet.RejectPacket;
import io.onemfive.bitcoin.network.Peer;
import io.onemfive.bitcoin.network.PeerDiscovery;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

/**
 * A broadcast of a single transaction to the Bitcoin network.
 * Success is determined by announcements by peers indicating their acceptance.
 * Failure is indicated by receiving an explicit rejection message from a peer
 * or not reaching success within a given time period.
 *
 * @author objectorange
 */
public class TransactionBroadcast {

    private static final Logger log = Logger.getLogger(TransactionBroadcast.class.getName());

    private PeerDiscovery peerDiscovery;
    private Transaction tx;
    // Peers that returned a rejection message regarding this broadcast.
    private Map<Peer, RejectPacket> rejections = new HashMap<>();

}
