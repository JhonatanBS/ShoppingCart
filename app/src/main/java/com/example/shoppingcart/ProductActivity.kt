package com.example.shoppingcart

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.shoppingcart.databinding.ActivityProductBinding

class ProductActivity : AppCompatActivity() {

    private lateinit var binding: ActivityProductBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityProductBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
}