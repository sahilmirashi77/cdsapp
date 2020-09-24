package com.example.cdsmaster.ssb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.cdsmaster.R;

public class SSBpractice extends AppCompatActivity {

    Button ppdt,pyscho,interview,gto,conference,ssbolq,ssbprocedure;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_s_s_bpractice);

        ppdt=findViewById(R.id.ppndt);
        pyscho=findViewById(R.id.phsyo);
        ssbolq=findViewById(R.id.ssbolq);
        ssbprocedure=findViewById(R.id.ssbproceduree);
        interview=findViewById(R.id.IO);
        gto=findViewById(R.id.GTO);
        conference=findViewById(R.id.conferenceday);




        ssbolq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(SSBpractice.this,SSB_olq.class);
                startActivity(intent);

            }
        });

        ssbprocedure.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(SSBpractice.this,SSBprocedure.class);
                startActivity(intent);

            }
        });



        ppdt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(SSBpractice.this, ssbpp.class);
                startActivity(intent);


            }
        });

        pyscho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(SSBpractice.this,physcologicaltest.class);
                startActivity(intent);
            }
        });

        interview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(SSBpractice.this,ssbinterviewclickactivity.class);
                startActivity(intent);

            }
        });

        gto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(SSBpractice.this,ssbgto.class);
                startActivity(intent);



            }
        });

        conference.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(SSBpractice.this,ssbconference.class);
                startActivity(intent);

            }
        });


    }
}
