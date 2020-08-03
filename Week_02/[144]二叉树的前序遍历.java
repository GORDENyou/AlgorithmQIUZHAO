//给定一个二叉树，返回它的 前序 遍历。 
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
//输出: [1,2,3]
// 
//
// 进阶: 递归算法很简单，你可以通过迭代算法完成吗？ 
// Related Topics 栈 树 
// 👍 324 👎 0


//leetcode submit region begin(Prohibit modification and deletion)


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
    public List<Integer> preorderTraversal(TreeNode root) {
        // 递归方法
        //return method1(root);

        // 其实我这个写成了 bfs
        //return bfs(root);

        // 栈的正确写法，时空度都为 O(n)
        return method2(root);
    }

    private List<Integer> method2(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        LinkedList<TreeNode> stack = new LinkedList<>();
        if(root == null) return result;
        stack.add(root);
        while(!stack.isEmpty()){
            TreeNode node = stack.pollLast();
            result.add(node.val);
            if(node.right != null){
                stack.add(node.right);
            }
            if(node.left != null){
                stack.add(node.left);
            }
        }
        return result;
    }

    private List<Integer> bfs(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        LinkedList<TreeNode> queue = new LinkedList<>();
        TreeNode cur = root;
        if (root == null) return result;
        queue.add(cur);
        while (!queue.isEmpty()) {
            cur = queue.pollFirst();
            result.add(cur.val);
            if (cur.left != null) queue.add(cur.left);
            if (cur.right != null) queue.add(cur.right);
        }
        return result;
    }

    private List<Integer> method1(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        helper(result, root);
        return result;
    }

    private void helper(List<Integer> list, TreeNode node) {
        if (node != null) {
            list.add(node.val);
            if (node.left != null) {
                helper(list, node.left);
            }
            if (node.right != null) {
                helper(list, node.right);
            }
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)
