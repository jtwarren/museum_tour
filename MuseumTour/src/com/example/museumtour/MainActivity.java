package com.example.museumtour;

import java.util.Arrays;
import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;

public class MainActivity extends Activity {
	Spinner museumSelectionSpinner;
	String[] museums = {"MIT Museum"};
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		populateMuseumSelectionList(Arrays.asList(museums));
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

}
