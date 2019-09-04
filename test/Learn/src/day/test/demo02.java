package day.test;

import org.omg.CORBA.PUBLIC_MEMBER;

public class demo02 {
    public static void main(String [] args){
        int []arry1 = {30,40,50,60,10,20,70,80,100,90};
        int max = arry1[0];
        int min = arry1[0];
        for (int i = 1; i < arry1.length; i++) {
            if (arry1[i]>max){
                max=arry1[i];
            }
            if (arry1[i]<min){
                min=arry1[i];
            }
        }
        System.out.println("max="+max);
        System.out.println("min="+min);
        System.out.println(arry1);
        for (int i = 0; i < arry1.length; i++) {
            System.out.println(arry1[i]);
        }
        System.out.println("=====================");
        arry1=arr(arry1);
        for (int i = 0; i < arry1.length; i++) {
            System.out.println(arry1[i]);
        }
        System.out.println("=========冒泡============");
        arry1=arrsort(arry1);
        for (int i = 0; i < arry1.length; i++) {
            System.out.println(arry1[i]);
        }
        System.out.println("=========选择============");
        arry1=arrsort1(arry1);
        for (int i = 0; i < arry1.length; i++) {
            System.out.println(arry1[i]);
        }
        System.out.println(arry1.length-1);

        System.out.println("========快速=============");
        arry1=arrsort2(arry1,0,arry1.length-1);
        for (int i = 0; i < arry1.length; i++) {
            System.out.println(arry1[i]);
        }
    }


    public static int[] arr(int[] arry){
        for (int max=arry.length-1,min=0; min<max ; min++,max--) {
            int temp = arry[min];
            arry[min] = arry[max];
            arry[max] = temp;
        }
        return arry;
    }

    public static int[] arrsort(int[] a){
        for (int i = 0; i < a.length-1; i++) {
            for (int j = 0; j < a.length-1; j++) {
                if (a[j]>a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
        return a;
    }
    public static int[] arrsort1(int[] a){
        for (int i = 0; i < a.length-1; i++) {
            int k = i;
            for (int j = k+1; j < a.length; j++) {
                if(a[k] > a[j]){
                    k = j;
                }
            }
            if(i != k){
                int temp = a[i];
                a[i] = a[k];
                a[k] = temp;
            }
        }
        return a;
    }
    public static int[] arrsort2(int[] arry,int low,int hight){
        int i = low;
        int j = hight;
        int key = arry[i];
        if (i>j){
            return arry;
        }
        while (i<j){
            while (arry[j] > key) {
                --j;
            }
            while (arry[i] <= key) {
                ++i;
            }

            if (i < j) {
                int temp = arry[i];
                arry[j] = arry[i];
                arry[i] = temp;
            }
        }
//        int temp = arry[i];
//        arry[j] = arry[low];
//        arry[low] = temp;
        arrsort2(arry,low,i-1) ;
        arrsort2(arry,i,hight-1) ;
        return arry;
    }


}
