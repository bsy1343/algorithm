# [Gold II] Matching Numbers - 27489

[문제 링크](https://www.acmicpc.net/problem/27489)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 1024 MB (추가 메모리 없음)

### 통계

제출: 172, 정답: 149, 맞힌 사람: 134, 정답 비율: 88.158%

### 분류

수학, 해 구성하기

### 문제 설명

<p>You are given an integer $n$. Pair the integers $1$ to $2n$ (i.e. each integer should be in exactly one pair) so that each sum of matched pairs is consecutive and distinct. </p>

<p>Formally, let $(a_i, b_i)$ be the pairs that you matched. $\{a_1, b_1, a_2, b_2, \ldots, a_n, b_n\}$ should be a permutation of $\{1, 2, \ldots, 2n\}$. Let the sorted list of $\{a_1+b_1, a_2+b_2, \ldots, a_n+b_n\}$ be $s_1 &lt; s_2 &lt; \ldots &lt; s_n$. We must have $s_{i+1}-s_i = 1$ for $1 \le i \le n - 1$.</p>

### 입력

<p>Each test contains multiple test cases. The first line contains the number of test cases $t$ ($1 \le t \le 500$). The description of the test cases follows.</p>

<p>For each test case, a single integer $n$ ($1 \leq n \leq 10^5$) is given.</p>

<p>It is guaranteed that the sum of $n$ over all test cases doesn&#39;t exceed $10^5$.</p>

### 출력

<p>For each test case, if it is impossible to make such a pairing, print &quot;No&quot;.</p>

<p>Otherwise, print &quot;Yes&quot; followed by $n$ lines.</p>

<p>At each line, print two integers that are paired.</p>

<p>You can output the answer in any case (upper or lower). For example, the strings &quot;yEs&quot;, &quot;yes&quot;, &quot;Yes&quot;, and &quot;YES&quot; will be recognized as positive responses.</p>

<p>If there are multiple solutions, print any.</p>