# [Gold I] Ambiguous Permutations - 32743

[문제 링크](https://www.acmicpc.net/problem/32743)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 32, 정답: 9, 맞힌 사람: 9, 정답 비율: 36.000%

### 분류

그래프 이론, 애드 혹

### 문제 설명

<p>You want to find two permutations $p$ and $q$ of size $n$ that satisfy $m$ restrictions of the form $(p_i-p_j)\cdot (q_i-q_j)&gt;0$.</p>

<p>A permutation of length $n$ is an array consisting of $n$ distinct integers from $1$ to $n$ in arbitrary order. For example, $[2, 3, 1, 5, 4]$ is a permutation, but $[1, 2, 2]$ is not a permutation ($2$ appears twice in the array), and $[1, 3, 4]$ is also not a permutation ($l=3$ but there is $4$ in the array).</p>

<p>Find two distinct permutations $p$ and $q$ of size $n$ such that all restrictions are satisfied, or state that it is impossible to do so. $p$ and $q$ are considered distinct if there is at least one index $i$ where $p_i \neq q_i$.</p>

### 입력

<p>The first line of the input contains a single integer $t$ ($1\le t\le 10^4$) --- the number of test cases.</p>

<p>The first line of each test case contains two integers $n$ and $m$ ($1\leq n\leq 2\cdot 10^5$, $0 \le m \le min(2\cdot 10^5, \frac{n(n-1)}{2})$) --- the size of the permutations and the number of restrictions, respectively.</p>

<p>Each of the next $m$ lines of the test case contains two integers $i$ and $j$ ($1 \le i &lt; j \le n$) --- representing the restriction $(p_i-p_j)\cdot (q_i-q_j)&gt;0$. It is guaranteed that all restrictions in the input are distinct.</p>

<p>It is guaranteed that the sum of $n$ over all test cases does not exceed $2\cdot 10^5$.</p>

<p>Similarly, the sum of $m$ over all test cases does not exceed $2\cdot 10^5$.</p>

### 출력

<p>The first line of output for each test case should contain "<code>YES</code>" if a valid $p$ and $q$ exist, and "<code>NO</code>" otherwise.</p>

<p>You can output the answer in any case (upper or lower). For example, the strings "<code>yEs</code>", "<code>yes</code>", "<code>Yes</code>", and "<code>YES</code>" will be recognized as positive responses.</p>

<p>If you printed "<code>YES</code>", print two additional lines of output.</p>

<p>The first of these should contain $n$ distinct integers $p_1,\, p_2, \cdots\, p_n$ ($1 \le p_i \le n$) --- the permutation $p$.</p>

<p>The second of these should contain $n$ distinct integers $q_1,\, q_2,\, \cdots\, q_n$ ($1 \le q_i \le n$) --- the permutation $q$.</p>

### 힌트

<p>In the first test case of the first test, $n=1$. Since there is only one distinct permutation of size $1$, there is no solution.</p>

<p>In the second test case of the first test, $n=2$ and there are no restrictions that need to be satisfied. So $p = [1,\, 2]$ and $q = [2,\,1]$ is a valid solution.</p>