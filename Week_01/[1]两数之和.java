//给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。 
//
// 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。 
//
// 
//
// 示例: 
//
// 给定 nums = [2, 7, 11, 15], target = 9
//
//因为 nums[0] + nums[1] = 2 + 7 = 9
//所以返回 [0, 1]
// 
// Related Topics 数组 哈希表 
// 👍 8679 👎 0


import java.util.Arrays;
import java.util.HashMap;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] twoSum(int[] nums, int target) {
//        return method1(nums, target);

//        return method2(nums, target);

//        return method3(nums, target);

        return method4(nums, target);
    }

    // 其实不太理解，空间换时间，这里用数组存储了每一个数字的位置。
    // 时空度： O(n),O(n)
    private int[] method4(int[] nums, int target) {
        int v = 2 << 10; // 为运算的速度比我们使用十进制要快很多。
        int max = v - 1;
        int[] array = new int[v];
        for (int i = 0; i < nums.length; i++) {
            int temp = target - nums[i];
            if(array[temp & max] != 0){
                return new int[]{array[temp & max] - 1, i};
            } else{
                array[nums[i] & max] = i + 1;
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    // 暴力破解，不过多解释
    private int[] method3(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if(nums[i] + nums[j] == target){
                    return new int[]{i, j};
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    // leetcode 上的一遍哈希
    // 时空度：O(n), O(1)
    // 实际上这里有个疑问：containsKey()这个函数的时间复杂度。
    private int[] method2(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                return new int[]{map.get(target - nums[i]),i};
            } else {
                map.put(nums[i], i);
            }
        }

        throw new IllegalArgumentException("No two sum solution");
    }

    // 这道题自己的思路遇到了点问题。我以为数组是已经排好序的。
    // 如果原始数组已经拍好了序，我的思路就可以使用
    // 时空度：O(n),O(1)
    private int[] method1(int[] nums, int target) {
        int[] result = new int[2];
        int p1 = 0, p2 = 1, temp = 0;
        while (p1 < nums.length - 1) {
//            System.out.println("p1:" + p1);
//            System.out.println("p2:" + p2);
            if (nums[p1] < target) {
                result[0] = p1;
                temp = target - nums[p1];
                System.out.println("result[0]:" + result[0]);
                System.out.println("temp:" + temp);
            } else {
                break;
            }
            while (p2 < nums.length && nums[p2] <= temp) {
                if (nums[p2] == temp) {
                    result[1] = p2;
                    System.out.println("result[0]:" + result[0]);
                    return result;
                }
                p2++;
            }
            p1++;
//            System.out.println("p1:" + p1);
        }

        return result;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
