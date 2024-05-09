package org.example

import kotlin.random.Random

fun main(args: Array<String>) {
    println("1:グー 2:チョキ 3:パー を選んでください:")
    // 入力1,2,3ですが、0,1,2となるよう工夫してください
    val player = readln().toInt() - 1


    //CPUの手をランダムで決める
    val cpu = Random.nextInt(0, 3) //0,1,2のどれかになる

    //勝敗判定
    /*
    val judge = when {
        player == 0 && cpu == 0 -> "あいこ"
        player == 0 && cpu == 1 -> "かち"
        player == 0 && cpu == 2 -> "まけ"
        player == 1 && cpu == 0 -> "まけ"
        player == 1 && cpu == 1 -> "あいこ"
        player == 1 && cpu == 2 -> "かち"
        player == 2 && cpu == 0 -> "かち"
        player == 2 && cpu == 1 -> "まけ"
        player == 2 && cpu == 2 -> "あいこ"
        else -> "?"
        8
     */
    val diff = (player - cpu + 3) % 3
    val judge = when (diff) {
        0 -> "あいこ"
        1 -> "まけ"
        2 -> "かち"
        else -> "?"
    }
    //勝敗の結果表示（プレイヤー視点）
    println("CPU: ${cpu + 1} --- $judge")
}