package com.example.freeshop.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.freeshop.R
import com.example.freeshop.databinding.ActivityAddBinding

class AddActivity : AppCompatActivity() {

    private lateinit var binding : ActivityAddBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add)
        binding= ActivityAddBinding.inflate(layoutInflater)
        setContentView(binding.root)
        init()
    }
    fun init (){
        binding.btAddBack.setOnClickListener{
            onBackPressed()
        }
    }
}