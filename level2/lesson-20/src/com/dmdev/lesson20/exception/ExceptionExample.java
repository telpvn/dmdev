package com.dmdev.lesson20.exception;

import java.io.FileNotFoundException;

public class ExceptionExample {

    public static void main(String[] args) {
        System.out.println("main start");
        try {
            unsafe(10);
        } catch (FileNotFoundException exception) {
//            handle exception
            exception.printStackTrace();
        }
        System.out.println("main code");
//        code
    }

    public static void unsafe(int value) throws FileNotFoundException {
        System.out.println("unsafe start");
        if (value > 0) {
            throw new FileNotFoundException();
        }
        System.out.println("unsafe end");
//        code
    }
}
