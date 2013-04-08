package com.example.museumtour;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.zxing.integration.android.IntentIntegrator;
import com.google.zxing.integration.android.IntentResult;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;

public class HomeActivity extends Activity {
	Spinner museumSelectionSpinner;
	String[] museums = {"MIT Museum"};
	ImageView map;
	ListView list;
    ExhibitListAdapter adapter;
	TextView contents=null;
	Map<Integer, Integer> CURRENT_LOCATION_MAP = new HashMap<Integer, Integer>();
	static Map<Integer, Integer> EXHIBIT_IMAGES = new HashMap<Integer, Integer>();
	Resources res;
	static String[] EXHIBIT_TEXT;
	static String[] EXHIBIT_NAMES;
	static String[] SHORT_EXHIBIT_NAMES;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.home);
		
//		populateMuseumSelectionList(Arrays.asList(museums));
//		contents=(TextView)findViewById(R.id.contents);
//		res = getResources();
//		
//		
//		list=(ListView)findViewById(R.id.listView1);
//        adapter=new ExhibitListAdapter(this);
//        list.setAdapter(adapter);
//        list.setClickable(true);
//        
//        EXHIBIT_TEXT = res.getStringArray(R.array.exhibit_text);
//        EXHIBIT_NAMES = res.getStringArray(R.array.exhibit_names);
//        SHORT_EXHIBIT_NAMES = res.getStringArray(R.array.short_exhibit_names);
//        loadData();
        
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
//	public void populateMuseumSelectionList(List<String> museums) {
//		 
//		museumSelectionSpinner = (Spinner) findViewById(R.id.museumSelectionSpinner);
//		
//		ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this,
//			android.R.layout.simple_spinner_item, museums);
//		dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//		museumSelectionSpinner.setAdapter(dataAdapter);
//	  }
//	
	public void beginTour(View view){
		Intent intent = new Intent(this, MapActivity.class);
		startActivity(intent);
	}
//	
//	public void loadMap(int exhibit){
//		int d = CURRENT_LOCATION_MAP.get(exhibit);
//		map.setImageResource(d);
//	}
//	
//	private void loadData(){
//		CURRENT_LOCATION_MAP.put(1, R.drawable.map1);
//		CURRENT_LOCATION_MAP.put(2, R.drawable.map2);
//		CURRENT_LOCATION_MAP.put(3, R.drawable.map3);
//		CURRENT_LOCATION_MAP.put(4, R.drawable.map4);
//		CURRENT_LOCATION_MAP.put(5, R.drawable.map5);
//		CURRENT_LOCATION_MAP.put(6, R.drawable.map6);
//		CURRENT_LOCATION_MAP.put(7, R.drawable.map7);
//		CURRENT_LOCATION_MAP.put(8, R.drawable.map8);
//		CURRENT_LOCATION_MAP.put(9, R.drawable.map9);
//		CURRENT_LOCATION_MAP.put(10, R.drawable.map10);
//		EXHIBIT_IMAGES.put(0, R.drawable.academic0);
//		EXHIBIT_IMAGES.put(1, R.drawable.academic1);
//		EXHIBIT_IMAGES.put(2, R.drawable.academic2);
//		EXHIBIT_IMAGES.put(3, R.drawable.academic3);
//		EXHIBIT_IMAGES.put(4, R.drawable.academic4);
//		
//		
//		list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//	          @Override
//	          public void onItemClick(AdapterView<?> arg0, View arg1, int position, long arg3) {
//	        	  
//	        	  TextView exhibitInfo = (TextView) findViewById(R.id.exhibitInfo);
//	        	  exhibitInfo.setText(EXHIBIT_TEXT[position]);
//	        	  exhibitInfo.setMovementMethod(new ScrollingMovementMethod());
//	        	  
//	        	  ImageView exhibitPic = (ImageView) findViewById(R.id.exhibitPic);
//	        	  exhibitPic.setImageResource(EXHIBIT_IMAGES.get(position));
//	        	  
//	        	  TextView exhibitTitle = (TextView) findViewById(R.id.exhibitTitle);
//	        	  exhibitTitle.setText(EXHIBIT_NAMES[position]);
//	        	  
//	        	  ListView list = (ListView) findViewById(R.id.listView1);
//	        	  
//	        	  list.setVisibility(View.GONE);
//	        	  exhibitInfo.setVisibility(1);
//	        	  exhibitPic.setVisibility(1);
//	        	  exhibitTitle.setVisibility(1);
//	        	  
//	          }
//	        });
//
//	}
	
}
