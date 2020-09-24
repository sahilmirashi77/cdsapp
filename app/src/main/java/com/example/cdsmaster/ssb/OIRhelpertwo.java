package com.example.cdsmaster.ssb;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.List;


public class OIRhelpertwo extends SQLiteOpenHelper {



    private Context context;
    private  static final String DB_NAME="OIRtwo.db";

    private static final int DB_VERSION=8;

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


    OIRhelpertwo(Context context) {
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

        ArrayList<OIRQUESTIONtwo> arrayList=new ArrayList<>();


        arrayList.add(new OIRQUESTIONtwo("In each of the following questions find out the alternative which will replace the question mark. CUP : LIP :: BIRD : ?","BUSH","GRASS","FOREST","BEAK","BEAK"));
       arrayList.add(new OIRQUESTIONtwo("Flow : River :: Stagnant : ?","Rain","Stream","Pool","Canal","Pool"));
        arrayList.add(new OIRQUESTIONtwo("Paw : Cat :: Hoof : ?","Lamb","Elephant","Lion","Horse","Horse"));
        arrayList.add(new OIRQUESTIONtwo("Peacock : India :: Bear : ?","Australia","england","america","Russia","Russia"));
        arrayList.add(new OIRQUESTIONtwo("120, 99, 80, 63, 48, ?","35","57","42","38","35"));
        arrayList.add(new OIRQUESTIONtwo("589654237, 89654237, 8965423, 965423, ?","96542","657939","65423","589654237","96542"));
        arrayList.add(new OIRQUESTIONtwo("3, 10, 101,?","10202","2002","10201","2003","10202"));
        arrayList.add(new OIRQUESTIONtwo("In the series 2, 6, 18, 54, ...... what will be the 8th term ?","4379","4378","7832","4374","4374"));
        arrayList.add(new OIRQUESTIONtwo("125,80,45,20,?","15","5","25","10","5"));
        arrayList.add(new OIRQUESTIONtwo("One morning Udai and Vishal were talking to each other face to face at a crossing. If Vishal's shadow was exactly to the left of Udai, which direction was Udai facing?","East","West","North","South","North"));
        arrayList.add(new OIRQUESTIONtwo("Y is in the East of X which is in the North of Z. If P is in the South of Z, then in which direction of Y, is P?","North-East","South-West","North","None of the above","None of the above"));
        arrayList.add(new OIRQUESTIONtwo("A man walks 5 km toward south and then turns to the right. After walking 3 km he turns to the left and walks 5 km. Now in which direction is he from the starting place?","West","South-West","North","West","South-West"));
        arrayList.add(new OIRQUESTIONtwo("Rahul put his timepiece on the table in such a way that at 6 P.M. hour hand points to North. In which direction the minute hand will point at 9.15 P.M. ?","North","West","North-West","South","West"));
        arrayList.add(new OIRQUESTIONtwo("If a boy starting from Nilesh, met to Ankur and then to Kumar and after this he to Dev and then to Pintu and whole the time he walked in a straight line, then how much total distance did he cover?","215","220","190","130","215"));
        arrayList.add(new OIRQUESTIONtwo("The meteorological Department has issued a statement mentioning deficient rainfall during monsoon in many parts of the country.\n" +
                "The Government has lowered the revised estimated GDP growth from the level of earlier estimates.","Statement I is the cause and statement II is its effect.","Statement II is the cause and statement I is its effect.","\tBoth the statements I and II are independent causes.","Both the statements I and II are effects of independent causes.","Both the statements I and II are effects of independent causes."));
        arrayList.add(new OIRQUESTIONtwo("The staff of Airport Authorities called off the strike they were observing in protest against privatization.\n" +
                "The staff of Airport Authorities went on strike anticipating a threat to their jobs.","Statement I is the cause and statement II is its effect.","Statement II is the cause and statement I is its effect","Both the statements I and II are independent causes","Both the statements I and II are effects of independent causes.","Both the statements I and II are effects of independent causes."));
        arrayList.add(new OIRQUESTIONtwo("A huge truck overturned on the middle of the road last night.\n" +
                "The police had cordoned of entire area in the locality this morning for half of the day.","Statement I is the cause and statement II is its effect.","Statement II is the cause and statement I is its effect.","\tBoth the statements I and II are independent causes.","Both the statements I and II are effects of independent causes.","Statement I is the cause and statement II is its effect."));
        arrayList.add(new OIRQUESTIONtwo("Importance of Yoga and exercise is being realized by all sections of the society.\n" +
                "There is an increasing awareness about health in the society particularly among middle ages group of people.","Statement I is the cause and statement II is its effect.","Statement II is the cause and statement I is its effect.","Both the statements I and II are independent causes.","Both the statements I and II are effects of independent causes.","Statement II is the cause and statement I is its effect."));
        arrayList.add(new OIRQUESTIONtwo("The total of the ages of Amar, Akbar and Anthony is 80 years. What was the total of their ages three years ago ?","74","71","76","77","71"));
        arrayList.add(new OIRQUESTIONtwo("\t\n" +
                "An institute organised a fete and 1/5 of the girls and 1/8 of the boys participated in the same. What fraction of the total number of students took part in the fete ?","2/13","12/40","dataInAdequate","20/13","dataInAdequate"));
        arrayList.add(new OIRQUESTIONtwo("A number of friends decided to go on a picnic and planned to spend Rs. 96 on eatables. Four of them, however, did not turn up. As a consequence, the remaining ones had to contribute Rs. 4 each extra. The number of those who attended the picnic was","12","8","24","10","8"));
        arrayList.add(new OIRQUESTIONtwo("\t\n" +
                "A, B, C, D and E play a game of cards. A says to B, \"If you give me three cards, you will have as many as E has and if I give you three cards, you will have as many as D has.\" A and B together have 10 cards more than what D and E together have. If B has two cards more than what C has and the total number of cards be 133, how many cards does B have ?","24","25","27","42","25"));
        arrayList.add(new OIRQUESTIONtwo("Pointing to a photograph of a boy Suresh said, \"He is the son of the only son of my mother.\" How is Suresh related to that boy?","niece","nephew","uncle","father","father"));
        arrayList.add(new OIRQUESTIONtwo("\t\n" +
                "If A is the brother of B; B is the sister of C; and C is the father of D, how D is related to A?","Brother","Wife","Nephew","CannotbeDetermined","CannotbeDetermined"));
        arrayList.add(new OIRQUESTIONtwo("Introducing a boy, a girl said, \"He is the son of the daughter of the father of my uncle.\" How is the boy related to the girl?","Brother","Father","Nephew","Uncle","Brother"));
        arrayList.add(new OIRQUESTIONtwo("\t\n" +
                "Choose the word which is different from the rest.","Chicken","Snake","Swan","Crocodile","Chicken"));
        arrayList.add(new OIRQUESTIONtwo("\t\n" +
                "Choose the word which is different from the rest.","Cap","Turban","Veil","Helmet","Veil"));
        arrayList.add(new OIRQUESTIONtwo("Odd one out","Kiwi","Ostrich","chicken","Eagle","Eagle"));
        arrayList.add(new OIRQUESTIONtwo("\t\n" +
                "Choose the word which is different from the rest.","Curd","Butter","Oil","Milk","Oil"));
        arrayList.add(new OIRQUESTIONtwo("Arrange the words given below in a meaningful sequence.\n" +
                "\n" +
                "1. Key\t2. Door\t3. Lock\n" +
                "4. Room\t5. Switch on\t","1,3,2,4,5","1,5,4,3,2","1,4,3,2,5","1,5,2,3,4","1,3,2,4,,5"));
        arrayList.add(new OIRQUESTIONtwo("\t\n" +
                "Arrange the words given below in a meaningful sequence.\n" +
                "\n" +
                "1. Police\t2. Punishment\t3. Crime\n" +
                "4. Judge\t5. Judgement\t ","3,1,2,4,5","5,2,1,4,3","3,1,4,5,2","3,4,5,1,2","3,1,4,5,2"));
        arrayList.add(new OIRQUESTIONtwo("\t\n" +
                "Arrange the words given below in a meaningful sequence.\n" +
                "\n" +
                "1. Family\t2. Community\t3. Member\n" +
                "4. Locality\t5. Country","3,1,2,4,5","2,1,3,4,5","1,2,4,3,5","3,1,4,5,2","3,1,2,4,5"));
        arrayList.add(new OIRQUESTIONtwo("Arrange the words given below in a meaningful sequence.\n" +
                "\n" +
                "1. Leaf\t2. Fruit\t3. Stem\n" +
                "4. Root\t5. Flower\t ","4,3,1,5,2","4,3,2,1,5","3,4,5,1,2","4,5,2,1,3","4,3,1,5,2"));
        arrayList.add(new OIRQUESTIONtwo("Arrange the words given below in a meaningful sequence.\n" +
                "\n" +
                "1. Nation\t2. Village\t3. City\n" +
                "4. District\t5. State","2,3,4,5,1","3,4,5,2,1","2,3,5,1,4","5,3,2,1,4","2,3,4,5,1"));
        arrayList.add(new OIRQUESTIONtwo("There are 8 houses in a line and in each house only one boy lives with the conditions as given below:\n" +
                "\n" +
                "Jack is not the neighbour Siman.\n" +
                "Harry is just next to the left of Larry.\n" +
                "There is at least one to the left of Larry.\n" +
                "Paul lives in one of the two houses in the middle.\n" +
                "Mike lives in between Paul and Larry.\n" +
                "If at least one lives to the right of Robert and Harry is not between Taud and Larry, then which one of the following statement is not correct ?","Robert is not at the left end.","Robert is in between Simon and Taud.","Taud is in between Paul and Jack.","There are three persons to the right of Paul.","Taud is in between Paul and Jack."));
        arrayList.add(new OIRQUESTIONtwo("\t\n" +
                "A, B, C, D and E are sitting on a bench. A is sitting next to B, C is sitting next to D, D is not sitting with E who is on the left end of the bench. C is on the second position from the right. A is to the right of B and E. A and C are sitting together. In which position A is sitting ?","Between B and D","Between B and C","Between E and D","Between C and E","Between B and C"));
        arrayList.add(new OIRQUESTIONtwo("\t\n" +
                "A train always has","Engine","Rail","Passengers","Buckets","Engine"));
        arrayList.add(new OIRQUESTIONtwo("Which one of the following is always found in 'Bravery'?","Experience","Power","Courage","Laziness","courage"));
        arrayList.add(new OIRQUESTIONtwo("A song always has","word","musician","people","listeners","word"));
        arrayList.add(new OIRQUESTIONtwo("Yesterday I saw an ice cube which had already melted due to heat of a nearby furnace.","Always","Never","often","Sometimes","Never"));
        arrayList.add(new OIRQUESTIONtwo("What is found necessarily in milk?","Whiteness","Thickness","Water","Cream,","Whiteness"));
        arrayList.add(new OIRQUESTIONtwo());

        this.addAllquestion(arrayList);

    }

