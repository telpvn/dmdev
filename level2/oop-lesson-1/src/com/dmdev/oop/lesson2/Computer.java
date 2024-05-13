package com.dmdev.oop.lesson2;

public class Computer {
    int ssd = 500;
    private long ram;

    public Computer() {
        System.out.println("Я был создан");
    }

    Computer(int newSsd) {
        ssd = newSsd;
        ram = 999;
    }

    protected Computer(int ssd, int newRam) {
        this.ssd = ssd;
        ram = newRam;
    }


    void load() {
        System.out.println("Я загрузился");
    }

    void load(boolean open) {
        System.out.println("Я загрузился");
        if (open) {
            System.out.println("Я открыл крышку");
        }
    }

    void printState() {
        System.out.println("Ssd " + ssd);
        System.out.println("Ram " + ram);
        System.out.println();
    }
}
