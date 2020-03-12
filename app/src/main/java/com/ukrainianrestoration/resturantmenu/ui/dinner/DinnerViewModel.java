package com.ukrainianrestoration.resturantmenu.ui.dinner;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class DinnerViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public DinnerViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Today's Dinner Menu");
    }

    public LiveData<String> getText() {
        return mText;
    }
}