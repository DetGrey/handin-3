package com.example.handin_3

fun main() {
    val fastFoodObjects: List<FastFood> = listOf(
        Sandwich("Cheese"),
        Sandwich("Tuna"),
        Pizza("Hawaii"),
        Pizza("Margarita"),
        Burger("Chicken"),
        Burger("Ham")
    )

    fastFoodObjects.forEach { item ->
        item.prepareFood()
        item.eat()
    }

}
/* 2.
Create an interface called FastFood (with appropriate methods) and create a Sandwich class,
a Pizza class and a class you decide that implements the FastFood interface.

Add some different Fastfood objects to an array. Now iterate through that array and use some
of the methods you have created above.
 */

interface FastFood {
    fun prepareFood()
    fun eat()
}

// SANDWICH
class Sandwich(val type: String): FastFood {
    override fun prepareFood() {
        println("Preparing a $type sandwich")
    }

    override fun eat() {
        println("Eating a $type sandwich")
    }
}
// PIZZA
class Pizza(val type: String): FastFood {
    override fun prepareFood() {
        println("Preparing a $type pizza")
    }

    override fun eat() {
        println("Eating a $type pizza")
    }
}
// BURGER
class Burger(val type: String): FastFood {
    override fun prepareFood() {
        println("Preparing a $type burger")
    }

    override fun eat() {
        println("Eating a $type burger")
    }
}