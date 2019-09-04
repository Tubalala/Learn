package day02.day10;

import java.util.Arrays;
import java.util.Comparator;

public class Demo04Comparator {
    public static Comparator<String> getComparator(){
        /*return new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.length()-o1.length();
            }
        };*/
       /* return (String o1,String o2)->{
            return o2.length()-o1.length();
        };*/

        return ((o1, o2) -> o2.length()-o1.length());
    }
    public static void main(String[] args) {
        String[] arr = {"aa","b","cccccc","ddddddddd"};
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr,getComparator());
        System.out.println(Arrays.toString(arr));
    }
}
