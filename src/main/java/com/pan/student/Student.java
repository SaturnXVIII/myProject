package com.pan.student;
// 快捷鍵help / keymap
public class Student {
    //類別下的變數為屬性
    //預設字串為null
    //預設數字為0
    String id;
    String name;
    int english;
    int math;
    // java生成預設的建構子
    public Student() {
        super();
    }
    //tab selected param
    public Student(/*field*/String name, int english, int math) {
//        將區域變數傳進變成屬性(紫色)
        this.name = name;
        this.english = english;
        this.math = math;

    }
    //alt inser

    public void print() {
        System.out.println(name +  "\t english score = " + english + "\t math score = " + math);
    }

//    16
//    成績回傳
    public int hightest() {
        /*
        int max = (english > math) ? english : math; //三元運算式

        if (english > math) {
            max = english;
        }else {
            max = math;
        }
        */
        return (english > math) ? english : math;
    }
}
