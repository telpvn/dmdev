package com.dmdev.lesson21;

import java.util.Comparator;

public class LambdaExample {
    public static void main(String[] args) {
        Comparator<Integer> comparator = (Integer o1, Integer o2) -> {
            return Integer.compare(o1, o2);
        };
        System.out.println(comparator.compare(25, 100));
    }

//        private static class IntegerComparator implements Comparator<Integer> {

//        @Override
//        (Integer o1, Integer o2) -> {
//            return Integer.compare(o1, o2);
//        }

}
