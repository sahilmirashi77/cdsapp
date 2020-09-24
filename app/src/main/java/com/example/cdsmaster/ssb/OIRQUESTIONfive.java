package com.example.cdsmaster.ssb;

import android.app.Activity;

public class OIRQUESTIONfive    extends Activity {





    private int id;
    private String questionfive;
    private String optfivea;
    private String optfiveb;
    private String optfivec;
    private String optfived;
    private String answerfive;


    public OIRQUESTIONfive(String que, String oa, String ob, String oc, String od, String ans) {

        questionfive = que;
        optfivea = oa;
        optfiveb= ob;
        optfivec = oc;
        optfived = od;
        answerfive = ans;
    }

    public OIRQUESTIONfive(){
        id=0;
        questionfive="";
        optfivea="";
        optfiveb="";
        optfivec="";
        optfived="";
        answerfive="";
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getQuestionfive() {
        return questionfive;
    }

    public void setQuestionfive(String questionfive) {
        this.questionfive = questionfive;
    }

    public String getOptfivea() {
        return optfivea;
    }

    public void setOptfivea(String optfivea) {
        this.optfivea = optfivea;
    }

    public String getOptfiveb() {
        return optfiveb;
    }

    public void setOptfiveb(String optfiveb) {
        this.optfiveb = optfiveb;
    }

    public String getOptfivec() {
        return optfivec;
    }

    public void setOptfivec(String optfivec) {
        this.optfivec = optfivec;
    }

    public String getOptfived() {
        return optfived;
    }

    public void setOptfived(String optfived) {
        this.optfived = optfived;
    }

    public String getAnswerfive() {
        return answerfive;
    }

    public void setAnswerfive(String answerfive) {
        this.answerfive = answerfive;
    }
}
