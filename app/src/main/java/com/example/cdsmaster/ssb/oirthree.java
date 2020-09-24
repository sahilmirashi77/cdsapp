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

public class oirthree extends AppCompatActivity {


    Button buttonA, buttonB, buttonC, buttonD, buttonnext;
    TextView questiontext, oirtext, timetext, resulttext, cointext;
    OIRhelperthree oiRhelperthree;
    OIRQUESTIONthree    currentquestionthree;
    List<OIRQUESTIONthree> list;
    int qid = 0;
    int timevalue = 30;
    int coinvalue = 0;

    CountDownTimer countDownTimer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oirthree);

        questiontext = findViewById(R.id.questionthree);
        oirtext = findViewById(R.id.textnamethree);
        buttonA = findViewById(R.id.ButtonAthree);
        buttonB = findViewById(R.id.ButtonthreeB);
        buttonC = findViewById(R.id.ButtonthreeC);
        buttonD = findViewById(R.id.ButtonthreeD);
        timetext = findViewById(R.id.timevaluethree);
        cointext = findViewById(R.id.coinvaluethree);
        resulttext = findViewById(R.id.resultthree);
        buttonnext = findViewById(R.id.nextthree);



        oiRhelperthree = new OIRhelperthree(this);

        oiRhelperthree.getWritableDatabase();

        if (oiRhelperthree.getALLofTheQuestion().size() == 0) {

            oiRhelperthree.allQuestion();
        }

        list = oiRhelperthree.getALLofTheQuestion();

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

        questiontext.setText(currentquestionthree.getQuestionthree());
        buttonA.setText(currentquestionthree.getOptthreea());
        buttonB.setText(currentquestionthree.getOptthreeb());
        buttonC.setText(currentquestionthree.getOptthreec());
        buttonD.setText(currentquestionthree.getOptthreed());


        cointext.setText(String.valueOf(coinvalue));

    }


    private void OIRresult() {

        Intent intent = new Intent(oirthree.this, OIRresult.class);
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

            Intent  intent=new Intent(oirthree.this,Timeup.class);
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

        Intent intent = new Intent(oirthree.this, Timeup.class);
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
        if (currentquestionthree.getOptthreea().equals(currentquestionthree.getAnswerthree())) {

            if (qid < list.size() - 1) {
                disableButton();

                coinvalue++;
            } else {
                OIRresult();
            }
        }
    }


    public void buttonB(View view) {
        if (currentquestionthree.getOptthreeb().equals(currentquestionthree.getAnswerthree())) {

            if (qid < list.size() - 1) {
                disableButton();

                coinvalue++;
            } else {
                OIRresult();
            }
        }
    }


    public void buttonC(View view) {
        if (currentquestionthree.getOptthreec().equals(currentquestionthree.getAnswerthree()) ){

            if (qid < list.size() - 1) {
                disableButton();

                coinvalue++;
            } else {
                OIRresult();
            }
        }
    }

    public void buttonD(View view) {
        if (currentquestionthree.getOptthreed().equals(currentquestionthree.getAnswerthree())) {

            if (qid < list.size() - 1) {
                disableButton();

                coinvalue++;
            } else {
                OIRresult();
            }
        }
    }
}
