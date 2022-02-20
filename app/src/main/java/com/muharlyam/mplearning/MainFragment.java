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

import com.muharlyam.mplearning.repository.NetworkRepository;
import com.muharlyam.mplearning.viewmodel.QuestionViewModel;

public class MainFragment extends Fragment {

    NetworkRepository repository = new NetworkRepository();
    private QuestionViewModel viewModel;
    private TextView textView;

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

        Button button = view.findViewById(R.id.button);
        textView = view.findViewById(R.id.textView);
        viewModel = new ViewModelProvider(this).get(QuestionViewModel.class);
        viewModel.getStringMutableLiveData().observe(getViewLifecycleOwner(), string -> {
            textView.setText(string);
        });

        button.setOnClickListener(v -> {
            repository.getRandomQuestion();
        });

        return view;
    }
}