package leetcode.test3;
/*乘积最大子序列
        给定一个整数数组 nums ，找出一个序列中乘积最大的连续子序列（该序列至少包含一个数）。

        示例 1:

        输入: [2,3,-2,4]
        输出: 6
        解释: 子数组 [2,3] 有最大乘积 6。
        示例 2:

        输入: [-2,0,-1]
        输出: 0
        解释: 结果不能为 2, 因为 [-2,-1] 不是子数组。*/
public class Demo04 {
    public static void main(String[] args) {
        int[] nums = {2,-5,-2,-4,3};
        if (nums.length == 1) {
            System.out.println(nums[0]);
        }
        int max = nums[0];
        int ret = nums[0];
        for (int j = 0; j < nums.length-1; j++) {
            int min = nums[j];
            int temp = nums[j];
            for (int i = j+1; i < nums.length; i++) {
                temp *= nums[i];
                max = Math.max(max,temp);
                min = Math.max(min,nums[i]);
                ret = Math.max(min,max);
            }
        }
        System.out.println(ret);
        System.out.println(maxProduct(nums));
    }
    public static int maxProduct(int[] nums) {
        int minLast = nums[0],maxLast=nums[0],minCur,maxCur;
        int maxALL=nums[0];
        for(int i=1;i<nums.length;i++){
            maxCur = Math.max(nums[i],Math.max(maxLast*nums[i], minLast*nums[i]));
            minCur = Math.min(nums[i], Math.min(maxLast*nums[i], minLast*nums[i]));
            maxLast = maxCur;
            minLast = minCur;
            maxALL = Math.max(maxALL, maxCur);
        }
        return maxALL;
    }
}
