package org.example.ex6;

public class DogWithNiggaFabric implements AbsFabric{
    @Override
    public Animal createAnimal() {
        return new Dog();
    }

    @Override
    public Human createHuman() {
        return new Nigger();
    }
}
