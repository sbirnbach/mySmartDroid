package de.mysmartgrid.mysmartdroid;

import android.app.Activity;
import android.widget.TextView;
import android.os.Bundle;

public class monthActivity extends Activity
{
		/** Called when the activity is first created. */
		@Override
		public void onCreate(Bundle savedInstanceState)
		{
				super.onCreate(savedInstanceState);

				TextView textview = new TextView(this);
				textview.setText("This is the month tab.");
				setContentView(textview);
		}
}
