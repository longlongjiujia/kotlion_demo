package com.zyl.loop

val items = listOf<String>("apple","banana","kiwifruit")

fun printItems1() {
    for(item in items) {
        println(item)
    }
}

fun printItems2() {
    for (index in items.indices) {
        println("item at $index is ${items[index]}")
    }
}

fun main(args: Array<String>) {
    printItems1()
    printItems2()
}
