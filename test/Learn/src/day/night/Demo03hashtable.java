package day.night;

import java.util.HashMap;
import java.util.Hashtable;

/*
        Hashtable 是一个线程安全集合 单线程 速度慢
        Hashmap 是多线程集合速度快

        Hashtable不允许为空

 */
public class Demo03hashtable {
    public static void main(String[] args) {
        HashMap<Object, Object> map = new HashMap<>();
        map.put(null,123);
        map.put(123,null);
        map.put("abc",123);
        System.out.println(map);
        Hashtable<Object, Object> table = new Hashtable<>();
        /*table.put(null,123);
        table.put(123,null);*/
        table.put("abc",123);
    }
}
