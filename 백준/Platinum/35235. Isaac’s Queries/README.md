# [Platinum III] Isaac’s Queries - 35235

[문제 링크](https://www.acmicpc.net/problem/35235)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 2048 MB

### 통계

제출: 71, 정답: 45, 맞힌 사람: 6, 정답 비율: 66.667%

### 분류

다이나믹 프로그래밍, 브루트포스 알고리즘, 수학, 해 구성하기

### 문제 설명

<p>You have reached the final level of the popular roguelike game “Isaac’s Keybindings”. Instead of a boss, you encounter a shopkeeper who holds a hidden array of integers $a_1, a_2, \dots , a_n$, where $0 ≤ a_i &lt; 2^{30}$ for each $i$ in $[1, n]$.</p>

<p>It is guaranteed that <strong>the array is generated randomly</strong>, i.e., $a_i$ is a uniformly random integer in $[0, 2^{30})$ for each $i$ in $[1, n]$, in all the tests excluding the example.</p>

<p>Let $f(u, v) = a_u ⊕ a_{u+1} ⊕ \dots ⊕ a_v$, where $⊕$ is the bitwise <code>XOR</code>.</p>

<p>You can ask queries of the following form: <code>?</code> $u$ $v$, with $1 ≤ u ≤ v ≤ n$.</p>

<p>The answer to the query is:</p>

<ul>
<li>$−1$, if $f(u, v) = 0$;</li>
<li>$\lfloor \log_2 (f(u, v)) \rfloor$ otherwise.</li>
</ul>

<p>Each query has a cost of $\frac{1} {v−u+1}$ robocoins. You initially have $35$ robocoins and if your balance ever becomes negative you lose. Note that your robocoin balance does not need to be an integer at any moment.</p>

<p>Find the answer to all possible $\frac{n(n+1)} {2}$ queries without losing.</p>

### 입력

<p>Each test contains multiple test cases. The first line contains the number of test cases $t$ ($1 ≤ t ≤ 30$). The description of the test cases follows.</p>

<p>The first line of each test case contains one integer $n$ ($1 ≤ n ≤ 100$) — the length of the array $a_1, a_2, \dots , a_n$. It is guaranteed that the array is generated randomly in all the tests excluding the example.</p>

<p>There are exactly $50$ tests in this problem (including the example). The example has $t = 1$ and $n = 3$, and all the other tests have $t = 30$ and $n = 100$.</p>

### 출력

