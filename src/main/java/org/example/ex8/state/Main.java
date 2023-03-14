package org.example.ex8.state;

import org.example.exercise3.SyncList;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Student s = new Student();
        s.setCtx(new Ctx1());
        s.getState();
        s.nextState();
        s.getState();
        s.nextState();
        s.getState();
        s.prevState();
        s.getState();
    }
}
