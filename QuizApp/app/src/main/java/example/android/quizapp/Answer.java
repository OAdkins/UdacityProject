package example.android.quizapp;

/**
 * Created by Onur on 14.01.2017.
 */

public class Answer {
    private String answerTxt;
    private boolean value;

    public Answer(String answerTxt, boolean value) {
        this.answerTxt = answerTxt;
        this.value = value;
    }

    public String getAnswerTxt() {
        return answerTxt;
    }

    public void setAnswerTxt(String answerTxt) {
        this.answerTxt = answerTxt;
    }

    public boolean isValue() {
        return value;
    }

    public void setValue(boolean value) {
        this.value = value;
    }
}
