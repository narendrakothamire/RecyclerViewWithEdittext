package com.softwares.swamisamarth.recyclerviewwithedittext;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Narendra on 8/24/2016.
 */
public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.MyViewHolder> {

    private Context context;
    private ArrayList<Model> models;
    private LayoutInflater inflater;

    public RecyclerAdapter(Context context, ArrayList<Model> models) {
        this.context = context;
        this.models = models;
        inflater = LayoutInflater.from(context);
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = inflater.inflate(R.layout.item_recycler, parent, false);
        return new MyViewHolder(itemView, models);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Model model = models.get(position);

        CustomTextWatch textWatch = (CustomTextWatch) holder.itemEditText.getTag();
        textWatch.setItemPosition(position);

        if(model.getEditTextValue() != null){
            holder.itemEditText.setText(model.getEditTextValue());
        }else{
            holder.itemEditText.setText(null);  // Resets the value of EditText if it is reused //
        }
        holder.itemNameTextView.setText(model.getItemName());
    }

    @Override
    public int getItemCount() {
        return models.size();
    }

    static class MyViewHolder extends RecyclerView.ViewHolder{

        TextView itemNameTextView;
        EditText itemEditText;

        public MyViewHolder(View itemView, ArrayList<Model> models) {
            super(itemView);
            CustomTextWatch customTextWatch = new CustomTextWatch(models);

            itemNameTextView = (TextView) itemView.findViewById(R.id.item_name_textView);
            itemEditText = (EditText) itemView.findViewById(R.id.item_EditText);

            itemEditText.addTextChangedListener(customTextWatch);
            itemEditText.setTag(customTextWatch);
        }
    }
}
