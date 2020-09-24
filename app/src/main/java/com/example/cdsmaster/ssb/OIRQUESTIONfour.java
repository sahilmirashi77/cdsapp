package com.example.cdsmaster.ssb;

import android.app.Activity;

public class OIRQUESTIONfour    extends Activity {



    private int id;
    private String questionfour;
    private String optfoura;
    private String optfourb;
    private String optfourc;
    private String optfourd;
    private String answerfour;


    public OIRQUESTIONfour(String que, String oa, String ob, String oc, String od, String ans) {

        questionfour = que;
        optfoura = oa;
        optfourb= ob;
        optfourc = oc;
        optfourd = od;
        answerfour = ans;
    }

    public OIRQUESTIONfour(){
        id=0;
        questionfour="";
        optfoura="";
        optfourb="";
        optfourc="";
        optfourd="";
        answerfour="";
    }


    public int getId() {
        return id;
    }

    public String getQuestionfour() {
        return questionfour;
    }

    public String getOptfoura() {
        return optfoura;
    }

    public String getOptfourb() {
        return optfourb;
    }

    public String getOptfourc() {
        return optfourc;
    }

    public String getOptfourd() {
        return optfourd;
    }

    public String getAnswerfour() {
        return answerfour;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setQuestionfour(String questionfour) {
        this.questionfour = questionfour;
    }

    public void setOptfoura(String optfoura) {
        this.optfoura = optfoura;
    }

    public void setOptfourb(String optfourb) {
        this.optfourb = optfourb;
    }

    public void setOptfourc(String optfourc) {
        this.optfourc = optfourc;
    }

    public void setOptfourd(String optfourd) {
        this.optfourd = optfourd;
    }

    public void setAnswerfour(String answerfour) {
        this.answerfour = answerfour;
    }
}
