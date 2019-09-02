package cn.function.domain;

public class ListDemo {
    static class Node {
        Node next = null;// 节点的引用，指向下一个节点
        int data;// 节点的对象，即内容

        public Node(int data) {
            this.data = data;
        }
    }
    private Node head = null;
    private Node end = null;

    public boolean add(int data){
        Node node = new Node(data);
        if (head == null) {
            head = node;
            return true;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = node;
        return true;
    }

    public int remove(){
        if (head != null) {
            Node temp = head;
            head = head.next;
            return temp.data;
        }
        return -1;
    }

    public static void main(String[] args) {
        ListDemo list = new ListDemo();
        list.add(12);
        list.add(13);
        System.out.println(list.remove());
        System.out.println(list.remove());
        System.out.println(list.remove());
    }
}

