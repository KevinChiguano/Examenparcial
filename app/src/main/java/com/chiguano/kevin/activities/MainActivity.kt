package com.chiguano.kevin.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.chiguano.kevin.R
import com.chiguano.kevin.databinding.ActivityMainBinding
import com.chiguano.kevin.logic.ListItems
import com.chiguano.kevin.ui.adapters.AdapterItem

class MainActivity : AppCompatActivity(), AdapterItem.OnItemClickListener {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.rvItems.adapter = AdapterItem(ListItems().getData(), this)
        binding.rvItems.layoutManager = LinearLayoutManager(this)
    }

    override fun onItemClick(nombre: String, asunto: String) {
        val intent = Intent(this, SecondActivity::class.java)
        intent.putExtra("nombre", nombre)
        intent.putExtra("asunto", asunto)
        startActivity(intent)
    }
}