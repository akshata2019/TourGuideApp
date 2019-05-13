package com.example.tourguideapp.Activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.tourguideapp.R;

public class TouristTourDetailsActivity extends Activity {
    TextView guidetext;
    ImageView backImage;
    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.touristtourdetailsactivity);
        guidetext=findViewById(R.id.guideText);
        guidetext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent(TouristTourDetailsActivity.this,TourGuideActivity.class);
                startActivity(i);
                finish();
            }
        });
        backImage=findViewById(R.id.backImage);
        backImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent(TouristTourDetailsActivity.this,TouristTourActivity.class);
                startActivity(i);
                finish();
            }
        });
    }
}
