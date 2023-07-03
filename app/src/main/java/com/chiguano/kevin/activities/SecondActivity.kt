package com.chiguano.kevin.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.chiguano.kevin.R
import com.chiguano.kevin.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySecondBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val nombre = intent.getStringExtra("nombre")
        val asunto = intent.getStringExtra("asunto")

        binding.nombreTextView.text = nombre
        binding.asuntoTextView.text = asunto
    }
}