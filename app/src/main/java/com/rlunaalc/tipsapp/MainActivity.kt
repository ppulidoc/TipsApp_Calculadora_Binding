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
import androidx.databinding.DataBindingUtil
import com.rlunaalc.tipsapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        enableEdgeToEdge()
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val butonCalcular = binding.buttonCalc

            butonCalcular.setOnClickListener{
                val precioInicial: String = binding.editTextText.text.toString()
                val coste = when {
                    binding.radioAmazing20.isChecked -> precioInicial.toDouble()*0.2
                    binding.radioButtonGood18.isChecked -> precioInicial.toDouble()*0.18
                    binding.radioButtonOkey15.isChecked -> precioInicial.toDouble()*0.15
                    else -> {
                        precioInicial.toDouble()
                    }
                }
            binding.textViewPriceFinal.text = coste.toString()
            }
        }


}