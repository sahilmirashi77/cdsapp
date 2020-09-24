package com.example.cdsmaster.ssb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.cdsmaster.R;

import java.util.Collections;
import java.util.List;

public class Oirfive extends AppCompatActivity {



    Button buttonA, buttonB, buttonC, buttonD, buttonnext;
    TextView questiontext, oirtext, timetext, resulttext, cointext;
    OIRhelperfive oiRhelperfive;
    OIRQUESTIONfive    currentquestionfive;
    List<OIRQUESTIONfive> list;
    int qid = 0;
    int timevalue = 30;
    int coinvalue = 0;

    CountDownTimer countDownTimer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oirfive);


        questiontext = findViewById(R.id.questionfive);
        oirtext = findViewById(R.id.textnamefive);
        buttonA = findViewById(R.id.ButtonfiveA);
        buttonB = findViewById(R.id.ButtonfiveB);
        buttonC = findViewById(R.id.ButtonfiveC);
        buttonD = findViewById(R.id.ButtonfiveD);
        timetext = findViewById(R.id.timevaluefive);
        cointext = findViewById(R.id.coinvaluefive);
        resulttext = findViewById(R.id.resultfive);
        buttonnext = findViewById(R.id.nextfive);




        oiRhelperfive = new OIRhelperfive(this);

        oiRhelperfive.getWritableDatabase();

        if (oiRhelperfive.getALLofTheQuestion().size() == 0) {

            oiRhelperfive.allQuestion();
        }

        list = oiRhelperfive.getALLofTheQuestion();

        Collections.shuffle(list);

        currentquestionfive = list.get(qid);


        countDownTimer = new CountDownTimer(33000, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {

                timetext.setText(String.valueOf(timevalue) + "\"");

                timevalue -= 1;

                if (timevalue == -1) {

                    resulttext.setText(getString(R.string.timeup));
                    disableButton();

                }


            }

            @Override
            public void onFinish() {

                timeup();

            }
        }.start();


        updateQueandOptions();

    }

    private void updateQueandOptions() {

        questiontext.setText(currentquestionfive.getQuestionfive());
        buttonA.setText(currentquestionfive.getOptfivea());
        buttonB.setText(currentquestionfive.getOptfiveb());
        buttonC.setText(currentquestionfive.getOptfivec());
        buttonD.setText(currentquestionfive.getOptfived());


        cointext.setText(String.valueOf(coinvalue));

    }


    private void OIRresult() {

        Intent intent = new Intent(Oirfive.this, OIRresult.class);
        startActivity(intent);
        finish();
    }


    public void nextButton(View view) {

        if(qid<(list.size()-1)) {
            qid++;
            currentquestionfive = list.get(qid);
            updateQueandOptions();
            enableButton();
        }else {

            Intent  intent=new Intent(Oirfive.this,Timeup.class);
            startActivity(intent);
        }
    }

    private void enableButton() {

        buttonA.setEnabled(true);
        buttonB.setEnabled(true);
        buttonC.setEnabled(true);
        buttonD.setEnabled(true);

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

    private void timeup() {

        Intent intent = new Intent(Oirfive.this, Timeup.class);
        startActivity(intent);
        finish();

    }

    private void disableButton() {

        buttonA.setEnabled(false);
        buttonB.setEnabled(false);
        buttonC.setEnabled(false);
        buttonD.setEnabled(false);
    }


    public void buttonA(View view) {
        if (currentquestionfive.getOptfivea().equals(currentquestionfive.getAnswerfive()) ){

            if (qid < list.size() - 1) {
                disableButton();

                coinvalue++;
            } else {
                OIRresult();
            }
        }
    }


    public void buttonB(View view) {
        if (currentquestionfive.getOptfiveb().equals(currentquestionfive.getAnswerfive())) {

            if (qid < list.size() - 1) {
                disableButton();

                coinvalue++;
            } else {
                OIRresult();
            }
        }
    }


    public void buttonC(View view) {
        if (currentquestionfive.getOptfivec().equals(currentquestionfive.getAnswerfive()) ){

            if (qid < list.size() - 1) {
                disableButton();

                coinvalue++;
            } else {
                OIRresult();
            }
        }
    }

    public void buttonD(View view) {
        if (currentquestionfive.getOptfived().equals(currentquestionfive.getAnswerfive())) {

            if (qid < list.size() - 1) {
                disableButton();

                coinvalue++;
            } else {
                OIRresult();
            }
        }
    }

    }

