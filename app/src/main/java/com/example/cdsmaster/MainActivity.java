package com.example.cdsmaster;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.cdsmaster.EXAM.Exam;
import com.example.cdsmaster.ssb.SSBpractice;
import com.example.cdsmaster.waystojoindefence.waystojoin;

public class MainActivity extends AppCompatActivity {


    ImageView defenceexam,ssb,waystojoin,info;


    @Override
    public void onBackPressed() {
        super.onBackPressed();

        Intent  intent=new Intent(Intent.ACTION_MAIN);
        intent.addCategory(Intent.CATEGORY_HOME);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        defenceexam=findViewById(R.id.exam);
        ssb=findViewById(R.id.ssb);
        waystojoin=findViewById(R.id.ways);
        info=findViewById(R.id.info);

        defenceexam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(MainActivity.this, Exam.class);
                startActivity(intent);
                Toast.makeText(getApplicationContext(),"welcome to defenceexamprep",Toast.LENGTH_SHORT);

            }
        });

        ssb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, SSBpractice.class);
                startActivity(intent);
                Toast.makeText(getApplicationContext(),"welcome to ssb",Toast.LENGTH_SHORT);

            }
        });

        waystojoin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, waystojoin.class);
                startActivity(intent);
                Toast.makeText(getApplicationContext(),"welcome to waystojoin",Toast.LENGTH_SHORT);




            }


        });




    }





}
