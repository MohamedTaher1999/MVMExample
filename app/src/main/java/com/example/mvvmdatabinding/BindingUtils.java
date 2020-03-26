package com.example.mvvmdatabinding;

import androidx.databinding.BindingAdapter;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class BindingUtils {




    @BindingAdapter({"adapter"})
    public static void setRecyclerViewData(RecyclerView recyclerView, ArrayList<Item> items) {
        AdapterItem adapterItem= (AdapterItem)recyclerView.getAdapter();
        if(adapterItem!=null&&items!=null){
            adapterItem.clearItems();
            adapterItem.addItems(items);
            System.out.println("DvvvvvvDD"+String.valueOf(items.size()));

        }

    }
}
