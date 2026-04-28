# [Platinum III] Heap Structure - 30326

[문제 링크](https://www.acmicpc.net/problem/30326)

### 성능 요약

시간 제한: 3 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 101, 정답: 44, 맞힌 사람: 40, 정답 비율: 44.944%

### 분류

수학, 트리

### 문제 설명

<p>A minimum binary heap, often simply referred to as a &quot;min-heap,&quot; is a specialized type of binary tree-based data structure used in computer science. It is a binary tree that has two main properties:</p>

<ol>
	<li>Heap Property: In a min-heap, for any given node, the value of that node is less than or equal to the values of its child nodes. This means that the minimum value in the heap is always found at the root node. In other words, the smallest element in the heap is at the top.</li>
	<li>Binary Tree Structure: A min-heap is typically a complete binary tree, which means that all levels of the tree are fully filled except possibly for the last level, which is filled from left to right. This structural property allows min-heaps to be efficiently implemented using arrays.</li>
</ol>

<p>Min-heaps are often used to implement priority queues, which are data structures that maintain a collection of elements with associated priorities. By keeping the minimum element at the root, min-heaps can quickly retrieve and remove the element with the highest priority (lowest value) in logarithmic time. However, removing any other element from a min-heap may need linear time.</p>

<p>Hank recently learned min-heaps. He wonders how many nodes can keep the $k$-th smallest element in a min-heap of $n$-nodes. Please write a program to help him.</p>

### 입력

<p>The input contains two space-separated positive integers $n$ and $k$.</p>

### 출력

<p>Output the number of nodes that can keep the $k$-th smallest element in a min-heap of $n$ nodes.</p>

### 제한

<ul>
	<li>$1&le;k&le;n&le;10^{18}$</li>
</ul>

### 힌트

<p>Please assume that all elements are distinct.</p>