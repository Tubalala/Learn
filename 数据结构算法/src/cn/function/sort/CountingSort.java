package cn.function.sort;

/**
 * 计数排序
 */
public class CountingSort {
    public static void countingSort(int[] a){
        if (a.length <= 1) {
            return;
        }
        //查找最大的数 确定桶的大小
        int max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (max < a[i]){
                max = a[i];
            }
        }

        //创建桶数组 并存入桶中
        int[] c = new int[max+1];
        for (int i = 0; i < a.length; i++) {
            c[a[i]]++;
        }

        //对桶中元素进行计数
        for (int i = 1; i < c.length; i++) {
            c[i] = c[i-1] + c[i];
        }

        //对数组进行排序存入临时数组中
        int[] temp = new int[a.length];

        for (int i = 0; i < a.length; i++) {
            int index = c[a[i]] - 1;
            temp[index] = a[i];
            c[a[i]]--;
        }

        //拷贝数组
        for (int i = 0; i < a.length; i++) {
            a[i] = temp[i];
        }

    }
}
