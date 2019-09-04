package day.five.demo02;

public class Obj {
    public void method(){
        //
        class Inner{
            int num = 10;
            public void method(){
                System.out.println(num);
            }
        }
        //调用局部内部类的方法
        Inner inner = new Inner();
        inner.method();
    }
}
