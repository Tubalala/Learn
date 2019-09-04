package day.night.DemoMap;

import java.util.HashMap;

public class Demo01 {
    public static void main(String[] args) {
        show1();
        show2();
        show3();
    }

    private static void show3() {
        HashMap<String, Integer> map1 = new HashMap<>();
        map1.put("李四",165);
        map1.put("王五",177);
        map1.put("赵六",178);
        map1.put("田七",168);
        Integer s = map1.get("李四");
        System.out.println(s);
        System.out.println(map1.containsKey("李四"));
        System.out.println(map1.containsValue(167));
    }

    private static void show2() {
        HashMap<String, Integer> map1 = new HashMap<>();
        map1.put("李四",165);
        map1.put("王五",177);
        map1.put("赵六",178);
        map1.put("田七",168);
        System.out.println(map1);
        Integer rm = map1.remove("李四");
        System.out.println(rm);
        System.out.println(map1);
    }

    private static void show1() {
        HashMap<String, String> map1 = new HashMap<>();
        String v1 = map1.put("张三","abc");
        System.out.println(v1);
        System.out.println(map1);
        String v2 = map1.put("张三", "abc");
        System.out.println(v2);
        System.out.println(map1);
        map1.put("李四","qwe");
        map1.put("王五","zxc");
        map1.put("赵六","fgh");
        map1.put("田七","vbn");
        System.out.println(map1);

    }
}
