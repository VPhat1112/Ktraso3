package com.example.ktso3;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class NhavanAdapter extends RecyclerView.Adapter<NhavanAdapter.DataViewHolder> {
    private List<NhaVan> list;
    private MainActivity context;

    public NhavanAdapter(List<NhaVan> list, MainActivity context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public DataViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView;
        itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_nhavan, parent, false);

        return new DataViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull DataViewHolder holder, int position) {
        NhaVan nhaVan=list.get(position);
        if(nhaVan==null){
            return;
        }
        holder.name.setText(nhaVan.getNameNhaVan());
        holder.Mota.setText(nhaVan.getMota());
        holder.DanhGia.setText(String.valueOf(nhaVan.getDanhGia()));
        holder.imageView.setImageResource(nhaVan.getImages());
        holder.layout_nhavan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, Detail1Activity.class);

                intent.putExtra("name", nhaVan.getNameNhaVan());
                intent.putExtra("Mota", nhaVan.getMota());
                intent.putExtra("Danhgia", nhaVan.getDanhGia());
                intent.putExtra("Images", nhaVan.getImages());

                context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        if (list!=null)
            return list.size();
        else return 0;
    }

    public class DataViewHolder extends RecyclerView.ViewHolder {
        private ImageView imageView;
        private TextView name;
        private TextView Mota,DanhGia;
        private LinearLayout layout_nhavan;

        public DataViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView=(ImageView) itemView.findViewById(R.id.img_nhavan);
            name=(TextView) itemView.findViewById(R.id.name_nhavan);
            Mota= (TextView)itemView.findViewById(R.id.info_nhavan);
            DanhGia=(TextView)itemView.findViewById(R.id.star_nhavan);
            layout_nhavan= (LinearLayout) itemView.findViewById(R.id.layout_item);
        }

    }
}
