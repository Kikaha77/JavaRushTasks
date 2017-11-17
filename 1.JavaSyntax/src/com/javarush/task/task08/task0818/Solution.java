package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static HashMap<String, Integer> createMap() {
        //напишите тут ваш код
        HashMap<String, Integer> someProtocol = new HashMap<String, Integer>();

        someProtocol.put("one", Integer.valueOf(100));
        someProtocol.put("two", Integer.valueOf(200));
        someProtocol.put("three", Integer.valueOf(1000));
        someProtocol.put("four", Integer.valueOf(2000));
        someProtocol.put("five", Integer.valueOf(150));
        someProtocol.put("six", Integer.valueOf(2500));
        someProtocol.put("seven", Integer.valueOf(1500));
        someProtocol.put("eight", Integer.valueOf(2500));
        someProtocol.put("nine", Integer.valueOf(4000));
        someProtocol.put("ten", Integer.valueOf(2500));

        return someProtocol;
    }


    public static void removeItemFromMap(HashMap<String, Integer> map) {
        //напишите тут ваш код
        HashMap<String, Integer> copy = new HashMap<String, Integer>(map);
        for (Map.Entry<String, Integer> pair : copy.entrySet()) {
            if (pair.getValue() < 500)
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args)
    {
    }
}