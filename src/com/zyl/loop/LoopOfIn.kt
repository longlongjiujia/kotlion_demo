package com.zyl.loop

val x = 10
val y = 9

fun main(args: Array<String>) {

    if (x in 1..y+1)
        println("fits in range")

    for (a in 1..5)
        println("a now is $a")

    for (b in 1..10 step 2)
        println("b now is $b")

    for (c in 9 downTo 0 step 3)
        println("c now is $c")
}