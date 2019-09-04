package day.one;

import java.util.Scanner;

public class Person_1 {
    String name;
    public void method(){
        System.out.println("输入的是"+name);
    }
    public static Scanner method_1(){
        Scanner sc =new Scanner(System.in);
        String name = sc.next();
        System.out.println("输入的是"+name);
        return null;
    }
}
