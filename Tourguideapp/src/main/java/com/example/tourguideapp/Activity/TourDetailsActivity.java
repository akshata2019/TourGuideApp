package com.example.tourguideapp.Activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.tourguideapp.R;

public class TourDetailsActivity extends Activity {
    ImageView backImage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tourdetails_activity);
        backImage=findViewById(R.id.backImage);

    }
}