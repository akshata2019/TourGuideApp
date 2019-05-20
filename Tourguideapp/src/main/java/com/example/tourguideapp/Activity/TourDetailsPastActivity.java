package com.example.tourguideapp.Activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.tourguideapp.R;

public class TourDetailsPastActivity extends Activity {
    ImageView backImage;
    public static Button buttonReject,buttonAccept;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tourdetails_past_activity);
        backImage=findViewById(R.id.backImage);
        buttonAccept=findViewById(R.id.buttonAccept);
        buttonReject=findViewById(R.id.buttonReject);

        backImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Intent i =new Intent(TourDetailsPastActivity.this, BookingActivity.class);
                //startActivity(i);
                finish();
            }
        });


    }
}