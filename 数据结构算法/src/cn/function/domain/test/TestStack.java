package cn.function.domain.test;

import cn.function.domain.ArrayStack;
import cn.function.domain.ListStack;

public class TestStack {
    public static void main(String[] args) {
        ListStack stack = new ListStack();
        stack.push(2);
        stack.push(4);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        stack.push(4);
        System.out.println(stack.pop());
    }
}
