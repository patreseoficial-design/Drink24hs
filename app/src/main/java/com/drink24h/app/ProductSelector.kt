package com.drink24h.app

object ProductSelector {

    private var currentIndex = 0

    fun currentProduct(): Product {
        return ProductRepository.products[currentIndex]
    }

    fun next(): Product {
        currentIndex++

        if (currentIndex >= ProductRepository.products.size) {
            currentIndex = 0
        }

        return currentProduct()
    }

    fun previous(): Product {
        currentIndex--

        if (currentIndex < 0) {
            currentIndex = ProductRepository.products.size - 1
        }

        return currentProduct()
    }

    fun select(): Product {
        val product = currentProduct()
        Cart.select(product)
        return product
    }

    fun reset() {
        currentIndex = 0
        Cart.clear()
    }
}
