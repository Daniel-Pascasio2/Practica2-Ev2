package com.example.paisescentroamerica;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {

    private LayoutInflater layoutInflater;
    private List<String> data;
    private List<String> data2;
    private List<Integer> data3;

    public Adapter(Context context, List<String> data, List<String> data2, List<Integer> data3){
     this.layoutInflater=LayoutInflater.from(context);
     this.data=data;
     this.data2=data2;
     this.data3=data3;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {

        View view=layoutInflater.inflate(R.layout.custom_view, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
     String titulo=data.get(position);
     String desc=data2.get(position);
     holder.txttitulo.setText(titulo);
     holder.txtdescripcion.setText(desc);
     holder.imagenes.setImageResource(data3.get(position));

}

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView txttitulo,txtdescripcion;
        ImageView imagenes;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            txttitulo=itemView.findViewById(R.id.txttitle);
            txtdescripcion=itemView.findViewById(R.id.txtdescription);
            imagenes=itemView.findViewById(R.id.imageView);



        }
    }
}
