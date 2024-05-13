package com.dmdev.oop.lesson2;

public class Computer {
    int ssd = 500;
    int ram;

    Computer() {
        System.out.println("Я был создан");
    }

    Computer(int newSsd) {
        ssd = newSsd;
        ram = 999;
    }

    Computer(int newSsd, int newRam) {
        ssd = newSsd;
        ram = newRam;
    }


    void load() {
        System.out.println("Я загрузился");
    }

    void printState() {
        System.out.println("Ssd " + ssd);
        System.out.println("Ram " + ram);
        System.out.println();
    }
}
