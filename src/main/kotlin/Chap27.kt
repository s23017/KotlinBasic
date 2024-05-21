package com.example.chap27

fun main(args: Array<String>) {
    run {
        println("----27.2----")
        val car = Car()
        car.drive(5.0)
        car.drive(10.0)
    }
    run {
        println("----27.3----")
        val car = Ferrari()
        car.drive(5.0)
        car.drive(10.0)
    }
    run {
        println("----27.5----")
        val car = Ferrari5("赤")
        car.drive(5.0)
        car.drive(10.0)
    }
}

open class Car() {
    var distance = 0.0
    open fun drive(d: Double) {
        distance = distance + d
        println("車が ${d}km 走りました。")
        println("マイレージは ${distance}キロになりました。")
    }
}
open class Car5(val color: String) {
    var distance = 0.0
    open fun drive(d: Double) {
        distance = distance + d
        println("${color}の車が ${d}km 走りました。")
        println{"マイレージは ${distance}キロになりました。"}
    }
}

class Ferrari() : Car()
class Ferrari5(color: String) : Car5(color)
