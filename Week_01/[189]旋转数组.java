//给定一个数组，将数组中的元素向右移动 k 个位置，其中 k 是非负数。 
//
// 示例 1: 
//
// 输入: [1,2,3,4,5,6,7] 和 k = 3
//输出: [5,6,7,1,2,3,4]
//解释:
//向右旋转 1 步: [7,1,2,3,4,5,6]
//向右旋转 2 步: [6,7,1,2,3,4,5]
//向右旋转 3 步: [5,6,7,1,2,3,4]
// 
//
// 示例 2: 
//
// 输入: [-1,-100,3,99] 和 k = 2
//输出: [3,99,-1,-100]
//解释: 
//向右旋转 1 步: [99,-1,-100,3]
//向右旋转 2 步: [3,99,-1,-100] 
//
// 说明: 
//
// 
// 尽可能想出更多的解决方案，至少有三种不同的方法可以解决这个问题。 
// 要求使用空间复杂度为 O(1) 的 原地 算法。 
// 
// Related Topics 数组 
// 👍 626 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public void rotate(int[] nums, int k) {
        // 首先想到的就是曾经接触过的方法，先倒置数组，时间复杂度为 O(logn)，然后根据 k 为界
        // 再次倒置数组， 时间复杂度同样为 O(logn)
        k %= nums.length;
        Inversion(nums, 0, nums.length);
//        printNums(nums);
        Inversion(nums, 0, k);
//        printNums(nums);
        Inversion(nums, k, nums.length);
//        printNums(nums);

    }

    private void Inversion(int[] nums, int start, int end) {
        int length = end + start;
        for (int i = start; i < length / 2; i++) {
            int temp = nums[i];
            nums[i] = nums[length - i - 1];
            nums[length - i - 1] = temp;
        }
    }

    private void printNums(int[] nums) {
        for (int num : nums) {
            System.out.print(num + ", ");
        }
        System.out.println("\n");
    }
}
//leetcode submit region end(Prohibit modification and deletion)
