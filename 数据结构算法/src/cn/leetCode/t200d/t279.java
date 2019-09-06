package cn.leetCode.t200d;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 给定正整数 n，找到若干个完全平方数（比如 1, 4, 9, 16, ...）使得它们的和等于 n。你需要让组成和的完全平方数的个数最少。
 *
 * 示例 1:
 *
 * 输入: n = 12
 * 输出: 3
 * 解释: 12 = 4 + 4 + 4.
 * 示例 2:
 *
 * 输入: n = 13
 * 输出: 2
 * 解释: 13 = 4 + 9.
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/perfect-squares
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class t279 {
    public int numSquares(int n) {
        List<Integer> sq = createSquares(n);
        int[] dp = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            int min = Integer.MAX_VALUE;
            for (Integer t : sq) {
                if (t > i) {
                    break;
                }
                min = Math.min(min,dp[i-t]+1);
            }
            dp[i] = min;
        }
        return dp[n];
    }
    /*public int numSquares(int n) {
        List<Integer> sqList = createSquares(n);
        Queue<Integer> queue = new LinkedList<>();
        boolean[] marked = new boolean[n + 1];
        queue.add(n);
        marked[n] = true;
        int level = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            level++;
            while (size-- > 0) {
                int cur = queue.poll();
                for (int s : sqList) {
                    int next = cur - s;
                    if (next < 0) {
                        break;
                    }
                    if (next == 0) {
                        return level;
                    }
                    if (marked[next]) {
                        continue;
                    }
                    marked[next] = true;
                    queue.add(next);
                }
            }
        }
        return n;
    }*/

    private List<Integer> createSquares(int n) {
        ArrayList<Integer> ret = new ArrayList<>();
        int i = 1;
        while (i * i <= n) {
            int square = i * i;
            ret.add(square);
            i++;
        }
        return ret;
    }

    public static void main(String[] args) {
        System.out.println(new t279().numSquares(7));
    }
}
