package cn.tu.test;

import static cn.function.sort.StringFromat.numberToLetter;

public class Demo {


    public static void main(String[] args) {
        String str = "R5C255";
        int i = str.length() - 1;
        for (; i > 0; i--) {
            if (str.charAt(i) == 'C') {
                break;
            }
        }
        String r = str.substring(1, i);
        String c = str.substring(i+1, str.length());
        String s = numberToLetter(Integer.valueOf(c));
        System.out.println(s+r);
    }
}
