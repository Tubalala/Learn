package cn.tu.test;

import cn.function.domain.Heap;

import java.util.PriorityQueue;

import static cn.function.domain.Heap.heapSort;

public class Test {
    public static void main(String[] args) {

        PriorityQueue<Integer> queue = new PriorityQueue<>();
        Heap heap = new Heap(11);
        int[] temp = new int[11];
        int j = 0;
        for (int i = 10; i >= 0; i--) {
            queue.add(i);
            temp[j] = i;
            j++;
        }
        Object[] objects = queue.toArray();
        for (Object object : objects) {
            System.out.print(object+" ");
        }
        System.out.println();
        heapSort(temp,10);
        for (int i : temp) {
            System.out.print(i+" ");
        }
    }
}
