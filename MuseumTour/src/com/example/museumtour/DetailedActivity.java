package com.example.museumtour;

public class DetailedActivity extends Activity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);

	    // Get the message from the intent
	    Intent intent = getIntent();
	    setContentView(R.layout.detailed);
	}
	

}