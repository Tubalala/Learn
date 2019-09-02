package cn.function.domain;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class ArrayListDemo{
    private int[] ints;
    private int size = 0;
    //初始化数组
    public ArrayListDemo() {this(10);}
    public ArrayListDemo(int initialCapacity) {ints = new int[initialCapacity];}
    //按索引获取值
    public int get(int index){
        if (index > ints.length - 1) {
            System.out.println("index error");
            return -1;
        }else {
            return ints[index];
        }
    }
    //获取数组长度
    public int size(){
        return ints.length;
    }
    //返回一个实例化的数组
    public int[] toList(){
        return ints;
    }
    //根据索引移除元素
    public boolean remove(int index){
        int j = index;
        if (index >= ints.length) {
            return false;
        }else {
            while (j<ints.length - 1){
                j++;
                ints[index] = ints[j];
                index++;
            }
            return true;
        }
    }


    //添加数据
    public boolean add(int num){
        if (size>ints.length){
            grow();
        }
        ints[size] = num;
        size++;
        return true;
    }
    //按索引添加数据
    public void set(int index,int num){
        while (index >= ints.length) {
            grow();
        }
        ints[index] = num;
    }
    //扩容
    public void grow(){
        int newCapacity = ints.length + ( ints.length >> 1 ) ;
        int[] newInts = new int[newCapacity];
        for (int i = 0; i < ints.length; i++) {
            newInts[i] = ints[i];
        }
        ints = newInts;
    }

    public static void main(String[] args) {
        ArrayListDemo list = new ArrayListDemo();
        list.add(1);
        list.add(10);
        list.add(13);
        list.add(13);
        list.add(13);
        list.remove(0);
        System.out.println(list.size());
        System.out.println(list.get(1));
        list.set(12,122);
        System.out.println(list.get(12));
        System.out.println(list.size());
        CopyOnWriteArrayList<String> list1 = new CopyOnWriteArrayList<>();
        Vector<String> strings = new Vector<>();
        ArrayList<Object> list2 = new ArrayList<>();
        Collections.synchronizedCollection(list2);
    }

}
