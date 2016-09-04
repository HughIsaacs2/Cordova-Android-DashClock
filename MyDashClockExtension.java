package com.hughisaacs2.cordova.plugins.androiddashclockplugin;

import com.google.android.apps.dashclock.api.DashClockExtension;
import com.google.android.apps.dashclock.api.ExtensionData;

import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.preference.PreferenceManager;

public class MyDashClockExtension extends DashClockExtension {
    private static final String TAG = "MyDashClockExtension";

    @Override
    protected void onUpdateData(int reason) {

        // Publish the extension data update.
        publishUpdate(new ExtensionData()
				.visible(true)
                .icon(R.drawable.icon)
                .status("Acrylic Style")
                .expandedTitle("Acrylic Style Dot Com")
                .expandedBody("Go to our site")
				//.contentDescription("Go to AcrylicStyle.com")
                .clickIntent(new Intent(Intent.ACTION_VIEW, Uri.parse("http://acrylicstyle.com/"))));
    }
}