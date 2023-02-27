package org.example.ex8.strategy;

public class WritingSlowStrategy implements Strategy{
    @Override
    public void write() {
        System.out.println("slow");
    }
}
