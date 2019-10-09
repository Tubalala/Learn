package cn.thread.synchronied;

public class SynchronizedExample {
    public synchronized void method1(){
        System.out.println("method1...");
        method2();
    }
    public synchronized void method2(){
        System.out.println("method2...");
        method3();
    }
    public synchronized void method3(){
        System.out.println("method3...");
    }

    public static void main(String[] args) {
        SynchronizedExample demo = new SynchronizedExample();
        demo.method1();
    }
}
