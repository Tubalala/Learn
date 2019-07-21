package cn.function.sort;

/**
 * 冒泡排序
 */
public class BubbleSort {
    public static void bubbleSort(int[] a) {
        if (a.length <= 1) {
            return;
        }
        for (int i = 0; i < a.length; i++) {
            boolean flag = false;
            for (int j = 0; j < a.length - i - 1; j++) {
                if (a[j] > a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                    flag = true;
                }
            }
            if (!flag) {
                break;
            }
        }
    }
}
