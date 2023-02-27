package org.example.ex7.adapter;

public class DataBaseAdapterToApp extends Application implements Database{
    @Override
    public void insert() {
        insert1();
    }

    @Override
    public void remove() {
        remove1();
    }

    @Override
    public void select() {
        select1();
    }
}
