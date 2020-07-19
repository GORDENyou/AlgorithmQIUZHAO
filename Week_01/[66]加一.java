//给定一个由整数组成的非空数组所表示的非负整数，在该数的基础上加一。 
//
// 最高位数字存放在数组的首位， 数组中每个元素只存储单个数字。 
//
// 你可以假设除了整数 0 之外，这个整数不会以零开头。 
//
// 示例 1: 
//
// 输入: [1,2,3]
//输出: [1,2,4]
//解释: 输入数组表示数字 123。
// 
//
// 示例 2: 
//
// 输入: [4,3,2,1]
//输出: [4,3,2,2]
//解释: 输入数组表示数字 4321。
// 
// Related Topics 数组 
// 👍 502 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] plusOne(int[] digits) {
//        return method1(digits);
        return method2(digits);
    }

    // leecode 上的方法，确实非常妙！
    // 时空度： O(n),O(n)
    private int[] method2(int[] digits) {
        for(int i = digits.length -1; i >= 0; i--){
            digits[i]++;
            digits[i] %= 10;
            // 不等于 0 ，说明没有进位。一旦没有进位，也就没必要继续了！
            if(digits[i] != 0) return digits;
        }
        // 如果还没有返回答案，说明有进位，而且源数字全为 9
        // 后面的位数全为 0 ，直接初始化即可。
        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }

    // 自己的解法说明对题目了解的不够深度。代码不够简洁！
    // 时空度：O(n), O(n)
    private int[] method1(int[] digits) {
        digits[digits.length - 1]++;
        int carry = 0;
        for (int i = digits.length - 1; i >= 0; i--) {
            if ((digits[i] = digits[i] + carry) >= 10) {
                digits[i] %= 10;
                carry = 1;
            } else {
                carry = 0;
            }
            System.out.println("after: " + digits[i]);
        }

        if (carry == 1) {
            int[] result = new int[digits.length + 1];
            System.arraycopy(digits, 0, result, 1, digits.length);
            result[0] = 1;
            return result;
        } else {
            return digits;
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)
