package com.example.chap37

fun main(args: Array<String>) {
    run {
        println("----37.3----")
        val p = ::calculatePlus
        val m = ::calculateMinus
        printRandomValueCalclation(p)
        printRandomValueCalclation(m)
    }
    run {
        println("----37.4----")
        val p = fun(x: Double, y: Double) : Double = x + y
        val m = fun(x: Double, y: Double) : Double = x - y
        printRandomValueCalclation(p)
        printRandomValueCalclation(m)
    }
    run {
        println("----37.6----")
        val calculator1 = getCalculator("+")
        val calculator2 = getCalculator("-")
        val result1 = calculator1(10.0, 2.0)
        val result2 = calculator2(10.0, 2.0)
        println(result1)
        println(result2)
    }
}



fun calculatePlus(x: Double, y: Double) = x + y
fun calculateMinus(x: Double, y: Double) = x - y

fun printRandomValueCalclation(calculator: (Double, Double) -> Double) {
    val x = Math.random()
    val y = Math.random()
    val result = calculator(x,y)
    println("$x と $y の計算結果は${result}です。")
}

fun getCalculator(type: String): (Double, Double) -> Double {
    val p = fun(x: Double, y: Double) = x + y
    val m = fun(x: Double, y: Double) = x - y
    return when (type) {
        "+" -> p
        else -> m
    }
}