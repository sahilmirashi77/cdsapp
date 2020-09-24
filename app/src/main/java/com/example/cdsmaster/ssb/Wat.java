package com.example.cdsmaster.ssb;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.cdsmaster.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Wat extends Fragment {


    Button tat1,tat2,tat3,tat4,tat5;

    public Wat() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View watview= inflater.inflate(R.layout.fragment_wat, container, false);

        tat1=(Button)watview.findViewById(R.id.tattestone);
        tat2=(Button)watview.findViewById(R.id.tattesttwo);
        tat3=watview.findViewById(R.id.tattestthree);
        tat4=watview.findViewById(R.id.tattestfour);
        tat5=watview.findViewById(R.id.tattestfive);



        tat1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            Intent intent=new Intent(getActivity(),WAtone.class);
            startActivity(intent);

            }
        });

        tat2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(getActivity(),Wattwo.class);
                startActivity(intent);

            }
        });

        tat3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent  intent=new Intent(getActivity(),Watthree.class);
                startActivity(intent);
            }
        });

        tat4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent  intent=new Intent(getActivity(),Watfour.class);
                startActivity(intent);

            }
        });

        tat5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent  intent=new Intent(getActivity(),Watfive.class);
                startActivity(intent);

            }
        });




        return  watview;


    }
}
