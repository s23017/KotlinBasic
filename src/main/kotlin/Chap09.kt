package org.example

fun main(args: Array<String>) {
    val a: Byte = 100
    val b: Short = 10_000
    val c: Int = 1_000_000_000
    val d: Long = 1_000_000_000_000_000_000L
    val e: Float = 0.123f
    val f: Double = 0.123456789
    val g: String = "こんにちは"

    println("----9.3----")
    var a3 = 100
    println("before a3: $a3")
    a3 = 101
    println(" after a3: $a3")

    println("----9.6----")
    var a6 = 100
    a6 = a6 + 1
    a6 = a6 - 21
    a6 = a6 * 3
    a6 = a6 / 10
    a6 = a6 % 10
    println(a6)
}