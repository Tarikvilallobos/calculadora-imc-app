package com.example.calculadoraimc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView

class secundActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_secund)

        val edit = findViewById<TextView>(R.id.textResultado2)
        edit.setText("30")




    }
}