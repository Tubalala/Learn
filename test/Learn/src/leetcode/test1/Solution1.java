package leetcode.test1;
// 只出现一次的数字
public class Solution1 {
    public static void main(String[] args) {
        int[] nums= {1,2,3,2,3};
        System.out.println("不同的那个是："+singleNumber(nums));
    }
    public static int singleNumber(int[] nums) {
        int num = 0;
        for (int i = 0; i < nums.length; i++) {
            num = num ^ nums[i];
        }
        return num;
    }
}
