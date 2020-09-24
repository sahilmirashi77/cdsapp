package com.example.cdsmaster.ssb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.cdsmaster.R;

public class ssbgto extends AppCompatActivity {

    Button gto,gd,lecturtee,io,gpe,pgt,gor;

    TextView gtooverview,mantra,gd1,lecturtee1,io1,gpe1,pgt1,gor1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ssbgto);


        gtooverview=findViewById(R.id.GTO);
        mantra=findViewById(R.id.mantra);
        gd=findViewById(R.id.GD);
        lecturtee=findViewById(R.id.lecturtee);
        io=findViewById(R.id.io);
        gpe=findViewById(R.id.gpe);
        gor=findViewById(R.id.gor);

        gd1=findViewById(R.id.gdone);
        lecturtee1=findViewById(R.id.lecturteetwo);
        io1=findViewById(R.id.ioone);
        gpe1=findViewById(R.id.gpeone);
        pgt1=findViewById(R.id.pgtone);
        pgt=findViewById(R.id.pgt);
        gor1=findViewById(R.id.gorone);





        mantra.setText(Html.fromHtml(getString(R.string.gtomantra)));


        gd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                gd1.setText(Html.fromHtml(getString(R.string.gdtopics)));
            }
        });

        io.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


            }
        });

        lecturtee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lecturtee1.setText(Html.fromHtml(getString(R.string.lectureteetopics)));
            }
        });

        gpe1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(ssbgto.this,gpeclicklistener.class);
                startActivity(intent);
            }
        });



        pgt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(ssbgto.this,pgt.class);
                startActivity(intent);

            }
        });

        gor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                gor1.setText(getString(R.string.gor));


            }
        });

        io.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

              Intent intent=new Intent(ssbgto.this,individualobstaclerace.class);
              startActivity(intent);

            }
        });







    }
}
