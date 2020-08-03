学习笔记

本周我们主要学习的是递归和回溯

不要感到羞愧，我们先把代码模版记忆下来：

### 分治模版代码（思路）：

```java
class divide_conquer(problem, param1, param2){
    // recursion terminator 递归终结者
	if(problem == null){
        println(result);
    }
    
    // prepare data 准备数据
    data = prepareData(problem);
    // 拆分为子问题
    subproblems = splitProblem(problem, data);
    
    // conquer subproblem 解决子问题
    subproblem1 = self.divide_conquer(subproblems[0], p1, ...);
    subproblem2 = self.divide_conquer(subproblems[1], p1, ...);
    subproblem3 = self.divide_conquer(subproblems[2], p1, ...);
    
    // process and generate the final result 处理并返回最终结果
    result = processResult(subresult1, subresult2, subresult3, ...);
    
    // revert the current level states 恢复当前级别状态。
}
```

### dfs 模版代码（递归写法）

```java
public List<List<Integer>> levelOrder(TreeNode root){
    List<List<Integer>> allResults = new ArrayList<>();
    if(root == null){
        return allResults;
    }
    travel(root, 0, allResults);
    return allResults;
}

// level 用来记录层级。也就是深度！
private void travel(TreeNode root, int level, List<List<Integer>> results){
    if(result.size() == level){
        results.add(new ArrayList<>());
    }
    results.get(level).add(root.val);
    if(root.left != null){
        travel(root.left, level + 1, results);
    }
    if(root.right != null){
        travel(root.right, level + 1,results);
    }
}
```

### dfs模版代码（非递归）

```java
// 其实非递归写法就是手动维护一个栈
void dfs(TreeNode node){
	if(node == null){
		return;
	}
    visited = new int[];
    stack = new Stack();
    
}
```



## 课堂作业

| 题目                                                         | 刷题次数 | 方法归类     | 备注                                                         |
| ------------------------------------------------------------ | -------- | ------------ | ------------------------------------------------------------ |
| [括号生成问题](https://leetcode-cn.com/problems/generate-parentheses/) | 1        | 深度优先遍历 | 不要人脑递归，我们只需要知道分解出的每一个动作。先把代码的大概套路记住，后面慢慢体会。 |
|                                                              |          |              |                                                              |

