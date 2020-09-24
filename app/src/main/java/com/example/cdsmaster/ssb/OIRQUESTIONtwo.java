package com.example.cdsmaster.ssb;

import android.app.Activity;

public class OIRQUESTIONtwo extends Activity {


    private int id;
    private String questiontwo;
    private String opttwoa;
    private String opttwob;
    private String opttwoc;
    private String opttwod;
    private String answertwo;


    public OIRQUESTIONtwo(String que, String oa, String ob, String oc, String od, String ans) {

        questiontwo = que;
        opttwoa = oa;
        opttwob = ob;
        opttwoc = oc;
        opttwod = od;
        answertwo = ans;
    }


    public OIRQUESTIONtwo(){
        id=0;
        questiontwo="";
        opttwoa="";
        opttwob="";
        opttwoc="";
        opttwod="";
        answertwo="";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getQuestiontwo() {
        return questiontwo;
    }

    public void setQuestiontwo(String questiontwo) {
        this.questiontwo = questiontwo;
    }

    public String getOpttwoa() {
        return opttwoa;
    }

    public void setOpttwoa(String opttwoa) {
        this.opttwoa = opttwoa;
    }

    public String getOpttwob() {
        return opttwob;
    }

    public void setOpttwob(String opttwob) {
        this.opttwob = opttwob;
    }

    public String getOpttwoc() {
        return opttwoc;
    }

    public void setOpttwoc(String opttwoc) {
        this.opttwoc = opttwoc;
    }

    public String getOpttwod() {
        return opttwod;
    }

    public void setOpttwod(String opttwod) {
        this.opttwod = opttwod;
    }

    public String getAnswertwo() {
        return answertwo;
    }

    public void setAnswertwo(String answertwo) {
        this.answertwo = answertwo;
    }
}


