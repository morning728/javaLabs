package org.example.ex6.facade;

public class Facade {
    Petux p = new Petux();
    Time t = new Time();

    void nature(){
        t.setData(1);
        if(!t.isDay()){
            System.out.println("night");
        }
        p.say(t);
    }
}
