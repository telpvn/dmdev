package com.dmdev.lesson21;

import java.util.List;

public class StreamExample {

    public static void main(String[] args) {
        List<String> strings = List.of("11", "22", "33", "44", "55");
        for (String string : strings) {
            String value = string + string;
            Integer intValue = Integer.valueOf(value);
            if (intValue % 2 == 0) {
                System.out.println(intValue);
            }
        }
    }
}
