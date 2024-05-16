package org.example

fun main(args: Array<String>) {
    if (args.size == 0) {
        println("Pleasse provide a nameas a commando-line argument")
        return
    }
    println("Hello, ${args[0]}!")
}