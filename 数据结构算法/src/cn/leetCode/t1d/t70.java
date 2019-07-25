package cn.leetCode.t1d;

import java.util.HashMap;

/*假设你正在爬楼梯。需要 n 阶你才能到达楼顶。

每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？

注意：给定 n 是一个正整数。

示例 1：

输入： 2
输出： 2
解释： 有两种方法可以爬到楼顶。
1.  1 阶 + 1 阶
2.  2 阶
示例 2：

输入： 3
输出： 3
解释： 有三种方法可以爬到楼顶。
1.  1 阶 + 1 阶 + 1 阶
2.  1 阶 + 2 阶
3.  2 阶 + 1 阶

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/climbing-stairs
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。*/
public class t70 {

    private static HashMap<Integer,Integer> map = new HashMap<>();

    public static int climbStairs3(int n) {
        if (n == 2) {
            return 2;
        }
        if (n == 1) {
            return 1;
        }
        if (map.containsKey(n)) {
            return map.get(n);
        }
        int res = climbStairs3(n-1) + climbStairs(n-2);
        map.put(n,res);
        return res;
    }


    public static int climbStairs2(int n){
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        int ret = 0;
        int pre = 2;
        int prepre = 1;
        for (int i = 3; i <= n; i++) {
            ret = pre + prepre;
            prepre = pre;
            pre = ret;
        }
        return ret;
    }

    public static int climbStairs(int n) {
        if (n == 2) {
            return 2;
        }
        if (n == 1) {
            return 1;
        }
        return climbStairs(n-1) + climbStairs(n-2);
    }
    public static void main(String[] args) {

        System.out.println(climbStairs(5));
        System.out.println(climbStairs2(4));
    }
}
