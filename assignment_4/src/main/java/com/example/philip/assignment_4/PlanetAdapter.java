package com.example.philip.assignment_4;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Philip on 2015-04-23.
 */
public class PlanetAdapter extends ArrayAdapter<Planet> {
    ArrayList<Planet> planetGrid;
    Context c;

    public PlanetAdapter(Context c, ArrayList<Planet> planetGrid){

        super(c, 0, planetGrid );
        this.planetGrid = planetGrid;
        this.c = c;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Log.i("MyListAdapter", "Called for position: " + position);
        LayoutInflater inflater = (LayoutInflater) c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView = inflater.inflate(R.layout.planet_list_item,null);
        Planet p = planetGrid.get(position);
        TextView tv = (TextView) convertView.findViewById(R.id.planet_title);
        ImageView iv = (ImageView) convertView.findViewById(R.id.planet_img);
        tv.setText(p.getPlanetTitle());
        iv.setImageDrawable(p.getImgPlanet());
        return convertView;
    }




}
