package org.example.ex6.flyweigth;

import java.util.HashMap;
import java.util.Map;

public class Fabric {
    public Map<Integer, Class> map = new HashMap<>();

    public Class get(int d){
        Class c = map.get(d);
        if (c == null){
            c = new Class(d);
            map.put(d, c);
        }
        return c;
    }
}
