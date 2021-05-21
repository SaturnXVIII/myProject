package com.pan.student;
//java class 首字大寫
public class SchoolRunner {
/*console utf-8:
  gradle.property=>
  https://stackoverflow.com/questions/21267234/show-utf-8-text-properly-in-gradle/21267635#21267635*/
    public static void main(String[] args) {
//        new 可將類別在記憶體生成為一個物件
//        create constructor: alt + shift + enter
        Student stu = new Student("Hank", 60, 70);
        stu.print();

    }
}
