package com.example.cdsmaster.ssb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.cdsmaster.R;

import java.util.Collections;
import java.util.List;

public class OIR extends AppCompatActivity {

    Button buttonA,buttonB,buttonC,buttonD,buttonnext,buttonback;
    TextView questiontext,oirtext,timetext,resulttext,cointext;
    OIRhelper oiRhelper;
    OIRQUESTION currentquestion;
    List<OIRQUESTION>list;
    int qid=0;
    int timevalue=1800;
    int coinvalue=0;

    CountDownTimer countDownTimer;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_o_i_r);

        questiontext=findViewById(R.id.que);
        oirtext=findViewById(R.id.OIR);
        buttonA=findViewById(R.id.opta);
        buttonB=findViewById(R.id.optb);
        buttonC=findViewById(R.id.optc);
        buttonD=findViewById(R.id.optd);
        timetext=findViewById(R.id.timevalue);
        cointext=findViewById(R.id.coinvalue);
        resulttext=findViewById(R.id.result);
        buttonnext=findViewById(R.id.next);
        buttonback=findViewById(R.id.backbutton);

        oiRhelper=new OIRhelper(this);

        oiRhelper.getWritableDatabase();

        if(oiRhelper.getALLofTheQuestion().size()==0){

            oiRhelper.allQuestion();
        }

        list=oiRhelper.getALLofTheQuestion();

        Collections.shuffle(list);

        currentquestion=list.get(qid);


        countDownTimer=new CountDownTimer(1650000,1000) {
            @Override
            public void onTick(long millisUntilFinished) {

                timetext.setText(String.valueOf(timevalue) +"\"");

                timevalue-=1;

                if(timevalue==-1){
                    
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

        questiontext.setText(currentquestion.getQuestion());
        buttonA.setText(currentquestion.getOpta());
        buttonB.setText(currentquestion.getOptb());
        buttonC.setText(currentquestion.getOptc());
        buttonD.setText(currentquestion.getOptd());




        cointext.setText(String.valueOf(coinvalue));

    }






    public void buttonA(View view) {

        if(currentquestion.getOpta().equals(currentquestion.getAnswer())){
            buttonA.setBackgroundResource(R.drawable.backyeight);

            if(qid<list.size()-1){
                disableButton();

                coinvalue++;
            }else {
                OIRresult();
            }


        }else{
            buttonA.setBackgroundResource(R.drawable.backyseven);

            disableButton();

        }

    }


    public void buttonB(View view) {
        if(currentquestion.getOptb().equals(currentquestion.getAnswer())){
            buttonB.setBackgroundResource(R.drawable.backyeight);


            if(qid<list.size()-1){
                disableButton();

                coinvalue++;
            }else {
                OIRresult();
            }


        }else{
            buttonB.setBackgroundResource(R.drawable.backyseven);

            disableButton();
        }


    }

    public void buttonC(View view) {

        if(currentquestion.getOptc().equals(currentquestion.getAnswer())){
            buttonC.setBackgroundResource(R.drawable.backyeight);

            if(qid<list.size()-1){
                disableButton();

                coinvalue++;
            }else {
                OIRresult();
            }


        }else {
            buttonC.setBackgroundResource(R.drawable.backyseven);

            disableButton();
        }

    }


    public void buttonD(View view) {


        if(currentquestion.getOptd().equals(currentquestion.getAnswer())){
            buttonD.setBackgroundResource(R.drawable.backyeight);


            if(qid<list.size()-1){
                disableButton();

                coinvalue++;
            }else {
                OIRresult();
            }


        }else{
           try {
            buttonD.setBackgroundResource(R.drawable.backyseven);
           }catch (IllegalArgumentException e){

               buttonD.setBackgroundResource(R.color.red);
           }

        }

    }

    private void OIRresult() {

        Intent intent=new Intent(OIR.this, OIRresult.class);
        startActivity(intent);
        finish();
    }




    public void nextButton(View view) {

            if(qid<(list.size()-1)) {
                qid++;
                currentquestion = list.get(qid);
                updateQueandOptions();
                enableButton();

                resetcolor();
            }
            else {
                Intent  intent=new Intent(OIR.this,Timeup.class);
                startActivity(intent);
            }

    }

    private void resetcolor() {

        buttonA.setBackgroundResource(R.drawable.backyfive);
        buttonB.setBackgroundResource(R.drawable.backyfive);
        buttonC.setBackgroundResource(R.drawable.backyfive);
        buttonD.setBackgroundResource(R.drawable.backyfive);

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

        Intent intent=new Intent(OIR.this, Timeup.class);
        startActivity(intent);
        finish();

    }

    private void disableButton() {

        buttonA.setEnabled(false);
        buttonB.setEnabled(false);
        buttonC.setEnabled(false);
        buttonD.setEnabled(false);
    }

    public void buttonback(View view) {

        if(qid<(list.size()-1)){
            qid++;
            currentquestion = list.get(qid);
            updateQueandOptions();
            enableButton();

            resetcolor();

        }else {
            Intent  intent=new Intent(OIR.this,Timeup.class);
            startActivity(intent);
        }
    }
}

