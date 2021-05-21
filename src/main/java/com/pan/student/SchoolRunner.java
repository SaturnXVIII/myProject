package com.pan.student;

import java.util.Scanner;

//java class 首字大寫
public class SchoolRunner {
/*console utf-8:
  gradle.property=>
  https://stackoverflow.com/questions/21267234/show-utf-8-text-properly-in-gradle/21267635#21267635*/
    public static void main(String[] args) {
//        userInput();
    }
// 抽取出成為方法：ctrl + alt + M
    private static void userInput() {
        //        ctrl + P: 建議的建構子
        System.out.print("please enter student's name: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        System.out.print("please enter english's score: ");
        int english = scanner.nextInt();
        System.out.print("please enter math's score: ");
        int math = scanner.nextInt();

//        new 可將類別在記憶體生成為一個物件
//        create constructor: alt + shift + enter
        Student stu = new Student(name, english, math);
        stu.print();
        System.out.println("High score: " + stu.hightest());
    }
}
