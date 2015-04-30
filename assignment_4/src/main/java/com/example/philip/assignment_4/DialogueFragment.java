package com.example.philip.assignment_4;


import android.app.Fragment;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 */
public class DialogueFragment extends DialogFragment implements View.OnClickListener {


    public DialogueFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_dialog, container, false);

        TextView tv1 = (TextView) v.findViewById(R.id.dialog_title);
        TextView tv2 = (TextView) v.findViewById(R.id.dialog_text);
        ImageView iv = (ImageView) v.findViewById(R.id.dialog_image);

        v.setOnClickListener(this);
        tv1.setOnClickListener(this);
        tv2.setOnClickListener(this);
        iv.setOnClickListener(this);


        return v;
    }

    @Override
    public void onClick(View v){
        DialogueFragment.this.dismiss();
    }



}
