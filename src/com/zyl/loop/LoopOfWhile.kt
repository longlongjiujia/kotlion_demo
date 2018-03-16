package com.zyl.loop

fun printItem3() {
    var index = 0
    while (index < items.size) {
        println("item at $index is ${items[index]}")
        index ++
    }
}

fun main(args: Array<String>) {
    printItem3()
}
