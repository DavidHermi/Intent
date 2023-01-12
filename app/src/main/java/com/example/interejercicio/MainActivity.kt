package com.example.interejercicio

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

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


    @Deprecated("Deprecated in Java")
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        val saludo = findViewById<TextView>(R.id.textoSegundo)

        if(resultCode != Activity.RESULT_OK) return
        when(requestCode) {
            RESULTADO_UNO -> {
                if (data != null) {
                    saludo.text = data.getStringExtra("Saludo")
                }; }
            // Other result codes
            else -> {}

        }

    }

}