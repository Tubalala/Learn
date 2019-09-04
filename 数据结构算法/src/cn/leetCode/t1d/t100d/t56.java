package cn.leetCode.t1d.t100d;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/*给出一个区间的集合，请合并所有重叠的区间。

示例 1:

输入: [[1,3],[2,6],[8,10],[15,18]]
输出: [[1,6],[8,10],[15,18]]
解释: 区间 [1,3] 和 [2,6] 重叠, 将它们合并为 [1,6].
示例 2:

输入: [[1,4],[4,5]]
输出: [[1,5]]
解释: 区间 [1,4] 和 [4,5] 可被视为重叠区间。

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/merge-intervals
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。*/
public class t56 {
    public static int[][] merge(int[][] intervals) {
        if(intervals == null || intervals.length < 2){
            return intervals;
        }
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
        });
        ArrayList<int[]> res = new ArrayList<>();
        int len = intervals.length;
        for(int i = 0 ; i < len  ; i ++) {
            int[] temp = new int[2];
            temp[0] = intervals[i][0];
            temp[1] = intervals[i][1];
            while(i < len - 1 &&temp[1] >= intervals[i + 1][0]) {//寻找本区间的可合并区间，有的话就合并
                temp[1] = Math.max(temp[1],intervals[i + 1][1]);
                i++;//标记到下一个待确认区间
            }
            res.add(temp);
        }
        int[][] arr = new int[res.size()][2];
        res.toArray(arr);
        return arr;
    }

    public static void main(String[] args) {
        int[][] num = {{1,4},{4,5},{2,3}};
        int[][] merges = merge(num);
        String string = Arrays.toString(merges);
        System.out.println(string);
    }
    /*public static int[][] merge(int[][] intervals) {
        if(intervals == null || intervals.length < 2){
            return intervals;
        }
        ArrayList<int[]> sum = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        for (int[] ints : intervals) {
            list1.add(ints[0]);
            list2.add(ints[ints.length-1]);
        }
        for (int i = 0; i < list1.size(); i++) {
            int min = list1.get(i);
            if (i + 1 == list1.size()) {
                int[] temp = {min,Math.max(list2.get(i-1),list2.get(i))};
                sum.add(temp);
                break;
            }
            if (list1.get(i + 1) <= list2.get(i)) {
                while (list1.get(i + 1) <= list2.get(i)) {
                    i++;
                    min = Math.min(min,list1.get(i));
                    if (i == list1.size() - 1) {
                        int[] temp = {min,Math.max(list2.get(i-1),list2.get(i))};
                        sum.add(temp);
                        int[][] arr = new int[sum.size()][2];
                        sum.toArray(arr);
                        return arr;
                    }
                }
                int[] temp = {min,Math.max(list2.get(i-1),list2.get(i))};
                sum.add(temp);
            }else {
                int[] temp = {min,list2.get(i)};
                sum.add(temp);

            }
        }
        int[][] arr = new int[sum.size()][2];
        sum.toArray(arr);
        return arr;
        *//*for (int i = 0; i < list1.size(); i++) {
            int min = list1.get(i);
            while (list1.get(i) <= list2.get(i + 1)) {
                i++;
                if (i == list1.size() - 1) {
                    break;
                }
            }
            int[] temp = {min,Math.max(list2.get(i-1),list2.get(i-2))};
            sum[count] = temp;
            count++;

        }*//*
    }*/
}
