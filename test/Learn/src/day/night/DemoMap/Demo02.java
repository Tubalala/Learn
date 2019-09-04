package day.night.DemoMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Demo02 {
    public static void main(String[] args) {
        //map遍历的方法第一种
        HashMap<String, Integer> map1 = new HashMap<>();
        map1.put("李四",165);
        map1.put("王五",177);
        map1.put("赵六",178);
        map1.put("田七",168);
        Set<String> set = map1.keySet();
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            String key = it.next();
            Integer in = map1.get(key);
            System.out.println(key+in);
        }
        System.out.println();
        for (String key :
                set) {
            Integer in = map1.get(key);
            System.out.println(key+in);
        }
        System.out.println();

        //遍历的第二种方法
        Set<Map.Entry<String, Integer>> entr = map1.entrySet();
        Iterator<Map.Entry<String, Integer>> it1 = entr.iterator();
        while (it1.hasNext()) {
            Map.Entry<String, Integer> next = it1.next();
            String key = next.getKey();
            Integer value = next.getValue();
            System.out.println(key+":"+value);
        }
        System.out.println("=============");
        for (Map.Entry<String, Integer> next : entr) {
            String key = next.getKey();
            Integer value = next.getValue();
            System.out.println(key+" "+value);
        }

    }
}
