package org.example.ex6.prototype;

public class Human implements Copyable{

    String name;
    String name1;
    void say(){
        return;
    }

    public Human(String name, String name1) {
        this.name = name;
        this.name1 = name1;
    }
    void setName(String name){
        this.name = name;
    }

    @Override
    public Object clone() {
        return new Human(name, name1);
    }
}
