package cn.leetCode.t1d.t100d;

/**
 * 一条包含字母 A-Z 的消息通过以下方式进行了编码：
 *
 * 'A' -> 1
 * 'B' -> 2
 * ...
 * 'Z' -> 26
 * 给定一个只包含数字的非空字符串，请计算解码方法的总数。
 *
 * 示例 1:
 *
 * 输入: "12"
 * 输出: 2
 * 解释: 它可以解码为 "AB"（1 2）或者 "L"（12）。
 * 示例 2:
 *
 * 输入: "226"
 * 输出: 3
 * 解释: 它可以解码为 "BZ" (2 26), "VF" (22 6), 或者 "BBF" (2 2 6) 。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/decode-ways
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class t91 {
    /*public int numDecodings(String s) {
        if (s.length() == 0 || s == null) {
            return 0;
        }
        int[] dp = new int[s.length()];
        for (int i = 1; i < s.length(); i++) {
            if (Integer.valueOf(s.substring(i - 1, i)) <= 2 && Integer.valueOf(s.substring(i - 1, i)) > 0) {
                if (Integer.valueOf(s.substring(i, i + 1)) > 6) {
                    dp[i] = dp[i-1];
                }else {
                    dp[i] = dp[i-1] + 1;
                }
            }else {
                dp[i] = dp[i-1];
            }
        }
        if (s.length() == 1 && Integer.valueOf(s.substring(0,1)) != 0) {
            return 1;
        }
        return dp[s.length()-1];
    }*/
    public int numDecodings(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        int n = s.length();
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = s.charAt(0) == '0' ? 0 : 1;
        for (int i = 2; i <= n; i++) {
            int one = Integer.valueOf(s.substring(i - 1, i));
            if (one != 0) {
                dp[i] += dp[i - 1];
            }
            if (s.charAt(i - 2) == '0') {
                continue;
            }
            int two = Integer.valueOf(s.substring(i - 2, i));
            if (two <= 26) {
                dp[i] += dp[i - 2];
            }
        }
        return dp[n];
    }

    public static void main(String[] args) {
        t91 demo = new t91();
        System.out.println(Integer.valueOf("12".substring(0,1))==1);
        System.out.println(demo.numDecodings("2100"));

    }
}
