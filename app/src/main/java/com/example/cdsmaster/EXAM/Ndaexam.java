package com.example.cdsmaster.EXAM;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.cdsmaster.R;

public class Ndaexam extends AppCompatActivity {

    Button ndasyllabus,ndaexamtips,ndapreviousyear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ndaexam);

        ndasyllabus=findViewById(R.id.ndasyllabus);
        ndaexamtips=findViewById(R.id.ndaexamtips);
        ndapreviousyear=findViewById(R.id.ndapreviousyear);

        ndasyllabus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Ndaexam.this, Ndasyllabus.class);
                startActivity(intent);
            }
        });




        ndapreviousyear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_VIEW,Uri.parse("https://upsc.gov.in/sites/default/files/CDS_I_2020_ENGLISH.pdf"));
                startActivity(intent);
            }
        });


        ndaexamtips.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://defenceaspire.weebly.com/uploads/1/3/0/8/130885487/nda.pdf"));
                startActivity(intent);
            }
        });





    }
}
