package leetcode.test2;

import java.util.HashMap;

/*
    存在重复元素
    给定一个整数数组，判断是否存在重复元素。

    如果任何值在数组中出现至少两次，函数返回 true。如果数组中每个元素都不相同，则返回 false。

    示例 1:
    输入: [1,2,3,1]
    输出: true
    示例 2:
    输入: [1,2,3,4]
    输出: false
    示例 3:
    输入: [1,1,1,3,3,4,3,2,4,2]
    输出: true
 */
public class Demo02 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        for (int i = 0; i < nums.length-1; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i]==nums[j]){
                    System.out.println(true);
                }
            }
        }

        System.out.println(find(nums));
    }

    private static boolean find(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])) {
                map.put(nums[i],1);
            }else {
                return true;
            }
        }
        return false;
    }
}
