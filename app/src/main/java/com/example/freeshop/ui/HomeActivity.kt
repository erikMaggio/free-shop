package com.example.freeshop.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.freeshop.R
import com.example.freeshop.databinding.ActivityHomeBinding
import com.example.freeshop.model.response.Title
import com.example.freeshop.ui.adapter.AdapterTitle
import com.example.freeshop.utils.Constants.miItem

class HomeActivity : AppCompatActivity() {

    private lateinit var binding: ActivityHomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initRecyclerView(getItem())
    }

    private fun initRecyclerView(list: List<Title>) {
        val adapter = AdapterTitle(list, onClick = { goToDetails.invoke(it) })
        binding.rvTitles.adapter = adapter
    }

    private fun getItem(): List<Title> {
        return listOf(
            Title("Agregar", R.drawable.icon_add),
            Title("Buscar", R.drawable.icon_search),
            Title("Vender", R.drawable.icon_sell),
            Title("Favoritos", R.drawable.icon_favorite),
            Title("Eliminar", R.drawable.icon_delete)
        )
    }

    private val goToDetails = fun(item: Title) {
        val intent: Intent = when (item.title) {
            "Agregar" -> Intent(this, AddActivity::class.java)
            "Buscar" -> Intent(this, SearchActivity::class.java)
            "Vender" -> Intent(this, SellActivity::class.java)
            "Favoritos" -> Intent(this, FavoritesActivity::class.java)
            "Eliminar" -> Intent(this, DeleteActivity::class.java)
            else -> {
                Intent(this, HomeActivity::class.java)
            }
        }
        miItem = item
        startActivity(intent)
    }

}

