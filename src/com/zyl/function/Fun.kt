package com.zyl.function

//带有两个 Int 参数、返回 Int 的函数：
fun sum1(a: Int,b: Int): Int{
    return a + b
}

//将表达式作为函数体、返回值类型自动推断的函数：
fun sum2(a: Int,b: Int) = a + b

//函数返回无意义的值：
fun printSum1(a: Int,b: Int): Unit{
    println("sum of $a and $b is ${a + b}")
}

//Unit 返回类型可以省略：
fun printSum2(a: Int,b: Int){
    println("sum of $a and $b is ${a + b}")
}


fun main(args: Array<String>) {
    sum1(1,2)

    sum2(1,2)

    printSum1(1,2)

    printSum2(1,2)
}