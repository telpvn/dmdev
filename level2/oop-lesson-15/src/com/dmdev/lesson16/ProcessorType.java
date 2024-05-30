package com.dmdev.lesson16;

public enum ProcessorType implements Describable {
    BIT_32("BIT_32"),
    BIT_64("BIT_64");

    private String name;

    ProcessorType(String name) {
        this.name = name;
    }

    @Override
    public String getDescription() {
        return name + " description";
    }

    public String getName() {
        return name;
    }

}
