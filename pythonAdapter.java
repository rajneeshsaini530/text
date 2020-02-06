package com.btpsindia.btps.ui.activity.tutorial.python;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.btpsindia.btps.R;

public class PythonAdapter extends RecyclerView.Adapter<PythonAdapter.ViewHolder> {
    Context context;
    String[] python;

    public PythonAdapter(Context context, String[] javaEE) {
        this.context = context;
        this.python = javaEE;
    }

    @NonNull
    @Override
    public PythonAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.java_ee_layout,parent,false);
        return new PythonAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PythonAdapter.ViewHolder holder, int position) {

        holder.button.setText(python[position]);
        holder.button.setOnClickListener(v -> {
            Intent intent = new Intent(context, PythonIntroduction.class);
            intent.putExtra("Name",python[position]);
            context.startActivity(intent);
        });
    }

    @Override
    public int getItemCount() {
        return python.length;
    }

    class ViewHolder extends RecyclerView.ViewHolder{

        private Button button;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            button = itemView.findViewById(R.id.button_javaee);
        }
    }
}
