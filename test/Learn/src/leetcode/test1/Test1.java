package leetcode.test1;

import java.util.HashMap;
import java.util.Map;

public class Test1 {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i <nums.length; i++) {
            map.put(i,nums[i]);
        }
        for (int i = 0; i < nums.length; i++) {
            int temp = target - nums[i];
            if (map.containsKey(temp)&&map.get(temp)!=i){
                return new int[]{map.get(temp),i};
            }
        }
        throw new IllegalArgumentException("没有需要的结果！");
    }
    public int[] twoSum1(int[] nums, int target) {
        Map<Integer,Integer>map = new HashMap<>();
        for (int i = 0; i <nums.length; i++) {
            map.put(i,nums[i]);
        }
        for (int i = 0; i < nums.length; i++) {
            int temp = target - nums[i];
            if (map.containsKey(temp)&&map.get(temp)!=i){
                return new int[]{map.get(temp),i};
            }
        }
        throw new IllegalArgumentException("没有需要的结果！");
    }
}
