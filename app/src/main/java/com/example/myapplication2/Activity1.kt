package com.example.myapplication2

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.content.Intent as Intent1
import android.widget.Button as Button1

class Activity1 : AppCompatActivity() {
    // Activity1 se hereda de la AppCompactActivity.
    // Importante: no puede ser de una clase cualquiera.
    // y este AppCompactActivity le hereda un metodo 'On Create'.
    override fun onCreate(savedInstanceState: Bundle?) {
        //
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        // Luego entra 'SetContentView' donde te dice donde estan las vistas.
        setContentView(R.layout.activity1)
        // se declara una constante: 'button'
        // y se llama el metodo 'findViewById' que recibe una valor entero.
        // y encontrar una vista por su 'id'.
        val button = findViewById<Button1>(R.id.btnSiguiente)
        // Posicionarse en el nombre del id Button1 e importar su clase dandole Alt+Enter.

        // Llamamos el metodo 'setOnClickListener' para ir a la segunda actividad.
        button.setOnClickListener {
            // Crear constante intent para crear objeto Intent1 e importar el objeto
            // ubicando el cursor en Intent1 y dar Alt+Enter.
            val intent = Intent1(this, Activity2::class.java)
            startActivity(intent)
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}



