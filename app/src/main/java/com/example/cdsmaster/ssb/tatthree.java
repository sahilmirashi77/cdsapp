package com.example.cdsmaster.ssb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.cdsmaster.R;

public class tatthree extends AppCompatActivity {


    ImageView imageView;

    CountDownTimer countDownTimer;

    int timevalue=20;

    TextView timetext;

    MediaPlayer mediaPlayer;

    public int[] sound={R.raw.cam1,R.raw.cm2};



    public Integer[] image={R.drawable.tat1,R.drawable.tat2,R.drawable.tat3,R.drawable.tat4,
            R.drawable.tat5,R.drawable.tat6,R.drawable.tat7,R.drawable.tat8,R.drawable.tat9,R.drawable.tat10,R.drawable.tat11,
            R.drawable.tat12};
    int i=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tatthree);

        imageView=findViewById(R.id.img3);
        timetext=findViewById(R.id.timetext3);




        imageView.setImageResource(image[i]);


        countDownTimer = new CountDownTimer(22000, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {



                timetext.setText(String.valueOf(timevalue));
                timevalue = timevalue - 1;



            }

            @Override
            public void onFinish() {


                Tatfinished();

            }
        }.start();



    }

    private void Tatfinished() {

        if(i<12) {

            mediaPlayer=MediaPlayer.create(tatthree.this,sound[0]);
            mediaPlayer.start();
            i++;
            imageView.setImageResource(image[i]);
            countDownTimer.start();
            timevalue = 20;
        }else {


            stopPlaying();
            countDownTimer.cancel();
            Intent intent=new Intent(tatthree.this,Timeup.class);
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
