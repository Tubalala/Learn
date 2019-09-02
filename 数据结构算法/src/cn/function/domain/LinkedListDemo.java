package cn.function.domain;


import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListDemo<T> {
    private static class Node<T> {
        T item;//存放数据的泛型
        Node<T> next;//上一个节点 这里这个Node 指向自己本身
        Node<T> prev;//下一个节点 这里这个Node 也指向自己本身

        Node(Node<T> prev, T element, Node<T> next) {
            this.item = element;
            this.next = next;
            this.prev = prev;
        }
    }
    private Node<T> pre;
    private Node<T> next;
    private int size;

    public LinkedListDemo() {
        size = 0;
        pre = new Node<T>(null,null,null);
        next = new Node<T>(pre,null,null);
        pre.next = next;
    }

    public boolean add(T data){
        Node<T> node = new Node<T>(next.prev,data,next);
        next.prev.next = node;
        next.prev = node;
        size++;
        return true;
    }


    public T remove(){
        Node<T> p;
        p = pre.next;
        p.prev.next = p.next;
        p.next.prev = p.prev;
        size--;
        return p.item;
    }
    public T remove(int index){
        Node<T> node = getNode(index);
        return node.item;
    }

    public Node<T> getNode(int index){
        Node<T> p = null;
        if (index < 0 | index >= size) {
            throw new IndexOutOfBoundsException("索引越界");
        }
        if (index < size / 2) {
            //从左开始查
            for (int i = 0; i < index; i++) {
                p = pre.next;
            }
        }else {
            //从右开始查
            for (int i = size; i > index; i--) {
                p = next.prev;
            }
        }
        return p;
    }
    public int size(){
        return size;
    }

    public ArrayList<T> toArray(){
        Node<T> p = pre.next;
        ArrayList<T> ts = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            ts.add(p.item);
            p=p.next;
        }

        return ts;
    }

    public static void main(String[] args) {
        LinkedList<Object> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        LinkedListDemo<Integer> listInt = new LinkedListDemo<>();
        listInt.add(1);
        listInt.add(2);
        listInt.add(5);
        /*System.out.println(listInt.remove());
        System.out.println(listInt.remove());
        System.out.println(listInt.remove());*/
        ArrayList<Integer> list1 = listInt.toArray();
        for (Integer integer : list1) {
            System.out.print(integer);
        }
    }

}


