package com.example.museumtour;

import com.google.zxing.integration.android.IntentIntegrator;
import com.google.zxing.integration.android.IntentResult;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
public class MapActivity extends Activity {
	
	TextView contents=null;

	@Override
	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);

	    // Get the message from the intent
	    Intent intent = getIntent();
	    setContentView(R.layout.map);
	    contents=(TextView)findViewById(R.id.contents);
	}
	
	public void doScan(View v) {
		(new IntentIntegrator(this)).initiateScan();
	}

	public void onActivityResult(int request, int result, Intent i) {
		IntentResult scan = IntentIntegrator.parseActivityResult(request, result, i);
		String message = scan.getContents();
		String exhibitName = urlToName(message);
		
		if (exhibitName.equals("error")) {
			return;
		}
		
		setMap(exhibitName);

		Intent intent = new Intent(this, ExhibitActivity.class);
	    intent.putExtra("EXHIBIT_NAME", exhibitName);
		startActivity(intent);
	}
	
	public String urlToName(String url) {
		if (url.equals("http://museum.mit.edu/150exhibit/003")) {
			return "boston";
		}
		if (url.equals("http://museum.mit.edu/150exhibit/053")) {
			return "uniquely";
		}
		if (url.equals("http://museum.mit.edu/150exhibit/101")) {
			return "artistic";
		}
		if (url.equals("http://museum.mit.edu/150exhibit/085")) {
			return "entrepreneurship";
		}
		if (url.equals("http://museum.mit.edu/150exhibit/045")) {
			return "academic";
		}
		if (url.equals("http://museum.mit.edu/150exhibit/39")) {
			return "broadcasting";
		}
		if (url.equals("http://museum.mit.edu/150exhibit/015")) {
			return "bionic";
		}
		if (url.equals("http://museum.mit.edu/150exhibit/141")) {
			return "pioneering";
		}
		if (url.equals("http://museum.mit.edu/150exhibit/150")) {
			return "problem";
		}
		if (url.equals("http://museum.mit.edu/150exhibit/020")) {
			return "analog";
		}
		return "error";
	}
	
	public void setMap(String exhibit) {
		ImageView map = (ImageView)findViewById(R.id.map);
		if (exhibit.equals("academic")) {
			map.setImageDrawable(getResources().getDrawable(R.drawable.map_academic));
		}
		if (exhibit.equals("analog")) {
			map.setImageDrawable(getResources().getDrawable(R.drawable.map_analog));
		}
		if (exhibit.equals("artistic")) {
			map.setImageDrawable(getResources().getDrawable(R.drawable.map_artistic));
		}
		if (exhibit.equals("bionic")) {
			map.setImageDrawable(getResources().getDrawable(R.drawable.map_bionic));
		}
		if (exhibit.equals("boston")) {
			map.setImageDrawable(getResources().getDrawable(R.drawable.map_boston));
		}
		if (exhibit.equals("broadcasting")) {
			map.setImageDrawable(getResources().getDrawable(R.drawable.map_broadcasting));
		}
		if (exhibit.equals("entrepreneurship")) {
			map.setImageDrawable(getResources().getDrawable(R.drawable.map_entrepreneurship));
		}
		if (exhibit.equals("pioneering")) {
			map.setImageDrawable(getResources().getDrawable(R.drawable.map_pioneering));
		}
		if (exhibit.equals("problem")) {
			map.setImageDrawable(getResources().getDrawable(R.drawable.map_problem));
		}
		if (exhibit.equals("uniquely")) {
			map.setImageDrawable(getResources().getDrawable(R.drawable.map_uniquely));
		}
	}
}