package example.android.quizapp;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import java.util.List;

import example.android.quizapp.databinding.QuestionItemBinding;

/**
 * Created by Onur on 14.01.2017.
 */

public class ViewAdapter extends RecyclerView.Adapter<ViewAdapter.BindingHolder> {

    private List<Question> questionList;
    private Context context;

    public ViewAdapter(List<Question> accountList, Context context) {
        this.questionList = accountList;
        this.context = context;
    }

    @Override
    public BindingHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        QuestionItemBinding binding = DataBindingUtil.inflate(
                LayoutInflater.from(parent.getContext()),
                R.layout.question_item, parent, false);

        return new ViewAdapter.BindingHolder(binding);
    }

    @Override
    public void onBindViewHolder(BindingHolder holder, int position) {
        QuestionItemBinding binding = holder.binding;
        binding.setQuestion(questionList.get(position));
        MainActivity handler = new MainActivity();
        binding.setHandler(handler);
    }

    @Override
    public int getItemCount() {
        return questionList.size();
    }


    static class BindingHolder extends RecyclerView.ViewHolder {
        private QuestionItemBinding binding;

        BindingHolder(QuestionItemBinding binding) {
            super(binding.questionCard);
            this.binding = binding;
        }
    }
}
