# 第6周第12课 动态规划

## 动态规划

本质：将一个复杂的问题分解成各种子问题，同时寻找他的重复性。

回顾：

- 递归

  ```java
  public void recur(int level, int param) { 
    // terminator 
    if (level > MAX_LEVEL) { 
      // process result 
      return; 
    }
    // process current logic 
    process(level, param); 
    // drill down 
    recur( level: level + 1, newParam); 
    // restore current status 
  }
  ```

- 分治

  ```python
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
    …
    # process and generate the final result 
    result = process_result(subresult1, subresult2, subresult3, …)
  	
    # revert the current level states
  ```

  

1. 人肉递归低效，很累
2. 找到最近简单方法，将其拆解成课重复解决的问题
3. 数学归纳法思维

动态规划和递归or分治 没有根本上的区别（关键看有无最优的子结构）

共性：找到重复子问题

差异性：最优子结构，中途可以淘汰次优解