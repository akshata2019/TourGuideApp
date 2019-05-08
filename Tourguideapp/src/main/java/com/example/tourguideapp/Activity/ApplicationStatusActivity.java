package com.example.tourguideapp.Activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.tourguideapp.R;

public class ApplicationStatusActivity extends Activity {
    ImageView backImage;
    Button submitButton;
    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.application_status_activity);
        backImage=findViewById(R.id.backImage);
        submitButton=findViewById(R.id.registerButton);
        backImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent(ApplicationStatusActivity.this,RegistrationActivity.class);
                startActivity(i);
                finish();
            }
        });
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent(ApplicationStatusActivity.this,BookingActivity.class);
                startActivity(i);
                finish();
            }
        });

    }
}
