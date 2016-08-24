package com.softwares.swamisamarth.recyclerviewwithedittext;

import android.text.Editable;
import android.text.TextWatcher;

import java.util.ArrayList;

/**
 * Created by Narendra on 8/24/2016.
 */
public class CustomTextWatch implements TextWatcher {

    private ArrayList<Model> models;
    private int itemPosition = -1;

    public CustomTextWatch(ArrayList<Model> models) {
        this.models = models;
    }

    public void setItemPosition(int itemPosition) {
        this.itemPosition = itemPosition;
    }

    @Override
    public void beforeTextChanged(CharSequence s, int start, int count, int after) {

    }

    @Override
    public void onTextChanged(CharSequence s, int start, int before, int count) {

    }

    @Override
    public void afterTextChanged(Editable s) {
        if(itemPosition != -1){
            models.get(itemPosition).setEditTextValue(s.toString());
        }

    }
}
