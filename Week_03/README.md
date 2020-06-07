# Week3总结笔记
## 第7课 泛型递归、树的递归
树的面试题解法一般都是递归。
### 递归（Recursion）
通过函数体来进行的循环
思维要点： 
1. 不要人肉进行递归（最大误区）
2. 找到最近最简方法，将其拆解成可重复解决的问题（重复子问题）
3. 数学归纳法思维
## 第8课 分治、回溯
分治和回溯的本质是递归。
## 分治（Divide&Conquer）
分治是一种思想，递归是一种具体的编程方法。
找子问题，最后组合子问题返回。
```java
def divide_conquer(problem, param1, param2, ...):   
	# recursion terminator
    if problem is None:
		print_result
        return
    # prepare data
    data = prepare_data(problem)
    subproblems = split_problem(problem, data)
    # conquer subproblems
    subresult1 = self.divide_conquer(subproblems[0], p1, ...)
    subresult2 = self.divide_conquer(subproblems[1], p1, ...)
    subresult3 = self.divide_conquer(subproblems[2], p1, ...)
    ...
    # process and generate the final result
    result = process_result(subresult1, subresult2, subresult3, …)
    # revert the current level states
```
## 回溯（Backtracking）
回溯法采用试错的思想，它尝试分步的去解决一个问题。
回溯法通常用递归方法来实现，可能出现两种情况：
- 找到一个可能存在的正确的答案。
- 在尝试了所有可能的分步方法后宣告该问题没有答案。
在最坏的情况下，回溯法会导致一次复杂度为指数时间的计算。