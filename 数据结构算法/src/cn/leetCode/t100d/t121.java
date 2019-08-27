package cn.leetCode.t100d;
/*给定一个数组，它的第 i 个元素是一支给定股票第 i 天的价格。

如果你最多只允许完成一笔交易（即买入和卖出一支股票），设计一个算法来计算你所能获取的最大利润。

注意你不能在买入股票前卖出股票。

示例 1:

输入: [7,1,5,3,6,4]
输出: 5
解释: 在第 2 天（股票价格 = 1）的时候买入，在第 5 天（股票价格 = 6）的时候卖出，最大利润 = 6-1 = 5 。
     注意利润不能是 7-1 = 6, 因为卖出价格需要大于买入价格。
示例 2:

输入: [7,6,4,3,1]
输出: 0
解释: 在这种情况下, 没有交易完成, 所以最大利润为 0。
输入: [7,1,4,3,-1]
来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。*/
public class t121 {
    /*public int maxProfit(int[] prices) {
        if(prices.length<1)
            return 0;
        int[] min = new int[prices.length];
        min[0] = prices[0];
        int result = 0;
        for(int i = 1 ;i <prices.length;i++){
            if(prices[i]<min[i-1]){
                min[i] = prices[i];
            }else {
                min[i] = min[i-1];
            }
            result = Math.max(result,prices[i] - min[i]);
        }
        return result;
    }*/
    /*public static int maxProfit(int[] prices) {
        int res = 0;
        int j = 0;
        for (int i = 0; i < prices.length - 1; i++) {
            j = i + 1;
            while (j < prices.length && prices[j] - prices[i] >= 0) {
                if (res == 0) {
                    res = prices[j] - prices[i];
                }else {
                    int sum = prices[j] - prices[i];
                    if (sum > res){
                        res = sum;
                    }
                }
                j++;
            }
        }
        return res;
    }*/

    public static int maxProfit(int[] prices) {
        if (prices.length == 0) {
            return 0;
        }
        int ret = 0;
        int min = prices[0];
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < min) {
                min = prices[i];
            }else {
                ret = Math.max(ret,prices[i]-min);
            }
        }
        return ret;
    }

    public static void main(String[] args) {
        int[] nums = {7,1,5,3,6,4};
        System.out.println(maxProfit(nums));
    }
}
