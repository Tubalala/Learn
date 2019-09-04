package day03.cn.itcast.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Demo03 {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        //使用构造器创建对象
        Class<Person> personClass = Person.class;
        Constructor<Person> constructor = personClass.getConstructor(String.class,int.class);
        Object p = constructor.newInstance("张三",10);
        System.out.println(p);
        //暴力反射
        constructor.setAccessible(true);
    }
}
