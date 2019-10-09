package cn.thread.synchronied;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Example1 {
    //synchronized修饰代码块
    public void test1(int j){
        synchronized (this){
            for (int i = 0; i < 10; i++) {
                System.out.println("test1 "+ j+ " : "+i);
            }
        }
    }
    //synchronized修饰方法
    public synchronized void test2(int j){
        for (int i = 0; i < 10; i++) {
            System.out.println("test2 "+ j+ " : "+i);
        }
    }

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        Example1 example1 = new Example1();
        Example1 example2 = new Example1();
        executorService.execute(()->{
            example1.test2(1);
        });
        executorService.execute(()->{
            example2.test2(2);
        });
    }
}
