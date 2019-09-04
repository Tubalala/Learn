package day03.test02;

public class Demo01Printable {
    public static void print(Printable p){
        p.print("hello world");
    }

    public static void main(String[] args) {
        print(s -> System.out.println(s));
        //简化Lambda,直接引用print方法
        print(System.out::print);
    }
}
