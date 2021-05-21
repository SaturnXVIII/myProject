package com.kotlin
//kotlin 只管package是誰，對於在哪個資料夾無嚴格規定

import java.util.*

//top -level
fun main(args: Array<String>) {
//    userInput()
    var stu = Student("Hank", 88, 99)
    // 方法的呼叫需要有{}
    println("Highest: ${stu.highest()}")
}

class Student(/*property*/private var name:String?, private var english: Int, private var math: Int) {
    //    新增屬性，可跟建構子同時設計
    fun print() {
        println(name + "\t" + english + "\t" + math +
                "\t" + ( english + math ) / 2)
    }

    fun nameCheck() {
        println(name?.length) //null的關係，沒有取得length屬性
    }

    fun highest() : Int { //告訴回傳值為int
        // kotlin沒有三元運算式，但允許等號右邊接if
        var max = if ( english > math) {
            print("english ")
            english //指定給max
        } else {
            print("math ")
            math
        }
        /*
        if ( english > math) {
            max = english
        } else {
            max = math
        }
        */
        return max
    }
}

private fun userInput() {
    //    in在kotlin中是關鍵字，加上重音符號即可使用關鍵字
    val scanner = Scanner(System.`in`)
//    print("Please enter student's name: ")
//    val name = scanner.next()
    val name = null
    print("Please enter student's english score: ")
    val english = scanner.nextInt()
    print("Please enter student's math score: ")
    val math = scanner.nextInt()
    val stu = Student(name, english, math)
    stu.print()
    stu.nameCheck()
}
