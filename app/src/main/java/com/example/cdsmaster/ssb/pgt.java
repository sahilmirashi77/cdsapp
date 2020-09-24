package com.example.cdsmaster.ssb;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.cdsmaster.R;

public class pgt extends AppCompatActivity {


    TextView pgtheading,hgtheading,fgtheading,ctheading,pgtcontent,hgtcontent,fgtcontent,ctcontent;

    ImageView imageView5,imageView6,imageView8,imageView9,imageView10,imageView11;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pgt);


        pgtcontent=findViewById(R.id.PGT);
        hgtcontent=findViewById(R.id.HGTcontent);
        fgtcontent=findViewById(R.id.fgtheading);
        ctcontent=findViewById(R.id.ctcontent);

        pgtheading=findViewById(R.id.pgtheading);
        hgtheading=findViewById(R.id.hgtheading);
        fgtheading=findViewById(R.id.fgtheading);
        ctheading=findViewById(R.id.CTheading);

        imageView5=findViewById(R.id.imageView5);
        imageView6=findViewById(R.id.imageView6);
        imageView8=findViewById(R.id.imageView8);
        imageView9=findViewById(R.id.imageView9);
        imageView10=findViewById(R.id.imageView10);
        imageView11=findViewById(R.id.imageView11);

        imageView5.setVisibility(View.GONE);
        imageView6.setVisibility(View.GONE);
        imageView8.setVisibility(View.GONE);
        imageView9.setVisibility(View.GONE);
        imageView10.setVisibility(View.GONE);
        imageView11.setVisibility(View.GONE);




        pgtheading.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                pgtcontent.setText(Html.fromHtml(getString(R.string.pgt)));
                imageView5.setVisibility(View.VISIBLE);
                imageView6.setVisibility(View.VISIBLE);
                imageView8.setVisibility(View.VISIBLE);
                imageView9.setVisibility(View.VISIBLE);

            }
        });
        hgtheading.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                hgtcontent.setText(Html.fromHtml(getString(R.string.hgt)));


            }
        });


        fgtheading.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                fgtcontent.setText(Html.fromHtml(getString(R.string.fgt)));
                imageView10.setVisibility(View.VISIBLE);
                imageView11.setVisibility(View.VISIBLE);

            }
        });

        ctheading.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ctcontent.setText(Html.fromHtml(getString(R.string.commandtask)));


            }
        });












    }
}
