package cn.leetCode.t200d;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

/**
 * 编写一个函数，以字符串作为输入，反转该字符串中的元音字母。
 * a e i o u
 * 示例 1:
 *
 * 输入: "hello"
 * 输出: "holle"
 * 示例 2:
 *
 * 输入: "leetcode"
 * 输出: "leotcede"
 * 说明:
 * 元音字母不包含字母"y"
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/reverse-vowels-of-a-string
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class t345 {
    public static String reverseVowels(String s) {
        HashSet<Character> map = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));
        char[] str = s.toCharArray();
        int i = 0;
        int j = s.length()-1;
        while (i < j) {
            if (map.contains(str[i]) && map.contains(str[j])) {
                char temp = str[i];
                str[i] = str[j];
                str[j] = temp;
                i++;
                j--;
            }else {
                if (map.contains(str[i])) {
                    j--;
                } else if (map.contains(str[j])) {
                    i++;
                }else {
                    j--;
                    i++;
                }
            }
        }
        return new String(str);
    }

    public static void main(String[] args) {
        System.out.println(reverseVowels("hello"));
    }
}
