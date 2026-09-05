package com.example.shoppingcart

import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.WindowCompat
import com.example.shoppingcart.databinding.ActivityMainBinding

class MainActivity: AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        supportActionBar?.hide()

        WindowCompat.setDecorFitsSystemWindows(window, true)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val adapterProduct = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1)

        binding.listviewProduct.adapter = adapterProduct

        binding.buttonProduct.setOnClickListener {
            startActivity(Intent(this, ProductActivity::class.java))
        }
    }
}