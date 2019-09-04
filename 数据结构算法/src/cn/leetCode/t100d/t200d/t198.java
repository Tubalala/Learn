package cn.leetCode.t100d.t200d;

import java.util.HashMap;

/**
 * 你是一个专业的小偷，计划偷窃沿街的房屋。每间房内都藏有一定的现金，影响你偷窃的唯一制约因素就是相邻的房屋装有相互连通的防盗系统，如果两间相邻的房屋在同一晚上被小偷闯入，系统会自动报警。
 *
 * 给定一个代表每个房屋存放金额的非负整数数组，计算你在不触动警报装置的情况下，能够偷窃到的最高金额。
 *
 * 示例 1:
 *
 * 输入: [1,2,3,1]
 * 输出: 4
 * 解释: 偷窃 1 号房屋 (金额 = 1) ，然后偷窃 3 号房屋 (金额 = 3)。
 *      偷窃到的最高金额 = 1 + 3 = 4 。
 * 示例 2:
 *
 * 输入: [2,7,9,3,1]
 * 输出: 12
 * 解释: 偷窃 1 号房屋 (金额 = 2), 偷窃 3 号房屋 (金额 = 9)，接着偷窃 5 号房屋 (金额 = 1)。
 *      偷窃到的最高金额 = 2 + 9 + 1 = 12 。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/house-robber
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class t198 {

    /*public int rob(int[] nums) {
        int pre = 0;
        int post = 0;
        for (int i = 0; i < nums.length; i++) {
            int cur = Math.max(pre+nums[i],post);
            pre = post;
            post = cur;
        }
        return post;
    }*/
    //递归减枝
    private HashMap<Integer,Integer> map;
    public int rob(int[] nums) {
        map = new HashMap<>();
        return doRob(nums,nums.length-1);
    }
    private int doRob(int[] nums, int i) {
        if (i < 0) {
            return 0;
        }
        if (map.containsKey(i)) {
            return map.get(i);
        }
        int res = Math.max(doRob(nums,i-2)+nums[i],doRob(nums,i-1));
        map.put(i,res);
        return res;
    }
    /*public int rob(int[] nums) {
        return doRob(nums,nums.length-1);
    }

    private int doRob(int[] nums, int i) {
        if (i < 0) {
            return 0;
        }
        return Math.max(doRob(nums,i-2)+nums[i],doRob(nums,i-1));
    }*/

    public static void main(String[] args) {
        t198 demo = new t198();
        int[] ints = {2,1,1,2};
        System.out.println(demo.rob(ints));
    }


}
