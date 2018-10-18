package com.example.andre.enviardatos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    EditText txtDireccionSitioWeb;
    Button btnVisitar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtDireccionSitioWeb = (EditText)findViewById(R.id.txtDireccionSitioWeb);
        btnVisitar= (Button)findViewById(R.id.btnVisitar);

        btnVisitar.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String direccionSitioWeb = txtDireccionSitioWeb.getText().toString();

        Bundle parametros = new Bundle();

        /* configurar el parametro a enviar */
        parametros.putString("sitio_web", direccionSitioWeb);
        //parametros.putString("parametro2","varlo2");

        /* Instanciando la pantalla(Activity) */
        Intent pantallaSitioWeb = new Intent(this, verSitioWeb.class);
        /* Mostrar la pantalla(Activity) */
        pantallaSitioWeb.putExtras(parametros);

        startActivity(pantallaSitioWeb);
    }
}
