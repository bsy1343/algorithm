# [Platinum II] Array - 23641

[문제 링크](https://www.acmicpc.net/problem/23641)

### 성능 요약

시간 제한: 3 초 (추가 시간 없음), 메모리 제한: 256 MB

### 통계

제출: 67, 정답: 12, 맞힌 사람: 7, 정답 비율: 15.217%

### 분류

다이나믹 프로그래밍, 비트 집합

### 문제 설명

<p>You are given an array $a_1, a_2, \ldots, a_n$. Let $x_1 = a_1$, and $x_i = x_{i - 1} \bmod a_i$ for each $i$ from $2$ to $n$.</p>

<p>Suppose that we can rearrange $a_1, \ldots, a_n$ in any way. What is the largest possible value of $x_n$ we can obtain?</p>

### 입력

<p>The first line contains an integer $n$ --- the size of the array ($2\leq n\leq 10^5$).</p>

<p>The second line containing $n$ integers $a_1, \ldots, a_n$ ($1\leq a_i\leq 10^5$).</p>

### 출력

<p>Print one integer --- the largest possible value of $x_n$.</p>