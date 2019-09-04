package day.three;

public class Phone {
    private int num = 20;

    public Phone(int num) {
        System.out.println("父类的有参构造！");
    }

    public Phone() {
        System.out.println("父类的无参构造！");
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public void method(){
        System.out.println("显示手机号");
    }
}
