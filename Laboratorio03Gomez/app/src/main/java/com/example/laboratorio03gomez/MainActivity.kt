package com.example.laboratorio03gomez

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var fiveCents: ImageView
    private lateinit var tenCents: ImageView
    private lateinit var ivquarter: ImageView
    private lateinit var ivOnDolar: ImageView
    private lateinit var cashTextView: TextView
    private var cash = 0.0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bind()
        setOnClickListener()

}


    fun agregarDinero(agregar: Double) {

        cash = cash + agregar
        cash = String.format("%.2f", cash).toDouble()

        cashTextView.text = "$${cash}"

    }

    fun setOnClickListener() {

        fiveCents.setOnClickListener {
            agregarDinero(0.05.toDouble())
        }

        tenCents.setOnClickListener {
            agregarDinero(0.10.toDouble())

        }

        ivquarter.setOnClickListener {
            agregarDinero(0.25.toDouble())
        }

        ivOnDolar.setOnClickListener {
            agregarDinero(1.toDouble())

        }

    }



    private fun bind() {

        fiveCents =findViewById(R.id.ivfivecents)
        tenCents =findViewById(R.id.ivtencents)
        ivquarter =findViewById(R.id.ivquarter)
        ivOnDolar =findViewById(R.id.ivonedolar)
        cashTextView =findViewById(R.id.tvcantidad)
    }

}