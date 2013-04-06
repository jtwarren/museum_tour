package com.example.museumtour;

import java.util.Arrays;
import java.util.List;

import com.google.zxing.integration.android.IntentIntegrator;
import com.google.zxing.integration.android.IntentResult;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends Activity {
	Spinner museumSelectionSpinner;
	String[] museums = {"MIT Museum"};
	TextView contents=null;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		populateMuseumSelectionList(Arrays.asList(museums));
		contents=(TextView)findViewById(R.id.contents);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	public void populateMuseumSelectionList(List<String> museums) {
		 
		museumSelectionSpinner = (Spinner) findViewById(R.id.museumSelectionSpinner);
		
		ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this,
			android.R.layout.simple_spinner_item, museums);
		dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		museumSelectionSpinner.setAdapter(dataAdapter);
	  }
	
	public void beginTour(View view){
		museumSelectionSpinner.setVisibility(0);
		findViewById(R.id.welcome).setVisibility(0);
		findViewById(R.id.museumSelection).setVisibility(0);
		findViewById(R.id.map).setVisibility(1);


	}
	
	public void doScan(View v) {
		(new IntentIntegrator(this)).initiateScan();
	}
	
	public void onActivityResult(int request, int result, Intent i) {
		IntentResult scan=IntentIntegrator.parseActivityResult(request, result, i);

		if (scan!=null) {
//			format.setText(scan.getFormatName());
			contents.setText(scan.getContents());
		}
	}

}
