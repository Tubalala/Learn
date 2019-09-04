package leetcode.test2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/*
两个数组的交集 II
给定两个数组，编写一个函数来计算它们的交集。

示例 1:

输入: nums1 = [1,2,2,1], nums2 = [2,2]
输出: [2,2]
示例 2:

输入: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
输出: [4,9]
说明：

输出结果中每个元素出现的次数，应与元素在两个数组中出现的次数一致。
我们可以不考虑输出结果的顺序。
进阶:

如果给定的数组已经排好序呢？你将如何优化你的算法？
如果 nums1 的大小比 nums2 小很多，哪种方法更优？
如果 nums2 的元素存储在磁盘上，磁盘内存是有限的，并且你不能一次加载所有的元素到内存中，你该怎么办？
 */
public class Demo05 {
    public static void main(String[] args) {
        int[] nums1 = {4,9,5};
        int[] nums2 = {9,4,9,8,4};
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums2.length; i++) {
            if (map.containsKey(nums2[i])) {
                Integer count = map.get(nums2[i]);
                count++;
                map.put(nums2[i],count);
            }else {
                map.put(nums2[i],1);
            }
        }
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums1.length; i++) {
            if (map.containsKey(nums1[i]) && map.get(nums1[i]) > 0) {
                list.add(nums1[i]);
                map.put(nums1[i],map.get(nums1[i])-1);
            }
        }
//        int[] nums3 = new int[list.size()];
//        for (int i = 0; i < nums3.length; i++) {
//            nums3[i] = list.get(i);
//        }

//        Set<Map.Entry<Integer, Integer>> entr = map.entrySet();
//        for (Map.Entry<Integer, Integer> entry : entr) {
//            Integer key = entry.getKey();
//            Integer value = entry.getValue();
//            System.out.print(key+"==="+value+"\n");
//        }
        System.out.println(list);
    }
    public int[] intersect(int[] nums1, int[] nums2) {
        if (nums1.length > nums2.length) {
            return intersect(nums2, nums1);
        }
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int nums[] = new int[nums1.length];
        int len = 0;
        for (int i = 0, j = 0; i < nums1.length && j < nums2.length; ) {
            if (nums1[i] == nums2[j]) {
                nums[len++] = nums1[i];
                ++i;
                ++j;
            } else if (nums1[i] < nums2[j]) {
                i++;
            } else {
                j++;
            }
        }
        int num[] = new int[len];
        System.arraycopy(nums, 0, num, 0, len);
        return num;
    }
}
