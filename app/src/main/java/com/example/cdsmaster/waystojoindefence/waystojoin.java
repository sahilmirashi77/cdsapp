package com.example.cdsmaster.waystojoindefence;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.cdsmaster.R;

public class waystojoin extends AppCompatActivity {

    Button  armyway,airforceway,navyway;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_waystojoin);

        armyway=findViewById(R.id.armyway);
        airforceway=findViewById(R.id.arforceway);
        navyway=findViewById(R.id.navyway);


        armyway.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent  intent=new Intent(waystojoin.this,Ways.class);
                startActivity(intent);
            }
        });


        airforceway.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent  intent=new Intent(waystojoin.this,Waystwo.class);
                startActivity(intent);
            }
        });

        navyway.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent  intent=new Intent(waystojoin.this,Waysthree.class);
                startActivity(intent);
            }
        });


    }
}
