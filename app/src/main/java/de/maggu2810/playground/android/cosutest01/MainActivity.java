package de.maggu2810.playground.android.cosutest01;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.admin.DevicePolicyManager;
import android.app.admin.SystemUpdatePolicy;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.BatteryManager;
import android.os.Bundle;
import android.os.UserManager;
import android.provider.Settings;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends Activity {

    private static final String TAG = "CosuTest01";

    private DevicePolicyManager mDevicePolicyManager;
    private ComponentName mAdminComponentName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d(TAG, "onCreate: ...");
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        Log.d(TAG, "onCreate: request device policy manager");
        mDevicePolicyManager = (DevicePolicyManager) getSystemService(Context.DEVICE_POLICY_SERVICE);
        Log.d(TAG, "onCreate: request device policy manager: " + mDevicePolicyManager);

        // Set Default COSU policy
        Log.d(TAG, "onCreate: take admin component name");
        mAdminComponentName = DeviceAdminReceiver.getComponentName(this);
        Log.d(TAG, "onCreate: take admin component name: " + mAdminComponentName);

        Log.d(TAG, "onCreate: am I a device owner app?");
        if (mDevicePolicyManager.isDeviceOwnerApp(getPackageName())) {
            Log.d(TAG, "onCreate: set default cosu policies");
            setDefaultCosuPolicies(true);
        } else {
            Log.d(TAG, "onCreate: not device owner");
            Toast.makeText(getApplicationContext(), R.string.not_device_owner, Toast.LENGTH_SHORT).show();
        }

        Log.d(TAG, "onCreate: done");
    }

    @Override
    protected void onResume() {
        Log.d(TAG, "onResume: ...");
        super.onResume();
        Log.d(TAG, "onResume: done");
    }


    @Override
    protected void onStart() {
        Log.d(TAG, "onStart: ...");
        super.onStart();

        // Start lock task mode if its not already active
        if (mDevicePolicyManager.isLockTaskPermitted(this.getPackageName())) {
            ActivityManager am = (ActivityManager) getSystemService(Context.ACTIVITY_SERVICE);
            if (am.getLockTaskModeState() == ActivityManager.LOCK_TASK_MODE_NONE) {
                startLockTask();
            }
        }
        Log.d(TAG, "onStart: done");
    }

    @Override
    public void onBackPressed() {
        // nothing to do here
        // … really
    }

    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        Log.d(TAG, "onWindowFocusChanged: ...");
        super.onWindowFocusChanged(hasFocus);
        Log.d(TAG, "onWindowFocusChanged: done");
    }

    private void setDefaultCosuPolicies(boolean active) {
        // Set user restrictions
        Log.d(TAG, "setDefaultCosuPolicies: set user restrictions");
        setUserRestriction(UserManager.DISALLOW_SAFE_BOOT, active);
        setUserRestriction(UserManager.DISALLOW_FACTORY_RESET, active);
        setUserRestriction(UserManager.DISALLOW_ADD_USER, active);
        setUserRestriction(UserManager.DISALLOW_MOUNT_PHYSICAL_MEDIA, active);
        setUserRestriction(UserManager.DISALLOW_ADJUST_VOLUME, active);

        // Disable keyguard and status bar
        Log.d(TAG, "setDefaultCosuPolicies: disable keyguad and status bar");
        mDevicePolicyManager.setKeyguardDisabled(mAdminComponentName, active);
        mDevicePolicyManager.setStatusBarDisabled(mAdminComponentName, active);

        // Enable STAY_ON_WHILE_PLUGGED_IN
        Log.d(TAG, "setDefaultCosuPolicies: enable stay on while plugged in");
        enableStayOnWhilePluggedIn(active);

        // Set system update policy
        Log.d(TAG, "setDefaultCosuPolicies: set system update policy");
        if (active) {
            mDevicePolicyManager.setSystemUpdatePolicy(mAdminComponentName,
                    SystemUpdatePolicy.createWindowedInstallPolicy(60, 120));
        } else {
            mDevicePolicyManager.setSystemUpdatePolicy(mAdminComponentName,
                    null);
        }

        // set this Activity as a lock task package
        Log.d(TAG, "setDefaultCosuPolicies: set this activity as a lock task package");
        mDevicePolicyManager.setLockTaskPackages(mAdminComponentName,
                active ? new String[]{getPackageName()} : new String[]{});

        IntentFilter intentFilter = new IntentFilter(Intent.ACTION_MAIN);
        intentFilter.addCategory(Intent.CATEGORY_HOME);
        intentFilter.addCategory(Intent.CATEGORY_DEFAULT);

        Log.d(TAG, "setDefaultCosuPolicies: check preferred activities");
        if (active) {
            // set Cosu activity as home intent receiver so that it is started on reboot
            mDevicePolicyManager.addPersistentPreferredActivity(mAdminComponentName, intentFilter, new ComponentName(getPackageName(), MainActivity.class.getName()));
        } else {
            mDevicePolicyManager.clearPackagePersistentPreferredActivities(mAdminComponentName, getPackageName());
        }

        Log.d(TAG, "setDefaultCosuPolicies: done");
    }

    private void setUserRestriction(String restriction, boolean disallow) {
        Log.d(TAG, String.format("setUserRestriction: %s, %b", restriction, disallow));
        if (disallow) {
            mDevicePolicyManager.addUserRestriction(mAdminComponentName,
                    restriction);
        } else {
            mDevicePolicyManager.clearUserRestriction(mAdminComponentName,
                    restriction);
        }
        Log.d(TAG, "setUserRestriction: done");
    }

    private void enableStayOnWhilePluggedIn(boolean enabled) {
        Log.d(TAG, "enableStayOnWhilePluggedIn: ... " + enabled);
        if (enabled) {
            mDevicePolicyManager.setGlobalSetting(
                    mAdminComponentName,
                    Settings.Global.STAY_ON_WHILE_PLUGGED_IN,
                    Integer.toString(BatteryManager.BATTERY_PLUGGED_AC
                            | BatteryManager.BATTERY_PLUGGED_USB
                            | BatteryManager.BATTERY_PLUGGED_WIRELESS));
        } else {
            mDevicePolicyManager.setGlobalSetting(
                    mAdminComponentName,
                    Settings.Global.STAY_ON_WHILE_PLUGGED_IN,
                    "0"
            );
        }
        Log.d(TAG, "enableStayOnWhilePluggedIn: done");
    }
}
