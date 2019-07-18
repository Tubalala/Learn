package cn.function.domain.test;

import cn.function.domain.CircularQueue;

public class CircularQueueTest {
    public static void main(String[] args) {
        CircularQueue cq = new CircularQueue(4);
        System.out.println(cq.enqueue(1));
        System.out.println(cq.enqueue(2));
        System.out.println(cq.enqueue(3));
        System.out.println(cq.dequeue());
        System.out.println(cq.dequeue());
        System.out.println(cq.dequeue());
        System.out.println(cq.dequeue());
        System.out.println(cq.enqueue(3));
        System.out.println(cq.dequeue());

    }
}
