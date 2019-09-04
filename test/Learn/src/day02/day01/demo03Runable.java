package day02.day01;

public class demo03Runable implements Runnable{
    private int ticket = 100;
    @Override
    public void run() {
        while (true) {
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
