package com.muharlyam.mplearning;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import android.os.StrictMode;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.muharlyam.mplearning.model.Question;
import com.muharlyam.mplearning.repository.NetworkRepository;
import com.muharlyam.mplearning.viewmodel.QuestionViewModel;

public class MainFragment extends Fragment {

    NetworkRepository repository = new NetworkRepository();
    private QuestionViewModel viewModel;
    private TextView questionView;
    private TextView answerView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder()
                .permitAll().build();
        StrictMode.setThreadPolicy(policy);

        View view = inflater.inflate(R.layout.fragment_main, container, false);

        Button questionButton = view.findViewById(R.id.question_button);
        Button answerButton = view.findViewById(R.id.answer_button);
        questionView = view.findViewById(R.id.question_view);
        answerView = view.findViewById(R.id.answer_view);

        viewModel = new ViewModelProvider(this).get(QuestionViewModel.class);

        viewModel.getQuestion().observe(getViewLifecycleOwner(), question -> {
            questionView.setText(question);
        });

        viewModel.getAnswer().observe(getViewLifecycleOwner(), answer -> {
            answerView.setText(answer);
        });

        questionButton.setOnClickListener(v -> {
            Question randomQuestion = repository.getRandomQuestion();

            if (randomQuestion != null) {
                if (randomQuestion.getQuestion() != null) {
                    viewModel.setQuestion(randomQuestion.getQuestion());
                }

                if (randomQuestion.getAnswer() != null) {
                    viewModel.setAnswer(randomQuestion.getAnswer());
                    answerView.setVisibility(View.INVISIBLE);
                }
            }
        });

        answerButton.setOnClickListener(v -> {
            answerView.setVisibility(View.VISIBLE);
        });

        return view;
    }
}