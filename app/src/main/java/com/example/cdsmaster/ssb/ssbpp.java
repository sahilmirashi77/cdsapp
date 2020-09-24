package com.example.cdsmaster.ssb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.cdsmaster.R;

public class ssbpp extends AppCompatActivity {

    Button oirone,oirtwo,oirthree,oirfour,oirfive;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ssbpp);

        oirone=findViewById(R.id.oirone);
        oirtwo=findViewById(R.id.oirtwo);
        oirthree=findViewById(R.id.oirthree);
        oirfour=findViewById(R.id.oirfour);
        oirfive=findViewById(R.id.oirfive);



        oirone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(ssbpp.this, OIRstart.class);
                startActivity(intent);
                
            }
        });

        oirtwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(ssbpp.this,OIRtwo.class);
                startActivity(intent);

            }
        });


        oirthree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent  intent=new Intent(ssbpp.this, oirthree.class);
                startActivity(intent);
            }
        });


        
        oirfour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent  intent=new Intent(ssbpp.this,Oirfour.class);


                startActivity(intent);
            }
        });

        oirfive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent  intent=new Intent(ssbpp.this,Oirfive.class);
                startActivity(intent);
            }
        });
    }
}
