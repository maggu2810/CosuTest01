package de.maggu2810.playground.android.cosutest01;

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
import android.view.View;
import android.widget.Toast;

public class MainActivity extends VerboseActivity {

    private static final String TAG = "CosuTest01";

    private DevicePolicyManager mDevicePolicyManager;
    private ComponentName mAdminComponentName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mDevicePolicyManager = (DevicePolicyManager) getSystemService(Context.DEVICE_POLICY_SERVICE);
        mAdminComponentName = DeviceAdminReceiver.getComponentName(this);

        //mDevicePolicyManager.clearDeviceOwnerApp(getPackageName());

        if (mDevicePolicyManager.isDeviceOwnerApp(getPackageName())) {
            setDefaultCosuPolicies(true);
        } else {
            Toast.makeText(getApplicationContext(), R.string.not_device_owner, Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    protected void onStart() {
        super.onStart();
        startLockTaskIfPossible();
    }

        @Override
    protected void onResume() {
        super.onResume();
        hideSystemUI();
    }

    private void startLockTaskIfPossible() {
        // Start lock task mode if its not already active
        if (mDevicePolicyManager.isLockTaskPermitted(this.getPackageName())) {
            ActivityManager am = (ActivityManager) getSystemService(Context.ACTIVITY_SERVICE);
            final int lockTaskModeState = am.getLockTaskModeState();
            Log.d(TAG, "startLockTaskIfPossible: current lock task mode state: " + lockTaskModeState);
            if (lockTaskModeState == ActivityManager.LOCK_TASK_MODE_NONE) {
                Log.d(TAG, "startLockTaskIfPossible: start lock task");
                startLockTask();
            }
        }
    }

    private void setDefaultCosuPolicies(boolean active) {
        // set this Activity as a lock task package
        Log.d(TAG, "setDefaultCosuPolicies: set this activity as a lock task package");
        mDevicePolicyManager.setLockTaskPackages(mAdminComponentName, active ? new String[]{getPackageName()} : new String[]{});

        // Disable keyguard and status bar
        Log.d(TAG, "setDefaultCosuPolicies: disable keyguad and status bar");
        mDevicePolicyManager.setKeyguardDisabled(mAdminComponentName, active);
        mDevicePolicyManager.setStatusBarDisabled(mAdminComponentName, active);

        // Enable STAY_ON_WHILE_PLUGGED_IN
        Log.d(TAG, "setDefaultCosuPolicies: enable stay on while plugged in");
        enableStayOnWhilePluggedIn(active);

        IntentFilter intentFilter = new IntentFilter(Intent.ACTION_MAIN);
        intentFilter.addCategory(Intent.CATEGORY_HOME);
        intentFilter.addCategory(Intent.CATEGORY_DEFAULT);

        // set Cosu activity as home intent receiver so that it is started on reboot
        Log.d(TAG, "setDefaultCosuPolicies: set activity as home intent receiver so that it is started on reboot");
        if (active) {
            mDevicePolicyManager.addPersistentPreferredActivity(
                    mAdminComponentName, intentFilter, new ComponentName(
                            getPackageName(), MainActivity.class.getName()));
        } else {
            mDevicePolicyManager.clearPackagePersistentPreferredActivities(
                    mAdminComponentName, getPackageName());
        }

        Log.d(TAG, "setDefaultCosuPolicies: done");
    }

    private void enableStayOnWhilePluggedIn(boolean enabled) {
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
    }

    // This snippet hides the system bars.
    private void hideSystemUI() {
        // Set the IMMERSIVE flag.
        // Set the content to appear under the system bars so that the content
        // doesn't resize when the system bars hide and show.
        getWindow().getDecorView().setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                        | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                        | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION // hide nav bar
                        | View.SYSTEM_UI_FLAG_FULLSCREEN // hide status bar
                        | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY);
    }
}
