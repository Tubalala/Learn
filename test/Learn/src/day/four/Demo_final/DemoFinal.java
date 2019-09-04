package day.four.Demo_final;
/*
final的四种用法

修饰一个类  太监类没有子类
修饰一个方法  不可被覆盖重写
修饰一个局部变量
修饰一个成员变量
    不可变 成员变量用final之后必须手动赋值
            要么直接赋值 要么构造方法赋值
            必须保证所有重载的构造方法必须有对其进行赋值
 */
public class DemoFinal {
    public static void main(String[] args) {
        /*
        对于基本类型来说不变的是变量中的数据
        对于引用类型来说不变的是变量中的地址值
         */
        Person stu1 = new Person("abc");
        System.out.print(stu1+" ");
        System.out.println(stu1.getName());
        stu1 = new Person("omg");
        System.out.print(stu1+" ");
        System.out.println(stu1.getName());
        final Person stu2 = new Person("aaa");
        System.out.print(stu2+" ");
        System.out.println(stu2.getName());
//        stu2 = new Person("omg");//错误写法
        stu2.setName("bbb");
        System.out.print(stu2+" ");
        System.out.println(stu2.getName());
    }

}
