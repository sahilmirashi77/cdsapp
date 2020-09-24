package com.example.cdsmaster.ssb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.widget.TextView;

import com.example.cdsmaster.R;

public class Watfive extends AppCompatActivity {

    TextView textView;

    CountDownTimer countDownTimer;

    int timevalue=20;

    TextView timetext;

    MediaPlayer mediaPlayer;

    public int[] sound={R.raw.cam1,R.raw.cm2};



    public String[] words={"wat","caught","right","crime","grace","wonder","love","fact","knowledge"};
    int i=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_watfive);

        setContentView(R.layout.activity_watfive);

        timetext=findViewById(R.id.timetext5);
        textView=findViewById(R.id.watwords5);




        textView.setText(words[i]);


        countDownTimer = new CountDownTimer(17000, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {




                timevalue = timevalue - 1;



            }

            @Override
            public void onFinish() {


                watfinished();

            }
        }.start();



    }

    private void watfinished() {

        if(i<9) {

            mediaPlayer=MediaPlayer.create(Watfive.this,sound[0]);
            mediaPlayer.start();
            i++;
            textView.setText(words[i]);
            countDownTimer.start();
            timevalue = 20;
        }else {


            stopPlaying();
            countDownTimer.cancel();
            Intent intent=new Intent(Watfive.this,Timeup.class);
            startActivity(intent);

        }
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        countDownTimer.start();
    }

    @Override
    protected void onStop() {
        super.onStop();
        countDownTimer.cancel();
    }

    @Override
    protected void onPause() {
        super.onPause();
        countDownTimer.cancel();
    }




    private void stopPlaying() {
        if(mediaPlayer!=null){
            mediaPlayer.stop();
            mediaPlayer.release();
            mediaPlayer=null;
        }



    }

    }

