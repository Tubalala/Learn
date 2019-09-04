package function;

import java.util.ArrayList;
import java.util.Collections;

public class Sort {
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
    public static void sort(int[] nums){
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i]<nums[j]){
                    int temp = nums[j];
                    nums[j] = nums[i];
                    nums[i] = temp;
                }
            }
        }
    }

    public static void chooseSort(int[] nums){
        for (int i = 0; i < nums.length-1; i++) {
            int k = i;
            for (int j = k+1; j < nums.length; j++) {
                if (nums[j]<nums[k]){
                    k = j;
                }
            }
            if (k != i) {
                int temp = nums[i];
                nums[i] = nums[k];
                nums[k] = temp;
            }
        }
    }

    public static void boomSort(int[] nums){
        int index = 0;
        int[] array = new int[10000];
        for (int i = 0; i < nums.length; i++) {
            array[nums[i]] = 1;
            nums[i] = 0;
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i]==1){
                nums[index] = i;
                index++;
            }
        }
    }
}
