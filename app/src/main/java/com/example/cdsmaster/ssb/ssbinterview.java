package com.example.cdsmaster.ssb;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;


import android.text.Html;
import android.text.Spanned;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;


import com.example.cdsmaster.R;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ssbinterview extends AppCompatActivity {



    ExpandableListView  expandableListView;

    List<String>  faq;
    Map<String,List<String>>  content;

    ExpandableListAdapter  listAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ssbinterview);


        expandableListView=findViewById(R.id.expandablelistview);
        filldata();


        listAdapter=new Myexpandablelistadapter(this,faq,content);
        expandableListView.setAdapter(listAdapter);

    }

    public void filldata()
    {
        faq=new ArrayList<>();
        content=new HashMap<>();
        faq.add("DO'S and DONT'S");
        faq.add("FREQUENTLY ASKED QUESTION ONE");
        faq.add("FREQUENTLY ASKED QUESTION Two");
        faq.add("FREQUENTLY ASKED QUESTION Three");
        faq.add("FREQUENTLY ASKED QUESTION four");
        faq.add("FREQUENTLY ASKED QUESTION five");

        List<String>   questionone=new ArrayList<>();
        List<String>    questiontwo=new ArrayList<>();
        List<String>    questionthree=new ArrayList<>();
        List<String>    questionfour=new ArrayList<>();
        List<String>    questionfive=new ArrayList<>();
        List<String>    questionsix=new ArrayList<>();

        questionone.add("Some basics which a candidate must keep in mind while preparing during an interview are as under:\n" +
                "\n" +
                "1.Be appropriately turned out for the interview.\\n\n" +
                "2.Look smart, cheerful and enthusiastic.\\n\n" +
                "3.Must remain happy and calm and respond politely to the interviewing officer\\'s welcome remark.\\n\n" +
                "4.Be audible but not too loud. Appear keen to speak and respond to questions.\\n\n" +
                "5.Sit straight and comfortably, do not fidget, do not keep moving your hands and legs.\\n\n" +
                "6.Acknowledge questions being asked by gently nodding your head and maintain eye contact throughout.\\n\n" +
                "7.If you have not understood anything, politely ask for a clarification or to repeat the question.\\n\n" +
                "8.Must be clear about facts and figures regarding your bio data, marks obtained, ranking in competitive exams, dates, names of school / institution, teachers, friends etc. Avoid stating \"I do not remember\" and respond as far as possible.\\n\n" +
                "9.A large number of questions are normally asked at one go in a sequence. Try and remember all these questions and attempt to answer them in the same sequence. If you fail to recollect all questions, finish those you remember and then request to clarify for anything, left out.\\n\n" +
                "10.Prep well in general knowledge for the interview. You are expected to be aware about current events, if asked.\\n\n" +
                "11.Talk about hobbies, participation in games and sports, adventure activities and any other interests. You must have adequate technical knowledge about your hobbies and games you play. You shall get some questions on these.\\n\n" +
                "12.Utilize your time while waiting for interview by reading newspapers and journals available in waiting room.\\n\n" +
                "13.Watch TV News for updating yourself in candidates lines / waiting room.\\n\n" +
                "14.Remain relaxed and at ease throughout during the interview.\\n\n" +
                "15.Listen to complete questions before attempting to reply.\\n\n" +
                "16.Be truthful and honest while replying to questions.\\n  + \n" +
                "    Dont\\'s:\n" +
                "\n" +
                "Do not be shabbily dressed.\\n\n" +
                "Don not be under stress during interview.\\n\n" +
                "Do not discuss the questions asked by interviewing officer.\\n\n" +
                "Never lie or put up a false pretense.\\n\n" +
                "If you are well read it is an advantage. If not, do not pretend to have read books/magazines and newspapers which you have only heard of.\\n\n" +
                "Do not reply as has been told to you by the candidates interviewed before you. Their questions may have had a different perspective.\\n\n" +
                "Avoid guess work. Better be polite and say I don not know, sir, I shall find out.\\n\n" +
                "Avoid being rigid, restorative, argumentative, overbearing, complacent and stiff, throughout the interview.\\n\n" +
                "Don not keep mobile, watch etc on person during interview.\\n"
        );
        questiontwo.add("Your academic performance starting from your 10th class till graduation.\n" +
                "• Your academic scores in each class and semesters.\n" +
                "• State your academic achievements if any.\n" +
                "• The teachers you liked and why did you like them.\n" +
                "• The teachers you didn’t like and why so.\n" +
                "• The subjects you liked and why.\n" +
                "• The subjects you didn’t like and why so.\n" +
                "• The subjects you were weak in and how did you improve on them.\n" +
                "• Who are your best friends and why.\n" +
                "• Tell your friend’s one good and one bad quality.\n" +
                "• Tell one quality from each of your friend’s that you like and want to learn.\n" +
                "• The games and sports you participated in.\n" +
                "• Extra co-curricular activities you took part in.\n" +
                "• State your achievements in these if any. C\n");
        questionthree.add("\n" +
                "•Who all are in your family and their occupation.\n" +
                "• Do you stay with them or not. If not then how often you visit them and when.\n" +
                "• What all activities you do together and how do you spend time with them.\n" +
                "• Who are you closer to your mother or your father.\n" +
                "• Whom do you approach when you require help or are facing any problem.\n" +
                "• How do you help your parents at home.\n" +
                "• If you have any monetary need whom do you approach.\n" +
                "• How do you spend your money and how much do you save.\n" +
                "• If you have neighbours what are your relations with them");
        questionfour.add("•What is your routine during weekdays.\n" +
                "• What is your routine during weekends.\n" +
                "• How you spend your spare time.\n" +
                "• What are your hobbies.\n" +
                "• Questions relating to your hobbies.\n" +
                "• What are your interests.\n" +
                "• Questions relating to your interests.\n" +
                "• What are the activities you take part in your family or society at festivals.\n" +
                "• Why didn’t you consider your hobby as a career path.\n" +
                "• If you had some more spare time what would you do.");
        questionfive.add("•What sport you play and which level did you play at.\n" +
                "• Your achievements in the sport.\n" +
                "• Specific rules and regulations of that sport.\n" +
                "• Any current affairs related to the sport.\n" +
                "• Captain of the Indian Team for that sport and last tournament played.\n" +
                "• Famous Indian Personalities of that sport.\n" +
                "• Why do you like that sport.\n" +
                "• What did you learn from sports.\n" +
                "• What extra co-curricular activities you participated in.\n" +
                "• Why did you choose these activities over the others.\n" +
                "• What have been your achievements in them.\n" +
                "• Famous Indian Personalities in them if any.\n" +
                "• Major news of the past month or two months.\n" +
                "• India’s geo-political situation and relations with different countries.\n" +
                "• Main headlines of that day’s newspaper.\n" +
                "• International news relating to India.\n" +
                "• Physical geography.\n" +
                "• Current Affairs.");
        questionsix.add("1. Introductory Questions\n" +
                "These types of questions are generally asked to make you feel at ease with the IO. These questions can be easily answered by all candidates\n" +
                "Few examples if such questions may be,\n" +
                "\n" +
                "    What is the meaning of your name?\n" +
                "    Tell me something about your city/town.\n" +
                "    List out 5 things you like the most about your native place.\n" +
                "\n" +
                "While answering such questions, do not provide one-line answers but don’t be too descriptive as well. Be precise and informative at the same time.\n" +
                "\n" +
                "    Your answer should cover most important things about your native place or things your place is most popular for.\n" +
                "\n" +
                "2. Rapid Fire Questions and Stress Questions\n" +
                "Rapid Fire Questions & Stress Questions are important and play a vital role in deciding your recommendation for SSB.\n" +
                "\n" +
                "    Stress Questions will allow the IO to check the original personality of the candidate, how he/she reacts to them and about his/her temper.\n" +
                "\n" +
                "IO checks whether the candidate has optimistic attitude towards hard or stressful situations, keeps his calm and has good-decision making capability or not.\n" +
                "Stress Questions generally comprise of set of questions on the same topic until the candidate has uttered all of his knowledge on the subject.\n" +
                "For example,\n" +
                "What is the difference between drum brake and disc brake? Which one is better? Which type of brake is used in cars? Why? Why do some vehicles use disk brake as well as drum brake? And so on…….\n" +
                "IO will continue to grill you on the subject to check your temper. Candidates need to keep their calm and answer as much as he/she knows. If you don’t know the answer, you can clearly say it to the IO. But avoid faking or lying.\n" +
                "Sometimes, IO might ask you questions related to completely different academic stream as well, just to see your pulse.\n" +
                "Rapid Fire Questions are nearly set of 10 to 15 questions asked all at the same time by IO. He checks how attentively you’ve listened and how truthfully you will answer them.\n" +
                "Rapid Fire Questions can be about your family, friends, educational background, about yourself, hobbies, interests, etc. All of these questions will be asked based on your PIQ form only.\n" +
                "And, all of the answers provided in your PIQ form must match with your answers given during PI.\n" +
                "3. Current Affairs & GK Questions\n" +
                "In this session, IO might ask questions related to national or international issues and ask you to provide a solution. This is to check your knowledge and approach towards life problems.\n" +
                "IO might also ask questions about history, geography and other GK-related subjects. This is to check your Social awareness and Basic Intelligence.\n" +
                "4. Technical Questions\n" +
                "If you are from a technical background or engineering field, IO might ask you some technical/practical questions that we may come across during day-to-day life.\n" +
                "This is to check your practical knowledge about your stream and how you apply it in your daily life.\n" +
                "5. Armed Forces Questions\n" +
                "It is essential for every candidate to have basic knowledge about the branch they want to join. Get to know about history and current news related to that particular Armed Forces branch.\n");


        content.put(faq.get(0),questionone);
        content.put(faq.get(1),questiontwo);
        content.put(faq.get(2),questionthree);
        content.put(faq.get(3),questionfour);
        content.put(faq.get(4),questionfive);
        content.put(faq.get(5),questionsix);





    }
}
