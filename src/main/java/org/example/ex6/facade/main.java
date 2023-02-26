package org.example.ex6.facade;

import org.example.ex6.AbsFabric;
import org.example.ex6.Animal;
import org.example.ex6.DogWithNiggaFabric;
import org.example.ex6.Human;

public class main {
    public static void main(String[] args) {
        Facade f = new Facade();

        f.nature();
    }
}
