package day03.cn.itcast.reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Demo04 {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Class<Person> personClass = Person.class;
        //获取指定名称的方法 方法名 参数列表
        Method method = personClass.getMethod("method");
        Person p = new Person();
        //执行方法
        method.invoke(p);

        Method methodA = personClass.getMethod("methodA", String.class);
        methodA.invoke(p,"abc");

        //获取所有public修饰的方法
        Method[] methods = personClass.getMethods();
        for (Method method1 : methods) {
            System.out.println(method1);
            String name = method1.getName();
            System.out.println(name);
            method1.setAccessible(true);
        }

        //获取类名
        String name = personClass.getName();
        System.out.println(name);
    }
}
