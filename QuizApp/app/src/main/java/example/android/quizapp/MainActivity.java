package example.android.quizapp;

import android.databinding.DataBindingUtil;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;


import example.android.quizapp.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
    static Manager manager;
    static int position=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        binding.questionView.setHasFixedSize(true);
        manager = new Manager(this,LinearLayoutManager.HORIZONTAL,false);
        manager.setScrollEnabled(false);
        binding.questionView.setLayoutManager(manager);
        ViewAdapter adapter = new ViewAdapter(QuestionDataPump.getAllQuestions(), this);
        binding.questionView.setAdapter(adapter);
    }

    public void logAnswer(final View view, Answer answer){
        if(answer.isValue()){
            view.setBackgroundColor(Color.GREEN);
            view.setClickable(false);
            view.postDelayed(new Runnable() {
                @Override
                public void run() {
                    view.setBackgroundColor(Color.WHITE);
                    manager.scrollToPosition(position);
                }
            },1000);
            position++;
            if(position>=5)  position = 0;
            Log.d("POSITION",String.valueOf(position));
            view.setClickable(true);
        } else {
            view.setBackgroundColor(Color.RED);
            view.postDelayed(new Runnable() {
                @Override
                public void run() {
                    view.setBackgroundColor(Color.WHITE);
                }
            },1000);
        }
    }

}
