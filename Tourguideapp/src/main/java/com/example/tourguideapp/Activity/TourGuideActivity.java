package com.example.tourguideapp.Activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

import com.example.tourguideapp.R;

public class TourGuideActivity extends Activity {
    RelativeLayout relativeLayout;
    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tour_guide_activity);
        relativeLayout=findViewById(R.id.relativeLayout);
        relativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent(TourGuideActivity.this,GuideDetailsActivity.class);
                startActivity(i);
                finish();
            }
        });
    }
}
