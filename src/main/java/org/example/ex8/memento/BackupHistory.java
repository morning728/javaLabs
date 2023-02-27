package org.example.ex8.memento;

import java.util.Stack;

public class BackupHistory {
    public Stack<RecoverObj> stack;

    public BackupHistory() {
        stack = new Stack<>();
    }

    void add(RecoverObj r){
        stack.add(r);
    }

    RecoverObj get(){
        return stack.peek();
    }
}
