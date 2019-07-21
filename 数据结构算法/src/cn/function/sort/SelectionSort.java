package cn.function.sort;

/**
 * 选择排序
 */
public class SelectionSort {
    public static void selectionSort(int[] a) {
        if (a.length <= 1) {
            return;
        }
        for (int i = 0; i < a.length - 1; i++) {
            int min = a[i];
            int index = i;
            for (int j = i + 1; j < a.length; j++) {
                if (min > a[j]){
                    index = j;
                    min = a[j];
                }
            }
            int temp = a[i];
            a[i] = a[index];
            a[index] = temp;
        }
    }
}
