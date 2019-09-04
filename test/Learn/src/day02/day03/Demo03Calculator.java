package day02.day03;

public class Demo03Calculator {
    public static void main(String[] args) {
        invokeCalc(10, 20, new Calculator() {
            @Override
            public int calc(int a, int b) {
                return a+b;
            }
        });
        //使用Lambda简化
        invokeCalc(10,20,(int a,int b)->{
            return a+b;
        });
        //优化省略后
        invokeCalc(10,20,(int a,int b)-> a+b);
    }

    public static void invokeCalc(int a,int b,Calculator c){
        int sum = c.calc(a,b);
        System.out.println(sum);
    }
}
