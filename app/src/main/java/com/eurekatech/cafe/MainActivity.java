package com.eurekatech.cafe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
   // Declaracion de variables
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
// funcion que llama a metodo automatico o manual segun vista checked es verdadera o falsa
    public void PrecioTotal(View v) {

        if(cb.isChecked()){

            automatico();
        }
        else
        {

            manual();

        }


    }
//calculos automaticos del precio total
    void automatico(){



        cant++;

        cantidad.setText(cant.toString());

        Integer precioTotal = cant * precio;

        resultado.setText(precioTotal.toString());
    }

    //calculo manual del precio total
    void manual(){



        cant=Integer.parseInt(cantidadEditable.getText().toString());

        Integer precioTotal = cant * precio;

        resultado.setText(precioTotal.toString());
    }

    // funcion que cambia la visibilidad de textview segun checked sea verdadero o falso
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
//pone las vistas a su valor iniciar
 void limpiar(){
        cantidadEditable.setHint("0");
        cantidad.setText("0");
        cant=0;
        resultado.setText("0");
 }

}
