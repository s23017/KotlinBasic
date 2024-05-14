package org.example

fun main(args: Array<String>) {
    //横は　９　→　１、縦は　１　→　９　の掛け算表を表示してください。
    val x = 9 downTo 1
    val y = 1..9

    //最初の見出しを出す
    print(" ")
    for (xi in x) {
        print("$xi ")
    }
    println()
    //掛け算を出す
    for (yi in y) {
        print("$yi ")
        for (xi in x) {
            print("${xi * yi} ")
        }
    }
    println()
}