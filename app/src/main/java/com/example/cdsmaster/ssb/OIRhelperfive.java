package com.example.cdsmaster.ssb;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.List;

public class OIRhelperfive  extends SQLiteOpenHelper {


    private Context context;
    private  static final String DB_NAME="OIRfive.db";

    private static final int DB_VERSION=8;

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


    OIRhelperfive(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
        this.context=context;
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


    void allQuestion(){

        ArrayList<OIRQUESTIONfive> arrayList=new ArrayList<>();

        arrayList.add(new OIRQUESTIONfive("who is wfnifr","sahil","elon ","ambani","riteshagrawal","sahil"));
        arrayList.add(new OIRQUESTIONfive("who is not en==nvfffvfr","sahil","elon ","ambani","riteshagrawal","sahil"));
        arrayList.add(new OIRQUESTIONfive("who is rfvfvfvpenour","sahil","elon ","ambani","riteshagrawal","sahil"));
        arrayList.add(new OIRQUESTIONfive("who not edsvevervrvntrepenour","sahil","elon ","ambani","riteshagrawal","sahil"));
        arrayList.add(new OIRQUESTIONfive("whotrepenour","sahil","elon ","ambani","riteshagrawal","sahil"));
        arrayList.add(new OIRQUESTIONfive("who is nvefvefvtpenour","sahil","elon ","ambani","riteshagrawal","sahil"));
        arrayList.add(new OIRQUESTIONfive("who is nververvrepenour","sahil","elon ","ambani","riteshagrawal","sahil"));
        arrayList.add(new OIRQUESTIONfive("whvrbtbtbtrrepenour","sahil","elon ","ambani","riteshagrawal","sahil"));
        arrayList.add(new OIRQUESTIONfive("ws rbwribmrentrepenour","sahil","elon ","ambani","riteshagrawal","sahil"));
        arrayList.add(new OIRQUESTIONfive("who nmrigigjtrepenour","sahil","elon ","ambani","riteshagrawal","sahil"));

        this.addAllquestion(arrayList);

    }
    private void addAllquestion(ArrayList<OIRQUESTIONfive> allQuestions) {

        SQLiteDatabase db=this.getWritableDatabase();

        db.beginTransaction();


        try{

            ContentValues values=new ContentValues();

            for (OIRQUESTIONfive question:allQuestions){
                values.put(QUESTION,question.getQuestionfive());
                values.put(OPTA,question.getOptfivea());
                values.put(OPTB,question.getOptfiveb());
                values.put(OPTC,question.getOptfivec());
                values.put(OPTD,question.getOptfived());
                values.put(ANSWER,question.getAnswerfive());
                db.insert(TABLE_NAME,null,values);


            }
            db.setTransactionSuccessful();
        }finally {
            db.endTransaction();
            db.close();
        }



    }


    List<OIRQUESTIONfive> getALLofTheQuestion(){

        List<OIRQUESTIONfive> oirquestionList=new ArrayList<>();

        SQLiteDatabase db=this.getWritableDatabase();
        db.beginTransaction();

        String coloumn[] = {UID,QUESTION,OPTA,OPTB,OPTC,OPTD,ANSWER};
        Cursor cursor=db.query(TABLE_NAME,coloumn,null,null,null,null,null);

        while (cursor.moveToNext()){
            OIRQUESTIONfive question=new OIRQUESTIONfive();
            question.setId(cursor.getInt(0));
            question.setQuestionfive(cursor.getString(1));
            question.setOptfivea(cursor.getString(2));
            question.setOptfiveb(cursor.getString(3));
            question.setOptfivec(cursor.getString(4));
            question.setOptfived(cursor.getString(5));
            question.setAnswerfive(cursor.getString(6));
            oirquestionList.add(question);



        }

        db.setTransactionSuccessful();
        db.endTransaction();
        cursor.close();
        db.close();
        return oirquestionList;
    }




}
