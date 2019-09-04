package day.four;

public class MyinterfaceAimpl extends father implements Myinterface1 ,Myinterface2{
//    @Override
//    public void method() {//对于冲突的默认方法要进行重写,继承优先接口
//        System.out.println("");
//    }

    @Override
    public void print() {
        System.out.println("实现了接口的抽象方法！");
        Myinterface1.methodDefault1();

    }

    @Override
    public void show() {
        System.out.println("班级为"+Myinterface1.NUM_OF_MY_CLASS);
    }

}
