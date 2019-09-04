package leetcode.test2;

public class Demo06 {
    public static void main(String[] args) {
        /*
        给定长度为 n 的整数数组 nums，其中 n > 1，返回输出数组 output ，其中 output[i] 等于 nums 中除 nums[i] 之外其余各元素的乘积。
        示例:
        输入: [1,2,3,4]
        输出: [24,12,8,6]
        说明: 请不要使用除法，且在 O(n) 时间复杂度内完成此题。

        进阶：
        你可以在常数空间复杂度内完成这个题目吗？（ 出于对空间复杂度分析的目的，输出数组不被视为额外空间。）
        */
        int[] nums = {1,2,3,4};
        int[] star = new int[nums.length];
        int[] end = new int[nums.length];
        int count = 1;
        for (int i = 0; i < star.length; i++) {
            count = count*nums[i];
            star[i] = count;
        }
        count = 1;
        for (int i = end.length-1; i >= 0; i--) {
            count = count*nums[i];
            end[i] = count;

        }
        for (int i = 0; i < nums.length; i++) {
            if (i - 1 < 0) {
                nums[i] = end[i+1];
            } else if (i + 1 == nums.length) {
                nums[i] = star[i-1];
            }else {
                nums[i] = star[i-1] * end[i+1];
            }
        }
        int[] ints = get(nums);

    }

    public static int[] get(int[] nums){
        int len = nums.length;
        int[] output = new int[len];
        int p = 1;
        for(int i=0;i<len;i++) {
            output[i] = p;
            p *= nums[i];
        }
        p = 1;
        for(int i=len-1;i>=0;i--) {
            output[i] *= p;
            p *= nums[i];
        }
        return output;
    }
}
