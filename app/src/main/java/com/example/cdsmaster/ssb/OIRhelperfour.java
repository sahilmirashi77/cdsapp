package com.example.cdsmaster.ssb;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.List;

public class OIRhelperfour  extends SQLiteOpenHelper {


    private Context context;
    private  static final String DB_NAME="OIR.db";

    private static final int DB_VERSION=7;

    private static final String TABLE_NAME ="OIR";

    private static final String UID ="_UID";

    private static final String QUESTION = "QUESTION";

    private static final String OPTA =" OPTA";

    private static final String OPTB =" OPTB";

    private static final String OPTC =" OPTC";

    private static final String OPTD =" OTPD";

    private static final String ANSWER = "ANSWER";

    private static final String CREATE_TABLE = "CREATE TABLE "+ TABLE_NAME +" ( " + UID + " INTEGER PRIMARY KEY AUTOINCREMENT ," + QUESTION +" VARCHAR(255), " + OPTA +" VARCHAR(255), " + OPTB + " VARCHAR(255), " + OPTC + " VARCHAR(255), "+ OPTD +" VARCHAR, "+ ANSWER +" VARCHAR(255));";

    private static final String DROP_TABLE ="DROP TABLE IF EXISTS "+ TABLE_NAME;



    OIRhelperfour(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
        this.context = context;
    }


    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL(CREATE_TABLE);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL(DROP_TABLE);
        onCreate(db);

    }


    void allQuestion() {

        ArrayList<OIRQUESTIONfour> arrayList = new ArrayList<>();

        arrayList.add(new OIRQUESTIONfour("who is wfnifr", "sahil", "elon ", "ambani", "riteshagrawal", "sahil"));
        arrayList.add(new OIRQUESTIONfour("who is not en==nvfffvfr", "sahil", "elon ", "ambani", "riteshagrawal", "sahil"));
        arrayList.add(new OIRQUESTIONfour("who is rfvfvfvpenour", "sahil", "elon ", "ambani", "riteshagrawal", "sahil"));
        arrayList.add(new OIRQUESTIONfour("who not edsvevervrvntrepenour", "sahil", "elon ", "ambani", "riteshagrawal", "sahil"));
        arrayList.add(new OIRQUESTIONfour("whotrepenour", "sahil", "elon ", "ambani", "riteshagrawal", "sahil"));
        arrayList.add(new OIRQUESTIONfour("who is nvefvefvtpenour", "sahil", "elon ", "ambani", "riteshagrawal", "sahil"));
        arrayList.add(new OIRQUESTIONfour("who is nververvrepenour", "sahil", "elon ", "ambani", "riteshagrawal", "sahil"));
        arrayList.add(new OIRQUESTIONfour("whvrbtbtbtrrepenour", "sahil", "elon ", "ambani", "riteshagrawal", "sahil"));
        arrayList.add(new OIRQUESTIONfour("ws rbwribmrentrepenour", "sahil", "elon ", "ambani", "riteshagrawal", "sahil"));
        arrayList.add(new OIRQUESTIONfour("who nmrigigjtrepenour", "sahil", "elon ", "ambani", "riteshagrawal", "sahil"));

        this.addAllquestion(arrayList);

    }

    private void addAllquestion(ArrayList<OIRQUESTIONfour> allQuestion) {


        SQLiteDatabase db = this.getWritableDatabase();

        db.beginTransaction();


        try {

            ContentValues values = new ContentValues();

            for (OIRQUESTIONfour question : allQuestion) {
                values.put(QUESTION, question.getQuestionfour());
                values.put(OPTA, question.getOptfoura());
                values.put(OPTB, question.getOptfourb());
                values.put(OPTC, question.getOptfourc());
                values.put(OPTD, question.getOptfourd());
                values.put(ANSWER, question.getAnswerfour());
                db.insert(TABLE_NAME, null, values);

            }
            db.setTransactionSuccessful();
        } finally {
            db.endTransaction();
            db.close();
        }

    }


    List<OIRQUESTIONfour> getALLofTheQuestion(){

        List<OIRQUESTIONfour> oirquestionList=new ArrayList<>();

        SQLiteDatabase db=this.getWritableDatabase();
        db.beginTransaction();

        String coloumn[] = {UID,QUESTION,OPTA,OPTB,OPTC,OPTD,ANSWER};
        Cursor cursor=db.query(TABLE_NAME,coloumn,null,null,null,null,null);

        while (cursor.moveToNext()){
            OIRQUESTIONfour question=new OIRQUESTIONfour();
            question.setId(cursor.getInt(0));
            question.setQuestionfour(cursor.getString(1));
            question.setOptfoura(cursor.getString(2));
            question.setOptfourb(cursor.getString(3));
            question.setOptfourc(cursor.getString(4));
            question.setOptfourd(cursor.getString(5));
            question.setAnswerfour(cursor.getString(6));
            oirquestionList.add(question);



        }

        db.setTransactionSuccessful();
        db.endTransaction();
        cursor.close();
        db.close();
        return oirquestionList;
    }


}