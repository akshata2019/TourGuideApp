package com.example.tourguideapp.Activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.tourguideapp.R;

public class GuideDetailsActivity extends Activity {
    ImageView backImage;

    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.guide_details_activity);
        backImage=findViewById(R.id.backImage);
        backImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Intent i =new Intent(GuideDetailsActivity.this,TourGuideActivity.class);
                //startActivity(i);
                finish();
            }
        });
    }
}
