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