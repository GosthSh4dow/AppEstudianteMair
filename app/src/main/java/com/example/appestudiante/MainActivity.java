package com.example.appestudiante;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {
 private EditText nom,ape,tel,ci,dom,corr;
 private RadioButton va,mu;
 private CheckBox cal,fis,qui,est,pro,otros;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nom=(EditText)findViewById(R.id.txtnombre);
        ape=(EditText)findViewById(R.id.txtapellido);
        tel=(EditText)findViewById(R.id.telefono);
        ci=(EditText)findViewById(R.id.ci);
        dom=(EditText)findViewById(R.id.txtdireccion);
        corr=(EditText)findViewById(R.id.txtcorreo);
        va=(RadioButton)findViewById(R.id.rbvaron);
        mu=(RadioButton)findViewById(R.id.rbmujer);
        cal=(CheckBox)findViewById(R.id.m1);
        fis=(CheckBox)findViewById(R.id.m2);
        qui=(CheckBox)findViewById(R.id.m3);
        est=(CheckBox)findViewById(R.id.m4);
        pro=(CheckBox)findViewById(R.id.m5);
        otros=(CheckBox)findViewById(R.id.m6);
        va.setSelected(true);
        if (va.isChecked()==true){
            mu.setChecked(false);
        }else if(mu.isChecked()==true){
            va.setChecked(false);
        }
        //poner icono
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_launcher);

    }public void boton(View view){
        String fisi,quim,calc,progra,esta,otr,sexo="",nomb,apell,cii,telw,dom1,correo;
        Intent g = new Intent  (this,MainActivity2.class);
        g.putExtra("nombre",nom.getText().toString());
        g.putExtra("apellido",ape.getText().toString());
        if(va.isChecked()==true){
            mu.setChecked(false);
            sexo="Varon";

        }else if (mu.isChecked()==true){
            va.setChecked(false);
            sexo="Mujer";


        } g.putExtra("sexo",sexo.toString());
        if(cal.isChecked()==true){
            String calculo="Calculo";
            g.putExtra("cal",calculo.toString());

        }else{
            String calculo="";
            g.putExtra("cal",calculo.toString());
        }
            if (fis.isChecked()==true){
            String fis="Fisica";
            g.putExtra("fis",fis.toString());

        }else{
            String fis="";
            g.putExtra("fis",fis.toString());
        }
        if(qui.isChecked()==true){
            String qui="Quimica";
            g.putExtra("qui",qui.toString());

        }else{
            String qui="";
            g.putExtra("qui",qui.toString());
        }if(est.isChecked()==true){
            String est="Estadistica";
            g.putExtra("esta",est.toString());

        }else{
            String est="";
            g.putExtra("esta",est.toString());
        }
        if(pro.isChecked()==true){
            String pro="Programacion";
            g.putExtra("pro",pro.toString());

        }else{
            String pro="";
            g.putExtra("pro",pro.toString());
        }
        if(otros.isChecked()==true){
            String ot="Otros";
            g.putExtra("otros",ot.toString());
        }else{
            String ot="";
            g.putExtra("otros",ot.toString());
        }g.putExtra("ci",ci.getText().toString());
        g.putExtra("tel",tel.getText().toString());
        g.putExtra("correo",corr.getText().toString());
        g.putExtra("domi",dom.getText().toString());
     startActivity(g);


    }
}