# [Silver II] Kites - 34496

[문제 링크](https://www.acmicpc.net/problem/34496)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 256 MB

### 통계

제출: 32, 정답: 23, 맞힌 사람: 21, 정답 비율: 70.000%

### 분류

다이나믹 프로그래밍, 정렬

### 문제 설명

<p>Busy Beaver has a collection of $N$ sticks with integer lengths $a_1, a_2, \dots, a_N$ and wants to make a kite. To do so, he needs to choose four different sticks from his collection with lengths $a$, $a$, $b$, $b$ for some integers $a$ and $b$ (not necessarily distinct).</p>

<p>It might not be possible for Busy Beaver to make a kite using his current collection, but he is able to modify the sticks. In an <em>operation</em>, Busy Beaver can take a stick and extend its length by $1$. Compute the minimum number of operations required to construct a kite of any size. It can be shown that it's always possible to make a kite after a finite number of operations.</p>

### 입력

<p>Each test contains multiple test cases. The first line of input contains a single integer $T$ $(1 \leq T \leq 10^4)$, the number of test cases. The description of each test case follows.</p>

<p>The first line of each test case contains a single positive integer $N$ ($4 \leq N \leq 2 \cdot 10^5$) --- the number of sticks in Busy Beaver's collection.</p>

<p>The second line contains $N$ space separated integers $a_1, a_2, \dots, a_N$ ($1 \leq a_i \leq 10^9$) --- the lengths of the sticks.</p>

<p>It is guaranteed that the sum of $N$ across all test cases is no more than $2 \cdot 10^5$.</p>

### 출력

<p>For each test case, output a single integer --- the minimum number of operations that Busy Beaver needs before he can make a kite.</p>

### 힌트

<p>In the first test case, there are four sticks, all of which are length $9$ except for one that is length $1$. The optimal way to create a kite is to apply the operation $8$ times to the stick of length $1$. We will then have four sticks of length $9$, which we can use to make a kite.</p>

<p>In the second test case, there are five sticks. We do not need to apply any operations because we already have four sticks of lengths $9$, $9$, $20$, $20$, so the answer is $0$.</p>

<p>In the third test case, it can be shown that the minimum number of operations needed is $2$. One way to make a kite with $2$ operations would be to extend the sticks of length $1$ and $3$ so that our collection of sticks has lengths $5$, $4$, $4$, $2$, $2$. The last four sticks can then form a kite.</p>