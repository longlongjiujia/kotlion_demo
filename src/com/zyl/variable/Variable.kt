package com.zyl.variable

//局部变量

val a: Int = 1  // 立即赋值
val b = 2   // 自动推断出 `Int` 类型

//可变变量
var x = 5



fun main(args: Array<String>) {
//    x ++
    ++x
    println(x)
}
