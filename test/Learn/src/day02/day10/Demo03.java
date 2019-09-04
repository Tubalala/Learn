package day02.day10;

public class Demo03 {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"线程开始！！！");
            }
        }).start();

        new Thread(()-> System.out.println(Thread.currentThread().getName()+"线程开始")).start();
    }
}
