package com.example.mvvmdatabinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mvvmdatabinding.databinding.ItemBinding;

import java.util.ArrayList;

public class AdapterItem extends RecyclerView.Adapter<AdapterItem.ItemViewHolder>{

    private ArrayList<Item> items;


    public AdapterItem(){
        items=new ArrayList<>();
    }
    public void clearItems(){

        items.clear();
    }
    public void addItems(ArrayList<Item> items){
        if(items!=null){
        this.items.addAll(items);
        notifyDataSetChanged();}

    }

    @NonNull
    @Override
    public ItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

            LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
            ItemBinding itemBinding = ItemBinding.inflate(layoutInflater, parent, false);
            return new ItemViewHolder(itemBinding);


    }

    @Override
    public void onBindViewHolder(@NonNull ItemViewHolder holder, int position) {
        if(items.size()>0){
        holder.onBindItem(items.get(position));}
    }

    @Override
    public int getItemCount() {
        return items != null && items.size() > 0 ? items.size() : 1;
    }


   public class ItemViewHolder extends RecyclerView.ViewHolder  {
       ItemBinding itemBinding;

    public ItemViewHolder(@NonNull ItemBinding itemBinding) {
        super(itemBinding.getRoot());
        this.itemBinding=itemBinding;
    }
       public void onBindItem(Item item) {
           // set Data to variable to set each specific Item
           itemBinding.setItem(item);
           itemBinding.executePendingBindings();
       }
}


}
