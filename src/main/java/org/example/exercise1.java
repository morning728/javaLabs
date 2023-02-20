package org.example;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class exercise1 {

    public static void main(String[] args) {
        class Comp implements Comparator {
            @Override
            public int compare(Object o1, Object o2) {
                return Math.abs((Integer) o1) - Math.abs((Integer)o2);
            }
        }
        Comp comp = new Comp();
        List<Integer> ints = new ArrayList<>();
        ints.add(123);
        ints.add(125);
        ints.add(124);
        ints.add(1);
        ints.add(-23);
        ints.sort(comp);
        System.out.println(ints.toString());
    }
}
