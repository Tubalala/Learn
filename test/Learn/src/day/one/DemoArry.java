package day.one;

import java.util.ArrayList;
import java.util.Random;

public class DemoArry {
    public static void main(String[] args){
        ArrayList<Person_2> list = new ArrayList<>();
        
        Person_2 one = new Person_2("asd",20);
        Person_2 two = new Person_2("qwe",22);
        Person_2 three = new Person_2("zxc",21);
        Person_2 four = new Person_2("omg",23);

        list.add(one);
        list.add(two);
        list.add(three);
        list.add(four);

        for (int i = 0; i < list.size(); i++) {
            Person_2 all = list.get(i);
            System.out.println("姓名："+all.getName()+" 年龄："+all.getAge());
        }
        arrylistRandom();

        for (int i = 0; i < list.size(); i++) {
            Person_2 all = list.get(i);
            System.out.print(all.getName());
        }
        System.out.println("\n");
        printArrylist(list);
        System.out.println("\n=======\n");
        ArrayList<Integer> biglist = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < 20; i++) {
            int num = r.nextInt(100)+1;
            biglist.add(num);
        }
        ArrayList<Integer> small = small(biglist);
        for (int i = 0; i < small.size(); i++) {
            System.out.println(small.get(i));
        }
        System.out.println("偶数总共有："+small.size());


    }
    public static ArrayList<Integer> small(ArrayList<Integer> list){
        ArrayList<Integer> samllist = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0){
                samllist.add(list.get(i));
            }
        }
        return samllist;
    }
    public static void arrylistRandom(){
        ArrayList<Integer> list = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < 5; i++) {
            int num = r.nextInt(33) + 1;
            list.add(num);
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
    public static void printArrylist(ArrayList<Person_2> list){
        Person_2 all = new Person_2();
        System.out.print("{");
        for (int i = 0; i < list.size(); i++) {
            Person_2 name = list.get(i);
            System.out.print(name.getName());
            if ( i == list.size()-1) {
                System.out.print("}");
            }
            else {
                System.out.print("@");
            }
        }
    }
}
