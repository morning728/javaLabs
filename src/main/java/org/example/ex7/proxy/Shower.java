package org.example.ex7.proxy;

public class Shower {
    GetData getter =new GetSpecifiedDataProxy(new GetSpecifiedData()); //new GetSpecifiedDataProxy(new GetSpecifiedData()); // GET RID OF PROXY AND PASTE ORIG

    void print() throws InterruptedException {
        System.out.println(getter.getData() + getter.getData() + getter.getData());
    }
}
