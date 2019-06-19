package leetcode.zero;

/**
 * 假设你正在爬楼梯。需要 n 阶你才能到达楼顶。
 * 每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
 */
public class Seventy {

    public int climbStairs(int n) {
        if (n < 4) {
            return n;
        }
        int l1 = 1;
        int l2 = 2;
        int l3;
        for (int i = 4; i <= n; i++) {
            l3 = l1 + l2;
            l1 = l2;
            l2 = l3;
        }
        return l2;
    }
}
