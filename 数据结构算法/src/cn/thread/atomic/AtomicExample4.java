package cn.thread.atomic;


import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

//AtomicIntegerFieldUpdater
public class AtomicExample4 {
    private static AtomicIntegerFieldUpdater<AtomicExample4> updater = AtomicIntegerFieldUpdater.newUpdater(AtomicExample4.class,"count");
    private volatile int count = 100;
    public static void main(String[] args) {
        AtomicExample4 atomicExample4 = new AtomicExample4();
        if (updater.compareAndSet(atomicExample4, 100, 120)) {
            System.out.println(" 1 update success");
        }
        if (updater.compareAndSet(atomicExample4, 100, 120)) {
            System.out.println(" 2 update success");
        }else {
            System.out.println(" 2 update filed");
        }
    }
}
