package day.night;

import java.util.HashMap;
import java.util.Scanner;

public class Demo03 {
    public static void main(String[] args) {
//        scNum();
        demo01();
    }

    private static void demo01() {
        /*
        f8:逐行执行程序
        f7：进入到方法中
        shift+f8：跳出方法
        f9：跳到下一个断点
        ctrl+f2：退出debug模式，停止程序
        Console：切换到控制台
         */
//        int a = 10;
//        int b = 20;
//        int sum = a + b;
//        System.out.println(sum);
        for (int i = 0; i < 3; i++) {
            System.out.println(i);
        }
    }

    private static void scNum() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String str = sc.next();
        char[] chars = str.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();
        for (Character c : chars) {
            if (map.containsKey(c)) {
                Integer num = map.get(c);
                num++;
                map.put(c,num);
            }else {
                map.put(c,1);
            }
        }
        for (Character key: map.keySet()) {
            Integer num = map.get(key);
            System.out.println(key+"==="+num);

        }
    }
}
