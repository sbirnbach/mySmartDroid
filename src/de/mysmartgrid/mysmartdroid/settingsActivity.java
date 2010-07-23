package de.mysmartgrid.mysmartdroid;

import android.app.ListActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.ArrayAdapter;

public class settingsActivity extends ListActivity
{
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);

		setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, new String[] {"Server", "Sensor-ID", "Token"}));

		ListView lv = getListView();
	}
}
