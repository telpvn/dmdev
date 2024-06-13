package com.dmdev.lesson19.task;

/*
 * 1. Написать метод, который принимает целочисленный список и возвращает
 * целочисленный список только с нечетными значениями.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task1 {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 3, 6, 8, 9, 13, 20));
        List<Integer> result = removeEven(list);
        System.out.println(result);
    }

    private static List<Integer> removeEven(List<Integer> list) {
        for (Integer value : list) {
            if (value % 2 == 0) {
                list.remove(value);
            }
        }
        return list;
    }
}

/*D:\git\dmdev\level2\lesson19\out\production\lesson19 com.dmdev.lesson19.task.Task1
Exception in thread "main" java.util.ConcurrentModificationException
	at java.base/java.util.ArrayList$Itr.checkForComodification(ArrayList.java:1013)
	at java.base/java.util.ArrayList$Itr.next(ArrayList.java:967)
	at com.dmdev.lesson19.task.Task1.removeEven(Task1.java:21)
	at com.dmdev.lesson19.task.Task1.main(Task1.java:16)
*/
