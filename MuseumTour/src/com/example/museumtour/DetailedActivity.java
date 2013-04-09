package com.example.museumtour;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailedActivity extends Activity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);

	    // Get the message from the intent
	    Intent intent = getIntent();
	    int image = intent.getIntExtra("EXHIBIT_IMAGE", -1);
	    String title = intent.getStringExtra("EXHIBIT_TITLE");
	    String text = intent.getStringExtra("EXHIBIT_TEXT");
	    setContentView(R.layout.detailed);
	    setImage(image);
	    setTitle(title);
	    setText(text);
	    
	}
	public void setImage(int image){
		ImageView imageView = (ImageView)findViewById(R.id.exhibit_image);
		imageView.setImageDrawable(getResources().getDrawable(image));
	}
	
	public void setTitle(String title){
		TextView titleView = (TextView)findViewById(R.id.exhibit_title);
		titleView.setText(title);
	}
	
	public void setText(String text){
		TextView textView = (TextView)findViewById(R.id.exhibit_text);
		textView.setText(text);
	}

}