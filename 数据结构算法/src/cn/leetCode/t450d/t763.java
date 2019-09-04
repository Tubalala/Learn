package cn.leetCode.t450d;

import java.util.*;

/**
 * 字符串 S 由小写字母组成。我们要把这个字符串划分为尽可能多的片段，同一个字母只会出现在其中的一个片段。返回一个表示每个字符串片段的长度的列表。
 *
 * 示例 1:
 *
 * 输入: S = "ababcbacadefegdehijhklij"
 * 输出: [9,7,8]
 * 解释:
 * 划分结果为 "ababcbaca", "defegde", "hijhklij"。
 * 每个字母最多出现在一个片段中。
 * 像 "ababcbacadefegde", "hijhklij" 的划分是错误的，因为划分的片段数较少。
 * 注意:
 *
 * S的长度在[1, 500]之间。
 * S只包含小写字母'a'到'z'。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/partition-labels
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class t763 {
    public static List<Integer> partitionLabels(String S) {
        ArrayList<int[]> q = new ArrayList<>();
        //HashSet<Character> set = new HashSet<>();
        HashMap<Character,String> map = new HashMap<>();
        char[] chars = S.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (map.containsKey(chars[i])) {
            }else {
                int[] temp = new int[2];
                temp[0] = S.indexOf(chars[i]);
                temp[1] = S.lastIndexOf(chars[i]);
                map.put(chars[i],null);
                q.add(temp);
            }
        }
        ArrayList<Integer> ret = new ArrayList<>();
        int min = 0;
        int max = q.get(0)[1];
        for (int i = 1; i < q.size(); i++) {
            if (max < q.get(i)[0]) {
                ret.add(max-min+1);
                min = q.get(i)[0];
                max = q.get(i)[1];
            }
            if (max < q.get(i)[1]) {
                max = q.get(i)[1];
            }
        }
        ret.add(max-min+1);
        return ret;
    }
    /*
    public List<Integer> partitionLabels(String S) {
        int[] lastIndexsOfChar = new int[26];
        for (int i = 0; i < S.length(); i++) {
            lastIndexsOfChar[char2Index(S.charAt(i))] = i;
        }
        List<Integer> partitions = new ArrayList<>();
        int firstIndex = 0;
        while (firstIndex < S.length()) {
            int lastIndex = firstIndex;
            for (int i = firstIndex; i < S.length() && i <= lastIndex; i++) {
                int index = lastIndexsOfChar[char2Index(S.charAt(i))];
                if (index > lastIndex) {
                    lastIndex = index;
                }
            }
            partitions.add(lastIndex - firstIndex + 1);
            firstIndex = lastIndex + 1;
        }
        return partitions;
    }

    private int char2Index(char c) {
        return c - 'a';
    }
     */

    public static void main(String[] args) {
        System.out.println(partitionLabels("ababcbacadefegdehijhklij"));
    }
}
