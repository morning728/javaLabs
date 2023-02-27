package org.example.ex7.adapter;

public class Main {
    public static void main(String[] args) {
        Database db = new DataBaseAdapterToApp();
        db.insert();
        db.remove();
    }
}