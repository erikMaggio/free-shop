package com.example.freeshop.ui.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.freeshop.R
import com.example.freeshop.databinding.CardButtonsBinding
import com.example.freeshop.model.response.Title
import com.squareup.picasso.Picasso

class AdapterTitle(private val titleList: List<Title>,private val onClick:(Title)->Unit) : RecyclerView.Adapter<TitleHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TitleHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.card_buttons, parent, false)
        return TitleHolder(view)
    }

    override fun onBindViewHolder(holder: TitleHolder, position: Int) {
        holder.render(titleList[position],onClick)
    }

    override fun getItemCount(): Int {
        return titleList.size
    }
}

class TitleHolder(view: View) : RecyclerView.ViewHolder(view) {

    private val binding = CardButtonsBinding.bind(view)


    fun render(value: Title,onClick:(Title)->Unit) {

        binding.tvTitle.text = value.title

        Picasso.get().load(value.image).into(binding.imgRvHome)

        binding.root.setOnClickListener {
            onClick(value)
        }
    }
}