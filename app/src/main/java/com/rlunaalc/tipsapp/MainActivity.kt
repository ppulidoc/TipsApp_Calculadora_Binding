package com.rlunaalc.tipsapp

import android.os.Bundle
import android.widget.Button
import android.widget.RadioButton
import android.widget.Switch
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        var input: TextView = findViewById(R.id.editTextText);
        var finalPrice: TextView = findViewById(R.id.textView3)
        val button: Button = findViewById(R.id.button);
        var switch: Switch = findViewById(R.id.switch1);

        //radiobuttons

        val radio20: RadioButton = findViewById(R.id.radioButton);
        val radio18: RadioButton = findViewById(R.id.radioButton2);
        val radio15: RadioButton = findViewById(R.id.radioButton3);

        //recollir dades

        //input.text devuelve un charSequence, por eso se pasa a string
        var price = input.text.toString().toDouble()

        button.setOnClickListener{
            if (radio20.isActivated){
                finalPrice.setText(price* 0.2)
            }

        }

    }
}