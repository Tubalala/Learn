package leetcode.test1;
/*
验证回文串
给定一个字符串，验证它是否是回文串，只考虑字母和数字字符，可以忽略字母的大小写。

说明：本题中，我们将空字符串定义为有效的回文串。

示例 1:

输入: "A man, a plan, a canal: Panama"
输出: true
示例 2:

输入: "race a car"
输出: false
 */

public class Solution6 {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        int count = 0;
        StringBuffer strBuf=new StringBuffer();
        for(int i=0;i<s.length();i++){
            if(Character.isLetterOrDigit(s.charAt(i))){
                strBuf.append(s.charAt(i));
                count++;
            }
        }

        for (int i = 0; i < count ; i++) {
            if ('A' <= strBuf.charAt(i) && strBuf.charAt(i) <= 'Z') {
                char c = (char) (strBuf.charAt(i) + 32);
                String s1 = String.valueOf(c);
                strBuf.replace(i, i + 1, s1);
            }
        }
        String s1 = strBuf.toString();
        strBuf.reverse();
        String s2 = strBuf.toString();
        boolean b = s1.equals(s2);
        System.out.println(b);
//        System.out.println("'"+str+"'"+isHuiwen(str));
    }
    public boolean isPalindrome(String s) {
        StringBuffer strBuf=new StringBuffer();
        for(int i=0;i<s.length();i++){
            if(Character.isLetterOrDigit(s.charAt(i))){
                if ('A' <= s.charAt(i) && s.charAt(i) <= 'Z') {
                    String s1 = String.valueOf(s.charAt(i) + 32);
                    strBuf.append(s1);
                }else {
                    strBuf.append(s.charAt(i));
                }
            }
        }
        String s1 = strBuf.toString();
        strBuf.reverse();
        String s2 = strBuf.toString();
        boolean b = s1.equals(s2);
        return b;
    }



//    public static void main(String[] args) {
//        String s="A man, a plan, a canal: Panama";
//        System.out.println("is "+"["+s+"]"+" 回文串?"+"--"+isHuiwen(s));
////        String ss="12?abc(ba12";
////        System.out.println("is "+"["+ss+"]"+" 回文串?"+"--"+isHuiwen(ss));
//    }
//    public static boolean isHuiwen(String s){
//        String s1=filter(s);
//        String s2=reverse(s1);
//        return s2.equals(s1);
//    }
//    public static String filter(String s){//删除非字母非数字的字符过滤字符串
//        int count = 0;
//        StringBuffer strBuf=new StringBuffer();
//        for(int i=0;i<s.length();i++){
//            if(Character.isLetterOrDigit(s.charAt(i))){
//                strBuf.append(s.charAt(i));
//                count++;
//            }
//        }
//        for (int i = 0; i < count ; i++) {
//            if ('A' <= strBuf.charAt(i) && strBuf.charAt(i) <= 'Z') {
//                char c = (char) (strBuf.charAt(i) + 32);
//                String s1 = String.valueOf(c);
//                strBuf.replace(i, i + 1, s1);
//            }
//        }
//        return strBuf.toString();
//    }
//    public static String reverse(String s){//过滤后字符串反转，返回新的字符串
//        StringBuffer strBuf=new StringBuffer(s);
//        strBuf.reverse();
//        return strBuf.toString();
//    }


}
