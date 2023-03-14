package org.example.ex7.adapter;

class Class1 {
    private int data;
    public Class1() { data = 100; }
    public void getData() {
        System.out.println("data = " + data);
    }
}
class Class2 {
    private int data;
    public Class2() { data = 200; }
    public void getData() {
        System.out.println("data = " + data);
    }
}
class Adapter extends Class1 {
    private Class2 obj;
    public Adapter(Class2 obj) {
        this.obj = obj;
    }
    public void getData() {
        obj.getData();
    }
}

public class AdapterTest {//тест
    public static void main(String[] args) {
        Class1 o = new Class1();
        o.getData();
        Adapter o2 = new Adapter(new Class2());
        o2.getData();
    }
}
