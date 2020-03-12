package com.ukrainianrestoration.resturantmenu.ui.breakfast;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class BreakfastViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public BreakfastViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Today's Breakfast Menu");
    }

    public LiveData<String> getText() {
        return mText;
    }
}