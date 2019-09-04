package day03.cn.demo02;

public class Demo1 {

    @Check
    public void add(int a,int b){
        System.out.println("1 + 0 = "+(1+0));
    }

    @Check
    public void sub(int a,int b){
        System.out.println("1 - 0 = "+(1-0));
    }

    @Check
    public void mul(int a,int b){
        System.out.println("1 * 0 = "+(1*0));
    }

    @Check
    public void div(int a,int b){
        System.out.println("1 / 0 = "+(1/0));
    }

    public void show(){
        System.out.println("不测试的方法");
    }

}
