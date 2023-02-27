package org.example.exercise3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Semaphore;

public class Main {
    public static void main(String[] args) throws InterruptedException { // GET RID OF SYNCHRONIZED ON METHOD FOR TEST

        SyncList<Integer> list = new SyncList<>(new ArrayList<Integer>());
        Thread t1 = new Thread(() -> {
            for (int i = 0; i< 1000; i++)
                list.add(1);
        });
        Thread t2 = new Thread(() -> {
            for (int i = 0; i< 1000; i++)
                list.add(1);
        });
        t1.start();
        t2.start();
        Thread.sleep(2000);
        System.out.println(list.size());
//        MySet<Integer> set = new MySet<>(new HashSet<Integer>(), new Semaphore(2)); //permits
//        Thread t1 = new Thread(() -> {
//            for (int i = 0; i< 1000; i++)
//                set.add(i);
//        });
//        Thread t2 = new Thread(() -> {
//            for (int i = 1001; i< 2001; i++)
//                set.add(i);
//        });
//        t1.start();
//        t2.start();
//        Thread.sleep(5000);
//        System.out.println(set.size());
    }
}
