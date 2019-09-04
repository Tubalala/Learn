package day03.cn.itcast;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

public class Test {
    public static void main(String[] args) throws Exception {
        //可以创建任意类的对象，可以执行任意方法
        /*前提不能改变该类的任何代码
        * 可以创建任意类对象
        * 可以执行任意方法*/
        /*
        * 步骤
        * 配置文件
        * 反射
        *
        * 将需要创建的对象的全类名和需要执行的方法定义在配置文件中
        * 在程序中加载读取配置文件
        * 使用反射技术来加载类文件进内存
        * 创建对象
        * 执行方法*/
       /* Person p = new Person();
        p.eat();*/
       //加载配置文件
        //创建properties对象
        Properties pro = new Properties();
        //获取class目录下的配置文件
        ClassLoader classLoader = Test.class.getClassLoader();
        InputStream is = classLoader.getResourceAsStream("pro.properties");
        pro.load(is);
        //获取配置文件中定义的数据
        String className = pro.getProperty("className");
        String methodName = pro.getProperty("methodName");

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
