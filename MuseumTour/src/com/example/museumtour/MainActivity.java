package com.example.museumtour;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import android.app.Activity;
import android.graphics.drawable.Drawable;
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
	ImageView map;

	TextView contents=null;
	Map<Integer, Integer> exhibitLocationMap = new HashMap<Integer, Integer>();
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		populateMuseumSelectionList(Arrays.asList(museums));
		contents=(TextView)findViewById(R.id.contents);
		loadMaps();
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
		museumSelectionSpinner.setVisibility(View.GONE);
		findViewById(R.id.welcome).setVisibility(View.GONE);
		findViewById(R.id.museumSelection).setVisibility(View.GONE);
		map = (ImageView) findViewById(R.id.map);
		map.setVisibility(1);
		map.setImageResource(R.drawable.map1);
		findViewById(R.id.scanButton).setVisibility(1);
	}
	
	public void changeMap(int exhibit){
		int d = exhibitLocationMap.get(exhibit);
		map.setImageResource(d);
	}
	
	private void loadMaps(){
		exhibitLocationMap.put(1, R.drawable.map1);
		exhibitLocationMap.put(2, R.drawable.map2);
		exhibitLocationMap.put(3, R.drawable.map3);
		exhibitLocationMap.put(4, R.drawable.map4);
		exhibitLocationMap.put(5, R.drawable.map5);
		exhibitLocationMap.put(6, R.drawable.map6);
		exhibitLocationMap.put(7, R.drawable.map7);
		exhibitLocationMap.put(8, R.drawable.map8);
		exhibitLocationMap.put(9, R.drawable.map9);
		exhibitLocationMap.put(10, R.drawable.map10);
	}
	
	int i=1;	//testing
	public void doScan(View v) {
		//(new IntentIntegrator(this)).initiateScan();
		
		///////Testing
		changeMap(i);	
		i+=1;
		////////////
	}
	/*
	public void onActivityResult(int request, int result, Intent i) {
		IntentResult scan=IntentIntegrator.parseActivityResult(request, result, i);

		if (scan!=null) {
//			format.setText(scan.getFormatName());
			contents.setText(scan.getContents());
		}
	}
*/
	
}
