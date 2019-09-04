package day02.day03.test;

public class Demo01Cook {
    public static void main(String[] args) {
        invokeCook(new Cook() {
            @Override
            public void makeFood() {
                System.out.println("吃饭了！！！");
            }
        });

        //使用Lamdba表达式简化代码
        invokeCook(()->{
            System.out.println("吃饭了！！！");
        });
        //优化省略后
        invokeCook(()-> System.out.println("吃饭了！！！"));


    }
    public static void invokeCook(Cook cook){
        cook.makeFood();
    }
}
