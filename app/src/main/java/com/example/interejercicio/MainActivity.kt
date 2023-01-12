package com.example.interejercicio

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    // definir el requestCode
    val RESULTADO_UNO=1


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val goSecond = findViewById<Button>(R.id.botonPrimero)

        goSecond.setOnClickListener {

            val intent = Intent (this, MainActivity2::class.java )


            intent.putExtra("Provedor", "2")
            intent.putExtra("Clientes", "3")


            startActivityForResult(intent, RESULTADO_UNO)




        }



    }
}