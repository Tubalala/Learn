package day02.day02;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Demo03 {
    public static void main(String[] args) {
        ExecutorService es = Executors.newFixedThreadPool(2);
        es.submit(new Demo03Runableimpl());
        es.submit(new Demo03Runableimpl());
        es.submit(new Demo03Runableimpl());
        //销毁线程池
        es.shutdown();
        //不能再执行线程，线程池被销毁
        es.submit(new Demo03Runableimpl());
    }
}
