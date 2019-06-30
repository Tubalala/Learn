package cn.leetCode.t100d;

import java.util.ArrayList;
import java.util.List;

/*给定一个非负索引 k，其中 k ≤ 33，返回杨辉三角的第 k 行。
在杨辉三角中，每个数是它左上方和右上方的数的和。

示例:

输入: 3
输出: [1,3,3,1]
进阶：

你可以优化你的算法到 O(k) 空间复杂度吗？

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/pascals-triangle-ii
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。*/
public class t119 {
    /**
     * 获取杨辉三角的指定行
     * 直接使用组合公式C(n,i) = n!/(i!*(n-i)!)
     * 则第(i+1)项是第i项的倍数=(n-i)/(i+1);
     */
    public List<Integer> getRow(int rowIndex) {
        List<Integer> res = new ArrayList<>(rowIndex + 1);
        long cur = 1;
        for (int i = 0; i <= rowIndex; i++) {
            res.add((int) cur);
            cur = cur * (rowIndex-i)/(i+1);
        }
        return res;
    }
    /*public List<Integer> getRow(int rowIndex) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < rowIndex + 1; i++) {
            if (i == 1) {
                list = new ArrayList<>();
                list.add(1);
                list.add(1);
            } else if ( i == 0) {
                list = new ArrayList<>();
                list.add(1);
            } else {
                List<Integer> temp = new ArrayList<>();
                temp.add(1);
                for (int j = 0; j < list.size() - 1; j++) {
                    temp.add(list.get(j) + list.get(j + 1));
                }
                temp.add(1);
                list = temp;
            }
        }
        return list;
    }*/
}
