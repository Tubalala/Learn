package day.five.demo02;

public class Body {
    int num = 10;//外部类成员变量
    public class Heart{
        int num = 20;//内部类成员变量
        public void heart(){
            int num = 30;//内部类内部方法成员变量
            System.out.println("aaaa"+num);
            System.out.println(num);
            System.out.println(this.num);
            System.out.println(Body.this.num);
        }
    }
    public void method(){
        new Heart().heart();
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}
