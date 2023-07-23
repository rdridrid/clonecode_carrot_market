package com.example.carrot_market.mypage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.carrot_market.R
import com.example.carrot_market.databinding.ActivityMainBinding
import com.example.carrot_market.databinding.ActivityMypageProfileBinding

class mypageProfile : AppCompatActivity() {
    lateinit var binding: ActivityMypageProfileBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMypageProfileBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}