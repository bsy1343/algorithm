# [Gold III] The Length of the Sequence - 27188

[문제 링크](https://www.acmicpc.net/problem/27188)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 71, 정답: 14, 맞힌 사람: 12, 정답 비율: 25.000%

### 분류

이분 탐색, 브루트포스 알고리즘

### 문제 설명

<p>Consider the segment of non-negative integers from $l$ to $r$. Write them in a row in decimal notation, getting a string $a$. For example, if $l=3$ and $r=10$, $a=345678910$.</p>

<p>You have to find such segment of consecutive non-negative integers $[l,r]$ ($0 \le l \le r \le 10^{18}$) that the length of the string $a$, corresponding to this segment, is exactly $S$, and the number of integers in the segment $[l,r]$ is maximum possible.</p>

### 입력

<p>The only line contains one integer $S$ ($1 \le S \le 10^{18}$).</p>

### 출력

<p>Print the length of the optimal segment $[l,r]$ in the first line. If there is no solution, print $-1$.</p>

<p>If the solution exists, print two integers $l$ and $r$ in the second line.</p>

<p>If there are multiple optimal solutions, print any of them.</p>