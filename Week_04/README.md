# Week4总结笔记

## 第9课 深度优先搜索和广度优先搜索

搜索：一般就是把所有的节点全部遍历一次，找到想要的结果。

​	-遍历：

- 每个节点都要访问一次
- 每个节点仅仅要访问一次
- 对于节点的访问顺序不限
  -  深度优先：depth ﬁrst search 
  -  广度优先：breadth ﬁrst search
  - 优先级优先（更加适用于现实中的很多业务场景）--->启发式搜索

### 深度优先搜索（DFS   Depth-First-Search）

先走到底。

递归写法：

```java
visited = set()  
def dfs(node, visited):
	if node in visited: # terminator
        # already visited
        return
    visited.add(node)
    # process current node here.
    ...
    for next_node in node.children():
		if not next_node in visited:
			dfs(next node, visited
```

非递归写法：

```java
def DFS(self, tree):
	if tree.root is None:
		return []
    visited, stack = [], [tree.root]
    while stack:
		node = stack.pop()
        visited .add(node)
       	process (node)
        nodes = generate_related_nodes(node)
        stack .push(nodes)
# other processing work
...
```



### 广度优先搜索（BFS Breadth-First-Search）

不再是用递归or栈，用队列。 （一层一层的遍历）

```java
def BFS(graph, start, end):
	queue = []
    queue .append([start])
    visited .add(start)
    while queue:
    	node = queue.pop()
        visited .add(node)
        process(node)
        nodes = generate_related_nodes(node)
        queue .push(nodes)
# other processing work
...
```

## 第10课 贪心算法 Greedy

贪心算法是一种在每一步选择中都采取在当前状态下最好或最优（即最有利）的选择，从而希望导致结果是全局最好或最优的算法。 ----->很可能不能导致结果是全局最优。

贪心：当下做全局最优判断

回溯：能够回退

动态规划：最有判断+回退

心算法 Greedy 贪心法可以解决一些最优化问题，如：求图中的最小生成树、求哈夫曼编码 等。然而对于工程和生活中的问题，贪心法一般不能得到我们所要求的答案。 


一旦一个问题可以通过贪心法来解决，那么贪心法一般是解决这个问题的最 好办法。由于贪心法的高效性以及其所求得的答案比较接近最优结果，贪心 法也可以用作辅助算法或者直接解决一些要求结果不特别精确的问题

适用贪心算法的场景：简单地说，问题能够分解成子问题来解决，子问题的最优解能递推到最终 问题的最优解。这种子问题最优解称为最优子结构。

## 第11课 二分查找

二分查找的前提：

1. 目标函数单调性（单调递增或者递减）
2. 存在上下界（bounded）
3. 能够通过索引访问（index accessible）

代码模板：

```python
left, right = 0, len(array) - 1
while left <= right:
	mid = (left + right) / 2
    if array[mid] == target:
    	# find the target!!
        break or return result
    elif array[mid] < target:
    	left = mid + 1
    else:
    	right = mid - 1
```

生活中用的更多的是牛顿迭代法。
