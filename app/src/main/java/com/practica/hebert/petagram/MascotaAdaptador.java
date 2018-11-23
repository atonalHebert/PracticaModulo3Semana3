package com.practica.hebert.petagram;


import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MascotaAdaptador extends RecyclerView.Adapter<MascotaAdaptador.MascotaViewHolder>{

    // Atributos
    ArrayList<Mascota> mascotas ;

    // Constructor
    public MascotaAdaptador(ArrayList<Mascota> mascotas ){
        this.mascotas = mascotas ;
    } // fin del constructor

    @Override
    public MascotaViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mascotas_cardview, viewGroup, false) ;
        return new MascotaViewHolder(v);
    }

    @Override
    public void onBindViewHolder(MascotaViewHolder mascotaViewHolder, int i) {
        Mascota mascota = mascotas.get(i);
        mascotaViewHolder.imgFotoMascota.setImageResource(mascota.getFoto());
        mascotaViewHolder.tvNombreMascota.setText(mascota.getNombre());
        mascotaViewHolder.tvRatingMascota.setText(String.valueOf(mascota.getRating()));
    }

    @Override
    public int getItemCount() {
        return mascotas.size() ;
    }


    public static class MascotaViewHolder extends RecyclerView.ViewHolder{

        // declarar los views del cardview
        private ImageView imgFotoMascota ;
        private ImageView imgHuesoMascota ;
        private ImageView imgHuesoMascotaDorado ;
        private TextView  tvNombreMascota ;
        private TextView  tvRatingMascota ;

        public MascotaViewHolder(View itemView) {
            super(itemView);
            imgFotoMascota        = (ImageView) itemView.findViewById(R.id.imgFotoMascota) ;
            imgHuesoMascota       = (ImageView) itemView.findViewById(R.id.imgHuesoMascota) ;
            imgHuesoMascotaDorado = (ImageView) itemView.findViewById(R.id.imgHuesoDoradoMascota) ;
            tvNombreMascota       = (TextView) itemView.findViewById(R.id.tvNombreMascota) ;
            tvRatingMascota       = (TextView) itemView.findViewById(R.id.tvRatingMascota) ;
        } // fin del construtor de MascotaViewHolder
    } // fin de la clase anidada MascotaViewHolder
} // fin de la clase MascotaAdaptador