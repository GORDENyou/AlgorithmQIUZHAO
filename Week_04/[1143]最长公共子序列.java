//给定两个字符串 text1 和 text2，返回这两个字符串的最长公共子序列的长度。 
//
// 一个字符串的 子序列 是指这样一个新的字符串：它是由原字符串在不改变字符的相对顺序的情况下删除某些字符（也可以不删除任何字符）后组成的新字符串。 
//例如，"ace" 是 "abcde" 的子序列，但 "aec" 不是 "abcde" 的子序列。两个字符串的「公共子序列」是这两个字符串所共同拥有的子序列。
// 
//
// 若这两个字符串没有公共子序列，则返回 0。 
//
// 
//
// 示例 1: 
//
// 输入：text1 = "abcde", text2 = "ace" 
//输出：3  
//解释：最长公共子序列是 "ace"，它的长度为 3。
// 
//
// 示例 2: 
//
// 输入：text1 = "abc", text2 = "abc"
//输出：3
//解释：最长公共子序列是 "abc"，它的长度为 3。
// 
//
// 示例 3: 
//
// 输入：text1 = "abc", text2 = "def"
//输出：0
//解释：两个字符串没有公共子序列，返回 0。
// 
//
// 
//
// 提示: 
//
// 
// 1 <= text1.length <= 1000 
// 1 <= text2.length <= 1000 
// 输入的字符串只含有小写英文字符。 
// 
// Related Topics 动态规划 
// 👍 196 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        return method1(text1, text2);
    }

    private int method1(String text1, String text2) {
        // 我们需要借助一个 DP 数组
        int[][] dp = new int[text1.length() + 1][text2.length() + 1];
        for (int i = 1; i <= text1.length(); i++) {
            for (int j = 1; j <= text2.length(); j++) {
                if(text1.charAt(i - 1) == text2.charAt(j - 1)){
                    // 为什么是自己的左上角的数据加一，是因为避免 “absent” 和 “btt” 这样的字符串出现。（可以自己在表格中演算下结果）
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    // 这里是将当前步骤的对比演化为 子串 的对比， 十分巧妙！
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        return dp[text1.length()][text2.length()];
    }
}
//leetcode submit region end(Prohibit modification and deletion)
