package org.example.ex8.memento;

import org.example.exercise3.SyncList;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws InterruptedException { // GET RID OF SYNCHRONIZED ON METHOD FOR TEST
        Obj o = new Obj("12", 12);
        BackupHistory h = new BackupHistory();
        h.add(o.makeBackup());
        o.setData(123);
        System.out.println(o.toString());
        o.recover(h.get());
        System.out.println(o.toString());
    }
}
