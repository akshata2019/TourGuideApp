package com.example.tourguideapp.Fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

import com.example.tourguideapp.Activity.TourDetailsActivity;
import com.example.tourguideapp.R;

import static android.view.View.GONE;
import static com.example.tourguideapp.Activity.TourDetailsActivity.buttonAccept;
import static com.example.tourguideapp.Activity.TourDetailsActivity.buttonReject;

public class PastFragment  extends Fragment {
    RelativeLayout firstLayout;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.fragment_past, container, false);
        firstLayout=v.findViewById(R.id.relativeLayout);
        firstLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i=new Intent(getActivity(), TourDetailsPastActivity.class);

                startActivity(i);

            }
        });

        return v;
    }

}