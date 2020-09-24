package com.example.cdsmaster.ssb;

import android.app.Activity;

public class OIRQUESTION extends Activity {


    private int id;
    private String question;
    private String opta;
    private String optb;
    private String optc;
    private String optd;
    private String answer;


    public OIRQUESTION(String que, String oa, String ob, String oc, String od, String ans) {

        question = que;
        opta = oa;
        optb = ob;
        optc = oc;
        optd = od;
        answer = ans;
    }


    public OIRQUESTION(){
        id=0;
        question="";
        opta="";
        optb="";
        optc="";
        optd="";
        answer="";
    }

    public String getQuestion() {
        return question;
    }

    public String getOpta() {
        return opta;
    }

    public String getOptb() {
        return optb;
    }

    public String getOptc() {
        return optc;
    }

    public String getOptd() {
        return optd;
    }

    public String getAnswer() {
        return answer;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public void setOpta(String opta) {
        this.opta = opta;
    }

    public void setOptb(String optb) {
        this.optb = optb;
    }

    public void setOptc(String optc) {
        this.optc = optc;
    }

    public void setOptd(String optd) {
        this.optd = optd;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
}
