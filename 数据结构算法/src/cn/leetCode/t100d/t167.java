package cn.leetCode.t100d;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*给定一个已按照升序排列 的有序数组，找到两个数使得它们相加之和等于目标数。

函数应该返回这两个下标值 index1 和 index2，其中 index1 必须小于 index2。

说明:

返回的下标值（index1 和 index2）不是从零开始的。
你可以假设每个输入只对应唯一的答案，而且你不可以重复使用相同的元素。
示例:

输入: numbers = [2, 7, 11, 15], target = 9
输出: [1,2]
解释: 2 与 7 之和等于目标数 9 。因此 index1 = 1, index2 = 2 。

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/two-sum-ii-input-array-is-sorted
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。*/
public class t167 {
    /*public static int[] twoSum(int[] numbers, int target) {
        int[] res = new int[2];
        if (numbers.length<2) {
            return res;
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        int index = 1;
        for (int number : numbers) {
            map.put(number,index);
            index++;
        }
        for (int i = 0; i < numbers.length; i++) {
            int sum = target - numbers[i];
            if (map.containsKey(sum)) {
                res[0] = i + 1;
                res[1] = map.get(sum);
                break;
            }
        }
        return res;
    }*/
    public static int[] twoSum(int[] numbers, int target) {
        int a = 0; int b = numbers.length - 1;
        while (a < b) {
            if (numbers[a]+numbers[b]==target) {
                return new int[]{a+1,b+1};
            } else if (numbers[a]+numbers[b]< target) {
                a++;
            }else {
                b--;
            }
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        int[] sum = {2,7,11,15};
        int[] ints = twoSum(sum, 9);
        for (int anInt : ints) {
            System.out.println(anInt);
        }
        char a = 65;
        System.out.println((char)(a+1));
    }
}
