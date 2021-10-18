package com.example.arif.doktor;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class HelperAdapter extends RecyclerView.Adapter {

    List<Perawatan> perawatanList;

    public HelperAdapter(List<Perawatan> perawatanList) {
        this.perawatanList = perawatanList;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater .from(parent.getContext()).inflate(R.layout.list_history_kerusakan,parent,false);
        ViewHolderClass viewHolderClass = new ViewHolderClass(view);

        return viewHolderClass;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        ViewHolderClass viewHolderClass = (ViewHolderClass)holder;

        Perawatan perawatan = perawatanList.get(position);
        viewHolderClass.text_jeniskerusakan.setText("Kerusakan : " + perawatan.getJenisperawatan());
        viewHolderClass.text_merk_motor.setText("Merk Motor : " +perawatan.getMerkMotor());
        viewHolderClass.text_pemilikmotor.setText("Nama Pemilik : "+perawatan.getNamapemilikMotor());
        viewHolderClass.text_plat_motor.setText("Plat nomor : "+ perawatan.getPlatNomor());
    }

    @Override
    public int getItemCount() {
        return perawatanList.size();
    }

    public class ViewHolderClass extends RecyclerView.ViewHolder{

        TextView text_plat_motor,text_merk_motor,text_jeniskerusakan, text_pemilikmotor;

        public ViewHolderClass(@NonNull View itemView) {
            super(itemView);
            text_jeniskerusakan = itemView.findViewById(R.id.text_jeniskerusakan1);
            text_merk_motor = itemView.findViewById(R.id.text_merk_motor1);
            text_pemilikmotor = itemView.findViewById(R.id.text_pemilik_motor1);
            text_plat_motor = itemView.findViewById(R.id.text_plat_motor1);

        }
    }
}
