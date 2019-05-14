package com.example.tourguideapp.Activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.Spinner;

import com.example.tourguideapp.R;

public class MainActivity extends Activity {
    Button registerButton,loginButton;
    //Spinner spinner;
    RadioGroup RG;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_activity);
        registerButton=findViewById(R.id.registerButton);
        loginButton=findViewById(R.id.loginbutton);
        //addItemOnSpinner();
        addListnerOnButton();
        addListnerOnSpinnerItemSelection();


    }

    public void addListnerOnSpinnerItemSelection() {
        //spinner=findViewById(R.id.spinner1);
        //spinner.setOnItemSelectedListener(new CustomItemSelectedListner());
        RG=(RadioGroup)findViewById(R.id.radio_group);

    }
    private int getSelectedIndex(){
        int radioButtonID = RG.getCheckedRadioButtonId();
        View radioButton = RG.findViewById(radioButtonID);
        int idx = RG.indexOfChild(radioButton);
        return idx;
    }

    public void addListnerOnButton() {
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                if(spinner.getSelectedItem().toString().equals("Guide")){
                if(getSelectedIndex()==0){
                Intent i=new Intent(MainActivity.this,BookingActivity.class);
                startActivity(i);
                }
                else{
                    Intent i=new Intent(MainActivity.this,TouristTourActivity.class);
                    startActivity(i);
                }
            }
        });
        registerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //if(spinner.getSelectedItem().toString().equals("Guide")){
                if(getSelectedIndex()==0){
                    Intent i=new Intent(MainActivity.this,RegistrationActivity.class);
                    startActivity(i);
                }
                                else{
                    Intent i=new Intent(MainActivity.this,TouristRegistrationActivity.class);
                    startActivity(i);
                }

            }
        });

    }

    private class CustomItemSelectedListner implements android.widget.AdapterView.OnItemSelectedListener {
        @Override
        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {


        }

        @Override
        public void onNothingSelected(AdapterView<?> parent) {

        }
    }

//    private void addItemOnSpinner() {
//        spinner=findViewById(R.id.spinner1);
//    }
}
