package com.ukrainianrestoration.resturantmenu.ui.desert;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class DesertViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public DesertViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Today's Desert Menu");
    }

    public LiveData<String> getText() {
        return mText;
    }
}