package cn.function.domain;

public class ArrayStack {
    private int count = 0;
    private int size;
    private int[] items;

    public ArrayStack(int size) {
        this.size = size;
        this.items = new int[size];
    }

    public boolean push(int item){
        if (count == items.length -1 ) {
            return false;
        }
        items[count] = item;
        count++;
        return true;
    }

    public int pop(){
        if (count == 0) {
            return Integer.MIN_VALUE;
        }
        count--;
        return items[count];
    }

}
