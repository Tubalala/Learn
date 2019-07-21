package cn.function.sort;

/**
 * 插入排序
 */
public class InsertionSort {
    public static void insertionSort(int[] a){
        if (a.length <= 1) {
            return;
        }
        for (int i = 1; i < a.length; i++) {
            int value = a[i];
            int j = i -1;
            for (; j >= 0; j--) {
                if (a[j] > value) {
                    a[j+1] = a[j];
                }else {
                    break;
                }
            }
            a[j+1] = value;
        }
    }
}
