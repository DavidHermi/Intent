package com.example.interejercicio

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity2 : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

         //var goFirst = findViewById<Button>(R.id.botonSegundo)
        //goFirst.setOnClickListener {
          //  val intent = Intent (this, MainActivity::class.java )

            // startActivity(intent)



        val intent = getIntent()
        val value = intent.getIntExtra("Provedor", 0 )

        val nmroClientes = findViewById<TextView>(R.id.nmroClientes)

        nmroClientes.text = value.toString()

        }


    }
