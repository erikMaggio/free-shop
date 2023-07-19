package com.example.freeshop.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.freeshop.R
import com.example.freeshop.databinding.ActivityFavoritesBinding
import com.example.freeshop.databinding.ActivitySearchBinding

class SearchActivity : AppCompatActivity() {
    private lateinit var binding : ActivitySearchBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_search)
        binding= ActivitySearchBinding.inflate(layoutInflater)
        setContentView(binding.root)
        init()
    }
    fun init (){
        binding.btSearchBack.setOnClickListener{
            onBackPressed()
        }
    }
}