package org.example

fun main(args: Array<String>) {
    println("点数を入力してください")
    val score = readln().toInt()

    println("成績判定")
    if (score in 0..59) {
        println("D")
    } else if (score in 60..69) {
        println("C")
    } else if (score in 70..79) {
        println("B")
    } else if (score in 80..89) {
        println("A")
    } else if (score in 90..99) {
        println("S")
    } else {
        println("エラー")
    }
}
//成績判定
//0 ~ 59 は D
//60 ~ 69 は C
//70 ~ 79 は B
//80 ~ 89 は A
//90 ~ 99 は S
//それ以外は[エラー]と出力