package day03.cn.demo01;

public class AnnoDemo2 {
    //重写的注解
    @Override
    public String toString() {
        return super.toString();
    }

    //标记已过时
    @Deprecated
    public void show1(){

    }

    public void test() {
        show1();
    }
    //压制警告 一般传递参数all
    @SuppressWarnings("all")
    public void show2(){

    }
}
