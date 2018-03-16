package com.zyl.loop

fun description(obj: Any): String =
        when (obj) {
            1          -> "One"
            "Hello"    -> "Greeting"
            is Long    -> "Long"
            !is String -> "Not a string"
            else       -> "Unknown"
        }


fun main(args: Array<String>) {
    println(description(1))

    println(description("Hello"))

    println(description(items))
}