package com.javarush.task.task02.task0201;

/* 
Реализуем метод print
*/
public class Solution {
    public static void main(String[] args) {
        print("Java easy to learn!");
    }

    public static void print(String s) {
        //напишите тут ваш код
        for (int i = 1; i < 5; i++) {
            System.out.println(s);
        }
    }
}
