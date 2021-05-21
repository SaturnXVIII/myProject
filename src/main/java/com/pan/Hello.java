package com.pan;

public class Hello {
    public static void main(String[] args) {
//        System.out.println("Hello world");
//        new Person().hello();
//        大寫的物件為參照資料型態
//        String s = new String("abcd")
        String s = "abcd"; //null 空白參照資料型態
//        NullPointerException記憶體為Null，沒有指到任何物件!!
        System.out.println(s.charAt(3)); //index
        System.out.println(s.length()); //長度
        System.out.println(s.substring(3));//取子字串 ==> 從第3index之後
        System.out.println(s.substring(1,4));//取子字串 ==> 從第1index取到4index之前
        Person p = new Person();
        p.hello();
    }
}
