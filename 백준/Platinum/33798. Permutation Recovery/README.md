# [Platinum II] Permutation Recovery - 33798

[문제 링크](https://www.acmicpc.net/problem/33798)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 2048 MB

### 통계

제출: 20, 정답: 12, 맞힌 사람: 12, 정답 비율: 60.000%

### 분류

순열 사이클 분할, 애드 혹

### 문제 설명

<p>There are two hidden permutations $a$ and $b$ of size $n$.</p>

<p>A permutation of length $n$ is an array consisting of $n$ distinct integers from $1$ to $n$ in arbitrary order. For example, $[2, 3, 1, 5, 4]$ is a permutation, but $[1, 2, 2]$ is not a permutation ($2$ appears twice in the array), and $[1, 3, 4]$ is also not a permutation ($n=3$ but there is $4$ in the array).</p>

<p>For each $i$ from $1$ to $n$, you are given the values $a_{b_i}$ and $b_{a_i}$. Recover any possible permutations $a$ and $b$, or determine that none exist.</p>

### 입력

<p>The first line of the input contains a single integer $t$ ($1 \le t \le 10^4$) --- the number of test cases. The description of the test cases follows.</p>

<p>The first line of each test case contains a single integer $n$ ($1 \le n \le 2\cdot 10^5$) --- the size of the two permutations.</p>

<p>The second line of each test case contains $n$ integers. The $i$-th of these is $a_{b_i}$ ($1 \le a_{b_i} \le n$). It is guaranteed that these $n$ integers are distinct.</p>

<p>The third line of each test case contains $n$ integers. The $i$-th of these is $b_{a_i}$ ($1 \le b_{a_i} \le n$). It is guaranteed that these $n$ integers are distinct.</p>

<p>It is guaranteed that the sum of $n$ across all test cases is at most $2\cdot 10^5$.</p>

### 출력

<p>For each test case, the first line of output should contain "<code>YES</code>" if there is a solution, and "<code>NO</code>" otherwise.</p>

<p>If you print "<code>YES</code>", print two additional lines of output:</p>

<p>The first line should contain $n$ integers $a_1, a_2, \cdots a_n$ ($1 \le a_i \le n$) --- a valid permutation $a$.</p>

<p>The second line should contain $n$ integers $b_1, b_2, \cdots b_n$ ($1 \le b_i \le n$) --- a valid permutation $b$.</p>

<p>If there are multiple solutions, you may print any.</p>

### 힌트

<p>The given solution to the first sample case is $a=[2, 1, 3]$, $b=[3, 2, 1]$. This gives $$a_{b_1} = a_3 = 3 \quad\quad a_{b_2} = a_2 = 1 \quad\quad a_{b_3} = a_1 = 2$$ $$b_{a_1} = b_2 = 2 \quad\quad b_{a_2} = b_1 = 3 \quad\quad b_{a_3} = b_3 = 1$$ which matches the input values $a_b=[3, 1, 2]$ and $b_a=[2, 3, 1]$.</p>

<p>In the second sample case, it can be shown that there are no valid permutations $a$ and $b$.</p>