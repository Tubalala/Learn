package day.one;

public class Usephone {
    public static void main(String[] args){
        Phone one = new Phone();
        System.out.println(one.price);
        System.out.println(one.name);
        System.out.println(one.color);
        one.price = 6666;
        one.name = "abc";
        one.color = "red";
        System.out.println(one.price);
        System.out.println(one.name);
        System.out.println(one.color);
        one.call("qwe");
        one.send();
        metod(one);
        System.out.println("============\n");
        Phone two = one;
        two.price = 8388;
        two.color = "white";
        two.name = "def";
        System.out.println(two.price);
        System.out.println(two.name);
        System.out.println(two.color);
        System.out.println("\n");
        System.out.println(one.price);
        System.out.println(one.name);
        System.out.println(one.color);

    }
    public static void metod(Phone parm){
        System.out.println("价格："+parm.price);
        System.out.println("名字："+parm.name);
        System.out.println("颜色："+parm.color);
    }
}
