package day02.day10;

public class Demo01 {
    public static void show(Demo01Interface Interface){
        Interface.method2();
    }

    public static void main(String[] args) {
        show(new Demo01Interface() {
            @Override
            public void method2() {
                System.out.println("重写抽象方法！");
            }
        });
        show(()->{
            System.out.println("重写抽象方法！");
        });

        show(()-> System.out.println("重写抽象方法！"));
    }
}
