package com.example.philip.assignment_4;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class GridFragment extends Fragment {
        public static ArrayList<Planet> planets = new ArrayList<Planet>();


    public GridFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        planets.clear();
        Drawable d = getResources().getDrawable(R.drawable.mercury);
        planets.add(new Planet(getResources().getString(R.string.mercury),d, getResources().getString(R.string.mercuryInfo), getString(R.string.mercuryData)));
        d = getResources().getDrawable(R.drawable.venus);
        planets.add(new Planet(getResources().getString(R.string.venus),d, getResources().getString(R.string.venusInfo), getString(R.string.venusData)));
        d = getResources().getDrawable(R.drawable.the_earth);
        planets.add(new Planet(getResources().getString(R.string.earth),d, getResources().getString(R.string.earthInfo), getResources().getString(R.string.earthData)));
        d = getResources().getDrawable(R.drawable.mars);
        planets.add(new Planet(getResources().getString(R.string.mars),d, getResources().getString(R.string.marsInfo), getString(R.string.marsData)));
        d = getResources().getDrawable(R.drawable.jupiter);
        planets.add(new Planet(getResources().getString(R.string.jupiter),d, getResources().getString(R.string.jupiterInfo), getString(R.string.jupiterData)));
        d = getResources().getDrawable(R.drawable.saturn);
        planets.add(new Planet(getResources().getString(R.string.saturn),d, getResources().getString(R.string.saturnInfo), getString(R.string.saturnData)));
        d = getResources().getDrawable(R.drawable.uranus);
        planets.add(new Planet(getResources().getString(R.string.uranus),d, getResources().getString(R.string.uranusInfo),getString(R.string.uranusData)));
        d = getResources().getDrawable(R.drawable.neptune);
        planets.add(new Planet(getResources().getString(R.string.neptune),d, getResources().getString(R.string.neptuneInfo), getString(R.string.neptuneData)));

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_grid, container,false);
        Log.i("PlanetList", "NumberOfPlanets:" + planets.size());
        PlanetAdapter pa = new PlanetAdapter(getActivity(), planets);
        GridView gv = (GridView)v.findViewById(R.id.gridView);
        gv.setAdapter(pa);
        gv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

            Log.i("FragmentWithList","Clicked on position: "+position);
            FragmentManager fm = getFragmentManager();
            FragmentTransaction fraAct = fm.beginTransaction();
            InfoFragment infoFragment = new InfoFragment();
                Bundle b = new Bundle();
                b.putSerializable("Planet",planets.get(position));
                infoFragment.setArguments(b);

            fraAct.replace(R.id.start_layout,infoFragment);
            fraAct.addToBackStack(null);
            fraAct.commit();

           }

        });
    return v;
    }


}
