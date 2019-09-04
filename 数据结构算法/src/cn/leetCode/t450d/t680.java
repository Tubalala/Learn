package cn.leetCode.t450d;

import com.sun.deploy.util.StringUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * 给定一个非空字符串 s，最多删除一个字符。判断是否能成为回文字符串。
 *  abvceba
 * 示例 1:
 *
 * 输入: "aba"
 * 输出: True
 * 示例 2:
 *
 * 输入: "abca"
 * 输出: True
 * 解释: 你可以删除c字符。
 * 注意:
 *
 * 字符串只包含从 a-z 的小写字母。字符串的最大长度是50000。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/valid-palindrome-ii
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class t680 {
    public static boolean validPalindrome(String s) {
        char[] str = s.toCharArray();
        int i = 0;
        int j = str.length - 1;

        while (i < j) {
            if ( str[i] == str[j] ){
                i++;
                j--;
            }else {
                return isPalindrome(str,i,j-1) || isPalindrome(str,i+1,j);
            }
        }
        return true;

    }

    private static boolean isPalindrome(char[] str, int i, int j) {
        while (i < j) {
            if ( str[i] == str[j] ){
                i++;
                j--;
            }else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(validPalindrome("deeee"));
    }
}
