package com.example.laterceraeslavencida

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val botsuma = findViewById<Button>(R.id.botsuma)
        val botresta = findViewById<Button>(R.id.botresta)
        val botmultiplicacion = findViewById<Button>(R.id.botmultiplicacion)
        val botdivision = findViewById<Button>(R.id.botdivision)
        val numero1 = findViewById<EditText>(R.id.numero1)
        val numero2 = findViewById<EditText>(R.id.numero2)
        botsuma.setOnClickListener(View.OnClickListener {
            if (numero1.text.toString().trim { it <= ' ' }.isEmpty() || numero2.text.toString()
                    .isEmpty()
            ) {
                Toast.makeText(baseContext, "Falta ingresar números", Toast.LENGTH_SHORT).show()
                return@OnClickListener
            }
            val primer = numero1.text.toString().toInt()
            val segundo = numero2.text.toString().toInt()
            val suma = primer + segundo
            Toast.makeText(baseContext, "Resultado: $suma", Toast.LENGTH_LONG).show()
        })
        botresta.setOnClickListener(View.OnClickListener {
            if (numero1.text.toString().trim { it <= ' ' }.isEmpty() || numero2.text.toString()
                    .isEmpty()
            ) {
                Toast.makeText(baseContext, "Falta ingresar números", Toast.LENGTH_SHORT).show()
                return@OnClickListener
            }
            val primer = numero1.text.toString().toInt()
            val segundo = numero2.text.toString().toInt()
            val resta = primer - segundo
            Toast.makeText(baseContext, "Resultado: $resta", Toast.LENGTH_LONG).show()
        })
        botmultiplicacion.setOnClickListener(View.OnClickListener {
            if (numero1.text.toString().trim { it <= ' ' }.isEmpty() || numero2.text.toString()
                    .isEmpty()
            ) {
                Toast.makeText(baseContext, "Falta ingresar números", Toast.LENGTH_SHORT).show()
                return@OnClickListener
            }
            val primer = numero1.text.toString().toInt()
            val segundo = numero2.text.toString().toInt()
            val multiplicacion = primer * segundo
            Toast.makeText(baseContext, "Resultado: $multiplicacion", Toast.LENGTH_LONG).show()
        })
        botdivision.setOnClickListener(View.OnClickListener {
            if (numero1.text.toString().trim { it <= ' ' }.isEmpty() || numero2.text.toString()
                    .isEmpty()
            ) {
                Toast.makeText(baseContext, "Falta ingresar números", Toast.LENGTH_SHORT).show()
                return@OnClickListener
            }
            val primer = numero1.text.toString().toInt()
            val segundo = numero2.text.toString().toInt()
            val division = primer / segundo
            if (numero2.text.toString().toInt() == 0) {
                Toast.makeText(baseContext, "no se puede dividir por cero", Toast.LENGTH_SHORT)
                    .show()
                return@OnClickListener
            }
            Toast.makeText(baseContext, "Resultado: $division", Toast.LENGTH_LONG).show()
        })
    }
}