package de.mysmartgrid.mysmartdroid;

import android.app.Activity;
import android.widget.TextView;
import android.webkit.WebView;
import android.view.View;
import android.os.Bundle;

public class hourActivity extends Activity
{
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

		WebView wv = new WebView(this);

		wv.getSettings().setJavaScriptEnabled(true);
		setContentView(wv);
		wv.loadUrl("file:///android_asset/flot/examples/basic.html");


    }
}
