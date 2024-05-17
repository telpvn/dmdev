package com.dmdev.oop.lesson9;

import com.dmdev.oop.lesson7.Computer;

public class StaticRunner {
    public static void main(String[] args) {
        new Computer(null, null);
        new Computer(null, null);
        Computer computer1 = new Computer(null, null);
        Computer computer2 = new Computer(null, null);
        Computer computer = new Computer(null, null);
        Class<? extends Computer> clazz = computer.getClass();
        Class<? extends Computer> clazz2 = computer2.getClass();
        Class<? extends Computer> clazz1 = computer1.getClass();

        System.out.println(clazz == clazz2);
        System.out.println(computer == computer2);


    }
}
