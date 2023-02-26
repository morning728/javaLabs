package org.example.ex6;

public class SnowWithCatFab implements AbsFabric{
    @Override
    public Animal createAnimal() {
        return new Cat();
    }

    @Override
    public Human createHuman() {
        return new Snow();
    }
}
