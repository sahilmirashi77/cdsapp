package com.example.cdsmaster.ssb;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.cdsmaster.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class SRT extends Fragment {

    Button srt1,srt2,srt3,srt4,srt5;


    public SRT() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View srtview=inflater.inflate(R.layout.fragment_s_r_t, container, false);

        srt1=(Button)srtview.findViewById(R.id.srtone);
        srt2=(Button)srtview.findViewById(R.id.srttwo);
        srt3=(Button)srtview.findViewById(R.id.srtthree);
        srt4=srtview.findViewById(R.id.srtfour);
        srt5=srtview.findViewById(R.id.srtfive);


        srt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(getActivity(),Srtone.class);
                startActivity(intent);

            }
        });

        srt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(getActivity(),Srttwo.class);
                startActivity(intent);
            }
        });

        srt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent  intent=new Intent(getActivity(),srtthree.class);
                startActivity(intent);
            }
        });

        srt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent  intent=new Intent(getActivity(),srtfour.class);
                startActivity(intent);
            }
        });

        srt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent  i=new Intent(getActivity(),srtfive.class);
                startActivity(i);
            }
        });






        return srtview;
    }
}
