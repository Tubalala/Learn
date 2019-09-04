package day.two;

public class DemoStaticUse {
    public static void main(String[] args) {
        DemoStatic first = new DemoStatic();//静态方法优先执行且执行唯一一次
        DemoStatic second = new DemoStatic();
        DemoStatic.room = "101教室";
        DemoStatic one = new DemoStatic("abc",20);
        DemoStatic two = new DemoStatic("def",15);
        System.out.println("姓名："+one.getName()+"，年龄："+one.getAge()+
                "，教室是："+DemoStatic.room+"，学号："+one.getId());
        System.out.println("姓名："+two.getName()+"，年龄："+two.getAge()+
                "，教室是："+DemoStatic.room+"，学号："+two.getId());
        one.method();//不推荐，javac会翻译成下面类型再执行
        DemoStatic.method2();//推荐
    }
}
