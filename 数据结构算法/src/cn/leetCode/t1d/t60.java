package cn.leetCode.t1d;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/*给出集合 [1,2,3,…,n]，其所有元素共有 n! 种排列。

按大小顺序列出所有排列情况，并一一标记，当 n = 3 时, 所有排列如下：

"123"
"132"
"213"
"231"
"312"
"321"
给定 n 和 k，返回第 k 个排列。

说明：

给定 n 的范围是 [1, 9]。
给定 k 的范围是[1,  n!]。
示例 1:

输入: n = 3, k = 3
输出: "213"
示例 2:

输入: n = 4, k = 9
输出: "2314"

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/permutation-sequence
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。*/
public class t60 {
    /*public static String getPermutation(int n, int k) {
        int[] ints = new int[n];
        for (int i = 0; i < ints.length; i++) {
            ints[i] = i + 1;
        }
        ArrayList<List<Integer>> list = new ArrayList<>();
        dfs(list,ints,0);
        long[] arr = new long[list.size()];
        int count = 0;
        for (List<Integer> in : list) {
            for (Integer i : in) {
                arr[count] = (arr[count] + i) * 10;
            }
            arr[count] = arr[count] / 10;
            count++;
        }
        Arrays.sort(arr);
        return arr[k-1]+"";
    }
    public static void dfs(List<List<Integer>> lists, int[] nums, int n) {
        if (n == nums.length) {
            List<Integer> list = new ArrayList<>();
            for (int num : nums) {
                list.add(num);
            }
            lists.add(list);
        }else {
            for (int i = n; i < nums.length; i++) {
                swap(nums,n,i);
                dfs(lists,nums,n+1);
                swap(nums,n,i);
            }
        }
    }
    public static void swap(int[] nums,int n,int m){
        int temp = nums[n];
        nums[n] = nums[m];
        nums[m] = temp;
    }*/
    public static String getPermutation(int n, int k) {
        /**
         直接用回溯法做的话需要在回溯到第k个排列时终止就不会超时了, 但是效率依旧感人
         可以用数学的方法来解, 因为数字都是从1开始的连续自然数, 排列出现的次序可以推
         算出来, 对于n=4, k=15 找到k=15排列的过程:

         1 + 对2,3,4的全排列 (3!个)
         2 + 对1,3,4的全排列 (3!个)         3, 1 + 对2,4的全排列(2!个)
         3 + 对1,2,4的全排列 (3!个)-------> 3, 2 + 对1,4的全排列(2!个)-------> 3, 2, 1 + 对4的全排列(1!个)-------> 3214
         4 + 对1,2,3的全排列 (3!个)         3, 4 + 对1,2的全排列(2!个)         3, 2, 4 + 对1的全排列(1!个)

         确定第一位:
         k = 14(从0开始计数)
         index = k / (n-1)! = 2, 说明第15个数的第一位是3
         更新k
         k = k - index*(n-1)! = 2
         确定第二位:
         k = 2
         index = k / (n-2)! = 1, 说明第15个数的第二位是2
         更新k
         k = k - index*(n-2)! = 0
         确定第三位:
         k = 0
         index = k / (n-3)! = 0, 说明第15个数的第三位是1
         更新k
         k = k - index*(n-3)! = 0
         确定第四位:
         k = 0
         index = k / (n-4)! = 0, 说明第15个数的第四位是4
         最终确定n=4时第15个数为3214
         **/

        StringBuilder sb = new StringBuilder();
        // 候选数字
        List<Integer> candidates = new ArrayList<>();
        // 分母的阶乘数
        int[] factorials = new int[n+1];
        factorials[0] = 1;
        int fact = 1;
        for(int i = 1; i <= n; ++i) {
            candidates.add(i);
            fact *= i;
            factorials[i] = fact;
        }
        k -= 1;
        for(int i = n-1; i >= 0; --i) {
            // 计算候选数字的index
            int index = k / factorials[i];
            // 移除候选数中的数并加入字符串中
            sb.append(candidates.remove(index));
            k -= index*factorials[i];
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        System.out.println(getPermutation(9, 94626));

    }
}
