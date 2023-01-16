package com.example.interejercicio

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    // definir el requestCode
    val RESULTADO_UNO = 1
    val RESULTADO_DOS = 2
    val RESULTADO_TRES = 3

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val goSecond = findViewById<Button>(R.id.botonPrimero)

        goSecond.setOnClickListener {

            val intent = Intent(this, MainActivity2::class.java)


            intent.putExtra("nro1", 2)
            intent.putExtra("nro2", 3)
            startActivityForResult(intent, RESULTADO_UNO)
            intent.putExtra("nro2", 4)
            startActivityForResult(intent, RESULTADO_DOS)
            intent.putExtra("nro1", 6)
            intent.putExtra("nro2", 10)
            startActivityForResult(intent, RESULTADO_TRES)


        }


    }


    @Deprecated("Deprecated in Java")
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        val suma1 = findViewById<TextView>(R.id.suma1)
        val suma2 = findViewById<TextView>(R.id.suma2)
        val suma3 = findViewById<TextView>(R.id.suma3)

        if (resultCode != Activity.RESULT_OK || data == null) return

        when (requestCode) {
            RESULTADO_UNO -> {
                suma1.text = data.getIntExtra("suma", 0).toString()
            }
            RESULTADO_DOS -> {
                suma2.text = data.getIntExtra("suma", 0).toString()
            }
            RESULTADO_TRES -> {
                suma3.text = data.getIntExtra("suma", 0).toString()
            }
            // Other result codes
            else -> {}

        }

    }
}