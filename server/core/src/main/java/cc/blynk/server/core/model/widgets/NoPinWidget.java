package cc.blynk.server.core.model.widgets;

import cc.blynk.server.core.model.enums.PinType;
import io.netty.channel.Channel;

/**
 * The Blynk Project.
 * Created by Dmitriy Dumanskiy.
 * Created on 21.04.16.
 */
public abstract class NoPinWidget extends Widget {

    @Override
    public void updateIfSame(byte pin, PinType type, String values) {

    }

    @Override
    public boolean isSame(byte pin, PinType type) {
        return false;
    }

    @Override
    public String getJsonValue() {
        return null;
    }

    @Override
    public void sendSyncOnActivate(Channel appChannel, int dashId) {
    }

    @Override
    public String getModeType() {
        return null;
    }

    @Override
    public String getValue(byte pin, PinType type) {
        return null;
    }

    @Override
    public boolean hasValue(String searchValue) {
        return false;
    }
}
