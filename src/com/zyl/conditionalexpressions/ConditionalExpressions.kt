package com.zyl.conditionalexpressions

fun maxOf1(a: Int,b: Int): Int{
    if(a > b){
        return a
    }else{
        return b
    }
}

fun maxOf2(a: Int,b: Int) = if(a > b) a else b