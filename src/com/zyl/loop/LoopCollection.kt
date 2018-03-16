package com.zyl.loop

fun main(args: Array<String>) {

    for (item in items) {
        println(item)
    }


    when {
        "orange" in items -> println("juicy")
    }
}