package leetcode.one;

/**
 * 给定一个数组，它的第 i 个元素是一支给定股票第 i 天的价格。
 * 设计一个算法来计算你所能获取的最大利润。你可以尽可能地完成更多的交易（多次买卖一支股票）。
 * 注意：你不能同时参与多笔交易（你必须在再次购买前出售掉之前的股票）。
 */
public class TwentyTwo {
    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
    }

    public int maxProfit2(int[] prices) {
        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]) {
                profit += prices[i] - prices[i - 1];
            }
        }
        return profit;
    }

    public static int maxProfit(int[] prices) {
        int profit = 0;
        int in;
        int last = prices.length - 1;
        for (int i = 0; i < last; i++) {
            while (i < last && prices[i] > prices[i + 1]) {
                i++;
            }
            in = prices[i++];
            while (i < last && prices[i + 1] > prices[i]) {
                i++;
            }
            if (i < last + 1) {
                profit += prices[i] - in;
            }
        }
        return profit;
    }

//    public int maxProfit3(int[] prices) {
//        int profit = 0;
//        int max = prices[0];
//        for (int i = 1; i < prices.length; i++) {
//
//        }
//    }
}
