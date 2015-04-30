package com.example.philip.assignment_4;


import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class InfoFragment extends Fragment {


    public InfoFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_info, container, false);

        Bundle b = getArguments();
        Planet p = (Planet)b.getSerializable("Planet");
        TextView tv_title = (TextView) v.findViewById(R.id.planetTitle);
        tv_title.setText(p.getPlanetTitle());
        TextView tv_data = (TextView) v.findViewById(R.id.planet_data);
        tv_data.setText(p.getPlanetData());
        TextView tv_info = (TextView) v.findViewById(R.id.planet_Info);
        tv_info.setText(p.getPlanetInfo());
        ImageView iv = (ImageView) v.findViewById(R.id.planetImg);
        iv.setImageDrawable(p.getImgPlanet());


        return v;
    }


    public void show(FragmentTransaction ft, String dialog) {

    }
}
