package com.pan.student

//top -level
fun main(args: Array<String>) {
    var stu = Students( "Jack", 66 , 88 )
    stu.print()

}

class Students(/*property*/var name:String, var english: Int, var math: Int) {
//    新增屬性，可跟建構子同時設計
    fun print() {
        println(name + "\t" + english + "\t" + math +
                "\t" + ( english + math ) / 2)
    }
}