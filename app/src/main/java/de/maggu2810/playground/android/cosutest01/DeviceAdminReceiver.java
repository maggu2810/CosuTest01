package de.maggu2810.playground.android.cosutest01;

import android.content.ComponentName;
import android.content.Context;

// Handles events related to managed profiles and devices
public class DeviceAdminReceiver extends VerboseDeviceAdminReceiver {
    private static final String TAG = "DeviceAdminReceiver";

    public static ComponentName getComponentName(Context context) {
        return new ComponentName(context.getApplicationContext(), DeviceAdminReceiver.class);
    }

}
