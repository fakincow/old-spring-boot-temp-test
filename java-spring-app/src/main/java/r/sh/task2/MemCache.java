package r.sh.task2;

import java.util.*;

public class MemCache implements InMemCache {
    public static HashMap<Integer, String> myMap = new HashMap<Integer, String>();
    public  void Set(Integer key , String value) {
        myMap.put(key,value);
    }
    public  void Get(Integer key) {
        System.out.println(myMap.get(key));
    }
    public  void SetAll(String value) {
        myMap.replaceAll( (k,v)->v=value );
    };
}
