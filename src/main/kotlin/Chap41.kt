package com.example.Chap41

fun main(args: Array<String>) {

    run {
        println("----41.4----")
        val box1 = Box<String>()
        val box2 = Box<Int>()
        box1.setValues("文字列ですよ", "あいうえお")
        box2.setValues("整列ですよ",1000)
        box1.printValue()
        box2.printValue()
    }
    run {
        println("----41.7----")
        val box1 = Box2<Int, String>()
        val box2 = Box2<String, Double>()
        box1.setValues(500, "ごひゃく")
        box2.setValues("pi", 3.14)
        box1.printValue()
        box2.printValue()
    }
}

class Box<T> {
    var label: String = ""
    var content: T? = null

    fun setValues(label: String, content: T) {
        this.label = label
        this.content = content
    }

    fun printValue() {
        println("$label : $content")
    }
}

class Box2<L, C> {
    var label: L? = null
    var content: C? = null
    fun setValues(label: L, content: C) {
        this.label = label
        this.content = content
    }
    fun printValue() {
        println("${label} = ${content}")
    }
}