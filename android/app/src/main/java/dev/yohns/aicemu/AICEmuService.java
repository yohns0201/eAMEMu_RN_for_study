package dev.yohns.aicemu;

import android.nfc.cardemulation.HostNfcFService;
import android.os.Bundle;

public class AICEmuService extends HostNfcFService {
    @Override
    public byte[] processNfcFPacket(byte[] commandPacket, Bundle extras){
        return null;
    }

    @Override
    public void onDeactivated(int reason)
    {
    }
}
