package day02.day02.test;

public class ChiHuo extends Thread{
    private BaoZi bz;

    public ChiHuo(BaoZi bz) {
        this.bz = bz;
    }

    @Override
    public void run() {

        while (true) {
            synchronized (bz){
                if (bz.flag == false) {
                    try {
                        bz.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                //被唤醒后吃包子
                System.out.println("吃货正在吃"+bz.pi+bz.xian+"包子");
                bz.flag = false;
                bz.notify();
                System.out.println("吃货吃完了"+bz.pi+bz.xian+"包子");
                System.out.println("============================");
            }
        }
    }
}
