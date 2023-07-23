package com.example.freeshop.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.freeshop.R
import com.example.freeshop.databinding.ActivityFavoritesBinding
import com.example.freeshop.databinding.ActivityTermsBinding

class TermsActivity : AppCompatActivity() {

    private lateinit var binding : ActivityTermsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityTermsBinding.inflate(layoutInflater)
        setContentView(binding.root)
        init()
    }

    fun init(){
        binding.btTermsBack.setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}