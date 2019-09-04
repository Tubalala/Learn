package cn.leetCode.t1d.t100d;
/*给定两个二进制字符串，返回他们的和（用二进制表示）。

输入为非空字符串且只包含数字 1 和 0。

示例 1:

输入: a = "11", b = "1"
输出: "100"
示例 2:

输入: a = "1010", b = "1011"
输出: "10101"

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/add-binary
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。*/
public class t67 {
    public static String addBinary(String a, String b) {
        StringBuilder sba = new StringBuilder(a);
        StringBuilder sbb = new StringBuilder(b);
        if (sba.length() >= sbb.length()) {
            for (int i = 0; i < a.length() - b.length(); i++) {
                sbb.insert(0,"0");
            }
        }else {
            for (int i = 0; i < b.length() - a.length(); i++) {
                sba.insert(0,"0");
            }
        }
        StringBuilder sb = new StringBuilder();
        int count = 0;
        for (int i = sba.length() - 1; i >= 0; i--) {
            if (((sba.charAt(i) - 48) + count + (sbb.charAt(i) - 48)) >= 2) {
                sb.insert(0,((sba.charAt(i) - 48) + count + (sbb.charAt(i) - 48))%2);
                count = 0;
                count++;
            }else {
                sb.insert(0,((sba.charAt(i) - 48) + count + (sbb.charAt(i) - 48))%2);
                count = 0;
            }
        }
        if (count != 0) {
            sb.insert(0,count);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String str = "11";
        String str1 = "1";
        System.out.println(addBinary(str, str1));
    }
}
