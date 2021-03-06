package io.onemfive.bitcoin.packet;

/**
 * A response to a {@link GetDataPacket}, sent if any requested data items could not be relayed,
 * for example, because the requested transaction was not in the memory pool or relay set.
 *
 * @author objectorange
 */
public class NotFoundPacket extends BitcoinPacket {
}
