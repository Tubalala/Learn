package leetcode.test2;
/*
移动零
给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。

示例:

输入: [0,1,0,3,12]
输出: [1,3,12,0,0]
说明:

必须在原数组上操作，不能拷贝额外的数组。
尽量减少操作次数。
 */
public class Demo04 {
    public static void main(String[] args) {
        int[] nums = {0,0,0,0,12,0,1,0,19};
        int star = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == 0 && nums[star] != 0) {
                star=i;
            } else if (nums[i] != 0 && nums[star] == 0) {
                int temp = nums[star];
                nums[star] = nums[i];
                nums[i] = temp;
                star++;
            }
        }
        for (int num : nums) {
            System.out.print(num+" ");
        }
    }
    public void moveZeroes(int[] nums) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[index++] = nums[i];
            }
        }
        for (int i = index; i < nums.length; i++) {
            nums[i] = 0;
        }

    }
}
