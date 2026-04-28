# [Platinum I] Saddle Point - 19139

[문제 링크](https://www.acmicpc.net/problem/19139)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 53, 정답: 21, 맞힌 사람: 17, 정답 비율: 50.000%

### 분류

수학, 다이나믹 프로그래밍, 조합론, 포함 배제의 원리

### 문제 설명

<p>bobo has a matrix of size $n \times m$, whose elements are integers from $[1, k]$.</p>

<p>Find out the number of matrices with at least one <em>saddle point</em>, modulo $(10^9+7)$.</p>

<p>Note that a <em>saddle point</em>&nbsp;is a position $(i, j)$ which is both strict maximum of the $i$-th row and $j$-th column.</p>

### 입력

<p>$3$ integers $n, m, k$ ($1 \leq n, m \leq 500, 1 \leq k \leq 10$).</p>

### 출력

<p>A single integer denotes the number of matrices.</p>