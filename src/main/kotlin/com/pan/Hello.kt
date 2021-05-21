package com.pan

fun main() {
    var s:String? = "abcde" //問號允許放null
    s = null
    println(s!!.length) //能為null則加?，確認要自行處理exception則加上!!
    println(s?.get(3)) //取到某index的值
    println(s?.substring(3)) //子字串
//    kotlin處理null pointer較厲害



//    println("Hello Kotlin")
//    Human().hello()

//    物件
    val h = Human()
    h.hello()
}

class Human{
    fun hello(){
        println("Hello Kotlin")
    }
}

//fun main(args: Array<String>) {
//
//}

