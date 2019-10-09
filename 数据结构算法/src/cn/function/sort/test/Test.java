package cn.function.sort.test;

import cn.function.sort.*;

public class Test {
    public static void main(String[] args) {
        int[] num = {13,12,15,1,5,3,2,2,6,0};
//        CountingSort.countingSort(num);
//        BubbleSort.bubbleSort(num);
        InsertionSort.insertionSort(num);
//        SelectionSort.selectionSort(num);
//        MergeSort.mergeSort(num);
//        QuickSort.quickSort(num);
//        QuickSortDemo.quickSort(num,0,num.length-1);
        System.out.println();
        for (int i : num) {
            System.out.print(i+" ");
        }
    }
}
