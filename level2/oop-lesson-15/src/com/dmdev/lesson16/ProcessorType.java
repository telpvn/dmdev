package com.dmdev.lesson16;

public enum ProcessorType {
    BIT_32("BIT_32"),
    BIT_64("BIT_64");

    private String name;

    ProcessorType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
