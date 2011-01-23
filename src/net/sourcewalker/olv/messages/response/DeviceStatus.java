package net.sourcewalker.olv.messages.response;

import java.nio.ByteBuffer;

import net.sourcewalker.olv.messages.LiveViewResponse;
import net.sourcewalker.olv.messages.MessageConstants;

public class DeviceStatus extends LiveViewResponse {

    private byte status;

    public byte getStatus() {
        return status;
    }

    public DeviceStatus() {
        super(MessageConstants.MSG_DEVICESTATUS);
    }

    /*
     * (non-Javadoc)
     * @see
     * net.sourcewalker.olv.messages.LiveViewResponse#readData(java.nio.ByteBuffer
     * )
     */
    @Override
    public void readData(ByteBuffer buffer) {
        status = buffer.get();
    }

    /*
     * (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "DeviceStatus = " + status;
    }

}
