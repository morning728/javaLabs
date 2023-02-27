package org.example.ex8.memento;

public class RecoverObj {
    public RecoverObj(String text, Integer data) {
        this.text = text;
        this.data = data;
    }

    String text;
    Integer data;

    public String getText() {
        return text;
    }

    public Integer getData() {
        return data;
    }
}
