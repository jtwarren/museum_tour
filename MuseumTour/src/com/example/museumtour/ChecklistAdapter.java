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

public class ChecklistAdapter extends BaseAdapter {
	private static LayoutInflater inflater=null;
	private String[] EXHIBIT_NAMES = {"Academic", "Analog", "Artistic", "Bionic", "Boston", "Broadcasting", "Entrepreneurship", "Pioneering", "Problem", "Uniquely"};
	Resources res;
	public ChecklistAdapter(Activity activity) {
        inflater = (LayoutInflater)activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return 10;
	}

	@Override
	public Object getItem(int arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long getItemId(int arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public View getView(int pos, View arg1, ViewGroup arg2) {
		View vi= arg1;
        if(arg1==null)
            vi = inflater.inflate(R.layout.item, null);

        TextView text=(TextView)vi.findViewById(R.id.text);
        ImageView imageView=(ImageView)vi.findViewById(R.id.image);
        if(MapActivity.isVisited(pos)){
        	imageView.setImageResource(R.drawable.check);
        }
        else{
        	imageView.setImageResource(R.drawable.checkbox);
        }
        text.setText(EXHIBIT_NAMES[pos]);
        return vi;
	}
}
