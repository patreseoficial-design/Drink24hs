package com.drink24h.app

object Cart {

    var selectedProduct: Product? = null

    fun select(product: Product) {
        selectedProduct = product
    }

    fun clear() {
        selectedProduct = null
    }

    fun total(): Double {
        return selectedProduct?.price ?: 0.0
    }
}
