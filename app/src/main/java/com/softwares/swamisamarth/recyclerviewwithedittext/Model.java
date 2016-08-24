package com.softwares.swamisamarth.recyclerviewwithedittext;

/**
 * Created by Narendra on 8/24/2016.
 */
public class Model {

    private String itemName;
    private String editTextValue;

    public Model(String itemName) {
        this.itemName = itemName;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getEditTextValue() {
        return editTextValue;
    }

    public void setEditTextValue(String editTextValue) {
        this.editTextValue = editTextValue;
    }
}
