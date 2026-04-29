# [Gold II] Bitwise Triangles - 32739

[문제 링크](https://www.acmicpc.net/problem/32739)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 5, 정답: 4, 맞힌 사람: 4, 정답 비율: 80.000%

### 분류

해 구성하기

### 문제 설명

<p>We define a <em>bitwise triangle</em> to be a triplet of distinct integers $(a,\,b,\,c)$ with $a\&amp;b\neq0$, $a\&amp;c\neq0$, and $b\&amp;c\neq0$, where $\&amp;$ indicates the <a href="https://en.wikipedia.org/wiki/Bitwise_operation#AND">bitwise AND operator</a>.</p>

<p>You are given an integer $n$. We define a <em>triangle packing</em> to be a set of pairwise disjoint bitwise triangles consisting of integers from $1$ to $n$ inclusive. Find a maximal triangle packing (one with the maximum number of bitwise triangles).</p>

### 입력

<p>The first line of the input contains a single integer $t$ ($1 \le t \le 10^4$) --- the number of test cases. The description of the test cases follows.</p>

<p>Each test case consists of a single line containing one integer $n$ ($1 \le n \le 2\cdot 10^5$) --- the maximum allowed number in any of the triangles.</p>

<p>It is guaranteed that the sum of $n$ over all test cases does not exceed $2\cdot 10^5$.</p>

### 출력

<p>The first line of output for each test case should contain a single integer $k$ ($0 \le k \le n$) --- the size of the maximal triangle packing.</p>

<p>The next $k$ lines of output should each contain three distinct integers $a$, $b$, and $c$ ($1 \le a, b, c \le n$), representing one triangle of the maximal triangle packing.</p>

<p>If there are multiple solutions, print any.</p>

### 힌트

<p>In the first test case, we have $n=4$. It can be shown that we cannot create any bitwise triangles from the set $\{1, 2, 3, 4\}$, so the size of the maximal packing is $0$.</p>

<p>In the second test case, we have $n=5$. The given triangle packing is valid since each of the three numbers in the one bitwise triangle are odd, and therefore the bitwise AND of any two of them is nonzero. It can be shown that this packing is maximal for $n=5$.</p>