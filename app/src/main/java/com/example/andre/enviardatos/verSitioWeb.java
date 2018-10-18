package com.example.andre.enviardatos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.TextView;

public class verSitioWeb extends AppCompatActivity {

    TextView txtSitioWeb;
    WebView wvSitioWeb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ver_sitio_web);

        txtSitioWeb = (TextView)findViewById(R.id.txtSitioWeb);
        wvSitioWeb = (WebView)findViewById(R.id.wvSitioWeb);

        /* recoge el parametro a enviado */
        Bundle parametros = getIntent().getExtras();
        /* recoge el parametro a enviado */

        String sitioWeb = parametros.getString("sitio_web");
        txtSitioWeb.setText(sitioWeb);

        wvSitioWeb.loadUrl("http://"+sitioWeb);
    }
}