    private void addAllquestion(ArrayList<OIRQUESTIONtwo> allQuestions) {

        SQLiteDatabase db=this.getWritableDatabase();

        db.beginTransaction();


        try{

            ContentValues values=new ContentValues();

            for (OIRQUESTIONtwo questiontwo:allQuestions){
                values.put(QUESTION,questiontwo.getQuestiontwo());
                values.put(OPTA,questiontwo.getOpttwoa());
                values.put(OPTB,questiontwo.getOpttwob());
                values.put(OPTC,questiontwo.getOpttwoc());
                values.put(OPTD,questiontwo.getOpttwod());
                values.put(ANSWER,questiontwo.getAnswertwo());
                db.insert(TABLE_NAME,null,values);


            }
            db.setTransactionSuccessful();
        }finally {
            db.endTransaction();
            db.close();
        }



    }


    List<OIRQUESTIONtwo> getALLofTheQuestion(){

        List<OIRQUESTIONtwo> oirquestionList=new ArrayList<>();

        SQLiteDatabase db=this.getWritableDatabase();
        db.beginTransaction();

        String coloumn[] = {UID,QUESTION,OPTA,OPTB,OPTC,OPTD,ANSWER};
        Cursor cursor=db.query(TABLE_NAME,coloumn,null,null,null,null,null);

        while (cursor.moveToNext()){
            OIRQUESTIONtwo question=new OIRQUESTIONtwo();
            question.setId(cursor.getInt(0));
            question.setQuestiontwo(cursor.getString(1));
            question.setOpttwoa(cursor.getString(2));
            question.setOpttwob(cursor.getString(3));
            question.setOpttwoc(cursor.getString(4));
            question.setOpttwod(cursor.getString(5));
            question.setAnswertwo(cursor.getString(6));
            oirquestionList.add(question);



        }

        db.setTransactionSuccessful();
        db.endTransaction();
        cursor.close();
        db.close();
        return oirquestionList;
    }

}


