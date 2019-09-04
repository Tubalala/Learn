package day03.cn.itcast.reflect;

import java.lang.reflect.Field;

public class Demo02 {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Class<Person> personClass = Person.class;
        Field[] fields = personClass.getFields();
        for (Field field : fields) {
            System.out.println(field);
        }
        System.out.println("============");
        Field a = personClass.getField("name");

        Person p = new Person();
        Object o = a.get(p);
        System.out.println(o);

        a.set(p,"张三");
        System.out.println(p);

        //getDeclaredFields获取所有的成员变量，不考虑修饰符
        Field[] f = personClass.getDeclaredFields();
        for (Field field : f) {
            System.out.println(field);
        }

        Field s = personClass.getDeclaredField("name");
        Person p1 = new Person();
        p1.setName("李四");
        s.set(p1,"王五");
        System.out.println(p1.getName());

    }
}
