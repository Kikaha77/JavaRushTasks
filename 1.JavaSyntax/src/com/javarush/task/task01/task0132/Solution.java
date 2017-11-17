package com.javarush.task.task01.task0132;

/* 
Сумма цифр трехзначного числа
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(546));
    }

    public static int sumDigitsInNumber(int number) {
        //напишите тут ваш код
        String pr = Integer.toString(number);
        char[] charArray = pr.toCharArray();
        int sum = 0;
        for (char c: charArray) {
            sum = sum + Character.getNumericValue(c);
        }

            return sum;
    }
}