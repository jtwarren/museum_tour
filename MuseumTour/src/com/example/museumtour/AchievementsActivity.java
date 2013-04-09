package com.example.museumtour;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.ProgressBar;

public class AchievementsActivity extends Activity {
	ListView achievementsChecklist;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    setContentView(R.layout.achievements);
	    
	    achievementsChecklist = (ListView) findViewById(R.id.achievementsChecklist);
	    achievementsChecklist.setAdapter(new ChecklistAdapter(this));	
	    
	    ProgressBar progressBar = (ProgressBar) findViewById(R.id.progressBar1);
	    int progress = (progressBar.getMax())*(MapActivity.getNumberOfVisitedExhibits())/10;
	    progressBar.setProgress(progress);
	    
	}
	

}
