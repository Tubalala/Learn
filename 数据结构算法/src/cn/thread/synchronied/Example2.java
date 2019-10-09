package cn.thread.synchronied;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Example2 {
    //synchronized修饰类
    public void test1(int j){
        synchronized (Example2.class){
            for (int i = 0; i < 10; i++) {
                System.out.println("test1 "+ j+ " : "+i);
            }
        }
    }
    //synchronized修饰静态方法
    public synchronized static void test2(int j){
        for (int i = 0; i < 10; i++) {
            System.out.println("test2 "+ j+ " : "+i);
        }
    }

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        Example2 example1 = new Example2();
        Example2 example2 = new Example2();
        executorService.execute(()->{
            example1.test1(1);
        });
        executorService.execute(()->{
            example2.test1(2);
        });
    }
}
