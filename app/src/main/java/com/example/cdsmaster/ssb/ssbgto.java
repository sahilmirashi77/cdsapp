package com.example.cdsmaster.ssb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.cdsmaster.R;

public class ssbgto extends AppCompatActivity {

    Button gto,gd,lecturtee,io,gpe,pgt,gor;
    int clickcount=1;


    MediaPlayer mediaPlayer;

    public int[] sound={R.raw.buttonsound,R.raw.buttonsoundfinal};


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

                clickcount=clickcount+1;
                mediaPlayer=MediaPlayer.create(ssbgto.this,sound[1]);
                mediaPlayer.start();
                if(clickcount%2==0)
                {
                    gd1.setVisibility(View.VISIBLE);
                    gd1.setText(Html.fromHtml(getString(R.string.gdtopics)));
                    gd1.setBackgroundResource(R.drawable.gtotextbackground);
                    gd.setCompoundDrawablesWithIntrinsicBounds(R.drawable.iconsforbutton,0,R.drawable.collaspsebuttonend,0);


                }
                else {
                    gd1.setText("");
                    gd1.setBackgroundResource(R.color.lightsteelblue);
                    gd.setCompoundDrawablesWithIntrinsicBounds(R.drawable.iconsforbutton,0,R.drawable.collapsebutton,0);


                }

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

                clickcount=clickcount+1;
                mediaPlayer=MediaPlayer.create(ssbgto.this,sound[1]);
                mediaPlayer.start();
                if(clickcount%2==0)
                {
                    lecturtee1.setVisibility(View.VISIBLE);
                    lecturtee1.setText(Html.fromHtml(getString(R.string.lectureteetopics)));
                    lecturtee1.setBackgroundResource(R.drawable.gtotextbackground);
                    lecturtee.setCompoundDrawablesWithIntrinsicBounds(R.drawable.lecturtte,0,R.drawable.collaspsebuttonend,0);



                }
                else {
                    lecturtee1.setText("");
                    lecturtee1.setBackgroundResource(R.color.lightsteelblue);
                    lecturtee.setCompoundDrawablesWithIntrinsicBounds(R.drawable.lecturtte,0,R.drawable.collapsebutton,0);


                }
            }
        });

        gpe.setOnClickListener(new View.OnClickListener() {
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


                clickcount=clickcount+1;
                mediaPlayer=MediaPlayer.create(ssbgto.this,sound[1]);
                mediaPlayer.start();
                if(clickcount%2==0)
                {
                    gor1.setVisibility(View.VISIBLE);
                    gor1.setText(Html.fromHtml(getString(R.string.gdtopics)));
                    gor1.setBackgroundResource(R.drawable.gtotextbackground);
                    gor.setCompoundDrawablesWithIntrinsicBounds(0,0,R.drawable.collaspsebuttonend,0);


                }
                else {
                    gor1.setVisibility(View.GONE);
                    gor1.setBackgroundResource(R.color.lightsteelblue);
                    gor.setCompoundDrawablesWithIntrinsicBounds(0,0,R.drawable.collapsebutton,0);


                }


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
