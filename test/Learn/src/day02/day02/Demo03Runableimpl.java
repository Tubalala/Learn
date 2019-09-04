package day02.day02;

public class Demo03Runableimpl implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+" "+"创建了一个新的线程执行！！！");
    }
}
