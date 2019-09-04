package leetcode.test2;
/*
旋转数组
给定一个数组，将数组中的元素向右移动 k 个位置，其中 k 是非负数。

示例 1:

输入: [1,2,3,4,5,6,7] 和 k = 3
输出: [5,6,7,1,2,3,4]
解释:
向右旋转 1 步: [7,1,2,3,4,5,6]
向右旋转 2 步: [6,7,1,2,3,4,5]
向右旋转 3 步: [5,6,7,1,2,3,4]
示例 2:

输入: [-1,-100,3,99] 和 k = 2
输出: [3,99,-1,-100]
解释:
向右旋转 1 步: [99,-1,-100,3]
向右旋转 2 步: [3,99,-1,-100]
说明:

尽可能想出更多的解决方案，至少有三种不同的方法可以解决这个问题。
要求使用空间复杂度为 O(1) 的原地算法。
 */
public class Demo03 {
    public static void main(String[] args) {
        int k = 3;
        int[] nums = {5,6,7,1,2,3,4};
        int[] ints = new int[nums.length + k];

        System.out.println();
        for (int i = k; i < ints.length; i++) {
            ints[i] = nums[i-k];
        }
        int count = 1;
        for (int i = ints.length-1; i >= ints.length - k  ; i--) {
            ints[k-count] = ints[i];
            count++;
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] = ints[i];
            System.out.print(nums[i]+" ");
        }
        System.out.println();
    }
    public void rotate(int[] nums, int k) {
        k=k%nums.length;
        int[] tmp=nums.clone();
        System.arraycopy(tmp,tmp.length-k,nums,0,k);
        System.arraycopy(tmp,0,nums,k,tmp.length-k);
    }
}
