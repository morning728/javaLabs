package org.example.ex8.strategy;

public class BigStudent extends Student{
    @Override
    public void run() {
        System.out.println("run");
    }

    @Override
    public void stay() {
        System.out.println("run");
    }

    public BigStudent() {
        this.ws = new WritingFastStrategy();
    }
}
