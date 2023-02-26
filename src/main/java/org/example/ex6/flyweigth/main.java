package org.example.ex6.flyweigth;

import org.example.ex6.facade.Facade;

public class main {
    public static void main(String[] args) {
        Fabric f = new Fabric();
        for (int i = 0; i< 10 ; i++){
            f.get(i % 3).say();
        }

        System.out.println(f.map.toString());
    }
}
