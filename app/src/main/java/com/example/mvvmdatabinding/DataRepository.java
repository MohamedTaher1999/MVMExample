package com.example.mvvmdatabinding;

import androidx.lifecycle.MutableLiveData;

import java.util.ArrayList;
import java.util.List;

public class DataRepository {


    private MutableLiveData<ArrayList<Item>> items;
    public DataRepository() {
        items = new MutableLiveData<>();
    }


    public MutableLiveData<ArrayList<Item>> getArray(){
        ArrayList<Item>e =new ArrayList<>();
        e.add(new Item("mohamed","20"));
        e.add(new Item("eslam","10"));
        e.add(new Item("ali","10"));
        e.add(new Item("ashraf","10"));
        e.add(new Item("zaki","10"));
        e.add(new Item("koko","10"));

        items.setValue(e);
        return items;

    }


}
