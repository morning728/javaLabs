package org.example.ex8.strategy;

import org.example.ex8.state.Context;

public abstract class Student {
    public Strategy ws;

    public void write() {
        ws.write();
    }

    abstract public void run();
    abstract public void stay();

}
