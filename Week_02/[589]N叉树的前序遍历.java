//给定一个 N 叉树，返回其节点值的前序遍历。 
//
// 例如，给定一个 3叉树 : 
//
// 
//
// 
//
// 
//
// 返回其前序遍历: [1,3,5,6,2,4]。 
//
// 
//
// 说明: 递归法很简单，你可以使用迭代法完成此题吗? Related Topics 树 
// 👍 89 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    ArrayList<Integer> output = new ArrayList<>();

    public List<Integer> preorder(Node root) {
        //return method1(root);

        // 递归写法 时空度：O(n) O(long)

        if (root == null) {
            return output;
        }
        output.add(root.val);
        for (Node node : root.children) {
            preorder(node);
        }
        return output;
    }

    // 使用栈的结构实现遍历，代码不好理解。
    private List<Integer> method1(Node root) {
        Stack<Node> stack = new Stack<>();
        ArrayList<Integer> output = new ArrayList<>();
        if (root == null) {
            return output;
        }

        stack.push(root);
        while (!stack.isEmpty()) {
            Node node = stack.pop();
            output.add(node.val);
            for (int i = node.children.size() - 1; i >= 0; i--) {
                stack.add(node.children.get(i));
            }
        }
        return output;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
