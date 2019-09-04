package cn.leetCode.t1d.t50d;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/**
 * 给定一个可包含重复数字的序列，返回所有不重复的全排列。
 *
 * 示例:
 *
 * 输入: [1,1,2]
 * 输出:
 * [
 *   [1,1,2],
 *   [1,2,1],
 *   [2,1,1]
 * ]
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/permutations-ii
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class t47 {
    private HashSet<List<Integer>> map = new HashSet<>();
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        dfs(list,nums,0);
        return list;
    }

    private void dfs(List<List<Integer>> list, int[] nums,int n) {
        if (n == nums.length) {
            ArrayList<Integer> res = new ArrayList<>();
            for (int num : nums) {
                res.add(num);
            }
            if (!map.contains(res)) {
                list.add(res);
                map.add(res);
            }
        }else {
            for (int i = n; i < nums.length; i++) {
                swap(nums,n,i);
                dfs(list,nums,n+1);
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
