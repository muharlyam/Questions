package com.muharlyam.mplearning.viewmodel;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class QuestionViewModel extends ViewModel {
    private static final MutableLiveData<String> stringMutableLiveData = new MutableLiveData<>();

    public static void addString(String str) {
        stringMutableLiveData.setValue(str);
    }

    public static MutableLiveData<String> getStringMutableLiveData() {
        return stringMutableLiveData;
    }
}
