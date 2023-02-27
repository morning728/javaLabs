package org.example.ex8.observer;

import java.util.ArrayList;
import java.util.List;

public class Zoo implements Observable{
    List<Observer> animals;
    String rules;

    public Zoo(List<Observer> animals) {
        this.animals = animals;
    }

    public void setRules(String rules) {
        this.rules = rules;
        notifyObservers(rules);
    }

    @Override
    public void add(Observer o) {
        animals.add(o);
    }

    @Override
    public void remove(Observer o) {
        animals.remove(o);
    }

    @Override
    public void notifyObservers(String newRules) {
        for (Observer o: animals
             ) {
            o.update(newRules);
        }
    }
}
