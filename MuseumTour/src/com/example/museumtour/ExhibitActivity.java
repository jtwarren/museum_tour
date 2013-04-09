package com.example.museumtour;

import java.util.HashMap;
import java.util.Map;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.TextView;

public class ExhibitActivity extends Activity {

    String[] shortTitles;
    String[] longTitles;
    String[] textBlobs;
    int[] images;
			
	@Override
	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);

	    // Get the message from the intent
	    Intent intent = getIntent();
	    String exhibitName = intent.getStringExtra("EXHIBIT_NAME");
	    int exhibitIndex = getExhibitIndex(exhibitName);
	    shortTitles = new String[6];
	    longTitles = new String[6];
	    textBlobs = new String[6];
	    images = getExhibitImages(exhibitIndex);
	    Resources res = getResources();
	    String[] allLongTitles = res.getStringArray(R.array.exhibit_names);
	    String[] allShortTitles = res.getStringArray(R.array.short_exhibit_names);
	    String[] allTextBlobs = res.getStringArray(R.array.exhibit_text);
	    for(int i=0; i<6; i++)
	    {
	    	shortTitles[i] = allShortTitles[i+exhibitIndex*6];
	    	longTitles[i] = allLongTitles[i+exhibitIndex*6];
	    	textBlobs[i] = allTextBlobs[i+exhibitIndex*6];
	    }
	    setContentView(R.layout.exhibit);
	    setImagesAndText(images, shortTitles, textBlobs, longTitles);
	}
	
	public int getExhibitIndex(String exhibitName){
		if(exhibitName.toLowerCase().equals("academic"))
		{
			return 0;
		}
		if(exhibitName.toLowerCase().equals("analog"))
		{
			return 1;
		}
		if(exhibitName.toLowerCase().equals("artistic"))
		{
			return 2;
		}
		if(exhibitName.toLowerCase().equals("bionic"))
		{
			return 3;
		}
		if(exhibitName.toLowerCase().equals("boston"))
		{
			return 4;
		}
		if(exhibitName.toLowerCase().equals("broadcasting"))
		{
			return 5;
		}
		if(exhibitName.toLowerCase().equals("entrepreneurship"))
		{
			return 6;
		}
		if(exhibitName.toLowerCase().equals("pioneering"))
		{
			return 7;
		}
		if(exhibitName.toLowerCase().equals("problem"))
		{
			return 8;
		}
		if(exhibitName.toLowerCase().equals("uniquely"))
		{
			return 9;
		}
		return 0;
	}
	
	public int[] getExhibitImages(int exhibitIndex){
		int[] tempImages = new int[6];
		switch(exhibitIndex)
		{
		case 0:
			tempImages[0] = R.drawable.academic0;
			tempImages[1] = R.drawable.academic1;
			tempImages[2] = R.drawable.academic2;
			tempImages[3] = R.drawable.academic3;
			tempImages[4] = R.drawable.academic4;
			tempImages[5] = R.drawable.academic5;
			break;
		case 1:
			tempImages[0] = R.drawable.analog0;
			tempImages[1] = R.drawable.analog1;
			tempImages[2] = R.drawable.analog2;
			tempImages[3] = R.drawable.analog3;
			tempImages[4] = R.drawable.analog4;
			tempImages[5] = R.drawable.analog5;
			break;
		case 2:
			tempImages[0] = R.drawable.artistic0;
			tempImages[1] = R.drawable.artistic1;
			tempImages[2] = R.drawable.artistic2;
			tempImages[3] = R.drawable.artistic3;
			tempImages[4] = R.drawable.artistic4;
			tempImages[5] = R.drawable.artistic5;
			break;
		case 3:
			tempImages[0] = R.drawable.bionic0;
			tempImages[1] = R.drawable.bionic1;
			tempImages[2] = R.drawable.bionic2;
			tempImages[3] = R.drawable.bionic3;
			tempImages[4] = R.drawable.bionic4;
			tempImages[5] = R.drawable.bionic5;
			break;
		case 4:
			tempImages[0] = R.drawable.boston0;
			tempImages[1] = R.drawable.boston1;
			tempImages[2] = R.drawable.boston2;
			tempImages[3] = R.drawable.boston3;
			tempImages[4] = R.drawable.boston4;
			tempImages[5] = R.drawable.boston5;
			break;
		case 5:
			tempImages[0] = R.drawable.broadcasting0;
			tempImages[1] = R.drawable.broadcasting1;
			tempImages[2] = R.drawable.broadcasting2;
			tempImages[3] = R.drawable.broadcasting3;
			tempImages[4] = R.drawable.broadcasting4;
			tempImages[5] = R.drawable.broadcasting5;
			break;
		case 6:
			tempImages[0] = R.drawable.entrepreneurship0;
			tempImages[1] = R.drawable.entrepreneurship1;
			tempImages[2] = R.drawable.entrepreneurship2;
			tempImages[3] = R.drawable.entrepreneurship3;
			tempImages[4] = R.drawable.entrepreneurship4;
			tempImages[5] = R.drawable.entrepreneurship5;
			break;
		case 7:
			tempImages[0] = R.drawable.pioneering0;
			tempImages[1] = R.drawable.pioneering1;
			tempImages[2] = R.drawable.pioneering2;
			tempImages[3] = R.drawable.pioneering3;
			tempImages[4] = R.drawable.pioneering4;
			tempImages[5] = R.drawable.pioneering5;
			break;
		case 8:
			tempImages[0] = R.drawable.problem0;
			tempImages[1] = R.drawable.problem1;
			tempImages[2] = R.drawable.problem2;
			tempImages[3] = R.drawable.problem3;
			tempImages[4] = R.drawable.problem4;
			tempImages[5] = R.drawable.problem5;
			break;
		case 9:
			tempImages[0] = R.drawable.uniquely0;
			tempImages[1] = R.drawable.uniquely1;
			tempImages[2] = R.drawable.uniquely2;
			tempImages[3] = R.drawable.uniquely3;
			tempImages[4] = R.drawable.uniquely4;
			tempImages[5] = R.drawable.uniquely5;
			break;
		default:
			break;
		}
		return tempImages;
	}

	public void setImagesAndText(int[] images, String[] titles, String[] blobs, String[] longTitles)
	{
		ImageButton image0 = (ImageButton)findViewById(R.id.exhibit_image0);
		ImageButton image1 = (ImageButton)findViewById(R.id.exhibit_image1);
		ImageButton image2 = (ImageButton)findViewById(R.id.exhibit_image2);
		ImageButton image3 = (ImageButton)findViewById(R.id.exhibit_image3);
		ImageButton image4 = (ImageButton)findViewById(R.id.exhibit_image4);
		ImageButton image5 = (ImageButton)findViewById(R.id.exhibit_image5);

		TextView title0 = (TextView)findViewById(R.id.exhibit_title0);
		TextView title1 = (TextView)findViewById(R.id.exhibit_title1);
		TextView title2 = (TextView)findViewById(R.id.exhibit_title2);
		TextView title3 = (TextView)findViewById(R.id.exhibit_title3);
		TextView title4 = (TextView)findViewById(R.id.exhibit_title4);
		TextView title5 = (TextView)findViewById(R.id.exhibit_title5);
		
		image0.setImageDrawable(getResources().getDrawable(images[0]));
		attachClickHandler(image0, longTitles[0], blobs[0], images[0]);
		image1.setImageDrawable(getResources().getDrawable(images[1]));
		attachClickHandler(image1, longTitles[1], blobs[1], images[1]);
		image2.setImageDrawable(getResources().getDrawable(images[2]));
		attachClickHandler(image2, longTitles[2], blobs[2], images[2]);
		image3.setImageDrawable(getResources().getDrawable(images[3]));
		attachClickHandler(image3, longTitles[3], blobs[3], images[3]);
		image4.setImageDrawable(getResources().getDrawable(images[4]));
		attachClickHandler(image4, longTitles[4], blobs[4], images[4]);
		image4.setImageDrawable(getResources().getDrawable(images[5]));
		attachClickHandler(image5, longTitles[5], blobs[5], images[5]);

		
		title0.setText(titles[0]);
		title1.setText(titles[1]);
		title2.setText(titles[2]);
		title3.setText(titles[3]);
		title4.setText(titles[4]);
		title4.setText(titles[5]);
	}
	
	public void attachClickHandler(ImageButton button, String title, String text, int image)
	{
		
		final int sendImage = image;
		final String sendTitle = title;
		final String sendText = text;
		button.setOnClickListener(new OnClickListener() {
			 
			@Override
			public void onClick(View arg0) {
				Intent intent = new Intent(ExhibitActivity.this, DetailedActivity.class);
			    intent.putExtra("EXHIBIT_IMAGE", sendImage);
			    intent.putExtra("EXHIBIT_TITLE", sendTitle);
			    intent.putExtra("EXHIBIT_TEXT", sendText);
				startActivity(intent);
				
			}
 
		});
	}
}