package org.example.ex6;

public class main {
    public static void main(String[] args) {
        AbsFabric f = new DogWithNiggaFabric();
        //AbsFabric f = new SnowWithCatFab();
        Animal a = f.createAnimal();
        Human h = f.createHuman();

        a.say();
        h.talk();
    }
}
