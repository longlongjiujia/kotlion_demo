package com.zyl.typedetection

//is 运算符检测一个表达式是否某类型的一个实例。 如果一个不可变的局部变量或属性已经判断出为某类型，那么检测后的分支中可以直接当作该类型使用，无需显式转换：

fun getStrLength1(obj: Any): Int? {
    if (obj is String) {
        // `obj` 在该条件分支内自动转换成 `String`
        return obj.length
    }

    return null

}

fun getStrLength2(obj: Any): Int? {

    if (obj !is String) return null
// `obj` 在这一分支自动转换为 `String`
    return obj.length
}

fun getStrLength3(obj: Any): Int? {
    // `obj` 在 `&&` 右边自动转换成 `String` 类型
    if (obj is String && obj.length > 0){
        return obj.length
    }

    return null
}