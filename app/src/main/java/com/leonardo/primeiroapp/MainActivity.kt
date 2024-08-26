package com.leonardo.primeiroapp

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
    }

    fun cliqueAqui(view:View){
        println("Foi clicado")
    }

    fun numeroRandon(vie:View){
        var textoResultado = findViewById<TextView>(R.id.txtResultado)
        var numero = java.util.Random().nextInt(10)

        textoResultado.setText("numero aleatorio ${numero}")
    }
}