package com.example.dell.fire;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.net.ConnectException;
import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {
Context context;
ArrayList<medicines> medicines;
public MyAdapter(Context c,ArrayList<medicines> m)
{
    context=c;
    medicines=m;
}
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyViewHolder(LayoutInflater.from(context).inflate(R.layout.card_view,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
       holder.tablet.setText( medicines.get(position).getTablet());
        holder.symptoms.setText( medicines.get(position).getSymptoms());
        holder.child.setText( medicines.get(position).getChild_dose());
        holder.adult.setText(medicines.get(position).getAdult_dose());
    }

    @Override
    public int getItemCount() {
        return medicines.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder{
       TextView tablet,symptoms,child,adult;
        public MyViewHolder(View itemView) {
            super(itemView);
            tablet=itemView.findViewById(R.id.tablet_ad);
            symptoms=itemView.findViewById(R.id.symp_ad);
            child=itemView.findViewById(R.id.child_dose);
            adult=itemView.findViewById(R.id.adult_dose);
        }
    }
}
