# [Platinum II] Modulo Permutations - 21913

[문제 링크](https://www.acmicpc.net/problem/21913)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 131, 정답: 60, 맞힌 사람: 56, 정답 비율: 47.458%

### 분류

수학, 다이나믹 프로그래밍, 정수론, 조화수

### 문제 설명

<p>Given a natural number $n$, count the number of permutations $(p_1, p_2, \dots , p_n)$ of the numbers from $1$ to $n$, such that for each $i$ ($1 \le i \le n$), the following property holds: $p_i \bmod p_{i+1} \le 2$, where $p_{n+1} = p_1$.</p>

<p>As this number can be very big, output it modulo $10^9 + 7$.</p>

### 입력

<p>The only line of the input contains the integer $n$ ($1 \le n \le 10^6$).</p>

### 출력

<p>Output a single integer &mdash; the number of the permutations satisfying the condition from the statement, modulo $10^9 + 7$.</p>

### 힌트

<p>For example, for $n = 4$ you should count the permutation $[4, 2, 3, 1]$, as $4 \bmod 2 = 0 \le 2$, $2 \bmod 3 = 2 \le 2$, $3 \bmod 1 = 0 \le 2$, $1 \bmod 4 = 1 \le 2$. However, you shouldn&rsquo;t count the permutation $[3, 4, 1, 2]$, as $3 \bmod 4 = 3 &gt; 2$ which violates the condition from the statement.</p>