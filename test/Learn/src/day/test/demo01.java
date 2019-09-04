package day.test;

public class demo01 {
    public static void main(String [] args){
        int [] arry1 = {15,25,35};
        for (int i = 0; i <= arry1.length-1; i++) {
            System.out.println(arry1[i]);
        }
        int [] arry2 = arry1;
        arry2[0] = 150;
        arry2[1] = 250;
        arry2[2] = 300;
        for (int i = 0; i <= arry1.length-1; i++) {
            System.out.println(arry1[i]);
        }
        //arry1.fori
        for (int i = 0; i < arry1.length; i++) {
            System.out.println(arry1[i]);
        }
    }
}
