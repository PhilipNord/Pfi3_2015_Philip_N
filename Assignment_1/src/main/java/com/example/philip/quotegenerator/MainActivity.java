package com.example.philip.quotegenerator;

import android.content.res.Resources;
import android.support.v7.app.ActionBarActivity;
import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.RelativeLayout;

import java.util.Random;

public class MainActivity extends ActionBarActivity {


    public void buttonAction(View v){

        Random rand = new Random();

        TextView txtView = (TextView) findViewById(R.id.qouteArea);
        txtView.setText(null);

        String[] quotes= getResources().getStringArray(R.array.qoute);

        int nextQuote = rand.nextInt(quotes.length);
        txtView.setText(quotes[nextQuote]);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);}



    @Override
    protected void onStart() {
        super.onStart();
        Log.i("onStart", "Started");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("onResume", "Resumed");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("onPause", "Paused");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("onDestroy", "Destroyed");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
