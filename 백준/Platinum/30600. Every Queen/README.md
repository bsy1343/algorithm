# [Platinum III] Every Queen - 30600

[문제 링크](https://www.acmicpc.net/problem/30600)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 63, 정답: 28, 맞힌 사람: 28, 정답 비율: 52.830%

### 분류

구현, 자료 구조, 브루트포스 알고리즘

### 문제 설명

<p>There are $n$ chess queens on an infinite grid. They are placed in squares with coordinates $(x_1, y_1), (x_2, y_2), \ldots, (x_n, y_n)$. Your task is to find a square that all queens attack, or report that no such square exists.</p>

<p>A queen in square $(x_i, y_i)$ attacks square $(x, y)$ if at least one of the following conditions is satisfied:</p>

<ul>
	<li>$x_i = x$;</li>
	<li>$y_i = y$;</li>
	<li>$|x_i - x| = |y_i - y|$.</li>
</ul>

<p>Note that in this problem, the queens do not block each other. For example, if there are queens in squares $(1, 1)$ and $(2, 2)$, both of them attack square $(3, 3)$. Moreover, you can choose a square that already contains a queen. For example, square $(1, 1)$ would be a valid answer in this case.</p>

### 입력

<p>Each test contains multiple test cases. The first line contains the number of test cases $t$ ($1 \le t \le 10^5$). The description of the test cases follows.</p>

<p>The first line of each test case contains a single integer $n$, denoting the number of queens ($1 \le n \le 10^5$).</p>

<p>The $i$-th of the following $n$ lines contains two integers $x_i$ and $y_i$, denoting the coordinates of the square containing the $i$-th queen ($-10^8 \le x_i, y_i \le 10^8$). No two queens share the same square.</p>

<p>It is guaranteed that the sum of $n$ over all test cases does not exceed $10^5$.</p>

### 출력

<p>For each test case, if an answer exists, print &quot;<code>YES</code>&quot; in the first line. Then, in the second line, print two integers $x$ and $y$, denoting the coordinates of a square attacked by every queen ($-10^9 \le x, y \le 10^9$).</p>

<p>If no such square exists, print a single line containing &quot;<code>NO</code>&quot; instead.</p>

<p>It can be shown that if an answer exists, there also exists an answer that satisfies $-10^9 \le x, y \le 10^9$. If there are multiple answers, print any of them.</p>