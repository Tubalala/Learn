package day03.cn.demo02;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Method;

/*
 * 简单的测试框架
 * 当主方法执行后会自动检测所有方法（加了check注解的方法）
 * 判断方法是否有异常
 * 记录到文件中*/
public class TestCheck {
    public static void main(String[] args) throws IOException {
        Demo1 d = new Demo1();
        Class cls = d.getClass();
        Method[] methods = cls.getMethods();

        int number = 0;
        BufferedWriter bw = new BufferedWriter(new FileWriter("bug.txt"));

        for (Method method : methods) {
            if (method.isAnnotationPresent(Check.class)) {
                try{
                    method.invoke(d);
                }catch (Exception e){
                    number++;
                    bw.write(method.getName()+"方法出现异常!");
                    bw.newLine();
                    bw.write("异常名称"+e.getCause().getClass().getSimpleName());
                    bw.newLine();
                    bw.write("异常原因"+e.getCause().getMessage());
                    bw.newLine();
                }
            }
        }
        bw.write("本次测试一共出现"+number+"次异常");
        bw.flush();
        bw.close();
    }
}
