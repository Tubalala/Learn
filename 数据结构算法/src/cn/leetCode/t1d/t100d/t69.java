package cn.leetCode.t1d.t100d;
/*实现 int sqrt(int x) 函数。

计算并返回 x 的平方根，其中 x 是非负整数。

由于返回类型是整数，结果只保留整数的部分，小数部分将被舍去。

示例 1:

输入: 4
输出: 2
示例 2:

输入: 8
输出: 2
说明: 8 的平方根是 2.82842...,
     由于返回类型是整数，小数部分将被舍去。

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/sqrtx
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。*/
public class t69 {
    /*public int mySqrt(int x) {
        long l = 0;
        long r = x;
        while (l < r) {
            long mid=(l + r + 1)/2;
            if((mid * mid) <= x){
                l = mid;
            } else{
                r = mid-1;
            }
        }
        return (int) l;
    }*/
    public int mySqrt(int x) {
        if (x <= 1) {
            return x;
        }
        int i = 0;
        int j = x;
        while (i <= j) {
            int mid = i + (j - i) / 2;
            int sqrt = x / mid;
            if (mid > sqrt) {
                j = mid - 1;
            }else if (sqrt == mid){
                return mid;
            }else {
                i = mid + 1;
            }
        }
        return i;
    }
}
