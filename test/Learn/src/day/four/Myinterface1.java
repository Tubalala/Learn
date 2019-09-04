package day.four;

public interface Myinterface1 {
    public static final int NUM_OF_MY_CLASS = 10;
    public static void methodDefault1(){
        System.out.println("静态方法1");
        methodConment();
    }
    public static void methodDefault2(){
        System.out.println("静态方法2");
        methodConment();
    }
    public default void method(){
        System.out.println("接口的默认方法1!");
    }
    public abstract void print();
    public static void methodConment(){
        System.out.println("aaa");
        System.out.println("bbb");
        System.out.println("ccc");
    }
    public abstract void show();


}
