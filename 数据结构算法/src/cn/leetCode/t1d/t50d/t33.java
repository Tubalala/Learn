package cn.leetCode.t1d.t50d;
/*假设按照升序排序的数组在预先未知的某个点上进行了旋转。

( 例如，数组 [0,1,2,4,5,6,7] 可能变为 [4,5,6,7,0,1,2] )。

搜索一个给定的目标值，如果数组中存在这个目标值，则返回它的索引，否则返回 -1 。

你可以假设数组中不存在重复的元素。

你的算法时间复杂度必须是 O(log n) 级别。

示例 1:

输入: nums = [4,5,6,7,0,1,2], target = 0
输出: 4
示例 2:

输入: nums = [4,5,6,7,0,1,2], target = 3
输出: -1

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/search-in-rotated-sorted-array
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。*/
public class t33 {

    private static int search(int[] nums,int target){
        int ret = -1;
        if (nums.length == 0) {
            return ret;
        }
        if (nums.length == 1) {
            if (nums[0] == target) {
                return 0;
            }
            return ret;
        }
        if (nums[0] < nums[nums.length-1]){
            ret = binSearch(nums,target,0,nums.length-1);
        }else {
            int value = nums[0];
            int low = 0;
            int heigh = nums.length - 1;
            int mid = 0;
            //查找分界点
            while (low <= heigh) {
                mid = low + ((heigh - low) >> 1);
                if (nums[mid] >= value) {
                    low = mid + 1;
                }else {
                    if (nums[mid] < nums[mid-1]){
                        break;
                    }
                    heigh = mid - 1;
                }
            }
            if (target > value) {
                ret = binSearch(nums,target,0,mid-1);
            } else if (target < value) {
                ret = binSearch(nums,target,mid,nums.length-1);
            }else {
                return 0;
            }

        }
        return ret;
    }

    private static int binSearch(int[] nums,int target,int low,int heigh) {
        while (low <= heigh) {
            int mid = low + ((heigh - low) >> 1);
            if (nums[mid] > target){
                heigh = mid - 1;
            }else if (nums[mid] < target){
                low = mid + 1;
            }else {
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {1,1};
        System.out.println(search(nums,1));
    }
}
