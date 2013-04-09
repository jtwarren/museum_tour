package com.example.museumtour;

import java.util.HashMap;
import java.util.Map;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;

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
	    shortTitles = new String[5];
	    longTitles = new String[5];
	    textBlobs = new String[5];
	    images = getExhibitImages(exhibitIndex);
	    Resources res = getResources();
	    String[] allLongTitles = res.getStringArray(R.array.exhibit_names);
	    String[] allShortTitles = res.getStringArray(R.array.short_exhibit_names);
	    String[] allTextBlobs = res.getStringArray(R.array.exhibit_text);
	    for(int i=0; i<5; i++)
	    {
	    	shortTitles[i] = allShortTitles[i+exhibitIndex];
	    	longTitles[i] = allLongTitles[i+exhibitIndex];
	    	textBlobs[i] = allTextBlobs[i+exhibitIndex];
	    }
	    
	    setContentView(R.layout.exhibit);
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
		int[] tempImages = new int[5];
		switch(exhibitIndex)
		{
		case 0:
			tempImages[0] = R.drawable.academic0;
			tempImages[1] = R.drawable.academic1;
			tempImages[2] = R.drawable.academic2;
			tempImages[3] = R.drawable.academic3;
			tempImages[4] = R.drawable.academic4;
			break;
		case 1:
			tempImages[0] = R.drawable.analog0;
			tempImages[1] = R.drawable.analog1;
			tempImages[2] = R.drawable.analog2;
			tempImages[3] = R.drawable.analog3;
			tempImages[4] = R.drawable.analog4;
			break;
		case 2:
			tempImages[0] = R.drawable.artistic0;
			tempImages[1] = R.drawable.artistic1;
			tempImages[2] = R.drawable.artistic2;
			tempImages[3] = R.drawable.artistic3;
			tempImages[4] = R.drawable.artistic4;
			break;
		case 3:
			tempImages[0] = R.drawable.bionic0;
			tempImages[1] = R.drawable.bionic1;
			tempImages[2] = R.drawable.bionic2;
			tempImages[3] = R.drawable.bionic3;
			tempImages[4] = R.drawable.bionic4;
			break;
		case 4:
			tempImages[0] = R.drawable.boston0;
			tempImages[1] = R.drawable.boston1;
			tempImages[2] = R.drawable.boston2;
			tempImages[3] = R.drawable.boston3;
			tempImages[4] = R.drawable.boston4;
			break;
		case 5:
			tempImages[0] = R.drawable.broadcasting0;
			tempImages[1] = R.drawable.broadcasting1;
			tempImages[2] = R.drawable.broadcasting2;
			tempImages[3] = R.drawable.broadcasting3;
			tempImages[4] = R.drawable.broadcasting4;
			break;
		case 6:
			tempImages[0] = R.drawable.entrepreneurship0;
			tempImages[1] = R.drawable.entrepreneurship1;
			tempImages[2] = R.drawable.entrepreneurship2;
			tempImages[3] = R.drawable.entrepreneurship3;
			tempImages[4] = R.drawable.entrepreneurship4;
			break;
		case 7:
			tempImages[0] = R.drawable.pioneering0;
			tempImages[1] = R.drawable.pioneering1;
			tempImages[2] = R.drawable.pioneering2;
			tempImages[3] = R.drawable.pioneering3;
			tempImages[4] = R.drawable.pioneering4;
			break;
		case 8:
			tempImages[0] = R.drawable.problem0;
			tempImages[1] = R.drawable.problem1;
			tempImages[2] = R.drawable.problem2;
			tempImages[3] = R.drawable.problem3;
			tempImages[4] = R.drawable.problem4;
			break;
		case 9:
			tempImages[0] = R.drawable.uniquely0;
			tempImages[1] = R.drawable.uniquely1;
			tempImages[2] = R.drawable.uniquely2;
			tempImages[3] = R.drawable.uniquely3;
			tempImages[4] = R.drawable.uniquely4;
			break;
		default:
			break;
		}
		return tempImages;
	}
}