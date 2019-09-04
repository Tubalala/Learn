package day.two;
import java.util.ArrayList;
import java.util.Arrays;

public class DemoArrySort {
    public static void main(String[] args) {
        String str = "qweracsdfghiuy6590462@";
        char[] arry = str.toCharArray();
        Arrays.sort(arry);
        for (int i = 0; i < arry.length; i++) {
            System.out.print(arry[i]);
        }
        System.out.println("\n========");
        for (int i = arry.length-1; i > 0; i--) {
            System.out.print(arry[i]);
        }
    }
}
