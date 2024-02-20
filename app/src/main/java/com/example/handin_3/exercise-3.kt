package com.example.handin_3

fun main() {
    val car1 = Car()
    car1.changeGear(6)
    car1.speedUp(100)

    println("Car1 - gear: ${car1.gear}, speed: ${car1.speed}")

    val car2 = Car()
    car2.changeGear(1)
    car2.speedUp(200)
    car2.applyBrakes(150)

    println("Car2 - gear: ${car2.gear}, speed: ${car2.speed}")

}

/* 3.
Create a class that implements the following interface. Now create two objects using the class created
interface Vehicle {
    changeGear(int a);
    speedUp(int a);
    applyBrakes(int a);
}
*/

interface Vehicle {
    fun changeGear(a: Int)
    fun speedUp(a: Int)
    fun applyBrakes(a: Int)
}

class Car(): Vehicle {
    var gear: Int = 1
        set(value) {
            field = if(value > 6) 6
                    else if (value < 0) 0
                    else value
        }

    var speed: Int = 0
        set(value) {
            field = if(value > 200) 200
            else if (value < 0) 0
            else value
        }

    override fun changeGear(a: Int) {
        gear = a
    }

    override fun speedUp(a: Int) {
        speed += a
    }

    override fun applyBrakes(a: Int) {
        speed -= a
    }

}