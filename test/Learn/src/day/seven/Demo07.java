package day.seven;

import org.omg.CORBA.Object;

import java.util.ArrayList;
import java.util.Collection;

public class Demo07 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<Number> list2 = new ArrayList<>();
        ArrayList<Double> list3 = new ArrayList<>();

        getElement1(list);
//        getElement1(list1);//报错
        getElement1(list2);
        getElement1(list3);

//        getElement2(list);//报错
//        getElement2(list1);//报错
        getElement2(list2);
//        getElement2(list3);//报错
    }
    //泛型上限： 必须是Number类型的子类
    public static void getElement1(Collection<? extends Number> coll){}
    //泛型下限： 必须是Number类型的父类
    public static void getElement2(Collection<? super Number> coll){}
}