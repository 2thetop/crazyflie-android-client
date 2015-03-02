package se.bitcraze.crazyflielib.crtp;

import java.nio.ByteBuffer;

/**
 * Packet used for setting parameter
 */
public class ParameterPacket extends CrtpPacket {

    public static final int PORT = 2;

    private int id;
    private int value;

    /**
     * Create a new parameter packet.
     *
     * @param id
     * @param value
     */
    public ParameterPacket(int id, int value) {
        super(2, PORT);
        this.id = id;
        this.value = value;
    }

    @Override
    protected void serializeData(ByteBuffer buffer) {
        buffer.put((byte) id);
        buffer.put((byte) value);
    }

    @Override
    protected int getDataByteCount() {
        return 2; // id + value
    }
}