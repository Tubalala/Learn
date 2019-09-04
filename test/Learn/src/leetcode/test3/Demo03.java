package leetcode.test3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/*
* 数据流的中位数
中位数是有序列表中间的数。如果列表长度是偶数，中位数则是中间两个数的平均值。

例如，

[2,3,4] 的中位数是 3

[2,3] 的中位数是 (2 + 3) / 2 = 2.5

设计一个支持以下两种操作的数据结构：

void addNum(int num) - 从数据流中添加一个整数到数据结构中。
double findMedian() - 返回目前所有元素的中位数。
示例：

addNum(1)
addNum(2)
findMedian() -> 1.5
addNum(3)
findMedian() -> 2
进阶:

如果数据流中所有整数都在 0 到 100 范围内，你将如何优化你的算法？
如果数据流中 99% 的整数都在 0 到 100 范围内，你将如何优化你的算法？*/
public class Demo03 {
    //超时
   /* class MedianFinder {
        private ArrayList<Integer> arr;
        public MedianFinder() {
            arr = new ArrayList<>();
        }

        public void addNum(int num) {
            arr.add(num);
        }

        public double findMedian() {
            Collections.sort(arr);
            double mid = 0;
            if (arr.size() % 2 == 0) {
                mid = (double)(arr.get(arr.size()/2-1) + arr.get(arr.size()/2))/2;
                return mid;
            }else {
                return arr.get(arr.size()/2);
            }

        }
    }*/

    class MedianFinder {
        private ArrayList<Integer> min;
        private int[] max;
        private int conut = 0;
        /** initialize your data structure here. */
        public MedianFinder() {
            min = new ArrayList<>();
        }

        public void addNum(int num) {


        }

        /*public double findMedian() {

        }*/
    }
    public static void main(String[] args) {
        System.out.println();
    }
}
