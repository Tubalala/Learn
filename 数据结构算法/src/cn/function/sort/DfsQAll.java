package cn.function.sort;

import java.util.ArrayList;
import java.util.List;

/**
 * 全排列实现方法
 */
public class DfsQAll {
    public static void dfs(List<List<Integer>> lists, int[] nums, int n) {
        if (n == nums.length) {
            List<Integer> list = new ArrayList<>();
            for (int num : nums) {
                list.add(num);
            }
            lists.add(list);
        }else {
            for (int i = n; i < nums.length; i++) {
                swap(nums,n,i);
                dfs(lists,nums,n+1);
                swap(nums,n,i);
            }
        }
    }
    public static void swap(int[] nums,int n,int m){
        int temp = nums[n];
        nums[n] = nums[m];
        nums[m] = temp;
    }
}
