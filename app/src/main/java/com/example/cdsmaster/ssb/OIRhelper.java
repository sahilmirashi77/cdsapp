package com.example.cdsmaster.ssb;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

 class OIRhelper extends SQLiteOpenHelper {

    private Context context;
    private  static final String DB_NAME="OIR.db";

    private static final int DB_VERSION=10;

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


     OIRhelper(Context context) {
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

        ArrayList<OIRQUESTION> arrayList=new ArrayList<>();

        arrayList.add(new OIRQUESTION("Arrange  the following words as per order in english dictionary category 1)caricature 2)cardinol     3)carnivore   4)cartoon "
                ,"1,2,3,4,5","2,1,3,5,4 ","2,1,2,4,5","4,5,1,3,2","2,1,3,5,4"));

        arrayList.add(new OIRQUESTION("how many 3's are there in the following series which are immediately peceded by 7 but not by immediately followed by 9? 2 4 7 3 9 6 5 7 3 8 5 4 3 6 7 3 5 4 1 9 3 8 7 3 9 6 4 5 2 3 9 7 3 5 4 ","2","4 ","3","1","3"));
        arrayList.add(new OIRQUESTION("five boys rakesh,anil,mahesh ,suresh and ranjith are sitting in circle .Anil is sitting in between rakesh and suresh .to manjith's right suresh is seated.Who is seated to mahesh's left ? ","anil","suresh ","Manjith","rakesh","rakesh"));
        arrayList.add(new OIRQUESTION("in row of 6 members ,D and C are immediate neighbours of E ,B is a neigbhor of A only.A is fourth from F .Who are on the two end points ","F,B","B,D","C,A","F,C","F,B"));
        arrayList.add(new OIRQUESTION("10,5,8,4,6,?","1","2","3","7","3"));
        arrayList.add(new OIRQUESTION("If MADRAS can be written as ARSARS , how can ARKONAM be written in that  is","a. ROAAKNM" , "b. ROAKANM" , "c. ROAKNNM" , "d. ROKANAM", "ROAAKNM"));
        arrayList.add(new OIRQUESTION("If in a certain language FASHION is coded as FOIHSAN ,how is PROBLEM coded in that code?","NOIHSAF","FASHNOI","FOIHSAN","HIOFAN","FOIHSAN"));
        arrayList.add(new OIRQUESTION("If BOMBAY is written as MYMYMY ,how will TAMILNADU be written in that" ,"a. TIATIATIA"  ,               "b. IATIATIAT" , "c. MNUMNUMNU" , "d. ALDALDALD!", "c. MNUMNUMNU"));
        arrayList.add(new OIRQUESTION("Write the last alphabet of the word which comes last in the dictionary.","Guide","Hail", " Gulp", "Gym" , "Guide"));

        arrayList.add(new OIRQUESTION("II","Half", "Hand" , "Handy", "Hard", "Hard"));

        arrayList.add(new OIRQUESTION("“A rolling stone gathers no moss ” means" , "a. Someone who does not settle in one place rarely prospers" , "b. Stone rolling down a hill moves faster", "c. One should keep moving forward inhis life " , "d. One should not stop.", "a. Someone who does not settle in one place rarely prospers"));

        arrayList.add(new OIRQUESTION("By how many degrees minute hand rotates in 45minutes" , "a. 45°" , "b. 90°" , "c. 180°" , "d. 270°","d. 270°"));
        arrayList.add(new OIRQUESTION("Degree covered by hour  hand in 6 hours is", "a. 45°", " b. 90°", "c. 180°", "d. 360°","c. 180°"));
        arrayList.add(new OIRQUESTION("Statement India is a secular country because " , "a.India’s prime minister is a secular person" , "b.India’s people are secular" , "c.Indian constitution is secular" , "d. Cause it is a democratic country","c.Indian constitution is secular"));
        arrayList.add(new OIRQUESTION("Statement India has 28 states because ", "a. India was created by joining 28 states in 1947", "b. India has a federal government ", "c. Cause it  was more difficult to govern one large state" , "d. people were not ready to live in a single state","a. India was created by joining 28 states in 1947"));
        arrayList.add(new OIRQUESTION("Write the smallest number from the following given", "1. 7547" , "2. 5792" , "3. 7203" , "4. 5934","5792"));
        arrayList.add(new OIRQUESTION("II" , "1. 467922", "2. 468910" , "3. 461093" , "4. 497252","461093"));
        arrayList.add(new OIRQUESTION("EAR:HEAR::EYE?","MAN","SEE","SMELL","HEAD","SEE"));
        arrayList.add(new OIRQUESTION("COBBLER:SHOE::CARPENTER:?","FURNITURE","GOLD","WOOD","IRON","FURNITURE"));
        arrayList.add(new OIRQUESTION("42572 stands for WORDLD, then 7252 stands for ","DOLR","ROLD","LORD","OLRD","LORD"));
        arrayList.add(new OIRQUESTION("If HOME=2541,SHOP=8256,WORK=9573,SMOKE?)","85431","84531","83451","84351","84531"));
        arrayList.add(new OIRQUESTION("If'+'means'*';'-'means'+';'*'means'/'and'/'means'-',thenthevalueof   9*4+2-5*10/3","2","-.2","3","5","2"));
        arrayList.add(new OIRQUESTION("chose the odd one out","BCD","KMN","QRS","GHI","KMN"));
        arrayList.add(new OIRQUESTION("chose odd one out","BDGK","JLOS","NPSW","MORU","MORU"));
        arrayList.add(new OIRQUESTION("CHOSE odd one out","CFIL","PSVX","JMPS","ORUX","PSVX"));
        arrayList.add(new OIRQUESTION("COMPLETE the series    2,5,10,17,_,37,50","30","28","26","25","26"));
        arrayList.add(new OIRQUESTION("2,7,28,63,126,_","201","215","216","217","217"));
        arrayList.add(new OIRQUESTION("2,6,14,30,62,_","124","126","128","132,","126"));
        arrayList.add(new OIRQUESTION("arrange in alphabetic order and choose that comes first","grammer","granary","gradient","grand","gradient"));
        arrayList.add(new OIRQUESTION("arrange in alphabetic order and choose that comes first","nature","native","narrate","nascent","narrate"));
        arrayList.add(new OIRQUESTION("arrange in alphabetic order and choose that comes first","WASP","WASTE","WAR","WRINKLE","WAR"));
        arrayList.add(new OIRQUESTION("arrange in alphabetic order and choose that comes first","ANIMATE","ANIMOSITY","ANGUISH","ANKLE","ANGUISH"));
        arrayList.add(new OIRQUESTION("Sushant introduced raja  the son of only brother of his father's wife how is suhantrelated to raj?","cousin","uncle","son","son-in-law","cousin"));
        arrayList.add(new OIRQUESTION("introducing a man,a woman said,'he is the only son of my mother'smother.'how the man is related woman","mother","aunt","uncle","niece","niece"));
        arrayList.add(new OIRQUESTION("Showing a man recieving the award,soni said,'he is the brother of my uncle's daughter.'who is the man to soni?","Son","cousin","brother-in-law","nephew","cousin"));
        arrayList.add(new OIRQUESTION("meena is eleventh from either end of row of girls How many girls are there in that row?", "19","20","21","23","21"));
        arrayList.add(new OIRQUESTION("In class class ajay is 15th in rank from the top and 21st from the bottom .How many students are there in the class?","34","36","32","35","35"));
        arrayList.add(new OIRQUESTION("odd one out ","PEN","CALCULATOR","PENCIL","INK","CALCULATOR"));
        arrayList.add(new OIRQUESTION("odd one out ","LAKE","POND","POOL","BROOK","BROOK"));
        arrayList.add(new OIRQUESTION("plant:botany::Bird:?","ZOALOGY","ORNITHOLOGY","ANTHROPOLOGY","GEOLOGY","ORNITHOLOGY"));
        arrayList.add(new OIRQUESTION("196,169,144,121,100,81,64","49","169","144","121","49"));
        arrayList.add(new OIRQUESTION("AZ,BY,CX","EF","GH","IJ","DW","DW"));
        arrayList.add(new OIRQUESTION("15,11,24,51,106,_","217","128","216","212","217"));




        this.addAllquestion(arrayList);

    }

    private void addAllquestion(ArrayList<OIRQUESTION> allQuestions) {

        SQLiteDatabase db=this.getWritableDatabase();

        db.beginTransaction();


        try{

            ContentValues values=new ContentValues();

            for (OIRQUESTION question:allQuestions){
                values.put(QUESTION,question.getQuestion());
                values.put(OPTA,question.getOpta());
                values.put(OPTB,question.getOptb());
                values.put(OPTC,question.getOptc());
                values.put(OPTD,question.getOptd());
                values.put(ANSWER,question.getAnswer());
                db.insert(TABLE_NAME,null,values);


            }
            db.setTransactionSuccessful();
        }finally {
            db.endTransaction();
            db.close();
        }



    }


    List<OIRQUESTION> getALLofTheQuestion(){

        List<OIRQUESTION> oirquestionList=new ArrayList<>();

        SQLiteDatabase db=this.getWritableDatabase();
        db.beginTransaction();

        String coloumn[] = {UID,QUESTION,OPTA,OPTB,OPTC,OPTD,ANSWER};
        Cursor cursor=db.query(TABLE_NAME,coloumn,null,null,null,null,null);

        while (cursor.moveToNext()){
            OIRQUESTION question=new OIRQUESTION();
            question.setId(cursor.getInt(0));
            question.setQuestion(cursor.getString(1));
            question.setOpta(cursor.getString(2));
            question.setOptb(cursor.getString(3));
            question.setOptc(cursor.getString(4));
            question.setOptd(cursor.getString(5));
            question.setAnswer(cursor.getString(6));
            oirquestionList.add(question);



        }

        db.setTransactionSuccessful();
        db.endTransaction();
        cursor.close();
        db.close();
        return oirquestionList;
    }

}
