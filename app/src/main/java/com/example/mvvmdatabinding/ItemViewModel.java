package com.example.mvvmdatabinding;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.ArrayList;
import java.util.List;

public class ItemViewModel extends ViewModel {

    private DataRepository repository;
    private MutableLiveData<ArrayList<Item>> allItems;

    public ItemViewModel() {
        repository=new DataRepository();
        allItems=new MutableLiveData<>();
        allItems=repository.getArray();
    }
    public MutableLiveData<ArrayList<Item>> getItemLiveDataLiveData() {
        return allItems;
    }

    public MutableLiveData<ArrayList<Item>> getAllItems() {
        return allItems;
    }
}
