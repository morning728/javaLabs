package org.example.ex6.prototype;

import org.example.ex6.AbsFabric;
import org.example.ex6.Animal;
import org.example.ex6.DogWithNiggaFabric;

public class main {
    public static void main(String[] args) {
        Human h = new org.example.ex6.prototype.Human("1", "1");
        Human h2 = (Human) h.clone();
        System.out.println(h.name + " " + h2.name);
        h2.setName("2");
        System.out.println(h.name + " " + h2.name);
    }
}
