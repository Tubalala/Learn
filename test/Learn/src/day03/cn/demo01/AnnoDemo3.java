package day03.cn.demo01;

/**
 * 注解本质上就是一个接口，
 * 该接口默认继承Annotation接口*/
/*
* 接口注解
* 只有下列数据类型
* 基本数据类型
* String
* 枚举
* 以上类型数组*/
public @interface AnnoDemo3 {
    int show1()default (12);//default 可以默认初始值
    //定义为int value()时可以省略
    String show2();

    Person per();
    Anno2 anno2();
    String[] strs();
}
