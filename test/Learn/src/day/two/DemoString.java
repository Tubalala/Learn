package day.two;

import java.util.Scanner;

public class DemoString {
    public static void main(String [] args){
        String str1 = "hello";
        String str2 = "Hello";
        char [] arry ={'H','e','l','l','o'};
        String str3 = new String(arry);
        System.out.println(str1==str2);
        System.out.println(str1==str3);
        System.out.println(str2.equals(str3));
        System.out.println(str1.equalsIgnoreCase(str3));
        String str4 = "World";
        int length = str2.length();
        String concat = str2.concat(str4);
        System.out.println(length+" "+concat);
        char charAt = concat.charAt(6);
        int wor = concat.indexOf("Wor");
        System.out.println(charAt+" "+wor);
        String substring = concat.substring(3, 6);
        System.out.println(substring);
        String str5 = "你大爷的";
        char[] chars = str5.toCharArray();
        System.out.println(chars[1]);
        String s = str5.replace("你大爷的", "@@@@");
        System.out.println(s);
        String str6 = "aaa.bbb.ccc";
        char[] strarry1 = str6.toCharArray();
        String[] strarry2 = str6.split("\\.");
        for (int i = 0; i < strarry1.length; i++) {
            System.out.print(strarry1[i]);
        }
        System.out.println("\n");
        for (int i = 0; i < strarry2.length; i++) {
            System.out.println(strarry2[i]);
        }
        char[] arry2 = {'1','2','3','4'};
        String st=sort(arry2);
        System.out.println(st);
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入字符串：");
        String str = sc.next();
        count(str);

    }
    public static  String sort(char[] arry2){
        String str = "[";
        for (int i = 0; i < arry2.length; i++) {
            if (i == arry2.length - 1) {
                str += "word"+arry2[i]+"]";
            }else {
                str += "word"+arry2[i] + "#";
            }
        }
        return str;
    }
    public static void count(String str){
        char[] array = str.toCharArray();
        int countBiger = 0;
        int countLower = 0;
        int countNumber = 0;
        int countOther = 0;
        for (int i = 0; i < array.length; i++) {
            char c = array[i];
            if ('A' <= c && c <= 'Z') {
                countBiger++;
            } else if ('a' <= c && c <= 'z') {
                countLower++;
            } else if ('0' < c && c <= '9') {
                countNumber++;
            }else {
                countOther++;
            }
        }
        System.out.println("大写字母共有："+countBiger+"个");
        System.out.println("小写字母共有："+countLower+"个");
        System.out.println("数字共有："+countNumber+"个");
        System.out.println("其他字符共有："+countOther+"个");
    }
    public static void hdu2020(){

    }
}
