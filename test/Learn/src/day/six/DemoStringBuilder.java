package day.six;

public class DemoStringBuilder {
    public static void main(String[] args) {
        demo1();
        demo2();
        demo3();
    }

    private static void demo3() {
        //String和StringBuilder的相互转换
        //String > StringBuilder
        String str = "hallo world";
        System.out.println(str);

        StringBuilder str1 = new StringBuilder(str);
        str1.append(123);
        System.out.println(str1);

        //StringBuilder > String
        String str2 = str1.toString();
        System.out.println(str2);
    }

    private static void demo2() {
        StringBuilder bu1 = new StringBuilder();
        StringBuilder bu2 = bu1.append("abc");
        System.out.println(bu1);
        System.out.println(bu2);
        System.out.println(bu1==bu2);//比较的是地址值
        //链式编程
        bu1.append(true).append(8.8).append("你好");
        System.out.println(bu1);
    }

    private static void demo1() {
        //String数组长度不可改变效率低
        //StringBuilde数组长度可变效率高
        StringBuilder stringBuilder1 = new StringBuilder();
        System.out.println(stringBuilder1);

        StringBuilder stringBuilder2 = new StringBuilder("abc");
        System.out.println(stringBuilder2);
    }
}
