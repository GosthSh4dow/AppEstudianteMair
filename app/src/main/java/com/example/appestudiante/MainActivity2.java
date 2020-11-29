package com.example.appestudiante;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
private TextView nom,sex,mate,cid,celu,domi,corr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        nom=(TextView)findViewById(R.id.nom);
        sex=(TextView)findViewById(R.id.sexo);
        mate=(TextView)findViewById(R.id.materia);
        cid=(TextView)findViewById(R.id.cedula);
        celu=(TextView)findViewById(R.id.celular);
        domi=(TextView)findViewById(R.id.domicilio);
        corr=(TextView)findViewById(R.id.correo);
        String nombre = getIntent().getStringExtra("nombre");
        String apellido = getIntent().getStringExtra("apellido");
        String sexo = getIntent().getStringExtra("sexo");
        String calculo = getIntent().getStringExtra("cal");
        String  fisica= getIntent().getStringExtra("fis");
        String quimica = getIntent().getStringExtra("qui");
        String estadistica = getIntent().getStringExtra("esta");
        String programacion = getIntent().getStringExtra("pro");
        String otros = getIntent().getStringExtra("otros");
        String ci = getIntent().getStringExtra("ci");
        String telefono = getIntent().getStringExtra("tel");
        String domicilio = getIntent().getStringExtra("correo");
        String correo = getIntent().getStringExtra("domi");
      nom.setText(nombre+" "+apellido);
      sex.setText(sexo);
      mate.setText(calculo+" "+fisica+" "+quimica+" "+estadistica+" "+programacion+" "+otros);
      cid.setText(ci);
      celu.setText(telefono);
      domi.setText(domicilio);
      corr.setText(correo);



    } public void volver(View view){
        Intent g = new Intent  (this,MainActivity.class);
        startActivity(g);
    }
}