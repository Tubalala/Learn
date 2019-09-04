package day.five.demo01;
/*
Java 中的四种权限修饰符
            public > protected > default > private
同一个类        YES     YES         YES     YES
同一个包        YES     YES         YES     NO
不同包          YES     YES         NO     NO
不同非子类      YES     NO         NO       NO
 */
public class MyClass {
    public String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MyClass() {
    }

    public MyClass(String name) {
        this.name = name;
    }
}
