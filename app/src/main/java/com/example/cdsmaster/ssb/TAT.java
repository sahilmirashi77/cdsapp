package com.example.cdsmaster.ssb;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import com.example.cdsmaster.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class TAT extends Fragment {

    Button tati1,tati2,tati3,tati4,tati5;



    public TAT() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View tatviewi= inflater.inflate(R.layout.fragment_t_a_t, container, false);
        tati1=(Button)tatviewi.findViewById(R.id.tatione);
        tati2=(Button)tatviewi.findViewById(R.id.tatitwo);
        tati3=(Button)tatviewi.findViewById(R.id.tatithree);
        tati4=(Button)tatviewi.findViewById(R.id.tatifour);
        tati5=(Button)tatviewi.findViewById(R.id.tatifive);


        tati1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(),ssbphysco.class);
                startActivity(intent);

            }
        });


        tati2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(),Tatttwo.class);
                startActivity(intent);
            }
        });

        tati3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent  intent=new Intent(getActivity(),tatthree.class);
                startActivity(intent);
            }
        });

        tati4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent  intent=new Intent(getActivity(),tatfour.class);
                startActivity(intent);
            }
        });

        tati4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent  intent=new Intent(getActivity(),tatfour.class);
                startActivity(intent);
            }
        });

        tati5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent  intent=new Intent(getActivity(),tatfive.class);
                startActivity(intent);
            }
        });
        return tatviewi;

    }
}
