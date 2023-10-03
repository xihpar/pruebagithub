package com.raphix.pruebagithub

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.raphix.pruebagithub.R.*

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layout.activity_main)

        var boton = findViewById<Button>(R.id.boton)
        var texto = findViewById<TextView>(R.id.texto)

        boton.setOnClickListener {
            texto.text = "GILIPOLLAS"
        }
    }
}


//cambio