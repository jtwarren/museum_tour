package com.example.museumtour;

import com.google.zxing.integration.android.IntentIntegrator;
import com.google.zxing.integration.android.IntentResult;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
public class MapActivity extends Activity {
	
	TextView contents=null;

	@Override
	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);

	    // Get the message from the intent
	    Intent intent = getIntent();
	    setContentView(R.layout.map);
	}
	
	public void doScan(View v) {
		(new IntentIntegrator(this)).initiateScan();
	}

	public void onActivityResult(int request, int result, Intent i) {
		IntentResult scan = IntentIntegrator.parseActivityResult(request, result, i);
		String message = scan.getContents();
		
		
		
		Intent intent = new Intent(this, ExhibitActivity.class);
	    intent.putExtra("EXHIBIT_NAME", "bionic");
		startActivity(intent);
	}
}