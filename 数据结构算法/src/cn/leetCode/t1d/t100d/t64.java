package cn.leetCode.t1d.t100d;

/**
 * 给定一个包含非负整数的 m x n 网格，请找出一条从左上角到右下角的路径，使得路径上的数字总和为最小。
 *
 * 说明：每次只能向下或者向右移动一步。
 *
 * 示例:
 *
 * 输入:
 * [
 *   [1,3,1],
 *   [1,5,1],
 *   [4,2,1]
 * ]
 * 输出: 7
 * 解释: 因为路径 1→3→1→1→1 的总和最小。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/minimum-path-sum
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class t64 {
    /*public int minPathSum(int[][] grid) {
        if (grid.length == 0 || grid[0].length == 0) {
            return 0;
        }
        int m = grid.length, n = grid[0].length;
        int[] dp = new int[n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (j == 0) {
                    dp[j] = dp[j];
                } else if (i == 0) {
                    dp[j] = dp[j-1];
                }else {
                    dp[j] = Math.min(dp[j-1],dp[j]);
                }
                dp[j] += grid[i][j];
            }
        }
        return dp[n-1];
    }*/

    public int minPathSum(int[][] grid) {
        return df(grid,0,0);
    }

    private int df(int[][] grid, int i, int j) {
        if (i == grid.length || j == grid[0].length) {
            return Integer.MAX_VALUE;
        }
        if (i == grid.length - 1 && j == grid[0].length - 1) {
            return grid[i][j];
        }
        return grid[i][j] + Math.min(df(grid, i + 1, j), df(grid, i, j + 1));
    }


    public static void main(String[] args) {
        t64 demo = new t64();
        int[][] temp = {
                {1,3,1},
                {1,5,1},
                {4,2,1}
        };
        System.out.println(demo.minPathSum(temp));
    }
}
