package day02;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class demo {
    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(11,22);
        map.put(12,20);
        map.put(13,23);
        map.put(14,21);
        Set<Integer> in = map.keySet();
        Iterator<Integer> it1 = in.iterator();
        while (it1.hasNext()) {
            Integer key = it1.next();
            Integer value = map.get(key);
            System.out.println(key+"=="+value);
        }
        for (Integer key :
                in) {

            Integer value = map.get(key);
            System.out.println(key+"==="+value);
        }

        Set<Map.Entry<Integer, Integer>> entr = map.entrySet();
        Iterator<Map.Entry<Integer, Integer>> it = entr.iterator();
        while (it.hasNext()) {
            Integer value = it.next().getValue();
            Integer key = it.next().getKey();
            System.out.println(key+" "+value);
        }
        for (Map.Entry<Integer, Integer> key : entr) {

            Integer value = key.getValue();
            Integer key1 = key.getKey();
            System.out.println(value+" //"+key1);
        }
    }
}
