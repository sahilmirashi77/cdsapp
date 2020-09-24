package com.example.cdsmaster;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class Splashscreen extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_splashscreen);



        Thread  thread=new Thread(){

            //threads   are used    there   we  want to do multiple task at one time(simantenously)

            public void run(){
                try {

                    sleep(2000);

                }catch (Exception  e){

                    e.printStackTrace();

                }finally {

                    Intent  intent=new Intent(Splashscreen.this, MainActivity.class);
                    startActivity(intent);
                }

            }

        };thread.start();
    }
}
