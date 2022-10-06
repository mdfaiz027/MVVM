package com.example.practicemvvm;

import androidx.lifecycle.ViewModel;

public class MyDataModel extends ViewModel {

    private int count = 0;

    public int getCount() {
        count++;
        return count;
    }

    public int setCount() {
        return count;
    }
}
