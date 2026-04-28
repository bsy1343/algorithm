# [Platinum I] Modified Treap - 17331

[문제 링크](https://www.acmicpc.net/problem/17331)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 13, 정답: 7, 맞힌 사람: 6, 정답 비율: 60.000%

### 분류

다이나믹 프로그래밍, 누적 합

### 문제 설명

<p>We are given a special kind of binary search tree. By definition, the&nbsp;<b>key</b>&nbsp;of any node in the binary search tree is strictly greater than the key of the node&#39;s left child, but is strictly less than the key of the node&#39;s right child.</p>

<p>On the other hand, each node of the binary search tree has a&nbsp;<b>priority</b>, where the priority of each node is strictly less than the priority of the node&#39;s children.</p>

<p>It is already known that all of the node keys in the tree are distinct, and that all of the node priorities in the tree are also distinct. Now we arrive at an interesting conclusion: if we can determine the keys and priorities of all the nodes in the tree, then the structure of the tree can also be determined. This is because we can think of this tree as one that&#39;s construct by inserting all of the nodes in order of ascending priority, where the binary search tree nodes are compared by their keys.</p>

<p>We define the&nbsp;<b>depth</b>&nbsp;of a node in the tree as its distance from the root node plus 1. Thus, the root node itself will have a depth of 1.</p>

<p>Other than a key and a priority, each node also has an&nbsp;<b>access frequency</b>. We define a node&#39;s&nbsp;<b>access cost within the tree</b>&nbsp;to be its access frequency multiplied by its depth. The access cost of the entire tree is defined as the sum of the access costs amongst all its nodes.</p>

<p>Now, given each node&#39;s key, priority, and access frequency, you may modify the priority of some number of nodes at an additional&nbsp;<b>modification cost</b>&nbsp;of&nbsp;<var>K</var>&nbsp;for each node&#39;s priority changed. You may change the priority of nodes to any real number, but the change must ensure that the priorities of all the nodes afterwards remain distinct. The problem you must solve is, determine the minimum possible sum of the entire tree&#39;s access frequency and the total modification cost.</p>

### 입력

<p>The first line of input contains two integers&nbsp;<var>N</var>&nbsp;and&nbsp;<var>K</var>.&nbsp;<var>N</var>&nbsp;is the number of nodes and&nbsp;<var>K</var>&nbsp;is the modification cost for each priority value changed.</p>

<p>The next line contains&nbsp;<var>N</var>&nbsp;nonnegative integers, the keys of all the nodes.</p>

<p>The next line contains&nbsp;<var>N</var>&nbsp;nonnegative integers, the priorities of all the nodes.</p>

<p>The next line contains&nbsp;<var>N</var>&nbsp;nonnegative integers, the access frequencies of all the nodes.</p>

<p>None of the keys, priorities, and access frequencies in the test data will exceed 400000. Pairs of adjacent values on the same line will be separated by a single integer, and there will not be any trailing spaces.</p>

### 출력

<p>The output should consist of one line containing a single number, the minimum possible value achievable for the sum of the entire tree&#39;s access cost and the total modification cost.</p>

### 제한

<ul>
	<li><var>N</var>&nbsp;&le; 70</li>
	<li>1 &le;&nbsp;<var>K</var>&nbsp;&le; 30000000</li>
</ul>