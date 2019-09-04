package day.ten;

public class Son extends Father{
    static{
        System.out.println("子类静态");
    }
    {
        System.out.println("子类非静态");
    }
    public Son(){
        System.out.println("子类构造");
    }
    public void method(){
        System.out.println("子类方法");
    }
    public static void main(String[] args){
       /* Father s = new Son();
        s = new Son();
        s.method();*/
        Father s1 =  new Father();
        s1.method();
    }
}
