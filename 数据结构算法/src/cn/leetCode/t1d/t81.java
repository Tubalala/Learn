package cn.leetCode.t1d;
/*假设按照升序排序的数组在预先未知的某个点上进行了旋转。

( 例如，数组 [0,0,1,2,2,5,6] 可能变为 [2,5,6,0,0,1,2] )。

编写一个函数来判断给定的目标值是否存在于数组中。若存在返回 true，否则返回 false。

示例 1:

输入: nums = [2,5,6,0,0,1,2], target = 0
输出: true
示例 2:

输入: nums = [2,5,6,0,0,1,2], target = 3
输出: false

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/search-in-rotated-sorted-array-ii
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。*/
public class t81 {
    public static boolean search(int[] nums, int target) {
        int m = nums.length;
        int low = 0, high = m -1;
        int mid;
        while (low <= high) {
            mid = low + (high - low) / 2;
            if (nums[mid] == target) {
                return true;
            }
            if (nums[mid] == nums[low] && nums[mid] == nums[high]) {
                ++low;
                --high;
            } else if (nums[low] <= nums[mid]){
                //middle左边有序
                if (nums[low] <= target && target < nums[mid]) {
                    high = mid -1;
                } else {
                    //target只能在low和middle之间（不包含）找，其他地方不可能了
                    low = mid +1;
                }
            } else {
                //middle右边有序
                if (nums[mid] < target && target <= nums[high]) {
                    low = mid + 1;
                } else {
                    high = mid -1;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {3,1};
        System.out.println(search(nums,1));
    }
}
