package day02.day10;
/*
* 日志浪费案列
* 使用Lambda进行优化
* */
public class Demo02 {
    public static void showLog(int level,String message){
        if (level == 1) {
            System.out.println(message);
        }
    }
    public static void main(String[] args) {
        String msg1 = "Hello";
        String msg2 = "World";
        String msg3 = "Java";

        showLog(2,msg1+msg2+msg3);

    }
}
