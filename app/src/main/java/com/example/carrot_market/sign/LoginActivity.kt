package com.example.carrot_market.sign

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.carrot_market.R
import com.example.carrot_market.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {
    private val binding = ActivityLoginBinding.inflate(layoutInflater)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)


    }

}