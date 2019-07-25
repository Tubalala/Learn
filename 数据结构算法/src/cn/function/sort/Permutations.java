package cn.function.sort;

import java.util.ArrayList;
import java.util.List;

/**
 * 全排列实现方法
 */
public class Permutations {
    /**
     * 从前往后
     * @param lists
     * @param nums
     * @param n
     */
    public static void prePermutations(List<List<Integer>> lists, int[] nums, int n) {
        if (n == nums.length) {
            //List<Integer> list = new ArrayList<>();
            for (int num : nums) {
                //list.add(num);
                System.out.print(num+" ");
            }
            System.out.println();
            //lists.add(list);
        }
        for (int i = n; i < nums.length; i++) {
            swap(nums,n,i);
            prePermutations(lists,nums,n+1);
            swap(nums,n,i);
        }
    }

    /**
     * 从后往前的全排列
     * @param nums
     * @param n
     */
    public static void endPermutations(int[] nums,int n) {
        if (n == 0) {
            for (int num : nums) {
                System.out.print(num+" ");
            }
            System.out.println();
        }
        for (int i = 0; i < n; i++) {
            swap(nums,i,n-1);
            endPermutations(nums,n-1);
            swap(nums,i,n-1);
        }
    }


    public static void swap(int[] nums,int n,int m){
        int temp = nums[n];
        nums[n] = nums[m];
        nums[m] = temp;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3};
        endPermutations(nums,nums.length);
        System.out.println("==================");
        prePermutations(null,nums,0);
    }
}
