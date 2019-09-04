package day03.cn.itcast.reflect;

public class ReflectDemo01 {
    public static void main(String[] args) throws ClassNotFoundException {
        //class.forName多用于配置文件，将类名定义在配置文件中读取文件，加载类
        Class cls1 = Class.forName("day03.cn.itcast.reflect.Person");
        System.out.println(cls1);
        //多用于参数传递
        Class cls2 = Person.class;
        System.out.println(cls2);
        //多用于对象获取字节码的方式
        Person p = new Person();
        Class cls3 = p.getClass();
        System.out.println(cls3);

        /*同一字节码文件，在一次程序运行过程中，只会被加载一次，
        * 不论通过哪一种方式获取的class对象都是同一个*/
        System.out.println(cls1==cls2);
        System.out.println(cls1==cls3);
        System.out.println(cls2==cls3);

    }
}
