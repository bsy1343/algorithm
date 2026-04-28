# [Gold III] Allowance - 5994

[문제 링크](https://www.acmicpc.net/problem/5994)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 33, 정답: 24, 맞힌 사람: 22, 정답 비율: 73.333%

### 분류

그리디 알고리즘

### 문제 설명

<p>As a reward for record milk production, Farmer John has decided to start paying Bessie a small weekly allowance.</p>

<p>FJ has a set of coins in N (1 &lt;= N &lt;= 20) different denominations, where each denomination of coin evenly divides the next-larger denomination.</p>

<p>Using the given set of coins, he would like to pay Bessie at least some given amount of money C (1 &lt;= C &lt;= 100,000,000) every week. Please help him compute the maximum number of weeks he can pay Bessie.</p>

### 입력

<ul>
	<li>Line 1: Two space-separated integers: N and C</li>
	<li>Lines 2..N+1: Each line corresponds to a denomination of coin and contains two integers: the value V (1 &lt;= V &lt;= 100,000,000) of the denomination, and the number of coins B (1 &lt;= B &lt;= 1,000,000) of this denomation in Farmer John&#39;s possession.</li>
</ul>

### 출력

<ul>
	<li>Line 1: A single integer that is the number of weeks Farmer John can pay Bessie at least C allowance</li>
</ul>

### 힌트

<p>FJ can overpay Bessie with the one 10-cent coin for 1 week, then pay Bessie two 5-cent coins for 10 weeks and then pay Bessie one 1-cent coin and one 5-cent coin for 100 weeks.</p>