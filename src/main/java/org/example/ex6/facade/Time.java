package org.example.ex6.facade;

public class Time {
    int data;

    public void setData(int data) {
        this.data = data;
    }

    boolean isDay(){
        return data == 1;
    }
}
