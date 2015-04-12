package com.example.philip.assignment2;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;


public class MenuFragment extends Fragment {


    public MenuFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_menu, container, false);
        ImageButton mImgButton = (ImageButton) view.findViewById(R.id.journey_img);
        mImgButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                FragmentManager fm = getFragmentManager();
                FragmentTransaction fraAct = fm.beginTransaction();
                Reseplaneraren rp = new Reseplaneraren();
                fraAct.replace(R.id.menu_layout, rp);
                fraAct.commit();
            }
        });
        return view;
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.i("onStart", "Started");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.i("onResume", "Resumed");

        ColorDrawable colorDrawable = new ColorDrawable(Color.parseColor("#FF0000"));

        ((SkaneTrafikenAPP) getActivity()).setTitle("Skånetrafiken");
        ((SkaneTrafikenAPP) getActivity()).setBackgroundDrawable(colorDrawable);

    }

    @Override
    public void onPause() {
        super.onPause();
        Log.i("onPause", "Paused");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.i("onDestroy", "Destroyed");
    }

}
