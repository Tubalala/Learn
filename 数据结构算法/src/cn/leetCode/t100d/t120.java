package cn.leetCode.t100d;

import java.util.List;

/*给定一个三角形，找出自顶向下的最小路径和。每一步只能移动到下一行中相邻的结点上。

例如，给定三角形：

[
     [2],
    [3,4],
   [6,5,7],
  [4,1,8,3]
]
自顶向下的最小路径和为 11（即，2 + 3 + 5 + 1 = 11）。

[
       [-1],
      [2,3],
    [1,-1,-3]
]

如果你可以只使用 O(n) 的额外空间（n 为三角形的总行数）来解决这个问题，那么你的算法会很加分。
来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/triangle
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。*/
public class t120 {
    /*public int minimumTotal(List<List<Integer>> triangle) {
        if (triangle == null || triangle.size() == 0) {
            return -1;
        }
        int res = triangle.get(0).get(0);
        int index = 0;
        for (int i = 1; i < triangle.size(); i++) {
            int a = triangle.get(i).get(index);
            int b = triangle.get(i).get(index+1);
            index = a < b ? index : index + 1;
            res += Math.min(a,b);
        }
        return res;
    }*/
    public int minimumTotal(List<List<Integer>> triangle) {
        if (triangle == null || triangle.size() == 0){
            return -1;
        }
        // 加1可以不用初始化最后一层
        int[][] dp = new int[triangle.size()+1][triangle.size()+1];

        for (int i = triangle.size()-1; i>=0; i--){
            List<Integer> curTr = triangle.get(i);
            for(int j = 0 ; j< curTr.size(); j++){
                dp[i][j] = Math.min(dp[i+1][j], dp[i+1][j+1]) + curTr.get(j);
            }
        }
        return dp[0][0];
    }
}
