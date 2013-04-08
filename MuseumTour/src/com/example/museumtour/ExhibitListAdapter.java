package com.example.museumtour;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class ExhibitListAdapter extends BaseAdapter {
    
    private Activity activity;
    private static LayoutInflater inflater=null;
    
    public ExhibitListAdapter(Activity a) {
        activity = a;
        inflater = (LayoutInflater)activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    public int getCount() {
        return 5;
    }

    public Object getItem(int position) {
        return position;
    }

    public long getItemId(int position) {
        return position;
    }
    
    
    public void displayImage(int position, ImageView imageView){
    	
    	imageView.setImageResource(MainActivity.EXHIBIT_IMAGES.get(position));
    }
    
    public View getView(int position, View convertView, ViewGroup parent) {
    	
        View vi = convertView;
        if(convertView==null)
            vi = inflater.inflate(R.layout.item, null);

        TextView text=(TextView)vi.findViewById(R.id.text);;
        ImageView image=(ImageView)vi.findViewById(R.id.image);
        text.setText(MainActivity.EXHIBIT_NAMES[position]);
        displayImage(position, image);
        return vi;
    }
}