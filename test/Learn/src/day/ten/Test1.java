package day.ten;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Test1 {
    public static void main(String[] args){
        int[] a;
        String[][] str1 =new String[][]{new String[3],new String[]{"hello"},new String[4] };
        for (String[] str : str1) {
            for (String s : str) {
                System.out.print(s+" ");
            }
            System.out.println();
        }
        int[] s = new int[5];
        Arrays.fill(s,1);
    }

}
