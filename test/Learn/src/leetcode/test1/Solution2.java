package leetcode.test1;
/*
给定一个大小为 n 的数组，找到其中的众数。众数是指在数组中出现次数大于 ⌊ n/2 ⌋ 的元素。

你可以假设数组是非空的，并且给定的数组总是存在众数。
 */
public class Solution2 {
    public static void main(String[] args) {
        int[] nums = {2,2,1,1,1,2,2};
        int i = majorityElement(nums);
        System.out.println(i);

    }
    public static int majorityElement(int[] nums) {
        int count = 0;
        int res = 0;
        for(Integer num : nums){
            if (count == 0) {
                res = num;
                count++;
            } else if (num == res) {
                count++;
            }else {
                count--;
            }
        }
        return res;
    }

}
