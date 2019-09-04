package day03.cn.demo01;

import java.lang.reflect.Method;

@Pro(className = "day03.cn.demo01.Demo5",
    methodName = "show")
public class Demo5Test {
    public static void main(String[] args) throws Exception{
        //解析注解
        //获取该类的字节码文件
        Class<Demo5Test> demo5TestClass = Demo5Test.class;
        //获取上边的注释对象
        //其实就是在内存中生成了一个该接口的是实现对象
        Pro an = demo5TestClass.getAnnotation(Pro.class);
        //调用注解的方法获取返回值
        String className = an.className();
        String methodName = an.methodName();
        System.out.println(className);
        System.out.println(methodName);
        //加载该类进内存
        Class cls = Class.forName(className);
        //创建对象
        Object obj = cls.newInstance();
        //获取方法对象
        Method method = cls.getMethod(methodName);
        //执行方法
        method.invoke(obj);
    }
}
