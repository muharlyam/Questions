package com.muharlyam.mplearning.viewmodel;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class QuestionViewModel extends ViewModel {

    private final MutableLiveData<String> question = new MutableLiveData<>();
    private final MutableLiveData<String> answer = new MutableLiveData<>();

    public void setQuestion(String str) {
        question.setValue(str);
    }

    public void setAnswer(String str) {
        answer.setValue(str);
    }

    public MutableLiveData<String> getQuestion() {
        return question;
    }

    public MutableLiveData<String> getAnswer() {
        return question;
    }
}
