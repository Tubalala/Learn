package leetcode.test2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/*
* 打乱数组
打乱一个没有重复元素的数组。

示例:

// 以数字集合 1, 2 和 3 初始化数组。
int[] nums = {1,2,3};
Solution solution = new Solution(nums);

// 打乱数组 [1,2,3] 并返回结果。任何 [1,2,3]的排列返回的概率应该相同。
solution.shuffle();

// 重设数组到它的初始状态[1,2,3]。
solution.reset();

// 随机返回数组[1,2,3]打乱后的结果。
solution.shuffle();

* */
public class Demo07 {
    public class Solution{
        private int[] arr;
        private ArrayList<Integer> list;
        public Solution(int[] nums) {
            arr = nums;
            list = new ArrayList<>();
            for (int count = 0; count < nums.length; count++) {
                list.add(nums[count]);
            }
        }

        /** Resets the array to its original configuration and return it. */
        public int[] reset() {
            return arr;
        }

        /** Returns a random shuffling of the array. */
        public int[] shuffle() {
            int[] nums = new int[list.size()];
            Collections.shuffle(list);
            for (int count = 0; count < list.size(); count++) {
                nums[count] = list.get(count);
            }
            return nums;
        }

    }

    /*class Solution {
        private int[] p;
        private int[] q;
        public Solution(int[] nums) {
            p = nums;
        }

        *//** Resets the array to its original configuration and return it. *//*
        public int[] reset() {
            return p;
        }

        *//** Returns a random shuffling of the array. *//*
        public int[] shuffle() {
            int len = p.length;
            q = new int[len];
            for(int i = 0;i<len;i++)
                q[i] = p[i];
            int pos;//记录要交换元素的位置
            int temp; //记录要交换的值
            Random ran = new Random();
            for(int i=len-1;i>=0;i--){
                pos = ran.nextInt(i+1);
                temp = q[pos];
                q[pos] = q[i];
                q[i] = temp;
            }
            return q;
        }
    }*/

}