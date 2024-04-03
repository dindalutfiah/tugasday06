package com.example.tugasday06;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class KosmetikAdapter extends RecyclerView.Adapter<KosmetikAdapter.ViewHolder> {

    private ArrayList<KosmetikModel> kosmetikModel;
    public Context context;
    public KosmetikAdapter(ArrayList<KosmetikModel> kosmetikModel, Context context) {
        this.kosmetikModel = kosmetikModel;
        this.context = context;
    }

    public KosmetikAdapter(ArrayList<KosmetikModel> kosmetikModel) {
        this.kosmetikModel = kosmetikModel;
    }

    @NonNull
    @Override
    public KosmetikAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull KosmetikAdapter.ViewHolder holder, int position) {
        KosmetikModel target = kosmetikModel.get(position);
        holder.namaKosmetik.setText(target.getNamaKosmetik());
        holder.jenisKosmetik.setText(target.getJenisKosmetik());
        holder.hargaKosmetik.setText(target.getHargaKosmetik());
        holder.deskripsiKosmetik.setText(target.getDeskripsiKosmetik());
        holder.fotoKosmetik.setImageResource(target.getFotoKosmetik());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, DetailKosmetik.class);
                intent.putExtra("nama", target.getNamaKosmetik());
                intent.putExtra("jenis", target.getJenisKosmetik());
                intent.putExtra("harga", target.getHargaKosmetik());
                intent.putExtra("deskripsi", target.getDeskripsiKosmetik());
                intent.putExtra("gambar", target.getFotoKosmetik());
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {

        return kosmetikModel.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView namaKosmetik, jenisKosmetik, hargaKosmetik, deskripsiKosmetik;
        ImageView fotoKosmetik;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            namaKosmetik = itemView.findViewById(R.id.nama_kosmetik);
            jenisKosmetik = itemView.findViewById(R.id.jenis_kosmetik);
            hargaKosmetik = itemView.findViewById(R.id.harga_kosmetik);
            deskripsiKosmetik = itemView.findViewById(R.id.deskripsi_kosmetik);
            fotoKosmetik = itemView.findViewById(R.id.foto_kosmetik);
        }
    }
}
