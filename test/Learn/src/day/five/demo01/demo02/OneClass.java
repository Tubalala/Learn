package day.five.demo01.demo02;

import day.five.demo01.MyClass;

/*
Java 中的四种权限修饰符
            public > protected > default > private
同一个类        YES     YES         YES     YES
同一个包        YES     YES         YES     NO
不同包          YES     YES         NO     NO
不同非子类      YES     NO         NO       NO
 */
public class OneClass extends MyClass {
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public OneClass() {
    }

    public OneClass(String name) {
        this.name = name;
    }
}
