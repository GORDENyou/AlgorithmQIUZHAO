学习笔记

不知不觉来到了第四周，算法不易，坚持！！

## 代码模版

### 递归

```java
public void recur(int level, int param){
	// terminator 终止条件
    if(level > MAX_LEVEL){
        // process result 执行结果
        return;
    }
    
    // process current logic 执行当前逻辑
    process(level, param);
    
    // drill down
    recur( level: level + 1, newParam);
    
    // restore current status
}
```

### 分治

```java
private static int divide_conquer(Problem problem){
    // recursion terminator
	if(problem == NULL){
        int res = process_last_result();
        return res;
    }
    
    // process current problem
    subProblems = split_problem(problem);
    
    res0 = divide_conquer(subProblems[0]);
    res1 = divide_conquer(subProblems[1]);
    
    // merge
    result = process_result(res0, res1);
    
    // revert the current level status
    return result;
}
```

## 动态规划思维总结（重要）

1. 打破思维惯性，形成机器思维
2. 理解复杂逻辑的关键
3. 这也是职业进阶的要领

机器擅长的事情就是循环和递归，我们要充分发挥机器这方面的优势。我们需要高度抽象解决问题的关键，不要在思维上人肉递归，学会让机器帮我们做事。

## 课后作业

## 

| 题目                                                         | 刷题次数 | 方法归类             | 备注                               |
| ------------------------------------------------------------ | -------- | -------------------- | ---------------------------------- |
| [斐波那契数列](https://leetcode-cn.com/problems/fei-bo-na-qi-shu-lie-lcof/) | 1        | 递归，自低向上的思想 | 终极DP就是自低向上的进行迭代。     |
| [不同路径](https://leetcode-cn.com/problems/unique-paths/)   | 1        | 二维数组             | 并没有用到DP的思路。               |
| [最小路径和](https://leetcode-cn.com/problems/minimum-path-sum/) | 1        | 二维数组             | 和上一题类似。                     |
| [最长公共子序列](https://leetcode-cn.com/problems/longest-common-subsequence/) | 1        | 二维数组，DP         | 经典题目，需要重视。               |
| [不同路径 II](https://leetcode-cn.com/problems/unique-paths-ii/) | 1        | 二维数组，DP         | 和上一题有所区别。初始化条件不同。 |
|                                                              |          |                      |                                    |
|                                                              |          |                      |                                    |
|                                                              |          |                      |                                    |