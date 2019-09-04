package cn.leetCode.t1d.t50d;

import java.util.ArrayList;

/*给定两个以字符串形式表示的非负整数 num1 和 num2，返回 num1 和 num2 的乘积，它们的乘积也表示为字符串形式。

示例 1:

输入: num1 = "2", num2 = "3"
输出: "6"
示例 2:

输入: num1 = "123", num2 = "456"
输出: "56088"
说明：

num1 和 num2 的长度小于110。
num1 和 num2 只包含数字 0-9。
num1 和 num2 均不以零开头，除非是数字 0 本身。
不能使用任何标准库的大数类型（比如 BigInteger）或直接将输入转换为整数来处理。

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/multiply-strings
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。*/
public class t43 {
    public static String multiply(String num1, String num2) {
        char[] chars1 = num1.toCharArray();
        char[] chars2 = num2.toCharArray();
        if (num1.charAt(0) == 0 || num2.charAt(0) == 0) {
            return "0";
        }
        int[] list = new int[chars1.length+chars2.length];
        String str = "";
        for (int i = chars1.length-1; i >= 0; i--) {
            for (int j = chars2.length-1; j >= 0; j--) {
                list[i+j] += (chars1[i]-48)*(chars2[j]-48);
                if (list[i + j] >= 10 && (i + j) != 0) {
                    list[i+j-1] += list[i+j]/10;
                    list[i+j] = list[i+j]%10;
                }
            }
        }
        for (int i = 0; i < num1.length()+num2.length()-1; i++) {
            str += list[i]+"";
        }
        return str;
    }

    public static void main(String[] args) {
        String str = "1";
        String str1 = "1";
        System.out.println(multiply(str,str1));
        System.out.println(123*123);
    }
}
