package com.example.tuapp
import com.example.proyectoviernes2.R

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val iniciar: Button = findViewById(R.id.iniciar)

        iniciar.setOnClickListener {
            val intent = Intent(this, registroActivity::class.java)
            startActivity(intent)
        }
    }
}
