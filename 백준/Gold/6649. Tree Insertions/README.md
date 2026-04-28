# [Gold IV] Tree Insertions - 6649

[문제 링크](https://www.acmicpc.net/problem/6649)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 17, 정답: 12, 맞힌 사람: 9, 정답 비율: 64.286%

### 분류

임의 정밀도 / 큰 수 연산, 조합론, 깊이 우선 탐색, 그래프 이론, 그래프 탐색, 수학, 트리

### 문제 설명

<p>All modern banks employ information systems to process their data. The amount of data is enormous. Imagine all the transactions, payments, e-banking, web services, etc. Therefore, advanced data structures must be used to store the data and allow to access them very quickly.</p>

<p>A Binary Search Tree (BST) is one example of such a data structure It holds a collection of values with some comparison operation that provides linear ordering on these values.</p>

<p>BST consists of nodes, each of them contains one value and has at most two subnodes: left and right (BST is a binary tree). The left subtree always contains only values strictly less than the node value, the right subtree only values greater than or equal to the node value.</p>

<p>As a consequence, values may easily be looked up by traversing the tree recursively. We begin with the root node and compare its value with the value we are searching for. Depending on the result, we descend either into the left or into the right subtree, but we never need to walk through both.</p>

<p>If we want to insert values to an existing tree, the procedure is also simple. The first value (when the tree is empty) is always put as the root. If the tree already exists, we start with the root node and traverse the tree recursively, as in the case of searching. When the traversal leads us to a missing subnode, we create a new leaf node at that position and assign it the new value.</p>

<p>The figures below show the tree after subsequently adding the following sequence of numbers: 3, 4, 3, 5, 4, 1, and 2.</p>

<p style="text-align: center;"><img alt="" src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/6649/1.png" style="height:353px; width:599px" /></p>

<p>You may notice that different permutations of the same numbers will often result in the same BST. For example, the tree from the fifth figure above may be constructed by three different input sequences:</p>

<ul>
	<li>3, 4, 3, 5, 4</li>
	<li>3, 4, 5, 4, 3</li>
	<li>3, 4, 5, 3, 4</li>
</ul>

<p>Interesting, isn&rsquo;t it? Your task is to compute how many different permutations are there that will result into the same BST.</p>

### 입력

<p>The input will consist of several trees, each of them specified on two lines. The first line contains a single integer N (1 &le; N &le; 100), the number of values in the tree. The second line contains N values separated by a space. These values, if inserted in the given order, form a BST to be examined. All values will be between 0 and 1 000.</p>

<p>The last tree is followed by a line containing a single zero.</p>

### 출력

<p>For each tree, output the total number of different permutations that would generate the same Binary Search Tree. As you may notice in the Sample Output, this number may exceed 2<sup>32</sup>.</p>