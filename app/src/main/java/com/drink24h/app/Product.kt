
package com.drink24h.app

data class Product(
    val id: Int,
    val name: String,
    val price: Double,
    val stock: Int,
    val alcoholic: Boolean = false
)
