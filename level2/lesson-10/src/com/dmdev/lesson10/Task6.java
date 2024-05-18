package com.dmdev.lesson10;

public class Task6 {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        String value = "";
        for (int i = 0; i < 100_000; i++) {
            value += i;
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Time: " + (endTime - startTime));
    }
}
