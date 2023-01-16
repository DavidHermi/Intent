package com.example.interejercicio

import android.annotation.SuppressLint
import android.app.Activity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity2 : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)


        val intent = getIntent()

        val nro1 = intent.getIntExtra("nro1",0)
        val nro2 = intent.getIntExtra("nro2",0)


        intent.putExtra("suma", nro1 + nro2);

        Log.d("MENSAJES", "actualizado intent")

        setResult(Activity.RESULT_OK, intent);

        Log.d("MENSAJES", "actualizado resultado")


        finish()


        }


    }
