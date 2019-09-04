package cn.leetCode.t100d.t200d;
/*给定一个数组，将数组中的元素向右移动 k 个位置，其中 k 是非负数。

示例 1:

输入: [1,2,3,4,5,6,7] 和 k = 3
输出: [5,6,7,1,2,3,4]
解释:
向右旋转 1 步: [7,1,2,3,4,5,6]
向右旋转 2 步: [6,7,1,2,3,4,5]
向右旋转 3 步: [5,6,7,1,2,3,4]
示例 2:

输入: [-1,-100,3,99] 和 k = 2
输出: [3,99,-1,-100]
解释:
向右旋转 1 步: [99,-1,-100,3]
向右旋转 2 步: [3,99,-1,-100]

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/rotate-array
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。*/
public class t189 {
    public void rotate(int[] nums, int k) {
        int[] ints = new int[nums.length + k];
        for (int i = k; i < ints.length; i++) {
            ints[i] = nums[i-k];
        }
        int count = 1;
        for (int i = ints.length-1; i >= ints.length - k  ; i--) {
            ints[k-count] = ints[i];
            ints[i] = 0;
            count++;
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] = ints[i];
        }
    }
}
