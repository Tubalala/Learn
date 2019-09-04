package cn.leetCode.t1d.t50d;
/*实现 pow(x, n) ，即计算 x 的 n 次幂函数。

示例 1:

输入: 2.00000, 10
输出: 1024.00000
示例 2:

输入: 2.10000, 3
输出: 9.26100
示例 3:

输入: 2.00000, -2
输出: 0.25000
解释: 2-2 = 1/22 = 1/4 = 0.25

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/powx-n
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。*/
public class t50 {
    public static double myPow(double x, int n) {
        long N = n;
        if (N < 0) {
            x = 1 / x;
            N = -N;
        }
        return fastPow(x, N);
    }
    public static double fastPow(double x, long n){
        if (n == 0) {
            return 1;
        }
        double mid = fastPow(x,n/2);
        if (n % 2 == 0) {
            return mid*mid;
        }else {
            return mid*mid*x;
        }
    }
    public static void main(String[] args) {
        System.out.println(myPow(2.00000, -2));
        Math.pow(2,3);
    }

   /* public static double myPow(double x, int n) {
        if (x == 0) {
            return 0;
        }
        double sum = x;
        if (n > 0) {
            for (long i = 0; i < n; i++) {
                sum = sum * x;
            }
            return sum/x;
        } else if (n == 0) {
            return 1.00000;
        } else if (n < 0) {
            double xv = myPow(x, -n);
            return 1.00000/xv;
        }
        return -1;
    }*/
}
