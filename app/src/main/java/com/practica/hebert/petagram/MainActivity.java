package com.practica.hebert.petagram;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ImageView imgEstrella ;
    private ArrayList<Mascota> mascotas ;
    private RecyclerView listaMascotas ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar mascotasActionBar = (Toolbar) findViewById(R.id.mascotasActionBar) ;
        setSupportActionBar(mascotasActionBar) ;

        listaMascotas = (RecyclerView) findViewById(R.id.rvMascotas) ;
        LinearLayoutManager llm = new LinearLayoutManager(this) ;
        llm.setOrientation(LinearLayoutManager.VERTICAL) ;
        listaMascotas.setLayoutManager(llm);
        inicializarLista() ;
        inicializarAdaptador() ;

        imgEstrella = (ImageView) findViewById(R.id.imgEstrella);
        imgEstrella.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Intent intent = new Intent(MainActivity.this, MascotasFavoritas.class) ;
               startActivity(intent);
            }
        }); // fin del listener de imgEstrellita

    } // fin del método onCreate

    private void inicializarAdaptador() {
        MascotaAdaptador adaptador = new MascotaAdaptador(mascotas) ;
        listaMascotas.setAdapter(adaptador) ;
    } // fin del método inicializarAdaptador

    private void inicializarLista() {
        mascotas = new ArrayList<Mascota>() ;
        mascotas.add(new Mascota(R.drawable.bulbasaur, "Bulbasur", (byte)5)) ;
        mascotas.add(new Mascota(R.drawable.charmander, "Charmander", (byte) 4)) ;
        mascotas.add(new Mascota(R.drawable.pikachu, "Pikachu",  (byte) 3)) ;
        mascotas.add(new Mascota(R.drawable.squirtle, "Squirtle",  (byte) 2)) ;
        mascotas.add(new Mascota(R.drawable.togepi, "Togepi",  (byte) 1)) ;
    } // fin del método inicializarLista


} // fin de la clase MainActivity
