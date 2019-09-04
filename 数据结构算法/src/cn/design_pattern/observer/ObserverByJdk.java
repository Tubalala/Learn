package cn.design_pattern.observer;


import java.util.Observable;
import java.util.Observer;

/**
 * jdk原生的观察者模式
 */
public class ObserverByJdk {
    class CustomerA implements Observer {
        @Override
        public void update(Observable o, Object arg) {
            System.out.println("A收到了更新！！！");
        }

    }
    class CustomerB implements Observer {
        @Override
        public void update(Observable o, Object arg) {
            System.out.println("B收到了更新！！！");
        }

    }
    class BeObserved extends Observable{

        public void doUpdate() {
            this.setChanged();
            this.notifyObservers();
        }
    }

    public static void main(String[] args) {
        ObserverByJdk demo = new ObserverByJdk();
        Observer a = demo.new CustomerA();
        Observer b = demo.new CustomerB();
        Observable observed = demo.new BeObserved();
        observed.addObserver(b);
        observed.addObserver(a);
        ((BeObserved) observed).doUpdate();
    }

}
