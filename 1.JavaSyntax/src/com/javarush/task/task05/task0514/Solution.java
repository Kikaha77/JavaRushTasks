package com.javarush.task.task05.task0514;

/* 
Программист создает человека
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Person ob = new Person();
        ob.initialize("Roma", 39);
    }

    static class Person {
        //напишите тут ваш код
        String name;
        int age;

        public void initialize (String name, int age) {
            this.name = name;
            this.age = age;
        }
    }
}
