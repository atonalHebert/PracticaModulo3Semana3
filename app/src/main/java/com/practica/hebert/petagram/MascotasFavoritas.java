package com.practica.hebert.petagram;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;

import java.util.ArrayList;

public class MascotasFavoritas extends AppCompatActivity {

    private ArrayList<Mascota> mascotas ;
    private RecyclerView listaMascotas ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mascotas_favoritas);
        Toolbar mascotasActionBar = (Toolbar) findViewById(R.id.mascotasActionBar) ;
        setSupportActionBar(mascotasActionBar) ;
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        ImageView imgEstrella = (ImageView) findViewById(R.id.imgEstrella) ;
        imgEstrella.setVisibility(View.INVISIBLE);

        listaMascotas = (RecyclerView) findViewById(R.id.rvMascotasFavoritas) ;
        LinearLayoutManager llm = new LinearLayoutManager(this) ;
        llm.setOrientation(LinearLayoutManager.VERTICAL) ;
        listaMascotas.setLayoutManager(llm);
        inicializarLista() ;
        inicializarAdaptador() ;

    }// fin del método onCreate

    private void inicializarAdaptador() {
        MascotaAdaptador adaptador = new MascotaAdaptador(mascotas) ;
        listaMascotas.setAdapter(adaptador) ;
    } // fin del método inicializarAdaptador

    private void inicializarLista() {
        mascotas = new ArrayList<Mascota>() ;
        mascotas.add(new Mascota(R.drawable.mew, "Mew", (byte)5)) ;
        mascotas.add(new Mascota(R.drawable.articuno, "Articuno", (byte) 5)) ;
        mascotas.add(new Mascota(R.drawable.mewtwo, "Mewtwo",  (byte) 5)) ;
        mascotas.add(new Mascota(R.drawable.moltres, "Moltres",  (byte) 5)) ;
        mascotas.add(new Mascota(R.drawable.zapdos, "Zaptos",  (byte) 5)) ;
    } // fin del método inicializarLista
} // fin de la clase MascotasFavoritas
