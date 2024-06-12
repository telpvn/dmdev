package com.dmdev.lesson19.map;

import com.dmdev.lesson19.person.Person;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortExample {

    public static void main(String[] args) {

        List<String> strings = Arrays.asList("123", "345", "14", "678");
        Collections.sort(strings);
        System.out.println(strings);

        List<Person> personList = Arrays.asList(
                new Person(1, "Ivan", "Ivanov"),
        new Person(29, "Petr", "Petrov"),
                new Person(3, "Sveta", "Svetikova")
        );
        Collections.sort(personList);
        System.out.println(personList);
    }
}
