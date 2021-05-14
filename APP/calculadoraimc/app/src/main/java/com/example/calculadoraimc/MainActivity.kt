package com.example.calculadoraimc

import androidx.appcompat.app.AppCompatActivity
import android.widget.EditText
import android.widget.TextView
import android.os.Bundle
import com.example.calculadoraimc.R
import android.content.Intent
import android.view.View
import com.example.calculadoraimc.secundActivity

class MainActivity : AppCompatActivity() {
    private var editPeso: EditText? = null
    private var editAltura: EditText? = null
    private var textResultado: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editPeso = findViewById(R.id.editPeso)
        editAltura = findViewById(R.id.editAltura)
        textResultado = findViewById(R.id.textResultado)
    }

    fun textIMC(View: View?) {
        val peso = editPeso!!.text.toString().toDouble()
        val altura = editAltura!!.text.toString().toDouble()
        val imc = peso / (altura * altura)

        val intent = Intent(this, secundActivity::class.java)
        startActivity(intent)

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