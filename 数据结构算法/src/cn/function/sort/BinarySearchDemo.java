package cn.function.sort;

/**
 * 二分查找
 */
public class BinarySearchDemo {
    /**
     * 无重复元素
     * @param nums
     * @param key
     * @return
     */
    public static int binarySearchNoRepeat(int[] nums,int key){
        int i = 0;
        int j = nums.length - 1;
        while (i <= j) {
            int mid = i + (j - i) / 2;
            if (nums[mid] == key) {
                return mid;
            } else if (nums[mid] > key) {
                j = mid - 1;
            }else {
                i = mid + 1;
            }
        }
        return -1;
    }

    /**
     * 有重复元素取最左
     * @param nums
     * @param key
     * @return
     */
    public static int binarySearchByLeft(int[] nums,int key) {
        int l = 0, h = nums.length - 1;
        while (l < h) {
            int m = l + (h - l) / 2;
            if (nums[m] >= key) {
                h = m;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

}
