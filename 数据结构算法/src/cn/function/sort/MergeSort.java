package cn.function.sort;

/**
 * 归并排序
 */
public class MergeSort {
    public static void mergeSort(int[] a){
        mergeSortion(a,0,a.length-1);
    }

    /**
     * 调用递归完成分治排序
     * @param a
     * @param p
     * @param r
     */
    private static void mergeSortion(int[] a,int p, int r){
        if (p >= r) {
            return;
        }
        int q = p + (r - p) / 2;
        mergeSortion(a,p,q);
        mergeSortion(a,q+1,r);
        merge(a,p,q,r);
    }

    /**
     * 合并数组
     * @param a
     * @param p
     * @param q
     * @param r
     */
    private static void merge(int[] a,int p,int q,int r){
        int i = p;
        int j = q + 1;
        int k = 0;
        int[] temp = new int[r-p+1];
        while (i <= q && j <= r) {
            if (a[i] <= a[j]) {
                temp[k++] = a[i++];
            }else {
                temp[k++] = a[j++];
            }
        }
        //判断哪个子数组中有剩余数据
        int start = i;
        int end = q;
        if (j <= r) {
            start = j;
            end = r;
        }
        //将剩余数据存入临时数组
        while (start <= end) {
            temp[k++] = a[start++];
        }
        //拷贝回原数组
        for (i = 0; i <= r - p; i++) {
            a[p+i] = temp[i];
        }
    }
}
