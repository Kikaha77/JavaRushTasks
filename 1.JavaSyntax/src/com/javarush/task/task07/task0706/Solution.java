package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner in = new Scanner(System.in);
        int[] nums = new int[15];

        for(int i=0;i < nums.length; i++){
            nums[i]=in.nextInt();
        }

        int even = 0;
        int odd = 0;

        for(int i=0;i < nums.length; i++){
            if ((i%2==0) || (i == 0)) {
                even = even + nums[i];
            }
            else {
                odd = odd + nums[i];
            }
        }
        if (even > odd) System.out.println("В домах с четными номерами проживает больше жителей.");
        else if (odd > even) System.out.println("В домах с нечетными номерами проживает больше жителей.");

    }
}
