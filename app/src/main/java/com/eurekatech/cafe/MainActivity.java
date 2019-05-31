package com.eurekatech.cafe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void PrecioTotal(View v) {
        TextView resultado = findViewById(R.id.txtPrecioTotal);

        TextView cantidad = findViewById(R.id.txtCantidadCafe);
        Integer cant = Integer.parseInt(cantidad.getText().toString());
        Double preciotasa = 4.0;
        Double precioTotal = cant * preciotasa;

        resultado.setText(precioTotal.toString());


    }
}
