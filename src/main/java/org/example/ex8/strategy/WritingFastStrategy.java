package org.example.ex8.strategy;

public class WritingFastStrategy implements Strategy{

    @Override
    public void write() {
        System.out.println("fast");
    }
}
