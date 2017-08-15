package de.maggu2810.playground.android.cosutest01;

import android.app.admin.DevicePolicyManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.UserHandle;
import android.util.Log;

public class VerboseDeviceAdminReceiver extends android.app.admin.DeviceAdminReceiver{
    private static final String TAG = "VerboseDAR";

    public VerboseDeviceAdminReceiver () {
        super();
        Log.d(TAG, "VerboseDeviceAdminReceiver: ");
    }

    @Override
    public DevicePolicyManager getManager(Context context) {
        Log.d(TAG, "getManager: ");
        return super.getManager(context);
    }

    @Override
    public ComponentName getWho(Context context) {
        Log.d(TAG, "getWho: ");
        return super.getWho(context);
    }

    @Override
    public void onEnabled(Context context, Intent intent) {
        Log.d(TAG, "onEnabled: ");
        super.onEnabled(context, intent);
    }

    @Override
    public CharSequence onDisableRequested(Context context, Intent intent) {
        Log.d(TAG, "onDisableRequested: ");
        return super.onDisableRequested(context, intent);
    }

    @Override
    public void onDisabled(Context context, Intent intent) {
        Log.d(TAG, "onDisabled: ");
        super.onDisabled(context, intent);
    }

    @Override
    public void onPasswordChanged(Context context, Intent intent) {
        Log.d(TAG, "onPasswordChanged: ");
        super.onPasswordChanged(context, intent);
    }

    @Override
    public void onPasswordChanged(Context context, Intent intent, UserHandle user) {
        Log.d(TAG, "onPasswordChanged: ");
        super.onPasswordChanged(context, intent, user);
    }

    @Override
    public void onPasswordFailed(Context context, Intent intent) {
        Log.d(TAG, "onPasswordFailed: ");
        super.onPasswordFailed(context, intent);
    }

    @Override
    public void onPasswordFailed(Context context, Intent intent, UserHandle user) {
        Log.d(TAG, "onPasswordFailed: ");
        super.onPasswordFailed(context, intent, user);
    }

    @Override
    public void onPasswordSucceeded(Context context, Intent intent) {
        Log.d(TAG, "onPasswordSucceeded: ");
        super.onPasswordSucceeded(context, intent);
    }

    @Override
    public void onPasswordSucceeded(Context context, Intent intent, UserHandle user) {
        Log.d(TAG, "onPasswordSucceeded: ");
        super.onPasswordSucceeded(context, intent, user);
    }

    @Override
    public void onPasswordExpiring(Context context, Intent intent) {
        Log.d(TAG, "onPasswordExpiring: ");
        super.onPasswordExpiring(context, intent);
    }

    @Override
    public void onPasswordExpiring(Context context, Intent intent, UserHandle user) {
        Log.d(TAG, "onPasswordExpiring: ");
        super.onPasswordExpiring(context, intent, user);
    }

    @Override
    public void onProfileProvisioningComplete(Context context, Intent intent) {
        Log.d(TAG, "onProfileProvisioningComplete: ");
        super.onProfileProvisioningComplete(context, intent);
    }

    @Override
    public void onReadyForUserInitialization(Context context, Intent intent) {
        Log.d(TAG, "onReadyForUserInitialization: ");
        super.onReadyForUserInitialization(context, intent);
    }

    @Override
    public void onLockTaskModeEntering(Context context, Intent intent, String pkg) {
        Log.d(TAG, "onLockTaskModeEntering: ");
        super.onLockTaskModeEntering(context, intent, pkg);
    }

    @Override
    public void onLockTaskModeExiting(Context context, Intent intent) {
        Log.d(TAG, "onLockTaskModeExiting: ");
        super.onLockTaskModeExiting(context, intent);
    }

    @Override
    public String onChoosePrivateKeyAlias(Context context, Intent intent, int uid, Uri uri, String alias) {
        Log.d(TAG, "onChoosePrivateKeyAlias: ");
        return super.onChoosePrivateKeyAlias(context, intent, uid, uri, alias);
    }

    @Override
    public void onSystemUpdatePending(Context context, Intent intent, long receivedTime) {
        Log.d(TAG, "onSystemUpdatePending: ");
        super.onSystemUpdatePending(context, intent, receivedTime);
    }

    @Override
    public void onBugreportSharingDeclined(Context context, Intent intent) {
        Log.d(TAG, "onBugreportSharingDeclined: ");
        super.onBugreportSharingDeclined(context, intent);
    }

    @Override
    public void onBugreportShared(Context context, Intent intent, String bugreportHash) {
        Log.d(TAG, "onBugreportShared: ");
        super.onBugreportShared(context, intent, bugreportHash);
    }

    @Override
    public void onBugreportFailed(Context context, Intent intent, int failureCode) {
        Log.d(TAG, "onBugreportFailed: ");
        super.onBugreportFailed(context, intent, failureCode);
    }

    @Override
    public void onSecurityLogsAvailable(Context context, Intent intent) {
        Log.d(TAG, "onSecurityLogsAvailable: ");
        super.onSecurityLogsAvailable(context, intent);
    }

    @Override
    public void onNetworkLogsAvailable(Context context, Intent intent, long batchToken, int networkLogsCount) {
        Log.d(TAG, "onNetworkLogsAvailable: ");
        super.onNetworkLogsAvailable(context, intent, batchToken, networkLogsCount);
    }

    @Override
    public void onUserAdded(Context context, Intent intent, UserHandle newUser) {
        Log.d(TAG, "onUserAdded: ");
        super.onUserAdded(context, intent, newUser);
    }

    @Override
    public void onUserRemoved(Context context, Intent intent, UserHandle removedUser) {
        Log.d(TAG, "onUserRemoved: ");
        super.onUserRemoved(context, intent, removedUser);
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        Log.d(TAG, String.format("onReceive: context: %s, intent: %s", context, intent));
        super.onReceive(context, intent);
    }

}
