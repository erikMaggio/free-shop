package com.example.freeshop.model.response

import com.example.freeshop.utils.Repository

class RepositoryImp: Repository {
    override fun addProduct(name: String, price: Int, quantity: Int, brand: String, ID: String) {
        var miProduct = Product(name, price, quantity, brand, ID)

        /*for (itemList in Bodega.stock) {
            if (itemList == miProduct) {
                itemList.quantity += miProduct.quantity
            }
        }

        if (!Bodega.stock.contains(miProduct)) {
            Bodega.stock.add(miProduct)
        }*/


    }
}
