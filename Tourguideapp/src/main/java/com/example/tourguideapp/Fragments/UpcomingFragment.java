package com.example.tourguideapp.Fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

import com.example.tourguideapp.Activity.TourDetailsActivity;
import com.example.tourguideapp.Activity.TouristTourDetailsActivity;
import com.example.tourguideapp.R;

public  class UpcomingFragment extends Fragment {
    RelativeLayout firstLayout;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.fragment_upcoming, container, false);
        firstLayout=v.findViewById(R.id.relativeLayout);
        firstLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getActivity(), TouristTourDetailsActivity.class);
                startActivity(i);
                getActivity().finish();


            }
        });
        return v;
    }
}
