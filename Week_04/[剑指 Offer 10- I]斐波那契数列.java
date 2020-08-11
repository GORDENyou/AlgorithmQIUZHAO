//写一个函数，输入 n ，求斐波那契（Fibonacci）数列的第 n 项。斐波那契数列的定义如下： 
//
// F(0) = 0,   F(1) = 1
//F(N) = F(N - 1) + F(N - 2), 其中 N > 1. 
//
// 斐波那契数列由 0 和 1 开始，之后的斐波那契数就是由之前的两数相加而得出。 
//
// 答案需要取模 1e9+7（1000000007），如计算初始结果为：1000000008，请返回 1。 
//
// 
//
// 示例 1： 
//
// 输入：n = 2
//输出：1
// 
//
// 示例 2： 
//
// 输入：n = 5
//输出：5
// 
//
// 
//
// 提示： 
//
// 
// 0 <= n <= 100 
// 
//
// 注意：本题与主站 509 题相同：https://leetcode-cn.com/problems/fibonacci-number/ 
// Related Topics 递归 
// 👍 46 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {


    public int fib(int n) {
        // 斐波那契数列就是将前两项相加，然后推测出后一项的过程
        // 由于递归的过程中会有很多重复计算的步骤，我们可以缓存起来，供我们以后使用。
        // 即使我们拥有了缓存，依旧会超时。
        // 我们原本是自顶向下的递推，现在我们尝试自低向上的进行递推
//        int[] cache = new int[n + 1];
//        return helper(n, cache);

        // 看了下大神的方法，甚至不需要数组！
        int a = 0, b = 1, sum;
        for (int i = 0; i < n; i++) {
            sum = (a + b) % 1000000007;
            a = b;
            b = sum;
        }
        return a;
    }

    private int helper(int n, int[] cache) {
        if(n <= 1){
            return n;
        }

        if (cache[n] == 0) {
            cache[n] = fib(n - 1) + fib(n - 2);
        }

        return cache[n];
    }
}
//leetcode submit region end(Prohibit modification and deletion)
