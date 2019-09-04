package leetcode.test2;
/*
每个非负整数 N 都有其二进制表示。例如， 5 可以被表示为二进制 "101"，11 可以用二进制 "1011" 表示，依此类推。注意，除 N = 0 外，任何二进制表示中都不含前导零。
二进制的反码表示是将每个 1 改为 0 且每个 0 变为 1。例如，二进制数 "101" 的二进制反码为 "010"。
给定十进制数 N，返回其二进制表示的反码所对应的十进制整数。
示例 1：
输入：5
输出：2
解释：5 的二进制表示为 "101"，其二进制反码为 "010"，也就是十进制中的 2 。
示例 2：
输入：7
输出：0
解释：7 的二进制表示为 "111"，其二进制反码为 "000"，也就是十进制中的 0 。
示例 3：
输入：10
输出：5
解释：10 的二进制表示为 "1010"，其二进制反码为 "0101"，也就是十进制中的 5 。
提示：
0 <= N < 10^9
 */
public class Demo01 {
    public static void main(String[] args) {
        int num = 5;
        String s = "1";
        String str = Integer.toBinaryString(num);
        String str1 = "";
        for (int i = 0; i < str.length(); i++) {
            str1 = str1 + (str.charAt(i) ^ s.charAt(0));
        }
        Integer in = Integer.valueOf(str1, 2);
        System.out.println("=============");
        System.out.println(str);
        System.out.println(str1);
        System.out.println(in);
/*
    十进制转成十六进制：
    Integer.toHexString(int i)
    十进制转成八进制
    Integer.toOctalString(int i)
    十进制转成二进制
    Integer.toBinaryString(int i)
    十六进制转成十进制
    Integer.valueOf("FFFF",16).toString()
    八进制转成十进制
    Integer.valueOf("876",8).toString()
    二进制转十进制
    Integer.valueOf("0101",2).toString()
 */
//        String str = "";
//        String str1 = "";
//        String str2 = "";
//        while (num != 0) {
//            str = str + (num % 2);
//            num = num / 2;
//            count++;
//        }
//        for (int i = 0; i < count; i++) {
//            str1 = str1 + 1;
//        }
//        for (int i = 0; i < count; i++) {
//            int j = str.charAt(i) ^ str1.charAt(i);
//            System.out.print(j);
//        }
    }
}
