package com.example.cdsmaster.ssb;

import android.app.Activity;

public class OIRQUESTIONthree extends Activity {



    private int id;
    private String questionthree;
    private String optthreea;
    private String optthreeb;
    private String optthreec;
    private String optthreed;
    private String answerthree;


    public OIRQUESTIONthree(String que, String oa, String ob, String oc, String od, String ans) {

        questionthree = que;
        optthreea = oa;
        optthreeb = ob;
        optthreec = oc;
        optthreed = od;
        answerthree = ans;
    }


    public OIRQUESTIONthree(){
        id=0;
        questionthree="";
        optthreea="";
        optthreeb="";
        optthreec="";
        optthreed="";
        answerthree="";
    }

    public int getId() {
        return id;
    }

    public String getQuestionthree() {
        return questionthree;
    }

    public String getOptthreea() {
        return optthreea;
    }

    public String getOptthreeb() {
        return optthreeb;
    }

    public String getOptthreec() {
        return optthreec;
    }

    public String getOptthreed() {
        return optthreed;
    }

    public String getAnswerthree() {
        return answerthree;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setQuestionthree(String questionthree) {
        this.questionthree = questionthree;
    }

    public void setOptthreea(String optthreea) {
        this.optthreea = optthreea;
    }

    public void setOptthreeb(String optthreeb) {
        this.optthreeb = optthreeb;
    }

    public void setOptthreec(String optthreec) {
        this.optthreec = optthreec;
    }

    public void setOptthreed(String optthreed) {
        this.optthreed = optthreed;
    }

    public void setAnswerthree(String answerthree) {
        this.answerthree = answerthree;
    }
}
