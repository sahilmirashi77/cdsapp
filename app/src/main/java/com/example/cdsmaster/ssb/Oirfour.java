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

public class Oirfour extends AppCompatActivity {


    Button buttonA, buttonB, buttonC, buttonD, buttonnext;
    TextView questiontext, oirtext, timetext, resulttext, cointext;
    OIRhelperfour oiRhelperfour;
    OIRQUESTIONfour    currentquestionthree;
    List<OIRQUESTIONfour> list;
    int qid = 0;
    int timevalue = 30;
    int coinvalue = 0;

    CountDownTimer countDownTimer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oirfour);




        questiontext = findViewById(R.id.questionfour);
        oirtext = findViewById(R.id.textnamefour);
        buttonA = findViewById(R.id.ButtonfourA);
        buttonB = findViewById(R.id.ButtonfourB);
        buttonC = findViewById(R.id.ButtonfourC);
        buttonD = findViewById(R.id.ButtonfourD);
        timetext = findViewById(R.id.timevaluefour);
        cointext = findViewById(R.id.coinvaluefour);
        resulttext = findViewById(R.id.resultfour);
        buttonnext = findViewById(R.id.nextfour);



        oiRhelperfour = new OIRhelperfour(this);

        oiRhelperfour.getWritableDatabase();

        if (oiRhelperfour.getALLofTheQuestion().size() == 0) {

            oiRhelperfour.allQuestion();
        }

        list = oiRhelperfour.getALLofTheQuestion();

        Collections.shuffle(list);

        currentquestionthree = list.get(qid);


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

        questiontext.setText(currentquestionthree.getQuestionfour());
        buttonA.setText(currentquestionthree.getOptfoura());
        buttonB.setText(currentquestionthree.getOptfourb());
        buttonC.setText(currentquestionthree.getOptfourc());
        buttonD.setText(currentquestionthree.getOptfourd());


        cointext.setText(String.valueOf(coinvalue));

    }


    private void OIRresult() {

        Intent intent = new Intent(Oirfour.this, OIRresult.class);
        startActivity(intent);
        finish();
    }


    public void nextButton(View view) {

        if(qid<(list.size()-1)) {
            qid++;
            currentquestionthree = list.get(qid);
            updateQueandOptions();
            enableButton();
        }else {

            Intent  intent=new Intent(Oirfour.this,Timeup.class);
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

        Intent intent = new Intent(Oirfour.this, Timeup.class);
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
        if (currentquestionthree.getOptfoura().equals(currentquestionthree.getAnswerfour())) {

            if (qid < list.size() - 1) {
                disableButton();

                coinvalue++;
            } else {
                OIRresult();
            }
        }
    }


    public void buttonB(View view) {
        if (currentquestionthree.getOptfourb().equals(currentquestionthree.getAnswerfour())) {

            if (qid < list.size() - 1) {
                disableButton();

                coinvalue++;
            } else {
                OIRresult();
            }
        }
    }


    public void buttonC(View view) {
        if (currentquestionthree.getOptfourc().equals(currentquestionthree.getAnswerfour()) ){

            if (qid < list.size() - 1) {
                disableButton();

                coinvalue++;
            } else {
                OIRresult();
            }
        }
    }

    public void buttonD(View view) {
        if (currentquestionthree.getOptfourd().equals(currentquestionthree.getAnswerfour())) {

            if (qid < list.size() - 1) {
                disableButton();

                coinvalue++;
            } else {
                OIRresult();
            }
        }
    }
}
