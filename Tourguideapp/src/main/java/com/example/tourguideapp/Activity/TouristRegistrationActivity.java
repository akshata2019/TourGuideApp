package com.example.tourguideapp.Activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.tourguideapp.R;

public class TouristRegistrationActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tourist_registration_activity);



    }

    public void RegisterClick(View v){
        Intent i=new Intent(this,TouristTourActivity.class);
        startActivity(i);
    }
}
