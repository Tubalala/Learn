package cn.function.domain;

/**
 * 循环数组队列
 */
public class CircularQueue {
    private int n;
    private int[] items;
    private int head = 0;
    private int tail = 0;

    public CircularQueue(int n) {
        this.items = new int[n];
        this.n = n;
    }

    public boolean enqueue(int item){
        if ((tail + 1) % n == head) {
            return false;
        }
        items[tail] = item;
        tail = (tail+1) % n;
        return true;
    }

    public int dequeue(){
        if (head == tail) {
            return -1;
        }
        int ret = items[head];
        head = (head + 1) % n;
        return ret;
    }
}
