# [Platinum IV] Restricted Arrays - 24677

[문제 링크](https://www.acmicpc.net/problem/24677)

### 성능 요약

시간 제한: 4 초, 메모리 제한: 256 MB

### 통계

제출: 59, 정답: 30, 맞힌 사람: 30, 정답 비율: 50.847%

### 분류

수학, 그래프 이론, 그래프 탐색, 정수론, 깊이 우선 탐색

### 문제 설명

<p>Let $n$ be a positive integer. Find the number of integers $1 \le M \le n$ for which there exists an array of integers $a[1..n]$ that satisfies the following conditions: $$ a[x_i] + 1 \equiv a[y_i] \pmod{M} , \quad 1 \le i \le q <em>.</em> $$</p>

### 입력

<p>The first line contains two integers, $n$ and $q$: the array size and the number of conditions ($1\le n, q \le 10^6$).</p>

<p>Each of the next $q$ lines contains two integers, $x_i$ and $y_i$: the indices describing the corresponding condition ($1 \le x_i, y_i \le n$).</p>

### 출력

<p>On the first line, print an integer $t$: the number of possible values of $M$. On the second line, print the $t$ possible values of $M$ in increasing order.</p>