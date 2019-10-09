package cn.thread.synchronied;

public class SynchronizedDemo {
    /**
     * 线程不安全示例
     */
    class MyThread1 extends Thread{
        private int count = 5;

        @Override
        public void run() {
            count--;
            System.out.println(this.currentThread().getName()+":"+count);
        }
    }

    /**
     * synchronized修饰后实现的线程安全
     */
    class MyThread2 extends Thread{
        private int count = 5;

        @Override
        public synchronized void run() {
            count--;
            System.out.println(this.currentThread().getName()+":"+count);
        }
    }
    public static void test(Thread thread){
        String threadName = "thread";
        Thread[] threads = new Thread[5];
        for (int i = 0; i < 5; i++) {
            threads[i] = new Thread(thread,threadName+i);
        }
        for (Thread th : threads) {
            th.start();
        }
    }
    public static void main(String[] args) {
        SynchronizedDemo demo = new SynchronizedDemo();
        MyThread1 thread = demo.new MyThread1();
//        MyThread2 thread = demo.new MyThread2();
        test(thread);
    }
    static class Example { String str = new String("good"); char[] ch = { 'a', 'b', 'c' }; public static void main(String args[]) { Example ex = new Example(); ex.change(ex.str, ex.ch); System.out.print(ex.str + " and "); System.out.print(ex.ch); }public void change(String str, char ch[]) { str = "test ok"; ch[0] = 'g'; } }
}