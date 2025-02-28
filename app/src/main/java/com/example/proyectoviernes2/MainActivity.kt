package com.example.proyectoviernes2

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)  // Asegúrate de que este es el archivo correcto

        val iniciar: Button = findViewById(R.id.button)

        // Establece el OnClickListener para el botón "Iniciar"
        iniciarButton.setOnClickListener {
            // Crea un Intent para iniciar la nueva actividad
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)  // Inicia la nueva actividad
        }
    }
}