package day.eight;

import day.five.demo02.Obj;

public class Demo05 {
    public static void main(String[] args) {
        //可变参数
//        int i = add();
//        int i = add(10);
//        int i = add(10,20,30,40,50,60,70,80,90,100);
//        System.out.println(i);
        //累加求和
        int i = sum(10,20);
        System.out.println(i);
        Object b =addA("abc",123,8.8,"!@#");
    }/*
            一个方法的可变参数只能有一个，可变参数必须放末尾
           特殊写法
         */
    public  static Obj addA(Object...obj){
        System.out.println(obj);
        for (int i = 0; i < obj.length; i++) {
            System.out.print(obj[i]+" ");
        }
        return null;
    }
    private static int sum(int...arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    private static int add(int...arr) {
        System.out.println(arr);
        System.out.println(arr.length);
        return 0;
    }
}
