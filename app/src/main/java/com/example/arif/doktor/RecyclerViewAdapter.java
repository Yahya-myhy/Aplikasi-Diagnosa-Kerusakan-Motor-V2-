package com.example.arif.doktor;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.PerawatanViewHolder> {
    private ArrayList<Perawatan> perawatanArrayList;

    public RecyclerViewAdapter(ArrayList<Perawatan> perawatanArrayList){
        this.perawatanArrayList = perawatanArrayList;
    }

    public class PerawatanViewHolder extends RecyclerView.ViewHolder{
        private TextView text_plat_motor,text_merk_motor,text_jeniskerusakan, text_pemilikmotor;

        public PerawatanViewHolder(View itemView) {
            super(itemView);
            text_jeniskerusakan = itemView.findViewById(R.id.text_jeniskerusakan1);
            text_merk_motor = itemView.findViewById(R.id.text_merk_motor1);
            text_pemilikmotor = itemView.findViewById(R.id.text_pemilik_motor1);
            text_plat_motor = itemView.findViewById(R.id.text_plat_motor1);
        }
    }
    @Override
    public PerawatanViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.list_history_kerusakan, parent, false);
        return new PerawatanViewHolder(view) {
        };
    }

    public void onBindViewHolder(PerawatanViewHolder holder, int position) {
        String plat_motor = perawatanArrayList.get(position).getPlatNomor();
        String pemilik_motor = perawatanArrayList.get(position).getNamapemilikMotor();
        String jenis_kerusakan = perawatanArrayList.get(position).getJenisperawatan();
        String merk_motor = perawatanArrayList.get(position).getMerkMotor();

        holder.text_plat_motor.setText("Plat Nomor Kendaraan : " + plat_motor);
        holder.text_pemilikmotor.setText("Nama pemilik Kendaraan : " + pemilik_motor);
        holder.text_jeniskerusakan.setText("Jenis Kerusakan :"+"\n" + jenis_kerusakan);
        holder.text_merk_motor.setText("Merk Motor : " + merk_motor);
    }

    @Override
    public int getItemCount() {
        return perawatanArrayList.size();
    }

}
