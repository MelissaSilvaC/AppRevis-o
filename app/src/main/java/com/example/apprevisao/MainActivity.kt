package com.example.apprevisao

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<Button>(R.id.comp).setOnClickListener {
            comparando(it)
        }
    }

    private fun comparando(view: View){
        val editTextI = findViewById<EditText>(R.id.vI)
        val editTextII = findViewById<EditText>(R.id.vII)


        if(Integer.parseInt(editTextI.text.toString()) == Integer.parseInt(editTextII.text.toString())){
            Toast.makeText(this, "Os valores são iguais", Toast.LENGTH_SHORT).show()
        }else
            if(Integer.parseInt(editTextI.text.toString()) > Integer.parseInt(editTextII.text.toString())){
                Toast.makeText(this, "O primeiro é MAIOR que o segundo", Toast.LENGTH_SHORT).show()
            }else{
                Toast.makeText(this, "O primeiro é MENOR que o segundo", Toast.LENGTH_SHORT).show()
            }
    }


}


