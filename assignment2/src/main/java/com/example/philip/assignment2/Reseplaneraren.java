package com.example.philip.assignment2;


import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Reseplaneraren extends Fragment {

    public Reseplaneraren() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_reseplaneraren, container, false);
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

        ((SkaneTrafikenAPP) getActivity()).setTitle("Reseplaneraren");
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
