package com.example.calculadoraimc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText editPeso;
    private EditText editAltura;
    private TextView textResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editPeso = findViewById(R.id.editPeso);
        editAltura = findViewById(R.id.editAltura);
        textResultado = findViewById(R.id.textResultado);

    }
    public void textIMC(View View){

        double peso = Double.parseDouble(editPeso.getText().toString());
        double altura = Double.parseDouble(editAltura.getText().toString());

        double imc = peso/(altura*altura);

        if(imc >= 0 && imc <= 18.49){
            textResultado.setText("Magreza, IMC = "+imc);
        }
        else if(imc >= 18.5 && imc <= 24.99){
            textResultado.setText("normal, IMC = "+imc);
        }
        else if (imc >= 25.0 && imc <= 29.99){
            textResultado.setText("Sobrepeso , IMC = "+imc);
        }
        else if (imc >= 30.0 && imc <= 39.99){
            textResultado.setText("Obesidade, IMC = "+imc);
        }
        else if (imc >= 40){
            textResultado.setText("Obesidade Grave, IMC = "+imc);
        }



    }

}