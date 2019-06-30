package cn.leetCode.t1d;
/*编写一个函数来查找字符串数组中的最长公共前缀。

如果不存在公共前缀，返回空字符串 ""。

示例 1:

输入: ["flower","flow","flight"]
输出: "fl"
示例 2:

输入: ["dog","racecar","car"]
输出: ""
解释: 输入不存在公共前缀。
说明:

所有输入只包含小写字母 a-z 。*/
public class t14 {
    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        if( strs.length == 1){
            return strs[0];
        }
        String str = "";
        int min = strs[0].length();
        for (int i = 0; i < strs.length; i++) {
            if (strs[i].length() < min) {
                min = strs[i].length();
            }
        }
        for (int i = 0; i < min; i++) {
            for (int j = 0; j < strs.length - 1 ; j++) {
                if (strs[j].charAt(i) != strs[j + 1].charAt(i)) {
                    return str;
                }
            }
            str = strs[0].substring(0,i+1);
        }
        return str;
    }

    public static void main(String[] args) {
        String[] str = {"aa","a"};
        System.out.println(longestCommonPrefix(str));
        System.out.println("qwe".substring(0,3));
    }
}
