package example.android.quizapp;

/**
 * Created by Onur on 14.01.2017.
 */

public class Question {
    private String question;
    private Answer answer1,answer2,answer3,answer4;


    public Question(String question, Answer answer1, Answer answer2, Answer answer3, Answer answer4) {
        this.question = question;
        this.answer1 = answer1;
        this.answer2 = answer2;
        this.answer3 = answer3;
        this.answer4 = answer4;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public void setAnswer1(Answer answer1) {
        this.answer1 = answer1;
    }

    public void setAnswer2(Answer answer2) {
        this.answer2 = answer2;
    }

    public void setAnswer3(Answer answer3) {
        this.answer3 = answer3;
    }

    public void setAnswer4(Answer answer4) {
        this.answer4 = answer4;
    }

    public String getQuestion() {
        return question;
    }

    public Answer getAnswer1() {
        return answer1;
    }

    public Answer getAnswer2() {
        return answer2;
    }

    public Answer getAnswer3() {
        return answer3;
    }

    public Answer getAnswer4() {
        return answer4;
    }
}

