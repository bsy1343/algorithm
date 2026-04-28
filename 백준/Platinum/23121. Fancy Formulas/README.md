# [Platinum III] Fancy Formulas - 23121

[문제 링크](https://www.acmicpc.net/problem/23121)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 43, 정답: 29, 맞힌 사람: 28, 정답 비율: 66.667%

### 분류

분할 정복을 이용한 거듭제곱, 수학, 정수론

### 문제 설명

<p>You are given a prime $p$ and a pair of integers $(a, b)$ such that <strong>their sum is not divisible by $p$</strong>. In one operation, you can do one of the following:</p>

<ul>
	<li>Replace $(a, b)$ with $(2a \bmod p, (b+p-a) \bmod p)$</li>
	<li>Replace $(a, b)$ with $((a+p-b) \bmod p, 2b \bmod p)$</li>
</ul>

<p>You have to answer $q$ queries. In the $i$-th query, find the smallest number of operations needed to transform the pair $(a_i, b_i)$ into the pair $(c_i, d_i)$, or determine that it is impossible.</p>

<p>Note that the order of numbers matters. For example, for $p = 3$, the distance between $(1, 2)$ and $(2, 1)$ is $1$, not $0$.</p>

### 입력

<p>The first line contains two integers $p$ and $q$ ($2 \le p \le 10^9 + 7$, $p$ is prime, $1 \le q \le 10^5$): the prime and the number of queries to answer.</p>

<p>The $i$-th of the next $q$ lines contains four integers $a_i$, $b_i$, $c_i$, $d_i$ ($0 \le a_i, b_i, c_i, d_i &lt; p$, and <strong>$a_i+b_i$ is not divisible by $p$</strong>).</p>

### 출력

<p>For each query, if it is impossible to transform $(a_i, b_i)$ into $(c_i, d_i)$, output $-1$. Otherwise, output the smallest number of operations required to achieve this goal.</p>