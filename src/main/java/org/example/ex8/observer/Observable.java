package org.example.ex8.observer;

public interface Observable {
    void add(Observer o);
    void remove(Observer o);
    void notifyObservers(String st);
}
