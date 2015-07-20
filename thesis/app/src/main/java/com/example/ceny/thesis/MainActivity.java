package com.example.ceny.thesis;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.widget.EditText;

import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

/**
 * Created by Ceny on 7/8/2015.
 */
public class MainActivity extends Activity {

    String searchString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin);


    }



    public void onClick_Search(View v){
        // CameraUpdate update = CameraUpdateFactory.newLatLng(LOCATION_CITY);
    EditText editText=(EditText) findViewById(R.id.location);
       searchString= editText.getText().toString();
       /* mMap.setMapType(GoogleMap.MAP_TYPE_SATELLITE);
        CameraUpdate update = CameraUpdateFactory.newLatLngZoom(LOCATION_CITY,9);
        mMap.addMarker(new MarkerOptions().position(LOCATION_CITY).title("Marked Cebu"));
        mMap.animateCamera(update);
    */
        Intent myIntent = new Intent(MainActivity.this, MapsActivity.class);
        myIntent.putExtra("key", searchString); //Optional parameters
        MainActivity.this.startActivity(myIntent);

    }

}


