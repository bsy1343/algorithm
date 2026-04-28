# [Platinum IV] Inv - 20597

[문제 링크](https://www.acmicpc.net/problem/20597)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 35, 정답: 19, 맞힌 사람: 17, 정답 비율: 60.714%

### 분류

다이나믹 프로그래밍, 수학, 정수론

### 문제 설명

<p>A permutation $p$ on $n$ elements is an <em>involution</em> if $p(p(i)) = i$ for each $i$ from $1$ to $n$ inclusive. Your task is to compute the number of involutions on $n$ elements with $k$ inversions. To make your life easier, we ask you to print only the parity of this number.</p>

### 입력

<p>In the only line of the input, two space-separated integers are given: $n$ ($1 \le n \le 500$), the length of the involution, and $k$ ($0 \le k \le \frac{n(n-1)}{2}$), the number of inversions.</p>

### 출력

<p>Print a single number ($0$ or $1$): the number of involutions on $n$ elements with exactly $k$ inversions, when taken modulo $2$.</p>

### 힌트

<p>In the first sample, there are $3$ such involutions.</p>