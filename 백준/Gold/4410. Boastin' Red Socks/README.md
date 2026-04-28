# [Gold V] Boastin' Red Socks - 4410

[문제 링크](https://www.acmicpc.net/problem/4410)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 83, 정답: 31, 맞힌 사람: 23, 정답 비율: 31.507%

### 분류

수학, 브루트포스 알고리즘, 이분 탐색, 조합론

### 문제 설명

<p>You have a drawer that is full of two kinds of socks: red and black. You know that there are at least 2 socks, and not more than 50000. However, you do not know how many there actually are, nor do you know how many are red, or how many are black. (Your mother does the laundry!)</p>

<p>You have noticed, though, that when you reach into the drawer each morning and choose two socks to wear (in pitch darkness, so you cannot distinguish red from black), the probability that you pick two red socks is exactly p/q, where 0 &lt; q and 0 &lt;= p &lt;= q.</p>

<p>From this, can you determine how many socks of each colour are in your drawer? There may be multiple solutions - if so, pick the solution with the fewest total number of socks.</p>

### 입력

<p>Input consists of multiple problems, each on a separate line. Each problem consists of the integers p and q separated by a single space. Note that p and q will both fit into an unsigned long integer.</p>

<p>Input is terminated by a line consisting of two zeroes.</p>

### 출력

<p>For each problem, output a single line consisting of the number of red socks and the number of black socks in your drawer, separated by one space. If there is no solution to the problem, print &quot;impossible&quot;.</p>

<p>If there are multiple solutions with the fewest total number of socks, pick the solution with the fewest number of red socks.</p>