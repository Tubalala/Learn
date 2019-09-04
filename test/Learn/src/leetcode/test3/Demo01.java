package leetcode.test3;

import java.util.ArrayList;
/*
设计一个支持 push，pop，top 操作，并能在常数时间内检索到最小元素的栈。

push(x) -- 将元素 x 推入栈中。
pop() -- 删除栈顶的元素。
top() -- 获取栈顶元素。
getMin() -- 检索栈中的最小元素。
示例:

MinStack minStack = new MinStack();
minStack.push(-2);
minStack.push(0);
minStack.push(-3);
minStack.getMin();   --> 返回 -3.
minStack.pop();
minStack.top();      --> 返回 0.
minStack.getMin();   --> 返回 -2.
* */
public class Demo01 {
    class MinStack {
        private ArrayList<Integer> arr;
        private int count = -1;
        /** initialize your data structure here. */
        public MinStack() {
            arr = new ArrayList<>();
        }
        public void push(int x) {
            arr.add(x);
            count++;
        }

        public void pop() {
            arr.remove(count);
            count--;
        }

        public int top() {
            if (arr.isEmpty()) {
                return -1;
            }else {
                Integer in = arr.get(count);
                return in;
            }
        }

        public int getMin() {
            int min = arr.get(0);
            for (Integer in : arr) {
                if (in < min) {
                    min = in;
                }
            }
            return min;
        }
    }

}
