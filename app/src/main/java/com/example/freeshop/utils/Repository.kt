package com.example.freeshop.utils

interface Repository {
    fun addProduct(
        name: String,
        price: Int,
        quantity: Int,
        brand: String,
        ID: String
    )
}