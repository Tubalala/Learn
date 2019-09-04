package day.five.demo02;
/*
间接调用 外部类方法使用内部类方法，然后main调用外部类方法
直接调用    类名称 对象名 = new 类名称
 */
public class Demo02 {
    public static void main(String[] args) {
        Body a = new Body();
        a.method();
        Body.Heart heart = new Body().new Heart();
        heart.heart();
    }
}
