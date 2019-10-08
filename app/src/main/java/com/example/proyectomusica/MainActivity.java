package com.example.proyectomusica;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //boton uno

    public void Uno(View view){
        Intent uno = new Intent(this,primera.class);
        startActivity(uno);
    }

    //boton dos

    public void Dos(View view){
        Intent dos = new Intent(this,segunda.class);
        startActivity(dos);
    }

    //boton tres

    public void Tres(View view){
        Intent tres = new Intent(this,tercera.class);
        startActivity(tres);
    }

    //boton cuatro

    public void Cuatro(View view){
        Intent cuatro = new Intent(this,cuarta.class);
        startActivity(cuatro);
    }

    //boton cinco

    public void Cinco(View view){
        Intent cinco = new Intent(this,quinta.class);
        startActivity(cinco);
    }

    //boton seis

    public void seis(View view){
        Intent seis = new Intent(this,sexta.class);
        startActivity(seis);
    }

    //boton siete

    public void Siete(View view){
        Intent siete = new Intent(this,septima.class);
        startActivity(siete);
    }

    //boton ocho

    public void Ocho(View view){
        Intent ocho = new Intent(this,octava.class);
        startActivity(ocho);
    }

    //boton nueve

    public void Nueve(View view){
        Intent nueve = new Intent(this,novena.class);
        startActivity(nueve);
    }

    //boton diez

    public void Diez(View view){
        Intent diez = new Intent(this,decima.class);
        startActivity(diez);
    }



}
