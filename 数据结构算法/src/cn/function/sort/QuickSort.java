package cn.function.sort;

/**
 * 快速排序
 */
public class QuickSort {
    public static void quickSort(int[] a) {
        qS(a,0,a.length-1);
    }

    private static void qS(int[] a,int star,int end) {
        if (star >= end) {
            return;
        }
        int q = partition(a,star,end);
        qS(a,star,q-1);
        qS(a,q+1,end);
    }

    private static int partition(int[] a,int star,int end) {
        int key = a[end];
        int i = star;
        for (int j = star; j < end; j++) {
            if (a[j] < key) {
                if (i == j) {
                    i++;
                }else {
                    int temp = a[i];
                    a[i++] = a[j];
                    a[j] = temp;
                }
            }
        }

        int temp = a[i];
        a[i] = a[end];
        a[end] = temp;
        System.out.print(i+" ");
        return i;
    }
}
