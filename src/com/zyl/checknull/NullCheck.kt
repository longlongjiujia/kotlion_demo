package com.zyl.checknull



//当某个变量的值可以为 null 的时候，必须在声明处的类型后添加 ? 来标识该引用可为空。
//如果 str 的内容不是数字返回 null：
fun parseInt(str: String): Int?{
   return Integer.parseInt(str);
}

// 直接使用 `i * j` 会导致编译错误，因为他们可能为 null
fun printProduct(arg1: String,arg2: String){
    val i = parseInt(arg1)
    val j = parseInt(arg2)
    // 在空检测后，i 和 j 会自动转换为非空值（non-nullable）
    if(i != null && j != null){
        println(i * j)
    }else{
        println("either '$arg1' or '$arg2' is not a number")
    }
}