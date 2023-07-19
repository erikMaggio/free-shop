package com.example.freeshop.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.freeshop.R
import com.example.freeshop.databinding.ActivitySellBinding

class SellActivity : AppCompatActivity() {
    private lateinit var binding : ActivitySellBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sell)
        binding= ActivitySellBinding.inflate(layoutInflater)
        setContentView(binding.root)
        init()
    }
    fun init (){
        binding.btSellBack.setOnClickListener{
            onBackPressed()
        }
    }
}