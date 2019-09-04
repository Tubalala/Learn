package leetcode.test1;

import java.util.ArrayList;
import java.util.Arrays;

/*
 有效的字母异位词
给定两个字符串 s 和 t ，编写一个函数来判断 t 是否是 s 的一个字母异位词。

示例 1:

输入: s = "anagram", t = "nagaram"
输出: true
示例 2:

输入: s = "rat", t = "car"
输出: false
说明:
你可以假设字符串只包含小写字母。

进阶:
如果输入字符串包含 unicode 字符怎么办？你能否调整你的解法来应对这种情况？
 */
public class Solution12 {
    public static void main(String[] args) {
        String s = "anagram", t = "nagaram";
        char[] chars = s.toCharArray();
        char[] chars1 = t.toCharArray();
        Arrays.sort(chars);
        Arrays.sort(chars1);

        String s1 = new String(chars);
        String t1 = new String(chars1);

        System.out.println(t1.equals(s1));
    }

    public boolean isAnagram(String s, String t) {
        int[] a=new int[26];
        int[] b=new int[26];
        for (int i=0;i<s.length();i++) {
            a[s.charAt(i)-'a']+=1;
        }
        for (int i=0;i<t.length();i++) {
            b[t.charAt(i)-'a']+=1;
        }
        for (int i=0;i<26;i++) {
            if (a[i]!=b[i]) {
                return false;
            }
        }
        return true;
    }
}
