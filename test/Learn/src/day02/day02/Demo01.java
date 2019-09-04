package day02.day02;

public class Demo01 {

    public static void main(String[] args) {
        Object obj = new Object();
        new Thread(){
            @Override
            public void run() {
                while (true) {
                    synchronized (obj){
                        System.out.println("告知老板要的包子种类和数量");
                        try {
                            obj.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.println("包子做好了，开吃");
                    }
                }
//                synchronized (obj){
//                    System.out.println("告知老板要的包子种类和数量");
//                    try {
//                        obj.wait();
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                    System.out.println("包子做好了，开吃");
//                }
            }
        }.start();
        new Thread(){
            @Override
            public void run() {
                while (true) {
                    try {

                        Thread.sleep(5000);

                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (obj){
                        System.out.println("老板做好包子了!");
                        obj.notify();
                    }
                }
//                try {
//
//                    Thread.sleep(5000);
//
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//                synchronized (obj){
//                    System.out.println("老板做好包子了!");
//                    obj.notify();
//                }
            }
        }.start();
    }
}
