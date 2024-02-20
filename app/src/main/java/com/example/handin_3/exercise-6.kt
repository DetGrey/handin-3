package com.example.handin_3

fun main() {
    val inventory = ProductInventory()
    inventory.addProduct(Product("computer", 5))
    inventory.addProduct(Product("phone", 2))
    inventory.addProduct(Product("chargers", 10))

    inventory.displayInventory()
}

/* 6. Advanced (Optional)
Create a product inventory system where each product has a name and a quantity.
Implement functions to add products, remove products, and display the current inventory.
 */

class Product(val name: String, var quantity: Int) {}

class ProductInventory() {
    private val products: MutableList<Product> = mutableListOf()

    fun addProduct(product: Product) {
        products.add(product)
    }
    fun removeProduct(productName: String) {
        products.removeIf { x -> x.name == productName }
    }

    fun displayInventory() {
        println("Showing current inventory:")
        products.forEach { product: Product -> println("Product: '${product.name}', Quantity: ${product.quantity}") }
    }
}