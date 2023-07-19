package com.example.freeshop.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.freeshop.R
import com.example.freeshop.databinding.ActivityDeleteBinding

class DeleteActivity : AppCompatActivity() {
    private lateinit var binding : ActivityDeleteBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_delete)
        binding= ActivityDeleteBinding.inflate(layoutInflater)
        setContentView(binding.root)
        init()
    }
    fun init (){
        binding.btDelBack.setOnClickListener{
            onBackPressed()
        }
    }
}
