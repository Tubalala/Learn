package day02.day01;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class demo03Runable4 implements Runnable{
    private int ticket = 100;

     Lock lock = new ReentrantLock();
    @Override
    public void run() {
        System.out.println(this);
        while (true) {
            //从lock方法中获取锁
            lock.lock();
            if (ticket>0) {
                try {
                    Thread.sleep(10);
                    System.out.println("正在抢"+ticket+"张票");
                    ticket--;
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }finally {
                    //释放锁
                    lock.unlock();
                }
            }
        }
    }



}
