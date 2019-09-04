package cn.leetCode.t1d.t50d;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/*给定一个没有重复数字的序列，返回其所有可能的全排列。

示例:

输入: [1,2,3]
输出:
[
  [1,2,3],
  [1,3,2],
  [2,1,3],
  [2,3,1],
  [3,1,2],
  [3,2,1]
]

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/permutations
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。*/
public class t46 {
    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> lists = new ArrayList<>();
        dfs(lists,nums,0);
        return lists;
    }

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

    public static void main(String[] args) {
        int[] l = {1,2,3};
        List<List<Integer>> permute = permute(l);
        System.out.println(permute);
    }

}
