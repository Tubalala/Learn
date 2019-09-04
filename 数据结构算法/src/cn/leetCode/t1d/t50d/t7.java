package cn.leetCode.t1d.t50d;
/*给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。

示例 1:

输入: 123
输出: 321
 示例 2:

输入: -123
输出: -321
示例 3:

输入: 120
输出: 21*/
public class t7 {
    public static int reverse(int x) {
        long b = 0;
        while (x / 10 != 0){
            b = b * 10;
            b += x % 10;
            x = x / 10;
        }
        b = b * 10 + x % 10;
        if (b <= -2147483648 || b >= 2147483647) {
            return 0;
        }

        return (int) b;
    }
    public static void main(String[] args) {
        System.out.println(reverse(1534236469));
    }
}
