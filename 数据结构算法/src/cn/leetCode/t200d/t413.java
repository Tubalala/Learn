package cn.leetCode.t200d;

/**
 * 如果一个数列至少有三个元素，并且任意两个相邻元素之差相同，则称该数列为等差数列。
 *
 * 例如，以下数列为等差数列:
 *
 * 1, 3, 5, 7, 9
 * 7, 7, 7, 7
 * 3, -1, -5, -9
 * 以下数列不是等差数列。
 *
 * 1, 1, 2, 5, 7
 *  
 *
 * 数组 A 包含 N 个数，且索引从0开始。数组 A 的一个子数组划分为数组 (P, Q)，P 与 Q 是整数且满足 0<=P<Q<N 。
 *
 * 如果满足以下条件，则称子数组(P, Q)为等差数组：
 *
 * 元素 A[P], A[p + 1], ..., A[Q - 1], A[Q] 是等差的。并且 P + 1 < Q 。
 *
 * 函数要返回数组 A 中所有为等差数组的子数组个数。
 *
 *  
 *
 * 示例:
 *
 * A = [1, 2, 3, 4]
 *
 * 返回: 3, A 中有三个子等差数组: [1, 2, 3], [2, 3, 4] 以及自身 [1, 2, 3, 4]。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/arithmetic-slices
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class t413 {
    //暴力搜索
    public int numberOfArithmeticSlices(int[] A) {
        int ret = 0;
        int m = A.length;
        for (int i = 0; i < m - 2; i++) {
            int l = i + 1;
            int q = A[l] - A[i];
            int end = l + 1;
            while (end < m && A[end] - A[l] == q) {
                if (A[end] - A[l] == q) {
                    ret++;
                    l++;
                    end++;
                }else {
                    break;
                }
            }
        }
        return ret;
    }
    //动态规划
    /*public int numberOfArithmeticSlices(int[] A) {
        if (A == null || A.length == 0) {
            return 0;
        }
        int n = A.length;
        int[] dp = new int[n];
        for (int i = 2; i < n; i++) {
            if (A[i] - A[i - 1] == A[i - 1] - A[i - 2]) {
                dp[i] = dp[i - 1] + 1;
            }
        }
        int total = 0;
        for (int cnt : dp) {
            total += cnt;
        }
        return total;
    }*/

    public static void main(String[] args) {
        t413 demo = new t413();
        int[] a = {1,2,3,4,5,6};
        System.out.println(demo.numberOfArithmeticSlices(new int[]{2, 1, 3, 4, 2, 3}));
        System.out.println(demo.numberOfArithmeticSlices(a));
    }
}
