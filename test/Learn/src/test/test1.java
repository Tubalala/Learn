package test;

public class test1 {
    public static void main(String[] args) {
        System.out.println(sum(5));
        int[] arrs = {17,31,5,36,24,67,89,100};
        quickSort(arrs,0,arrs.length-1);
        for (int i = 0; i < arrs.length; i++) {

            System.out.print(arrs[i]+" ");
        }
    }
    public static int sum(int n){
        if (n == 1) {
            return 1;
        }else {
            return n * sum(n-1);
        }
    }
    public static void quickSort(int[] arrs,int left,int right) {
        if( left > right) {
            return ;
        }
        int i = left;
        int j = right;
        int key = arrs[ left ];
        while( i< j) {
            while(i<j && arrs[j] > key){
                j--;
            }
            while( i<j && arrs[i] <= key) {
                i++;
            }
            if(i<j) {
                int temp = arrs[i];
                arrs[i] = arrs[j];
                arrs[j] = temp;
            }
        }
        int temp = arrs[i];
        arrs[i] = arrs[left];
        arrs[left] = temp;
        quickSort(arrs, left, i-1 );
        quickSort(arrs, i+1, right);
    }
}
