package day.seven;

public class Demo05 {
    public static void main(String[] args) {
        Demo05impl one = new Demo05impl();
        one.metod("hello world!");
        //具有泛型的接口实现方法
        Demo05impl2 two = new Demo05impl2<>();
        two.method("abc");
        two.method(123);
        two.method(1.23);
        two.method(true);
    }
}
