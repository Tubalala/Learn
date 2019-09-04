package leetcode.test1;

import java.util.*;

public class Solution13 {
    public static void main(String[] args) {
        String s = "leetcode";
        for (int i = 0; i < s.length(); i++) {
            int count = 0;
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    if (count == 2) {
                        break;
                    }else {
                        count++;
                    }
                }
            }
            if (count == 1) {
                System.out.println(i);
//                return i;
            }
        }
//        return -1;
        System.out.println();
        String s1 = "z";
        firstUniqChar(s);
    }
    public static int firstUniqChar(String s) {
        Map<Character,Integer> map = new LinkedHashMap<>();
        char[] arr = s.toCharArray();
        for(int i =0;i<arr.length;i++){
            if(!map.containsKey(arr[i])){
                map.put(arr[i],i);
            }else{
                map.put(arr[i],-1);
            }
        }
        for(Map.Entry<Character,Integer> entry :map.entrySet()){
            if(entry.getValue()!=-1){
                return entry.getValue();
            }
        }
        return -1;
    }
    public int firstUniqChar2(String s) {
        int[] count = new int[26];
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < s.length(); i++) {
            if (count[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }
        return -1;
    }
}
