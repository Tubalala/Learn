package cn.designPattern.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 观察者模式
 */
public class Observer {
    /**
     * 观察者
     */
    abstract class Customer {
        abstract void update();
    }

    /**
     * 观察者A
     */
    class CustomerA extends  Customer{
        @Override
        void update() {
            System.out.println("A收到了更新消息!!!");
        }
    }

    /**
     * 观察者B
     */
    class CustomerB extends  Customer{
        @Override
        void update() {
            System.out.println("B收到了更新消息!!!");
        }
    }

    /**
     * 基础接口
     */
    interface ISubject{
        void registerObserver(Customer customer);
        void removeObserver(Customer customer);
        void doUpdate();
    }

    /**
     * 被观察者
     */
    class BeObserved implements ISubject{
        List<Customer> customers = new ArrayList<>();
        //添加观察者
        @Override
        public void registerObserver(Customer customer) {
            this.customers.add(customer);
        }

        @Override
        public void removeObserver(Customer customer) {
            this.customers.remove(customer);
        }

        //更新消息
        @Override
        public void doUpdate(){
            for (Customer customer : customers) {
                customer.update();
            }
        }
    }

    public static void main(String[] args) {
        Observer demo = new Observer();
        Customer a = demo.new CustomerA();
        Customer b = demo.new CustomerB();
        BeObserved beObserved = demo.new BeObserved();
        beObserved.registerObserver(a);
        beObserved.registerObserver(b);
        beObserved.doUpdate();
    }
}
