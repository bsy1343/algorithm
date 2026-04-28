# [Gold III] Binary Tree - 13042

[문제 링크](https://www.acmicpc.net/problem/13042)

### 성능 요약

시간 제한: 4 초, 메모리 제한: 512 MB

### 통계

제출: 15, 정답: 5, 맞힌 사람: 5, 정답 비율: 41.667%

### 분류

트리

### 문제 설명

<p>Basil is a student, and in order to pass his final exam in Bioinformatics he needs to grow up a complete binary tree such that all of its leaves have the same distance from the root.</p>

<p>Recall that a rooted tree is an undirected acyclic graph with one vertex marked as a root. The parent of the vertex u is its neighbor closest to root, the root itself has no parent. Other neighbors of the vertex are its children. The vertex that has no children is called a leaf. The complete binary tree is a rooted tree such that each of its non-leaf vertices has exactly two children.</p>

<p>Unfortunately during the semester Basil spent all of his time in programming contests and didn&#39;t give enough attention to his tree. Now there are several days left before the final exam, and he has found out that his tree has grown up, but probably incorrectly, and it even doesn&#39;t have a root yet. So Basil now must mark one of its vertices as a root, and try to convert it to a required complete binary tree by adding vertices. Each day Basil can add a new vertex to the tree, making it a child of one of the existing vertices.</p>

<p>Basil would like to know if he can complete the task, which vertex he should choose as a root, and what is the minimal number of days required to complete the task. If there are several vertices that can be marked as root to get the complete binary tree with all leaves at the same distance from the root in the minimal number of days, he would like to mark the vertex with the smallest number.</p>

<p>When printing the required number of days to finish the tree, Basil would like to know this number modulo 10<sup>9</sup> + 7. Note that he wants to minimize the number of days, not the remainder modulo 10<sup>9</sup> + 7, you must take the answer modulo 10<sup>9</sup> + 7 only before printing.</p>

### 입력

<p>Input data contains several test cases. The first line of input contains the number of tests t.</p>

<p>Each test case is described in the following way: the first line contains integer n (2 &le; n &le; 2&middot;10<sup>5</sup>) &mdash; the number of vertices in a tree. The following n - 1 lines contain pairs of integers u<sub>i</sub>, v<sub>i</sub> (1 &le; u<sub>i</sub>, v<sub>i</sub> &le; n) &mdash; the vertices connected by edges. It is guaranteed that input describes a tree.</p>

<p>The sum of values of n for all test cases in one input data doesn&#39;t exceed 2&middot;10<sup>5</sup>.</p>

### 출력

<p>Print output for each test case on a separate line.</p>

<p>If there is no vertex that can be marked as root so that after that it is possible to get the complete binary tree with all leaves at the same distance from the root, print -1.</p>

<p>In the other case print two integers &mdash; the number of the vertex that must be marked as root, and the number of days that Basil needs to complete the task. The number of days must be printed modulo 10<sup>9</sup> + 7. If there are several vertices that can be marked as root to complete the task in the minimal number of days, output the minimal one.</p>