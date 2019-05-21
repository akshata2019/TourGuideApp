package com.example.tourguideapp.Activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import com.example.tourguideapp.R;

public class RegistrationActivity extends Activity {
    Button registerButton;
    Spinner spinnerView;
    String[] spinnerValue = {"Certification 1  ", "Certification 2   ", "Certification 3   ", "Certification 4    "};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        spinnerView =(Spinner)findViewById(R.id.spinner1);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(RegistrationActivity.this, android.R.layout.simple_list_item_1, spinnerValue);
        spinnerView.setAdapter(adapter);
        registerButton=findViewById(R.id.registerButton);
        registerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(RegistrationActivity.this, ApplicationStatusActivity.class);
                startActivity(i);
                finish();
            }
        });

    }
}
