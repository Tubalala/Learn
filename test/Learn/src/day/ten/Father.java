package day.ten;

class Father {
    private static Father f = new Father();
    static {
        System.out.println("父类静态");
    }
    {
        System.out.println("父类非静态");
    }
    public Father(){
        System.out.println("父类构造");
    }
    public void method(){
        System.out.println("父类方法");
    }
}
