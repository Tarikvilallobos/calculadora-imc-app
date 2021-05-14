package com.example.calculadoraimc

import androidx.appcompat.app.AppCompatActivity
import android.widget.EditText
import android.widget.TextView
import android.os.Bundle
import com.example.calculadoraimc.R
import android.content.Intent
import android.view.View

class MainActivity : AppCompatActivity() {
    companion object{
        public const val EXTRA_ALTURA: String = "EXTRA_ALTURA"
        public const val EXTRA_PESO: String = "EXTRA_PESO"
    }

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


        val intent = Intent (this, SecundActivity::class.java)

        val bundle = Bundle()
        bundle.putDouble(EXTRA_PESO, peso)
        bundle.putDouble(EXTRA_ALTURA, altura)

        intent.putExtras( bundle)
        startActivity(intent)


    }
}