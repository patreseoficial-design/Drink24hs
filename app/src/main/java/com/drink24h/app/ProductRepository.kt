package com.drink24h.app

object ProductRepository {

    val products = mutableListOf(

        Product(
            id = 1,
            name = "Água",
            price = 3.00,
            stock = 20
        ),

        Product(
            id = 2,
            name = "Refrigerante",
            price = 6.00,
            stock = 15
        ),

        Product(
            id = 3,
            name = "Energético",
            price = 10.00,
            stock = 10
        ),

        Product(
            id = 4,
            name = "Vodka",
            price = 25.00,
            stock = 8,
            alcoholic = true
        ),

        Product(
            id = 5,
            name = "Pinga",
            price = 2.00,
            stock = 20,
            alcoholic = true
        ),

        Product(
            id = 6,
            name = "Whisky",
            price = 25.00,
            stock = 10,
            alcoholic = true
        )
    )

    fun getProduct(id: Int): Product? {
        return products.find { it.id == id }
    }
}
