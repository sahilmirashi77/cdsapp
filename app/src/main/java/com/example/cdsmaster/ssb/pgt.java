package com.example.cdsmaster.ssb;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.cdsmaster.R;

public class pgt extends AppCompatActivity {

    MediaPlayer mediaPlayer;


    int clickcount=1;
    public int[] sound={R.raw.buttonsound,R.raw.buttonsoundfinal};


    TextView pgtheading,hgtheading,fgtheading,ctheading,pgtcontent,hgtcontent,fgtcontent,ctcontent;

    ImageView imageView5,imageView6,imageView8,imageView9,imageView10,imageView11;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pgt);


        pgtcontent=findViewById(R.id.PGT);
        hgtcontent=findViewById(R.id.HGTcontent);
        fgtcontent=findViewById(R.id.fgtcontent);
        ctcontent=findViewById(R.id.ctcontent);

        pgtheading=findViewById(R.id.pgtheading);
        hgtheading=findViewById(R.id.hgtheading);
        fgtheading=findViewById(R.id.fgtheading);
        ctheading=findViewById(R.id.CTheading);






        pgtheading.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer=MediaPlayer.create(pgt.this,sound[1]);
                mediaPlayer.start();



                clickcount=clickcount+1;


                if(clickcount%2==0) {
                    pgtcontent.setText(Html.fromHtml(getString(R.string.pgt)));
                    pgtcontent.setBackgroundResource(R.drawable.gtotextbackground);
                   pgtheading.setCompoundDrawablesWithIntrinsicBounds(0,0,R.drawable.collaspsebuttonend,0);
                }
                else {
                    pgtcontent.setText("");
                    pgtcontent.setBackgroundResource(R.color.lightsteelblue);
                    pgtheading.setCompoundDrawablesWithIntrinsicBounds(0,0,R.drawable.collapsebutton,0);
                }

            }
        });
        hgtheading.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                clickcount=clickcount+1;
                mediaPlayer=MediaPlayer.create(pgt.this,sound[1]);
                mediaPlayer.start();



                if(clickcount%2==0) {
                    hgtcontent.setText(Html.fromHtml(getString(R.string.hgt)));
                    hgtcontent.setBackgroundResource(R.drawable.gtotextbackground);
                    hgtheading.setCompoundDrawablesWithIntrinsicBounds(0,0,R.drawable.collaspsebuttonend,0);
                }
                else {
                    hgtcontent.setText("");
                    hgtcontent.setBackgroundResource(R.color.lightsteelblue);
                    hgtheading.setCompoundDrawablesWithIntrinsicBounds(0,0,R.drawable.collapsebutton,0);
                }





            }
        });


        fgtheading.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                clickcount=clickcount+1;
                mediaPlayer=MediaPlayer.create(pgt.this,sound[1]);
                mediaPlayer.start();




                if(clickcount%2==0) {
                    fgtcontent.setText(Html.fromHtml(getString(R.string.fgt)));

                    fgtcontent.setBackgroundResource(R.drawable.gtotextbackground);
                    fgtheading.setCompoundDrawablesWithIntrinsicBounds(0,0,R.drawable.collaspsebuttonend,0);
                }
                else {
                    fgtcontent.setText("");
                    fgtcontent.setBackgroundResource(R.color.lightsteelblue);
                    fgtheading.setCompoundDrawablesWithIntrinsicBounds(0,0,R.drawable.collapsebutton,0);
                }






            }
        });

        ctheading.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickcount=clickcount+1;
                mediaPlayer=MediaPlayer.create(pgt.this,sound[1]);
                mediaPlayer.start();




                if(clickcount%2==0) {
                    ctcontent.setText(Html.fromHtml(getString(R.string.commandtask)));

                    ctcontent.setBackgroundResource(R.drawable.gtotextbackground);
                    ctheading.setCompoundDrawablesWithIntrinsicBounds(0,0,R.drawable.collaspsebuttonend,0);
                }
                else {
                    ctcontent.setText("");
                    ctcontent.setBackgroundResource(R.color.lightsteelblue);
                    ctheading.setCompoundDrawablesWithIntrinsicBounds(0,0,R.drawable.collapsebutton,0);
                }




            }
        });












    }
}
