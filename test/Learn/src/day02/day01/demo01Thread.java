package day02.day01;

public class demo01Thread extends Thread {
    private String name;

    public demo01Thread() {}
    public demo01Thread(String name) {
        super(name);
    }

    @Override
    public void run() {
//        String name = getName();
//        System.out.println(name);
        Thread t = Thread.currentThread();
        System.out.println(t.getName());
    }
}
