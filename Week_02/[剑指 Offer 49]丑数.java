//我们把只包含质因子 2、3 和 5 的数称作丑数（Ugly Number）。求按从小到大的顺序的第 n 个丑数。 
//
// 
//
// 示例: 
//
// 输入: n = 10
//输出: 12
//解释: 1, 2, 3, 4, 5, 6, 8, 9, 10, 12 是前 10 个丑数。 
//
// 说明: 
//
// 
// 1 是丑数。 
// n 不超过1690。 
// 
//
// 注意：本题与主站 264 题相同：https://leetcode-cn.com/problems/ugly-number-ii/ 
// Related Topics 数学 
// 👍 54 👎 0


import java.util.PriorityQueue;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int nthUglyNumber(int n) {
        // 目前学习的是堆，尝试用堆来解决问题。
        int[] baseNums = new int[]{2, 3, 5};
        // 这里需要仔细想想用大顶还是小顶堆。
        PriorityQueue<Long> queue = new PriorityQueue<>();
        queue.add(1L);
        int count = 0; // 用于计数
        while(!queue.isEmpty()){
            long cur = queue.poll(); // 堆顶出

            if(++count == n){
                return (int)cur;
            }

            for (int num : baseNums) {
                if(!queue.contains(cur * num)){
                    queue.add(num * cur);
                }
            }
        }

        return -1;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
