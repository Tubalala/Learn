package day02.day01;

public class demo03Runable3 implements Runnable{
    private int ticket = 100;
    //创建锁对象
    Object obj = new Object();
    @Override
    public void run() {
        System.out.println(this);
        while (true) {
            payticket();

        }
    }

    private /*synchronized */void payticket() {
        synchronized (this){
            if (ticket>0) {
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("正在抢"+ticket+"张票");
                ticket--;
            }
        }
    }
}
