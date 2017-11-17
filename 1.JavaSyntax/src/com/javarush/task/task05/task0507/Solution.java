package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static jdk.nashorn.internal.objects.Global.println;

public class Solution {
    public static void main(String[] args) throws Exception {
        List<Integer> myList = new ArrayList<Integer>();
        Scanner reader = new Scanner(System.in);
        int a;
        int res = 0;

        do { a = reader.nextInt(); myList.add(a);
        } while (a != -1); {
            int x = myList.lastIndexOf(-1);
            myList.remove(x);
        }

        for (Integer number :  myList) {
            res = res + number;
        }

        a = myList.size();
        float last = ((float)res)/a;

        System.out.println(last);


    }
}
