package cn.thread;

/**
 * 实现多线程的方法
 */
/*
这里 Thread 和 Runnable 的关系是这样的：Thread 类本身实现了 Runnable 接口，
并且持有 run 方法，但 Thread 类的 run 方法主体是空的，Thread 类的 run 方法通常是由子类的 run 方法重写，
详细定义如下：
Runable 接口的定义：
    public interface Runnable {
        public abstract void run();
    }
Thread 类的定义：
    public class Thread implements Runnable {
    }
 */
public class ThreadRunDemo  {
    /**
     * 继承Thread重写run方法
     */
    static class ThreadDemo extends Thread{
        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName());
        }

        public static void main(String[] args) {
            ThreadDemo thread = new ThreadDemo();
            thread.start();
        }
    }

    /**
     * 实现runnable接口
     */
    static class RunnableDemo implements Runnable{
        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName());
        }

        public static void main(String[] args) {
            RunnableDemo runnable = new RunnableDemo();
            Thread t = new Thread(runnable, "runnable");
            t.start();
        }
    }

}
