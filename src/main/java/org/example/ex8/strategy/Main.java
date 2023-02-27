package org.example.ex8.strategy;

import org.example.ex8.state.Ctx1;
import org.example.ex8.state.Student;

public class Main {
    public static void main(String[] args) {
        LittleSt s1 = new LittleSt();
        BigStudent s2 = new BigStudent();

        s1.write();
        s2.write();
    }
}
