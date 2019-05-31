package com.eurekatech.cafe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Integer cant=0;
    Integer precio=2;
    TextView resultado;
    TextView cantidad;
    TextView cantidadEditable;
    CheckBox cb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        resultado = findViewById(R.id.txtPrecioTotal);
        cantidad = findViewById(R.id.txtCantidadCafe);
        cantidadEditable=findViewById(R.id.txtCantidadCafeEditable);
       cb=findViewById(R.id.cbAutomatico);

    }

    public void PrecioTotal(View v) {

        if(cb.isChecked()){

            automatico();
        }
        else
        {

            manual();

        }


    }

    void automatico(){



        cant++;

        cantidad.setText(cant.toString());

        Integer precioTotal = cant * precio;

        resultado.setText(precioTotal.toString());
    }

    void manual(){



        cant=Integer.parseInt(cantidadEditable.getText().toString());

        Integer precioTotal = cant * precio;

        resultado.setText(precioTotal.toString());
    }

        public void   cambiarText(View v){

        if(cb.isChecked()){

            cantidad.setVisibility(View.VISIBLE);
            cantidadEditable.setVisibility(View.INVISIBLE);
            cb.setChecked(true);
            limpiar();

        }
        else
        {
            cantidad.setVisibility(View.INVISIBLE);
            cantidadEditable.setVisibility(View.VISIBLE);
            cb.setChecked(false);
            limpiar();
        }

 }

 void limpiar(){
        cantidadEditable.setHint("0");
        cantidad.setText("0");
        cant=0;
        resultado.setText("0");
 }

}
