//给定一个二叉树，返回它的中序 遍历。 
//
// 示例: 
//
// 输入: [1,null,2,3]
//   1
//    \
//     2
//    /
//   3
//
//输出: [1,3,2] 
//
// 进阶: 递归算法很简单，你可以通过迭代算法完成吗？ 
// Related Topics 栈 树 哈希表 
// 👍 597 👎 0


//leetcode submit region begin(Prohibit modification and deletion)

import java.util.ArrayList;
import java.util.Stack;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {

        // 递归实现超时了，要求是迭代方法，迭代和递归有什么不同？
        // 反思：其实自己写的代码是有问题的。函数的递归调用存在问题。
        //return method1(root);

        // 这个才是正确的递归实现！！！
        //return method2(root);

        // 手动维护一个栈试试：
        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode cur = root;
        while(cur != null || !stack.empty()){
            while(cur != null){
                stack.add(cur);
                cur = cur.left;
            }
            cur = stack.pop();
            // 将先弹出的结点访问
            result.add(cur.val);
            cur = cur.right;
        }
        return result;
    }

    private List<Integer> method2(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        helper(result, root);
        return result;
    }

    private void helper(List<Integer> list, TreeNode node) {
        if (node != null) {
            if (node.left != null) {
                helper(list, node.left);
            }
            list.add(node.val);
            if (node.right != null) {
                helper(list, node.right);
            }
        }
    }

    private List<Integer> method1(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root != null) {
            if (root.left != null) {
                inorderTraversal(root.left);
            }
            result.add(root.val);
            if (root.right != null) {
                inorderTraversal(root.right);
            }
        }
        return result;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
