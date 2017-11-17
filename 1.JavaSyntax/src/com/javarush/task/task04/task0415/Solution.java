package com.javarush.task.task04.task0415;

/* 
Правило треугольника
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader( new InputStreamReader (System.in));

        String numa1 = reader.readLine();
        int num1 = Integer.parseInt(numa1);

        String numa2 = reader.readLine();
        int num2 = Integer.parseInt(numa2);

        String numa3 = reader.readLine();
        int num3 = Integer.parseInt(numa3);

        if ((((num1 + num2) > num3) && ((num2 + num3) > num1) && ((num1 + num3) > num2))) {

            System.out.println("Треугольник существует.");

        }

        else { System.out.println("Треугольник не существует."); }

    }
}