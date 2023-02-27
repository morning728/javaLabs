package org.example.ex8.observer;

import org.example.exercise3.SyncList;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Zoo z = new Zoo(new ArrayList<>());
        z.setRules("rules1");
        z.add(new Animal(z.rules));
        z.add(new Animal(z.rules));
        z.add(new Animal(z.rules));
        z.setRules("rules2");
        System.out.println(((Animal)z.animals.get(0)).getRules());
        z.setRules("rul12es2");
        System.out.println(((Animal)z.animals.get(0)).getRules());

    }
}
