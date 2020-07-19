//给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。 
//
// 示例: 
//
// 输入: [0,1,0,3,12]
//输出: [1,3,12,0,0] 
//
// 说明: 
//
// 
// 必须在原数组上操作，不能拷贝额外的数组。 
// 尽量减少操作次数。 
// 
// Related Topics 数组 双指针 
// 👍 654 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public void moveZeroes(int[] nums) {

//        method1(nums);
        method2(nums);
    }

    // 借鉴 leetcode，代码易读，逻辑严谨，值得学习！
    private void method2(int[] nums) {
        if(nums == null || nums.length == 0) return;
        // insertPos 用于记录插入位置
        int insertPos = 0;
        for (int num : nums) {
            if(num != 0){
                nums[insertPos++] = num;
            }
        }

        while(insertPos < nums.length){
            nums[insertPos++] = 0;
        }
    }

    // 自己的代码可阅读性不太好。时空度： O(n),O(1)
    // index 用来记录插入坐标，count 用于记录 0 的个数，i 为遍历游标
    private void method1(int[] nums) {
        int index = 0, count = 0, i = 0;
        while (i < nums.length) {
            if (nums[i] == 0) {
                count++;
            } else {
                if (index != i) {
                    nums[index] = nums[i];
                }
                index++;
            }
            i++;
        }
        while (count > 0) {
            nums[nums.length - count] = 0;
            count--;

        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)
