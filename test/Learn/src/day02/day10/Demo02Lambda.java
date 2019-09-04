package day02.day10;
/*
* Lambda优化日志案列
*Lambda必须使用函数式接口
* */
public class Demo02Lambda {
    public static void showLog(int level,Demo02MessageBuilder mb){
        if (level == 1) {
            System.out.println(mb.builderMessage());
        }
    }

    public static void main(String[] args) {
        String msg1 = "Hello";
        String msg2 = "World";
        String msg3 = "Java";
        showLog(2,()->{
            return msg1+msg2+msg3;
        });
        /*
        * 使用lambda表达式作为参数传递，仅仅是把参数传递到showlog方法中
        * 只有满足条件
        *       才会调用接口的方法，才会进行字符串的拼接
        *       如果条件不满足，是不会调用方法，进行字符串拼接
        *       不会存在性能浪费
        * */
        showLog(2,()->{
            System.out.println("不满足条件不执行！");
            return msg1+msg2+msg3;
        });
    }
}
