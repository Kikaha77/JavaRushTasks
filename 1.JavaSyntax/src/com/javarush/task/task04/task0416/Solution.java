package com.javarush.task.task04.task0416;

/* 
Переходим дорогу вслепую
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        double t = Double.parseDouble(s);
        double x = t % 5;
        if (0 <= x && x < 3) System.out.println("зелёный");
        else if (3 <= x && x < 4) System.out.println("желтый");
        else if (4 <= x && x < 5) System.out.println("красный");
    }
}
