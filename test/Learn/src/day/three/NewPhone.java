package day.three;

public class NewPhone extends Phone{
    private int num = 200;
    int n = 100;
    public NewPhone() {
//        super();//super和this只能有一个
        this(123);
        System.out.println("子类的无参构造！");
    }

    public NewPhone(int num, int num1) {
        super(num);
        this.num = num1;
    }
    public NewPhone(int n){

    }

    @Override
    public void method() {
        super.method();
        System.out.println("显示头像");
        System.out.println("显示签名");
        System.out.println(this.num);
        System.out.println(super.getNum());

    }
}
