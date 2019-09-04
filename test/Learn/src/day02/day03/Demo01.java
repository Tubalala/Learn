package day02.day03;

public class Demo01 {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"新线程创建了!!!");
            }
        }).start();
        //使用lambda表达式
        new Thread(()->{
                System.out.println(Thread.currentThread().getName()+"新线程创建了!!!");
        }).start();

    }
}
