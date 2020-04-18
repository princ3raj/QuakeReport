package com.example.quakereport;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    public static final String LOG_TAG = MainActivity.class.getName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Create a fake list of earthquake locations.
//        ArrayList<EarthQuake> earthquakes = new ArrayList<>();
//        earthquakes.add(new EarthQuake("6.1","San Francisco","26 Feb,2016"));
//        earthquakes.add(new EarthQuake("3.2","London","31 Jan,2019"));
//        earthquakes.add(new EarthQuake("7.9","Sanghai","26 Feb,2016"));
//        earthquakes.add(new EarthQuake("6.7","Tokyo","26 Feb,2016"));
//        earthquakes.add(new EarthQuake("5.1","Mexico City","26 Feb,2016"));
//        earthquakes.add(new EarthQuake("3.8","Moscow","26 Feb,2016"));


        //real data
         ArrayList<EarthQuake> earthquakes= QueryUtils.extractEarthquakes();



        EarthQuakeAdapter adapter=new EarthQuakeAdapter(this,earthquakes);

        // Find a reference to the {@link ListView} in the layout
        ListView earthquakeListView = (ListView) findViewById(R.id.list);




        // Set the adapter on the {@link ListView}
        // so the list can be populated in the user interface
        earthquakeListView.setAdapter(adapter);
    }
}
