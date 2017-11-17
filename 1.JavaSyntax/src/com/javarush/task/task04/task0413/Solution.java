package com.javarush.task.task04.task0413;

/* 
День недели
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader( new InputStreamReader (System.in));
        String numa = reader.readLine();
        int num1 = Integer.parseInt(numa);

        if (num1 == 1) {
            System.out.println("понедельник");
        }
        else if (num1 == 2) {
            System.out.println("вторник");
        }
        else if (num1 == 3) {
            System.out.println("среда");
        }
        else if (num1 == 4) {
            System.out.println("четверг");
        }
        else if (num1 == 5) {
            System.out.println("пятница");
        }
        else if (num1 == 6) {
            System.out.println("суббота");
        }
        else if (num1 == 7) {
            System.out.println("воскресенье");
        }
        else if ((num1 > 7) || (num1 < 1)) {
            System.out.println("такого дня недели не существует");
        }
    }
}