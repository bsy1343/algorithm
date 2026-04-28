# [Platinum I] King - 23458

[문제 링크](https://www.acmicpc.net/problem/23458)

### 성능 요약

시간 제한: 2 초 (추가 시간 없음), 메모리 제한: 256 MB

### 통계

제출: 135, 정답: 35, 맞힌 사람: 17, 정답 비율: 20.732%

### 분류

수학, 다이나믹 프로그래밍, 애드 혹, 정수론, 모듈로 곱셈 역원

### 문제 설명

<p>As we all know, the number of <em>Pang</em>&#39;s papers follows exponential growth. Therefore, we are curious about <em>King</em> sequence.</p>

<p>You are given a prime $p$. A sequence $(a_1,a_2,\ldots,a_n)$ is a <em>King</em> sequence if and only if there is an integer $1\leq q &lt; p$ such that for all integers $i\in [2,n]$, $q a_{i-1} \equiv a_i \pmod p$.</p>

<p>Given a sequence $B=(b_1,\ldots,b_m)$, what is the length of the longest <em>King</em> subsequence of $B$?&nbsp;</p>

<p>A subsequence is a sequence that can be derived from another sequence by deleting some elements without changing the order of the remaining elements.</p>

<p>$Pang$ is super busy recently, so the only thing he wants to know is whether the answer is greater than or equal to $\frac{n}{2}$.&nbsp;</p>

<p>If the length of the longest <em>King</em> sequence is less than $\frac{n}{2}$, output $-1$. Otherwise, output the length of the longest <em>King</em> subsequence.</p>

### 입력

<p>The first line contains an integer $T$ denoting the number of test cases ($1\le T\le 1000$).</p>

<p>The first line in a test case contains two integers $n$ and $p$ ($2\le n \le 200000$, $2\le p \le 1000000007$, $p$ is a prime). The sum of $n$ over all test cases does not exceed $200000$.</p>

<p>The second line in a test case contains a sequence $b_1,\ldots, b_n$ ($1\le b_i&lt; p$).</p>

### 출력

<p>For each test case, output one line containing the answer which is $-1$ or the length of the longest <em>King</em> subsequence.</p>