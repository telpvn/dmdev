package com.dmdev.lesson11;

public class Laptop extends Computer {
    private int weight;

    {
        System.out.println("init block laptop");
    }

    static {
        System.out.println("static block laptop");
    }

    public Laptop(Ssd ssd, Ram ram, int weight) {
        super(ssd, ram);
        this.weight = weight;
    }

    public Laptop() {
        System.out.println("Constructor Laptop");
    }

    public void open() {
        System.out.println("Открыл крышку");
    }

    public int getWeight() {
        return weight;
    }
}
