package cn.leetCode.t200d;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 给定一个字符串和一个字符串字典，找到字典里面最长的字符串，该字符串可以通过删除给定字符串的某些字符来得到。如果答案不止一个，返回长度最长且字典顺序最小的字符串。如果答案不存在，则返回空字符串。
 *
 * 示例 1:
 *
 * 输入:
 * s = "abpcplea", d = ["ale","apple","monkey","plea"]
 *
 * 输出:
 * "apple"
 * 示例 2:
 *
 * 输入:
 * s = "abpcplea", d = ["a","b","c"]
 *
 * 输出:
 * "a"
 * 说明:
 *
 * 所有输入的字符串只包含小写字母。
 * 字典的大小不会超过 1000。
 * 所有输入的字符串长度不会超过 1000。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/longest-word-in-dictionary-through-deleting
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class t524 {
    public static String findLongestWord(String s, List<String> d) {
        String ret = "";
        for (String str : d) {
            String res = isKid(s,str);
            if (res != null && res.length() >= ret.length()) {
                //compareTo(res)比较目标字符串在字典中的顺序
                if (res.length() == ret.length() && ret.compareTo(res) < 0) {
                    continue;
                }else {
                    ret = res;
                }
            }
        }
        return ret;
    }

    private static String isKid(String s, String str) {
        int i = str.length() - 1;
        int j = s.length() - 1;
        while (j >= 0) {
            if (str.charAt(i) == s.charAt(j)) {
                i--;
                j--;
            }else {
                j--;
            }
            if (i < 0) {
                return str;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        String s = "abpcplea";
        ArrayList<String> list = new ArrayList<>(Arrays.asList("ale", "apple", "monkey", "plea"));
        System.out.println(findLongestWord(s, list));
        System.out.println("abc".compareTo("abe"));

    }

}
