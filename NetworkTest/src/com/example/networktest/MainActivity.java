package com.example.networktest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
			
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	public void downloadFile(View view){
		new Thread(new Runnable(){
			public void run(){
				try {
					URL url = new URL("http://web.mit.edu/21w.789/www/papers/griswold2004.pdf");
					long startTime = System.currentTimeMillis();
					URLConnection connection = url.openConnection();
					connection.setUseCaches(false);
					long downloadStartTime = System.currentTimeMillis();
					BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
					String decodedString;
					while ((decodedString = in.readLine()) != null) {
					}
					in.close();
					long endTime = System.currentTimeMillis();
					long latency = downloadStartTime-startTime;
					long downloadTime = (endTime-downloadStartTime);
					long throughput = 650924*1000/(endTime-downloadStartTime);
					Log.d("download_info", "Latency = " + latency +"ms");
					Log.d("download_info", "Download Time = " + downloadTime + "ms");
					Log.d("download_info", "Throughput = " + throughput + "bytes/s");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}).start();
		
		
		
	}

}
