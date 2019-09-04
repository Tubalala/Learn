package day.ten;

import java.io.UnsupportedEncodingException;

public class SubTest {
    public static void main(String[] args){
        String s = sub("abc中", 2, 5);
        System.out.println(s);
    }

    private static String sub(String str1,int star,int end) {
        byte[] bytes = new byte[0];
        try {
            bytes = str1.getBytes("unicode");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        String str = "";
        for (int i = star; i < end; i++) {
            String s = String.valueOf(bytes[i]);

            str = str + s;
        }
        return str;
    }
}
