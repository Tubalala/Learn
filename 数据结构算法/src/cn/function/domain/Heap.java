package cn.function.domain;

/**
 * 大顶堆
 */
public class Heap {
    private int[] a;
    private int n;
    private int count;

    public Heap(int capacity) {
        a = new int[capacity+1];
        n = capacity;
        count = 0;
    }

    public void insert(int data){
        //堆满
        if (count == n) {
            return;
        }
        count++;
        a[count] = data;
        int i = count;
        while (i / 2 > 0 && a[i] > a[i/2]) {
            swap(a,i,i/2);
            i = i / 2;
        }
    }

    public boolean removeMax(){
        if (count == 0) {
            return false;
        }
        a[1] = a[count];
        count--;
        heapify(a,count,1);
        return true;
    }

    /**
     * 自上而下的堆化
     * @param a
     * @param n
     * @param i
     */
    public static void heapify(int[] a,int n,int i){
        while (true) {
            int maxPos = i;
            if (2 * i < n && a[i] < a[2*i]) {
                maxPos = 2 * i;
            }
            if (2 * i + 1 < n && a[i] < a[2*i+1]) {
                maxPos = 2 * i + 1;
            }
            if (maxPos == i) {
                break;
            }
            swap(a,maxPos,i);
            i = maxPos;
        }
    }

    /**
     * 建堆
     * @param a
     * @param n
     */
    public static void buildHeap(int[] a,int n){
        for (int i = n/2; i >= 1; i--) {
            heapify(a,n,i);
        }
    }

    /**
     * 堆排序
     * @param a
     * @param n
     */
    public static void heapSort(int[] a,int n){
        buildHeap(a,n);
        int k = n;
        while (k > 1) {
            swap(a,1,k);
            k--;
            heapify(a,k,1);
        }
    }

    public static void swap(int[] a,int i,int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public int[] toArray(){
            return a;
    }
}
