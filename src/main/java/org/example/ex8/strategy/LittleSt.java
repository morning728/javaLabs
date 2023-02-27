package org.example.ex8.strategy;

public class LittleSt extends Student {
    @Override
    public void run() {
        System.out.println("run");
    }

    @Override
    public void stay() {
        System.out.println("run");
    }

    public LittleSt() {
        this.ws = new WritingSlowStrategy();
    }
}
