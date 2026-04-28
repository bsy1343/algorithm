# [Gold IV] Minimum Coin Exchange Problem - 22786

[문제 링크](https://www.acmicpc.net/problem/22786)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 39, 정답: 5, 맞힌 사람: 5, 정답 비율: 23.810%

### 분류

그래프 이론, 그래프 탐색, 너비 우선 탐색

### 문제 설명

<p>Six kinds of coins are available currently in Japanese currency: 1 yen coins, 5 yen coins, 10 yen coins, 50 yen coins, 100 yen coins and 500 yen coins. Suppose that we have unlimited number of each coins, we define m(p) as the minimum number of coins required for a given amount of transaction p (1 &lt; p &lt; 500). For example, a transaction of 400 yen could be accomplished by paying one 500 yen coin and receiving one 100 yen coin, so there are two coins involved in this transaction. Since this is the least number of coins possible for a transcation of 400 yen, m(400) = 2.</p>

<p>Let us presume that in year 20xx, there are n + 1 types of coins in Japanese currency: 1 yen coin, a<sub>1</sub> yen coin, . . . a<sub>n</sub> yen coin (in the assending order). As before, we compute m(p) for each p in 1 &lt; p &lt; a<sub>n</sub>, compute the maximum of m(p).</p>

### 입력

<p>Each case is given in one line, consisting of an integer n followed by a<sub>1</sub>, . . . , a<sub>n</sub>. The end of test cases is indicated by the end of file.</p>

### 출력

<p>You should output m(p) in one line for each test case.</p>