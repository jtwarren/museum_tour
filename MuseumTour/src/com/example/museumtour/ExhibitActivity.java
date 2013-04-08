package com.example.museumtour;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class ExhibitActivity extends Activity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);

	    // Get the message from the intent
	    Intent intent = getIntent();
	    setContentView(R.layout.exhibit);
	}
}