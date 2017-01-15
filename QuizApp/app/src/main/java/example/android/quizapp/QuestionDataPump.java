package example.android.quizapp;

import java.util.ArrayList;

/**
 * Created by Onur on 14.01.2017.
 */

public class QuestionDataPump {
    public static ArrayList<Question>getAllQuestions(){
        ArrayList<Question> questionList = new ArrayList<>();

        String question1 ="Which Object creation is correct?";
        String q1AnswerTxt1 = "String name = \"Test\";";
        Answer q1Answer1 = new Answer(q1AnswerTxt1, true);
        String q1AnswerTxt2 = "String name = Test;";
        Answer q1Answer2 = new Answer(q1AnswerTxt2, false);
        String q1AnswerTxt3 = "string name = \"Test\";";
        Answer q1Answer3 = new Answer(q1AnswerTxt3, false);
        String q1AnswerTxt4 = "String name = \"Test\"";
        Answer q1Answer4 = new Answer(q1AnswerTxt4, false);
        Question firstQuestion = new Question(question1,q1Answer1,q1Answer2,q1Answer3,q1Answer4);

        String question2 ="What is the output of : String concat = \"Hello\" + \"World\";";
        String q2AnswerTxt1 = "Hello world";
        Answer q2Answer1 = new Answer(q2AnswerTxt1, false);
        String q2AnswerTxt2 = "Helloworld";
        Answer q2Answer2 = new Answer(q2AnswerTxt2, false);
        String q2AnswerTxt3 = "HelloWorld";
        Answer q2Answer3 = new Answer(q2AnswerTxt3, true);
        String q2AnswerTxt4 = "Hello World";
        Answer q2Answer4 = new Answer(q2AnswerTxt4, false);
        Question secondQuestion = new Question(question2,q2Answer1,q2Answer2,q2Answer3,q2Answer4);

        String question3 ="Which one is not a binary oparator?";
        String q3AnswerTxt1 = "&";
        Answer q3Answer1 = new Answer(q3AnswerTxt1, false);
        String q3AnswerTxt2 = "|";
        Answer q3Answer2 = new Answer(q3AnswerTxt2, false);
        String q3AnswerTxt3 = "^";
        Answer q3Answer3 = new Answer(q3AnswerTxt3, true);
        String q3AnswerTxt4 = ">";
        Answer q3Answer4 = new Answer(q3AnswerTxt4, true);
        Question thirdQuestion = new Question(question3,q3Answer1,q3Answer2,q3Answer3,q3Answer4);


        String question4 ="Which is not a primitive datatype?";
        String q4AnswerTxt1 = "int";
        Answer q4Answer1 = new Answer(q4AnswerTxt1, false);
        String q4AnswerTxt2 = "extends";
        Answer q4Answer2 = new Answer(q4AnswerTxt2, true);
        String q4AnswerTxt3 = "String";
        Answer q4Answer3 = new Answer(q4AnswerTxt3, false);
        String q4AnswerTxt4 = "Long";
        Answer q4Answer4 = new Answer(q4AnswerTxt4, false);
        Question fourthQuestion = new Question(question4,q4Answer1,q4Answer2,q4Answer3,q4Answer4);

        String question5 ="Which View represents a picture in android?";
        String q5AnswerTxt1 = "ImageView";
        Answer q5Answer1 = new Answer(q5AnswerTxt1, true);
        String q5AnswerTxt2 = "TextView";
        Answer q5Answer2 = new Answer(q5AnswerTxt2, false);
        String q5AnswerTxt3 = "Button";
        Answer q5Answer3 = new Answer(q5AnswerTxt3, false);
        String q5AnswerTxt4 = "LinearLayout";
        Answer q5Answer4 = new Answer(q5AnswerTxt4, false);
        Question fifthQuestion = new Question(question5,q5Answer1,q5Answer2,q5Answer3,q5Answer4);

        questionList.add(firstQuestion);
        questionList.add(secondQuestion);
        questionList.add(thirdQuestion);
        questionList.add(fourthQuestion);
        questionList.add(fifthQuestion);
        return questionList;
    }
}
