package jp.ac.it_college.std.koshiro.kotlin

import jp.ac.it_college.std.koshiro.kotlin.cars.Car

fun main(args: Array<String>) {
    val c1 = Car("赤")
    val c2 = Car("青")
    c1.drive()
    c2.drive()
}