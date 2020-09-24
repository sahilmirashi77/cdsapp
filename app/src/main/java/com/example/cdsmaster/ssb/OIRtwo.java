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

public class OIRtwo extends AppCompatActivity {

    Button buttonA, buttonB, buttonC, buttonD, buttonnext;
    TextView questiontext, oirtext, timetext, resulttext, cointext;
    OIRhelpertwo oiRhelpertwo;
    OIRQUESTIONtwo currentquestiontwo;
    List<OIRQUESTIONtwo> list;
    int qid = 0;
    int timevalue = 30;
    int coinvalue = 0;

    CountDownTimer countDownTimer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_o_i_rtwo);

        questiontext = findViewById(R.id.questiontwo);
        oirtext = findViewById(R.id.textnametwo);
        buttonA = findViewById(R.id.ButtonAone);
        buttonB = findViewById(R.id.ButtontwoB);
        buttonC = findViewById(R.id.ButtontwoC);
        buttonD = findViewById(R.id.ButtontwoD);
        timetext = findViewById(R.id.timevaluetwo);
        cointext = findViewById(R.id.coinvaluetwo);
        resulttext = findViewById(R.id.resulttwo);
        buttonnext = findViewById(R.id.nexttwo);

        oiRhelpertwo = new OIRhelpertwo(this);

        oiRhelpertwo.getWritableDatabase();

        if (oiRhelpertwo.getALLofTheQuestion().size() == 0) {

            oiRhelpertwo.allQuestion();
        }

        list = oiRhelpertwo.getALLofTheQuestion();

        Collections.shuffle(list);

        currentquestiontwo = list.get(qid);


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

        questiontext.setText(currentquestiontwo.getQuestiontwo());
        buttonA.setText(currentquestiontwo.getOpttwoa());
        buttonB.setText(currentquestiontwo.getOpttwob());
        buttonC.setText(currentquestiontwo.getOpttwoc());
        buttonD.setText(currentquestiontwo.getOpttwod());


        cointext.setText(String.valueOf(coinvalue));

    }


    private void OIRresult() {

        Intent intent = new Intent(OIRtwo.this, OIRresult.class);
        startActivity(intent);
        finish();
    }


    public void nextButton(View view) {

        if(qid<(list.size()-1)) {
            qid++;
            currentquestiontwo = list.get(qid);
            updateQueandOptions();
            enableButton();
        }
        else {

            Intent  i=new Intent(OIRtwo.this,Timeup.class);
            startActivity(i);
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

        Intent intent = new Intent(OIRtwo.this, Timeup.class);
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
        if (currentquestiontwo.getOpttwoa().equals(currentquestiontwo.getAnswertwo())) {

            if (qid < list.size() - 1) {
                disableButton();

                coinvalue++;
            } else {
                OIRresult();
            }
        }
    }


    public void buttonB(View view) {
        if (currentquestiontwo.getOpttwob().equals(currentquestiontwo.getAnswertwo())) {

            if (qid < list.size() - 1) {
                disableButton();

                coinvalue++;
            } else {
                OIRresult();
            }
        }
    }


    public void buttonC(View view) {
        if (currentquestiontwo.getOpttwob().equals(currentquestiontwo.getAnswertwo())) {

            if (qid < list.size() - 1) {
                disableButton();

                coinvalue++;
            } else {
                OIRresult();
            }
        }
    }

    public void buttonD(View view) {
        if (currentquestiontwo.getOpttwob().equals(currentquestiontwo.getAnswertwo())) {

            if (qid < list.size() - 1) {
                disableButton();

                coinvalue++;
            } else {
                OIRresult();
            }
        }
    }
}

