package com.example.cdsmaster.ssb;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class OIRhelperthree extends SQLiteOpenHelper {

    private Context context;
    private  static final String DB_NAME="OIRtwo.db";

    private static final int DB_VERSION=7;

    private static final String TABLE_NAME ="OIR";

    private static final String UID ="_UID";

    private static final String QUESTION = "QUESTION";

    private static final String OPTA =" OPTA";

    private static final String OPTB =" OPTB";

    private static final String OPTC =" OPTC";

    private static final String OPTD =" OTPD";

    private static final String ANSWER = "ANSWER";

    private static final String CREATE_TABLETWO = "CREATE TABLE "+ TABLE_NAME +" ( " + UID + " INTEGER PRIMARY KEY AUTOINCREMENT ," + QUESTION +" VARCHAR(255), " + OPTA +" VARCHAR(255), " + OPTB + " VARCHAR(255), " + OPTC + " VARCHAR(255), "+ OPTD +" VARCHAR, "+ ANSWER +" VARCHAR(255));";

    private static final String DROP_TABLE ="DROP TABLE IF EXISTS "+ TABLE_NAME;


    OIRhelperthree(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
        this.context=context;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL(CREATE_TABLETWO);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL(DROP_TABLE);
        onCreate(db);
    }




    void allQuestion(){

        ArrayList<OIRQUESTIONthree> arrayList=new ArrayList<>();

        arrayList.add(new OIRQUESTIONthree("who is wfnifr","sahil","elon ","ambani","riteshagrawal","sahil"));
        arrayList.add(new OIRQUESTIONthree("who is not en==nvfffvfr","sahil","elon ","ambani","riteshagrawal","sahil"));
        arrayList.add(new OIRQUESTIONthree("who is rfvfvfvpenour","sahil","elon ","ambani","riteshagrawal","sahil"));
        arrayList.add(new OIRQUESTIONthree("who not edsvevervrvntrepenour","sahil","elon ","ambani","riteshagrawal","sahil"));
        arrayList.add(new OIRQUESTIONthree("whotrepenour","sahil","elon ","ambani","riteshagrawal","sahil"));
        arrayList.add(new OIRQUESTIONthree("who is nvefvefvtpenour","sahil","elon ","ambani","riteshagrawal","sahil"));
        arrayList.add(new OIRQUESTIONthree("who is nververvrepenour","sahil","elon ","ambani","riteshagrawal","sahil"));
        arrayList.add(new OIRQUESTIONthree("whvrbtbtbtrrepenour","sahil","elon ","ambani","riteshagrawal","sahil"));
        arrayList.add(new OIRQUESTIONthree("ws rbwribmrentrepenour","sahil","elon ","ambani","riteshagrawal","sahil"));
        arrayList.add(new OIRQUESTIONthree("who nmrigigjtrepenour","sahil","elon ","ambani","riteshagrawal","sahil"));

        this.addAllquestion(arrayList);

    }

    private void addAllquestion(ArrayList<OIRQUESTIONthree> allQuestions) {

        SQLiteDatabase db=this.getWritableDatabase();

        db.beginTransaction();


        try{

            ContentValues values=new ContentValues();

            for (OIRQUESTIONthree question:allQuestions){
                values.put(QUESTION,question.getQuestionthree());
                values.put(OPTA,question.getOptthreea());
                values.put(OPTB,question.getOptthreeb());
                values.put(OPTC,question.getOptthreec());
                values.put(OPTD,question.getOptthreed());
                values.put(ANSWER,question.getAnswerthree());
                db.insert(TABLE_NAME,null,values);


            }
            db.setTransactionSuccessful();
        }finally {
            db.endTransaction();
            db.close();
        }



    }


    List<OIRQUESTIONthree> getALLofTheQuestion(){

        List<OIRQUESTIONthree> oirquestionList=new ArrayList<>();

        SQLiteDatabase db=this.getWritableDatabase();
        db.beginTransaction();

        String coloumn[] = {UID,QUESTION,OPTA,OPTB,OPTC,OPTD,ANSWER};
        Cursor cursor=db.query(TABLE_NAME,coloumn,null,null,null,null,null);

        while (cursor.moveToNext()){
            OIRQUESTIONthree question=new OIRQUESTIONthree();
            question.setId(cursor.getInt(0));
            question.setQuestionthree(cursor.getString(1));
            question.setOptthreea(cursor.getString(2));
            question.setOptthreeb(cursor.getString(3));
            question.setOptthreec(cursor.getString(4));
            question.setOptthreed(cursor.getString(5));
            question.setAnswerthree(cursor.getString(6));
            oirquestionList.add(question);



        }

        db.setTransactionSuccessful();
        db.endTransaction();
        cursor.close();
        db.close();
        return oirquestionList;
    }


}
