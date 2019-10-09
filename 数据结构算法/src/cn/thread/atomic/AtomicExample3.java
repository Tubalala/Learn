package cn.thread.atomic;


import java.util.concurrent.atomic.AtomicReference;

//AtomicReference
public class AtomicExample3 {
    private static AtomicReference<Integer> count = new AtomicReference<>(0);

    public static void main(String[] args) {
        count.compareAndSet(0,4);
        count.compareAndSet(2,4);
        count.compareAndSet(4,8);
        count.compareAndSet(2,4);
        System.out.println("count : "+count);
    }
}
