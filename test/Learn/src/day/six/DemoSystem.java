package day.six;

import java.lang.reflect.Array;
import java.util.Arrays;

/*
public static native long currentTimeMillis();获取程序运行时间
public static native void arraycopy();复制数组
 */
public class DemoSystem {
    public static void main(String[] args) {
        demo1();
        demo2();
    }

    private static void demo2() {
        //public static native void arraycopy();复制数组
        int [] src = {1,2,3,4,5};
        int [] dest = {6,7,8,9,10};
        System.out.println("复制前："+ Arrays.toString(src)+"\n"+Arrays.toString(dest));
        System.arraycopy(src,0,dest,0,dest.length);
        System.out.println("复制后："+ Arrays.toString(src)+"\n"+Arrays.toString(dest));
    }

    private static void demo1() {
        //public static native long currentTimeMillis();获取程序运行时间
        long s = System.currentTimeMillis();
        for (int i = 0; i <= 9999; i++) {
            System.out.print(i);
        }
        long e = System.currentTimeMillis();
        System.out.println("\n程序耗时为"+(e-s)+"毫秒");
    }
}
