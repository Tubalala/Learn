package cn.leetCode.t1d.t50d;
/*给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。

你可以假设数组中无重复元素。

示例 1:

输入: [1,3,5,6], 5
输出: 2
示例 2:

输入: [1,3,5,6], 2
输出: 1
示例 3:

输入: [1,3,5,6], 7
输出: 4
示例 4:

输入: [1,3,5,6], 0
输出: 0

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/search-insert-position
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。*/
public class t35 {
    public static int searchInsert(int[] nums, int target) {
        int p = -1;
        for (int i = 0; i < nums.length; i++) {
            if (target<=nums[i]){
                p = i;
                break;
            }
        }
        if (p == -1) {
            p = nums.length ;
        }
        return p;
    }

    public static void main(String[] args) {
        int[] nums = {1,3,5,6};
        System.out.println(searchInsert(nums,7));
    }
}

