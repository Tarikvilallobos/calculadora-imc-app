package com.example.calculadoraimc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView

class SecundActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_secund)


        val extras = intent.extras!!

        val peso = extras.getDouble(MainActivity.EXTRA_PESO)
        val altura = extras.getDouble(MainActivity.EXTRA_ALTURA)

        val textResultado = findViewById<TextView>(R.id.textResultado)
        val imc = peso / (altura * altura)

        if (imc >= 0 && imc <= 18.49) {
            textResultado!!.text = "Magreza, IMC = $imc"
        }
        else if (imc >= 18.5 && imc <= 24.99) {
            textResultado!!.text = "normal, IMC = $imc"
        }
        else if (imc >= 25.0 && imc <= 29.99) {
            textResultado!!.text = "Sobrepeso , IMC = $imc"
        }
        else if (imc >= 30.0 && imc <= 39.99) {
            textResultado!!.text = "Obesidade, IMC = $imc"
        }
        else if (imc >= 40) {
            textResultado!!.text = "Obesidade Grave, IMC = $imc"
        }





    }
}