package day02.day01;

public class demo01 {
    public static void main(String[] args) {
        demo01Thread one = new demo01Thread();
        one.setName("abc");
        one.run();
        one.start();
        new demo01Thread("abcd").start();
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
