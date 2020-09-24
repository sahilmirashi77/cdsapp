package com.example.cdsmaster.ssb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.cdsmaster.R;

public class OIRstart extends AppCompatActivity {

    Button  startoir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_o_i_rstart);

        startoir=findViewById(R.id.startoirchalo);

        startoir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent  intent=new Intent(OIRstart.this,OIR.class);
                startActivity(intent);
            }
        });

    }
}
