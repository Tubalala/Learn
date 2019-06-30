package cn.leetCode.t1d;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/*给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。

有效字符串需满足：

左括号必须用相同类型的右括号闭合。
左括号必须以正确的顺序闭合。
注意空字符串可被认为是有效字符串。

示例 1:

输入: "()"
输出: true
示例 2:

输入: "()[]{}"
输出: true
示例 3:

输入: "(]"
输出: false
示例 4:

输入: "([)]"
输出: false
示例 5:

输入: "{[]}"
输出: true*/
public class t20 {
    public static boolean isValid(String s) {
        if (s == null || s.length() == 0 ) {
            return true;
        }
        if (s.length() % 2 != 0) {
            return false;
        }
        ArrayList<Character> list = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == "{".charAt(0) || s.charAt(i) == "[".charAt(0) || s.charAt(i) == "(".charAt(0)) {
                list.add(s.charAt(i));
            } else if (s.charAt(i) == "}".charAt(0) || s.charAt(i) == "]".charAt(0) || s.charAt(i) == ")".charAt(0)) {
                if (list.size() == 0) {
                    return false;
                }
                if (list.get(list.size() - 1) == "{".charAt(0) && s.charAt(i) == "}".charAt(0)) {
                    list.remove(list.size()-1);
                } else if (list.get(list.size() - 1) == "[".charAt(0) && s.charAt(i) == "]".charAt(0)) {
                    list.remove(list.size()-1);
                } else if (list.get(list.size() - 1) == "(".charAt(0) && s.charAt(i) == ")".charAt(0)) {
                    list.remove(list.size()-1);
                }
            }
        }
        if (list.size() == 0) {
            return true;
        }
        return false;

    }
    public static void main(String[] args) {
        String str = "({})";


        System.out.println(isValid(str));
    }
    /*public static boolean isValid(String s) {
        if (s == null) {
            return true;
        }
        if (s.length() % 2 != 0) {
            return false;
        }
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == "{".charAt(0)) {
                list.add(3);
            }
            if (s.charAt(i) == "[".charAt(0)) {
                list.add(2);
            }
            if (s.charAt(i) == "(".charAt(0)) {
                list.add(1);
            }
            if (s.charAt(i) == "}".charAt(0)) {
                list.add(-3);
            }
            if (s.charAt(i) == "]".charAt(0)) {
                list.add(-2);
            }
            if (s.charAt(i) == ")".charAt(0)) {
                list.add(-1);
            }
        }
        int b = 0;
        List<Integer> list1 = new ArrayList<>();
        for (int i = 0; i < list.size() - 1; i++) {
            int a = list.get(i);
            b = list.get(i+1);
            if (a > 0 && a > b) {
                list1.add(a);
            } else if ( a > 0 && a <= b ){
                return false;
            }else if (a<0){
                if (list1.size() > 0 && list1.get(list1.size() - 1) == -a) {
                    list1.remove(list1.size()-1);
                }else {
                    return false;
                }
            }
        }
        if (list1.size() != 0 && list1.get(list1.size() - 1) == -b) {
            list1.remove(list1.size()-1);
        }
        if (list1.size() == 0) {
            return true;
        }
        return false;
    }
*/
}
