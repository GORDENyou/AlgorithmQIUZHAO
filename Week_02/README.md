学习笔记

学习在于每日稳定且持续的滴水穿石的积累。希望自己能养成这样良好的习惯。

本周是第二周，第一周的任务完成的并不完美，还有很多方面有待提高：

1. 贯彻五毒神掌的思想，遇到有问题的题目敢于放手学习。
2. 做好日常生活的规划，提高自己的注意力和精神状态。
3. 勇于思考对于自己有困难的问题，不要在思想上懒惰。

第二周，不要怂，就是干。

## 示例代码

### 二叉树遍历的递归实现

```java
// 前序遍历
void preOrder(TreeNode node){
    if(node != null){
        visited(node);
        preOrder(node.left);
        preOrder(node.right);
    }
}

// 中序遍历
void inOrder(TreeNode node){
    if(node != null){
        inOrder(node.left);
        visited(node);
        inOrder(node.right);
    }
}

// 后序遍历
void postOrder(TreeNode node){
    if(node != null){
        postOrder(node.left);
        postOrder(node.right);
        visited(node);
    }
}
```



## 课后作业

| 题目                                                         | 刷题次数 | 方法归类          | 备注                                                     |
| ------------------------------------------------------------ | -------- | ----------------- | -------------------------------------------------------- |
| [二叉树的中序遍历](https://leetcode-cn.com/problems/binary-tree-inorder-traversal/) | 1        | 递归，手动维护栈  | 有些代码不那么好理解，可以先记忆下来。                   |
| [二叉树的前序遍历](https://leetcode-cn.com/problems/binary-tree-preorder-traversal/) | 1        | 递归，栈          |                                                          |
| [N 叉树的后序遍历](https://leetcode-cn.com/problems/n-ary-tree-postorder-traversal/) | 1        | 递归，栈          | 栈的代码很不好理解                                       |
| [N 叉树的前序遍历](https://leetcode-cn.com/problems/n-ary-tree-preorder-traversal/description/) | 1        | 递归，栈          |                                                          |
| [N 叉树的层序遍历](https://leetcode-cn.com/problems/n-ary-tree-level-order-traversal/) | 1        | 队列              | 了解基本的数据结构，并加以巧妙运用！                     |
| [最小的 k 个数](https://leetcode-cn.com/problems/zui-xiao-de-kge-shu-lcof/) | 1        | 堆(PriorityQueue) | 本题有很多解法，需要以后补充学习。                       |
| [滑动窗口最大值](https://leetcode-cn.com/problems/sliding-window-maximum/) | 1        | 堆                | **使用堆超时了，还有待优化！！！**可以尝试双端队列等等。 |
| [丑数](https://leetcode-cn.com/problems/chou-shu-lcof/)      | 1        | 堆                | **有巨大的优化空间！！！**以后需要尝试动态规划。         |
|                                                              |          |                   |                                                          |

