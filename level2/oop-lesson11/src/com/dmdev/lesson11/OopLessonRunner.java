package com.dmdev.lesson11;

public class OopLessonRunner {
    public static void main(String[] args) {
        Ssd ssd = new Ssd(1024);
        Ram ram = new Ram(500);
        Computer computer = new Computer(ssd, ram);
        computer.load();
        double sin = Math.sin(2.5);
    }
}
