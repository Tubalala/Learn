package day.night.DemoMap;

import day.night.Person;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Demo03 {
    public static void main(String[] args) {
        show1();
        System.out.println();
        show2();
        System.out.println();
        show3();
    }

    private static void show3() {
        HashMap<String, String> map = new HashMap<>();
        map.put("a","a");
        map.put("b","b");
        map.put("c","c");
        map.put("d","d");
        map.put("a","d");
        System.out.println(map);

        LinkedHashMap<String, String> map1 = new LinkedHashMap<>();
        map1.put("a","a");
        map1.put("b","b");
        map1.put("c","c");
        map1.put("d","d");
        map1.put("a","d");
        System.out.println(map);
    }

    private static void show2() {
        HashMap<Person, String> map = new HashMap<>();
        map.put(new Person("赵四",18),"中国");
        map.put(new Person("五六",14),"英国");
        map.put(new Person("李爽",20),"俄罗斯");
        map.put(new Person("赵三",19),"法国");
        Set<Map.Entry<Person, String>> entries = map.entrySet();
        for (Map.Entry<Person, String> entry : entries) {
            Person key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key+":::"+value);
        }
    }

    private static void show1() {
        HashMap<String, Person> map = new HashMap<>();
        map.put("北京",new Person("张三",19));
        map.put("佛山",new Person("李四",16));
        map.put("杭州",new Person("王五",22));
        map.put("上海",new Person("赵柳",20));
        map.put("广州",new Person("田七",24));
        Set<String> set = map.keySet();
        for (String key :
                set) {
            Person value = map.get(key);
            System.out.println(value);
        }
    }
}
