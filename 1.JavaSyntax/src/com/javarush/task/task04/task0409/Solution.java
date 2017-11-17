package com.javarush.task.task04.task0409;

/* 
Ближайшее к 10
*/

public class Solution {
    public static void main(String[] args) {
        closeToTen(8, 11);
        closeToTen(14, 7);
    }

    public static void closeToTen(int a, int b) {
        //::CODE:
        int a1 = 10 - a;
        int b1 = 10 - b;

        int a2 = abs(a1);
        int b2 = abs(b1);

        if (a2 >= b2) {
            System.out.println(b);
        }

        else {
            System.out.println(a);
        }



    }

    public static int abs(int a) {
        if (a < 0) {
            return -a;
        } else {
            return a;
        }
    }
}