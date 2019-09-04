package day02.day01;

public class demo03 {
    public static void main(String[] args) {
        demo03Runable4 run = new demo03Runable4();
        Thread t0 = new Thread(run);
        Thread t1 = new Thread(run);
        Thread t2 = new Thread(run);
        t0.start();
        t1.start();
        t2.start();
    }
}
