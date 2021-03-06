package io.onemfive.bitcoin.packet;

/**
 * Inventory Packet
 *
 * Allows a node to advertise its knowledge of one or more objects.
 * It can be received unsolicited or in reply to {@link GetBlocksPacket}.
 * Maximum 50,000 entries, which is just over 1.8 megabytes
 *
 * @author objectorange
 */
public class InvPacket extends BitcoinPacket {

    public static int MAX_ENTRIES = 50000;

}
