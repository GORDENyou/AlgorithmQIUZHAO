//给定一个 N 叉树，返回其节点值的后序遍历。 
//
// 例如，给定一个 3叉树 : 
//
// 
//
// 
//
// 
//
// 返回其后序遍历: [5,6,3,2,4,1]. 
//
// 
//
// 说明: 递归法很简单，你可以使用迭代法完成此题吗? Related Topics 树 
// 👍 87 👎 0


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

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

class Solution {
    public List<Integer> postorder(Node root) {
        LinkedList<Integer> result = new LinkedList<>();
        Stack<Node> stack = Stack<>();
        if(root == null){
            return result;
        }
        stack.push(root);
        while(!stack.isEmpty()){
            Node node = stack.pop();
            // 这里其实运用了后进先出，放在最前面的反而最后出来。
            result.addFirst(node.val);
            for(Node item: node.children){
                if(item != null){
                    stack.push(item);
                }
            }
        }
        return result;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
