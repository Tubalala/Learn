package day.one;
import java.util.Random;
import java.util.Scanner;
public class DemoPerson {
    public static void main(String[] args){
        Person a =new Person();
        a.setAge(20);
        a.setName("abc");
        a.setMale(true);
        System.out.println("name:"+a.getName()+" \nage:"+a.getAge()+" \nis man? :"+a.isMale());
        a.say("acd");
        System.out.println(a);
        Person b = new Person();
        Person c = new Person("oge",20,true);
        System.out.println("name:"+c.getName()+" \nage:"+c.getAge()+" \nis man? :"+c.isMale());
        System.out.println("=============\n");
        new Person_1().name = "fafa";
        new Person_1().method();
        Person_1 sc = new Person_1();
        new Person_1().method_1();
        Scanner s =print();
        int num = s.nextInt();
        System.out.println("输入的是："+num);
        System.out.println("===============\n");
        Random r = new Random();
        int num1 = r.nextInt();
        System.out.println("随机数为："+num1);
    }
    public static Scanner print(){
        return new Scanner(System.in);
    }
}
