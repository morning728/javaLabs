package org.example.ex7.proxy;

public class GetSpecifiedDataProxy implements GetData{
    private GetSpecifiedData getSpecifiedData;
    private String cache;

    public GetSpecifiedDataProxy(GetSpecifiedData getSpecifiedData) {
        this.getSpecifiedData = getSpecifiedData;
    }

    @Override
    public String getData() throws InterruptedException {
        if(cache == null){
            cache = getSpecifiedData.getData();
        }
        return (cache);
    }

    @Override
    public void getData2() {
        getSpecifiedData.getData2();
    }
}
