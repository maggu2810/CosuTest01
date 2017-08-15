package de.maggu2810.playground.android.cosutest01;

import android.app.Activity;
import android.app.Dialog;
import android.app.Fragment;
import android.app.TaskStackBuilder;
import android.app.assist.AssistContent;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.net.Uri;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ActionMode;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.WindowManager;

import java.util.List;

/**
 * Created by rathgeb on 8/15/17.
 */

public class VerboseActivity extends Activity {
    private final String TAG = "VerboseActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d(TAG, "onCreate: ");
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
        Log.d(TAG, "onCreate: ");
        super.onCreate(savedInstanceState, persistentState);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        Log.d(TAG, "onRestoreInstanceState: ");
        super.onRestoreInstanceState(savedInstanceState);
    }

    @Override
    public void onRestoreInstanceState(Bundle savedInstanceState, PersistableBundle persistentState) {
        Log.d(TAG, "onRestoreInstanceState: ");
        super.onRestoreInstanceState(savedInstanceState, persistentState);
    }

    @Override
    protected void onPostCreate(Bundle savedInstanceState) {
        Log.d(TAG, "onPostCreate: ");
        super.onPostCreate(savedInstanceState);
    }

    @Override
    public void onPostCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
        Log.d(TAG, "onPostCreate: ");
        super.onPostCreate(savedInstanceState, persistentState);
    }

    @Override
    protected void onStart() {
        Log.d(TAG, "onStart: ");
        super.onStart();
    }

    @Override
    protected void onRestart() {
        Log.d(TAG, "onRestart: ");
        super.onRestart();
    }

    @Override
    public void onStateNotSaved() {
        Log.d(TAG, "onStateNotSaved: ");
        super.onStateNotSaved();
    }

    @Override
    protected void onResume() {
        Log.d(TAG, "onResume: ");
        super.onResume();
    }

    @Override
    protected void onPostResume() {
        Log.d(TAG, "onPostResume: ");
        super.onPostResume();
    }

    @Override
    public void onLocalVoiceInteractionStarted() {
        Log.d(TAG, "onLocalVoiceInteractionStarted: ");
        super.onLocalVoiceInteractionStarted();
    }

    @Override
    public void onLocalVoiceInteractionStopped() {
        Log.d(TAG, "onLocalVoiceInteractionStopped: ");
        super.onLocalVoiceInteractionStopped();
    }

    @Override
    protected void onNewIntent(Intent intent) {
        Log.d(TAG, "onNewIntent: ");
        super.onNewIntent(intent);
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        Log.d(TAG, "onSaveInstanceState: ");
        super.onSaveInstanceState(outState);
    }

    @Override
    public void onSaveInstanceState(Bundle outState, PersistableBundle outPersistentState) {
        Log.d(TAG, "onSaveInstanceState: ");
        super.onSaveInstanceState(outState, outPersistentState);
    }

    @Override
    protected void onPause() {
        Log.d(TAG, "onPause: ");
        super.onPause();
    }

    @Override
    protected void onUserLeaveHint() {
        Log.d(TAG, "onUserLeaveHint: ");
        super.onUserLeaveHint();
    }

    @Override
    public boolean onCreateThumbnail(Bitmap outBitmap, Canvas canvas) {
        Log.d(TAG, "onCreateThumbnail: ");
        return super.onCreateThumbnail(outBitmap, canvas);
    }

    @Override
    public CharSequence onCreateDescription() {
        Log.d(TAG, "onCreateDescription: ");
        return super.onCreateDescription();
    }

    @Override
    public void onProvideAssistData(Bundle data) {
        Log.d(TAG, "onProvideAssistData: ");
        super.onProvideAssistData(data);
    }

    @Override
    public void onProvideAssistContent(AssistContent outContent) {
        Log.d(TAG, "onProvideAssistContent: ");
        super.onProvideAssistContent(outContent);
    }

    @Override
    public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> data, Menu menu, int deviceId) {
        Log.d(TAG, "onProvideKeyboardShortcuts: ");
        super.onProvideKeyboardShortcuts(data, menu, deviceId);
    }

    @Override
    protected void onStop() {
        Log.d(TAG, "onStop: ");
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        Log.d(TAG, "onDestroy: ");
        super.onDestroy();
    }

    @Override
    public void onMultiWindowModeChanged(boolean isInMultiWindowMode, Configuration newConfig) {
        Log.d(TAG, "onMultiWindowModeChanged: ");
        super.onMultiWindowModeChanged(isInMultiWindowMode, newConfig);
    }

    @Override
    public void onMultiWindowModeChanged(boolean isInMultiWindowMode) {
        Log.d(TAG, "onMultiWindowModeChanged: ");
        super.onMultiWindowModeChanged(isInMultiWindowMode);
    }

    @Override
    public void onPictureInPictureModeChanged(boolean isInPictureInPictureMode, Configuration newConfig) {
        Log.d(TAG, "onPictureInPictureModeChanged: ");
        super.onPictureInPictureModeChanged(isInPictureInPictureMode, newConfig);
    }

    @Override
    public void onPictureInPictureModeChanged(boolean isInPictureInPictureMode) {
        Log.d(TAG, "onPictureInPictureModeChanged: ");
        super.onPictureInPictureModeChanged(isInPictureInPictureMode);
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        Log.d(TAG, "onConfigurationChanged: ");
        super.onConfigurationChanged(newConfig);
    }

    @Override
    public Object onRetainNonConfigurationInstance() {
        Log.d(TAG, "onRetainNonConfigurationInstance: ");
        return super.onRetainNonConfigurationInstance();
    }

    @Override
    public void onLowMemory() {
        Log.d(TAG, "onLowMemory: ");
        super.onLowMemory();
    }

    @Override
    public void onTrimMemory(int level) {
        Log.d(TAG, "onTrimMemory: ");
        super.onTrimMemory(level);
    }

    @Override
    public void onAttachFragment(Fragment fragment) {
        Log.d(TAG, "onAttachFragment: ");
        super.onAttachFragment(fragment);
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        Log.d(TAG, "onKeyDown: ");
        return super.onKeyDown(keyCode, event);
    }

    @Override
    public boolean onKeyLongPress(int keyCode, KeyEvent event) {
        Log.d(TAG, "onKeyLongPress: ");
        return super.onKeyLongPress(keyCode, event);
    }

    @Override
    public boolean onKeyUp(int keyCode, KeyEvent event) {
        Log.d(TAG, "onKeyUp: ");
        return super.onKeyUp(keyCode, event);
    }

    @Override
    public boolean onKeyMultiple(int keyCode, int repeatCount, KeyEvent event) {
        Log.d(TAG, "onKeyMultiple: ");
        return super.onKeyMultiple(keyCode, repeatCount, event);
    }

    @Override
    public void onBackPressed() {
        Log.d(TAG, "onBackPressed: ");
        super.onBackPressed();
    }

    @Override
    public boolean onKeyShortcut(int keyCode, KeyEvent event) {
        Log.d(TAG, "onKeyShortcut: ");
        return super.onKeyShortcut(keyCode, event);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.d(TAG, "onTouchEvent: ");
        return super.onTouchEvent(event);
    }

    @Override
    public boolean onTrackballEvent(MotionEvent event) {
        Log.d(TAG, "onTrackballEvent: ");
        return super.onTrackballEvent(event);
    }

    @Override
    public boolean onGenericMotionEvent(MotionEvent event) {
        Log.d(TAG, "onGenericMotionEvent: ");
        return super.onGenericMotionEvent(event);
    }

    @Override
    public void onUserInteraction() {
        Log.d(TAG, "onUserInteraction: ");
        super.onUserInteraction();
    }

    @Override
    public void onWindowAttributesChanged(WindowManager.LayoutParams params) {
        Log.d(TAG, "onWindowAttributesChanged: ");
        super.onWindowAttributesChanged(params);
    }

    @Override
    public void onContentChanged() {
        Log.d(TAG, "onContentChanged: ");
        super.onContentChanged();
    }

    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        Log.d(TAG, String.format("onWindowFocusChanged: hasFocus: %b", hasFocus));
        super.onWindowFocusChanged(hasFocus);
    }

    @Override
    public void onAttachedToWindow() {
        Log.d(TAG, "onAttachedToWindow: ");
        super.onAttachedToWindow();
    }

    @Override
    public void onDetachedFromWindow() {
        Log.d(TAG, "onDetachedFromWindow: ");
        super.onDetachedFromWindow();
    }

    @Override
    public View onCreatePanelView(int featureId) {
        Log.d(TAG, "onCreatePanelView: ");
        return super.onCreatePanelView(featureId);
    }

    @Override
    public boolean onCreatePanelMenu(int featureId, Menu menu) {
        Log.d(TAG, "onCreatePanelMenu: ");
        return super.onCreatePanelMenu(featureId, menu);
    }

    @Override
    public boolean onPreparePanel(int featureId, View view, Menu menu) {
        Log.d(TAG, "onPreparePanel: ");
        return super.onPreparePanel(featureId, view, menu);
    }

    @Override
    public boolean onMenuOpened(int featureId, Menu menu) {
        Log.d(TAG, "onMenuOpened: ");
        return super.onMenuOpened(featureId, menu);
    }

    @Override
    public boolean onMenuItemSelected(int featureId, MenuItem item) {
        Log.d(TAG, "onMenuItemSelected: ");
        return super.onMenuItemSelected(featureId, item);
    }

    @Override
    public void onPanelClosed(int featureId, Menu menu) {
        Log.d(TAG, "onPanelClosed: ");
        super.onPanelClosed(featureId, menu);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        Log.d(TAG, "onCreateOptionsMenu: ");
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onPrepareOptionsMenu(Menu menu) {
        Log.d(TAG, "onPrepareOptionsMenu: ");
        return super.onPrepareOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Log.d(TAG, "onOptionsItemSelected: ");
        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onNavigateUp() {
        Log.d(TAG, "onNavigateUp: ");
        return super.onNavigateUp();
    }

    @Override
    public boolean onNavigateUpFromChild(Activity child) {
        Log.d(TAG, "onNavigateUpFromChild: ");
        return super.onNavigateUpFromChild(child);
    }

    @Override
    public void onCreateNavigateUpTaskStack(TaskStackBuilder builder) {
        Log.d(TAG, "onCreateNavigateUpTaskStack: ");
        super.onCreateNavigateUpTaskStack(builder);
    }

    @Override
    public void onPrepareNavigateUpTaskStack(TaskStackBuilder builder) {
        Log.d(TAG, "onPrepareNavigateUpTaskStack: ");
        super.onPrepareNavigateUpTaskStack(builder);
    }

    @Override
    public void onOptionsMenuClosed(Menu menu) {
        Log.d(TAG, "onOptionsMenuClosed: ");
        super.onOptionsMenuClosed(menu);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        Log.d(TAG, "onCreateContextMenu: ");
        super.onCreateContextMenu(menu, v, menuInfo);
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        Log.d(TAG, "onContextItemSelected: ");
        return super.onContextItemSelected(item);
    }

    @Override
    public void onContextMenuClosed(Menu menu) {
        Log.d(TAG, "onContextMenuClosed: ");
        super.onContextMenuClosed(menu);
    }

    @Override
    protected Dialog onCreateDialog(int id) {
        Log.d(TAG, "onCreateDialog: ");
        return super.onCreateDialog(id);
    }

    @Override
    protected Dialog onCreateDialog(int id, Bundle args) {
        Log.d(TAG, "onCreateDialog: ");
        return super.onCreateDialog(id, args);
    }

    @Override
    protected void onPrepareDialog(int id, Dialog dialog) {
        Log.d(TAG, "onPrepareDialog: ");
        super.onPrepareDialog(id, dialog);
    }

    @Override
    protected void onPrepareDialog(int id, Dialog dialog, Bundle args) {
        Log.d(TAG, "onPrepareDialog: ");
        super.onPrepareDialog(id, dialog, args);
    }

    @Override
    public boolean onSearchRequested(SearchEvent searchEvent) {
        Log.d(TAG, "onSearchRequested: ");
        return super.onSearchRequested(searchEvent);
    }

    @Override
    public boolean onSearchRequested() {
        Log.d(TAG, "onSearchRequested: ");
        return super.onSearchRequested();
    }

    @Override
    protected void onApplyThemeResource(Resources.Theme theme, int resid, boolean first) {
        Log.d(TAG, "onApplyThemeResource: ");
        super.onApplyThemeResource(theme, resid, first);
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        Log.d(TAG, "onRequestPermissionsResult: ");
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
    }

    @Override
    public Uri onProvideReferrer() {
        Log.d(TAG, "onProvideReferrer: ");
        return super.onProvideReferrer();
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        Log.d(TAG, "onActivityResult: ");
        super.onActivityResult(requestCode, resultCode, data);
    }

    @Override
    public void onActivityReenter(int resultCode, Intent data) {
        Log.d(TAG, "onActivityReenter: ");
        super.onActivityReenter(resultCode, data);
    }

    @Override
    protected void onTitleChanged(CharSequence title, int color) {
        Log.d(TAG, "onTitleChanged: ");
        super.onTitleChanged(title, color);
    }

    @Override
    protected void onChildTitleChanged(Activity childActivity, CharSequence title) {
        Log.d(TAG, "onChildTitleChanged: ");
        super.onChildTitleChanged(childActivity, title);
    }

    @Override
    public View onCreateView(String name, Context context, AttributeSet attrs) {
        Log.d(TAG, "onCreateView: ");
        return super.onCreateView(name, context, attrs);
    }

    @Override
    public View onCreateView(View parent, String name, Context context, AttributeSet attrs) {
        Log.d(TAG, "onCreateView: ");
        return super.onCreateView(parent, name, context, attrs);
    }

    @Override
    public void onVisibleBehindCanceled() {
        Log.d(TAG, "onVisibleBehindCanceled: ");
        super.onVisibleBehindCanceled();
    }

    @Override
    public void onEnterAnimationComplete() {
        Log.d(TAG, "onEnterAnimationComplete: ");
        super.onEnterAnimationComplete();
    }

    @Override
    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        Log.d(TAG, "onWindowStartingActionMode: ");
        return super.onWindowStartingActionMode(callback);
    }

    @Override
    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int type) {
        Log.d(TAG, "onWindowStartingActionMode: ");
        return super.onWindowStartingActionMode(callback, type);
    }

    @Override
    public void onActionModeStarted(ActionMode mode) {
        Log.d(TAG, "onActionModeStarted: ");
        super.onActionModeStarted(mode);
    }

    @Override
    public void onActionModeFinished(ActionMode mode) {
        Log.d(TAG, "onActionModeFinished: ");
        super.onActionModeFinished(mode);
    }

    @Override
    public void startLockTask() {
        Log.d(TAG, "startLockTask: ");
        super.startLockTask();
    }

    @Override
    public void stopLockTask() {
        Log.d(TAG, "stopLockTask: ");
        super.stopLockTask();
    }

    @Override
    public void showLockTaskEscapeMessage() {
        Log.d(TAG, "showLockTaskEscapeMessage: ");
        super.showLockTaskEscapeMessage();
    }
}
