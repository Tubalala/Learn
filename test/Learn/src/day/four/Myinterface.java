package day.four;

public class Myinterface {
    public static void main(String[] args) {
        Myinterface1.methodDefault1();
        Myinterface1.methodDefault2();
        MyinterfaceAimpl a = new MyinterfaceAimpl();
        a.print();
        a.method();
    }
}
