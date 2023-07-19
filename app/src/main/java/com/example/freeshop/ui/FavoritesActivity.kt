package com.example.freeshop.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.freeshop.R
import com.example.freeshop.databinding.ActivityFavoritesBinding

class FavoritesActivity : AppCompatActivity() {
    private lateinit var binding : ActivityFavoritesBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_favorites)
        binding= ActivityFavoritesBinding.inflate(layoutInflater)
        setContentView(binding.root)
        init()
    }
    fun init (){
        binding.btFavBack.setOnClickListener{
            onBackPressed()
        }
    }
}