# [Platinum II] The Cross Covers Everything - 24966

[문제 링크](https://www.acmicpc.net/problem/24966)

### 성능 요약

시간 제한: 3 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 91, 정답: 52, 맞힌 사람: 47, 정답 비율: 57.317%

### 분류

자료 구조, 기하학, 세그먼트 트리, 이분 탐색, 스위핑, 두 포인터

### 문제 설명

<p>A cross-shaped infinite area on the $x$-$y$ plane can be specified by two distinct points as depicted on the figure below.</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/82298a3f-bedf-4dee-8b2b-424090bf3e9c/-/preview/" style="width: 222px; height: 201px;" /></p>

<p style="text-align: center;">Figure J.1. The cross area specified by two points numbered $2$ and $4$</p>

<p>Given a set of points on the plane, you are asked to figure out how many pairs of the points form a cross-shaped area that covers all the points. To be more precise, when $n$ points with coordinates $(x_i , y_i$) ($i = 1, \dots , n$) are given, the ordered pair $&lt;p, q&gt;$ is said to cover a point $(x, y)$ if $x_p &le; x &le; x_q$, $y_p &le; y &le; y_q$, or both hold. Your task is to find how many pairs $&lt;p, q&gt;$ cover all the $n$ points. No two given points have the same $x$-coordinate nor the same $y$-coordinate.</p>

### 입력

<p>The input consists of a single test case of the following format.</p>

<p>$\begin{align*}&amp; n \\ &amp; x_1 \, y_1 \\ &amp; \vdots \\ &amp; x_n \, y_n\end{align*}$</p>

<p>The first line contains an integer $n$ ($2 &le; n &le; 2 &times; 10^5$), which is the number of points given. Two integers $x_i$ and $y_i$ in the $i$-th line of the following $n$ lines are the coordinates of the $i$-th point ($1 &le; x_i &le; 10^6$, $1 &le; y_i &le; 10^6$). You may assume that $x_j \ne x_k$ and $y_j \ne y_k$ hold for all $j \ne k$.</p>

### 출력

<p>Print in a line the number of ordered pairs of points that satisfy the condition.</p>

### 힌트

<p>Figure J.1 depicts the cross specified by two points numbered 2 and 4, that are the second and the fourth points of the Sample Input 1. This is one of the crosses covering all the points.</p>