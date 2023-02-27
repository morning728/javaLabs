package org.example.ex7.proxy;

import java.util.concurrent.ThreadPoolExecutor;

public class GetSpecifiedData implements GetData{
    @Override
    public String getData() throws InterruptedException {
        Thread.sleep(2000);
        return ("get data");
    }

    @Override
    public void getData2() {
        System.out.println("get data2");
    }
}
