package com.dmdev.lesson18;

import com.dmdev.lesson15.Archer;

public class ListRunner {

    public static void main(String[] args) {
        List list = new List(10);
        list.add("String1");
        list.add(25);
        list.add(new Archer("Archer", 15));
        list.add("String3");

        Object element = (String) list.get(1);
        System.out.println(element);
    }
}
