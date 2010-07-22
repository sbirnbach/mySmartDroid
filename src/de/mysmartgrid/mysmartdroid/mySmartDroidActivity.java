package de.mysmartgrid.mysmartdroid;

import android.app.Activity;
import android.app.TabActivity;
import android.content.Intent;
import android.widget.TabHost;
import android.os.Bundle;

public class mySmartDroidActivity extends TabActivity
{
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

		TabHost tabhost = getTabHost();
		TabHost.TabSpec spec;
		Intent intent;

		intent = new Intent().setClass(this, hourActivity.class);
		spec = tabhost.newTabSpec("hour").setIndicator("hour").setContent(intent);

		tabhost.addTab(spec);

		intent = new Intent().setClass(this, dayActivity.class);
		spec = tabhost.newTabSpec("day").setIndicator("day").setContent(intent);

		tabhost.addTab(spec);

		intent = new Intent().setClass(this, monthActivity.class);
		spec = tabhost.newTabSpec("month").setIndicator("month").setContent(intent);

		tabhost.addTab(spec);

		intent = new Intent().setClass(this, yearActivity.class);
		spec = tabhost.newTabSpec("year").setIndicator("year").setContent(intent);

		tabhost.addTab(spec);

		intent = new Intent().setClass(this, nightActivity.class);
		spec = tabhost.newTabSpec("night").setIndicator("night").setContent(intent);

		tabhost.addTab(spec);

		tabhost.setCurrentTabByTag("hour");

    }
}
