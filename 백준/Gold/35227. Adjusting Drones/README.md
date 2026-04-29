# [Gold I] Adjusting Drones - 35227

[문제 링크](https://www.acmicpc.net/problem/35227)

### 성능 요약

시간 제한: 4 초, 메모리 제한: 2048 MB

### 통계

제출: 16, 정답: 15, 맞힌 사람: 15, 정답 비율: 93.750%

### 분류

분리 집합, 스위핑, 자료 구조

### 문제 설명

<p>You are managing a fleet of $n$ drones, each with an energy level $a_1, \dots , a_n$. You are also given a positive integer $k$, which represents the maximum number of drones allowed to share the same energy level.</p>

<p>To prevent overloads, the drones automatically perform energy balancing operations as follows. While there exists an energy level that appears strictly more than $k$ times, they execute the following steps:</p>

<ul>
<li>first, every drone $i$ whose energy $a_i$ has already appeared before (that is, there exists $j &lt; i$ with $a_j = a_i$) is marked;</li>
<li>then, for each marked drone, its energy is increased by $1$ unit;</li>
<li>then, the marks are removed.</li>
</ul>

<p>The process stops once no energy level appears more than $k$ times. Determine how many energy balancing operations will be performed.</p>

### 입력

<p>Each test contains multiple test cases. The first line contains the number of test cases $t$ ($1 ≤ t ≤ 10^4$). The description of the test cases follows.</p>

<p>The first line of each test case contains two integers $n$, $k$ ($1 ≤ k ≤ n ≤ 2 \cdot 10^5$) — the number of drones and the maximum allowed number of drones with the same energy level.</p>

<p>The second line of each test case contains $n$ integers $a_1, a_2, \dots , a_n$ ($1 ≤ a_i ≤ 2n$) — the initial energy levels of the drones.</p>

<p>It is guaranteed that the sum of $n$ over all test cases does not exceed $2 \cdot 10^5$.</p>

### 출력

<p>For each test case, output a single line containing an integer: the number of energy balancing operations performed.</p>