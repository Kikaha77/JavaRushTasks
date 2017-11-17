package com.javarush.task.task04.task0412;

/* 
Положительное и отрицательное число
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader( new InputStreamReader (System.in));
        String numa = reader.readLine();
        int num1 = Integer.parseInt(numa);
        if (num1 > 0 ) {
            System.out.println(num1*2);
        }
        else if (num1 < 0) {
            System.out.println(num1+1);
        }
        else {
            System.out.println(num1);
        }
    }

}