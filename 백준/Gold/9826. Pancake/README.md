# [Gold I] Pancake - 9826

[문제 링크](https://www.acmicpc.net/problem/9826)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 66, 정답: 11, 맞힌 사람: 8, 정답 비율: 40.000%

### 분류

그래프 이론, 브루트포스 알고리즘, 그래프 탐색, 너비 우선 탐색, 런타임 전의 전처리

### 문제 설명

<p>You are given a stack of N pancakes, where 1 &le; N &le; 8. The pancake at the bottom and at the top of the stack has index 0 and index N &minus; 1 respectively. The size of a pancake is its diameter which is a positive integer. All pancakes in the stack have different sizes. A stack A of N = 5 pancakes with size 3, 8, 7, 6, and 10 can be visualized as:</p>

<pre>
4 (top)        10
3               6
2               7
1               8
0 (bottom)      3
-----------------------
index i      A[i]</pre>

<p>We want to sort the stack in descending order, that is, the largest pancake is at the bottom and the smallest pancake is at the top. To make the problem more real-life like, sorting a stack of pancakes can only be done by a sequence of pancake &lsquo;flips&rsquo;, denoted by flip(i). The flip(i) operation inserts a spatula into the stack, lifts up pancakes from index i to index N &minus;1 and flips them. As a result, the position of the pancakes from index i to N &minus; 1 are reversed.</p>

<p>For example, stack A can be transformed to stack B via flip(0), i.e. inserting a spatula and flipping the pancakes from index 0 and 4. Stack B can be transformed to stack C via flip(3). Stack C can be transformed to stack D via flip(1), and so on. Our target is to make the stack sorted in descending order, i.e. we want the stack to be like stack E, using minimum number of flips.</p>

<pre>
4 (top)      10  &lt;--   3  &lt;--   8  &lt;--   6                 3
3             6        8  &lt;--   3        7     ...         6
2             7        7        7        3                 7
1             8        6        6  &lt;--   8                 8
0 (bottom)    3  &lt;--  10       10       10                10
--------------------------------------------------------------
index i    A[i]     B[i]     C[i]     D[i]     ...      E[i]</pre>

<p>Bill Gates (Microsoft founder, former CEO, and current chairman) wrote only one research paper so far, and it is about this pancake sorting<sup>1</sup>.</p>

<p>In this question, given the starting configuration of N pancakes, your task is to compute the minimum number of flips required to sort them.</p>

<p><sup>1</sup>Gates, W. and Papadimitriou, C. Bounds for Sorting by Prefix Reversal, Discrete Mathematics, 27, 47-57, 1979.</p>

### 입력

<p>The first line of input contains an integer T which is the number of test cases. Each of the next T lines corresponds to a test case. Each test case starts with the number of pancakes N, and then followed by a sequence of N integers indicating the size of each pancake. The bottom pancake (i.e the pancake with index 0) appears first in the sequence.</p>

### 출력

<p>For each test case, output in one line the minimum number of flips required to sort the test case. Hence, the output contains T lines with one integer per line.</p>