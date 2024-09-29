package com.example.gridview;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomAdapter extends BaseAdapter {

    private Context context;
    private String[] gridStrings;
    private int[] gridImages;

    public CustomAdapter(Context context, String[] gridStrings, int[] gridImages) {
        this.context = context;
        this.gridImages = gridImages;
        this.gridStrings = gridStrings;
    }
    @Override
    public int getCount() {
        return gridStrings.length;
    }

    @Override
    public Object getItem(int position) {
        return this.gridStrings[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.single_grid_item, null);
        }

        TextView textView = convertView.findViewById(R.id.gitem_text);
        ImageView imageView = convertView.findViewById(R.id.gitem_image);
        textView.setText(gridStrings[position]);
        imageView.setImageResource(gridImages[position]);

        return convertView;
    }
}
