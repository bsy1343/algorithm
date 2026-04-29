# [Platinum II] Monotone Subsequence - 34630

[문제 링크](https://www.acmicpc.net/problem/34630)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 2048 MB

### 통계

제출: 63, 정답: 52, 맞힌 사람: 50, 정답 비율: 84.746%

### 분류

비둘기집 원리, 수학, 애드 혹, 해 구성하기

### 문제 설명

<p><em>This is an interactive problem.</em></p>

<p>Faker is being naughty again. You asked him to create a nice query problem, but he created an interactive problem where he is answering a query instead! Faker hid a permutation from you, and you have to infer some interesting information by interacting with him.</p>

<p>You are given an integer $n$. Faker hid a hidden permutation<sup>*</sup> $p_1, p_2, \ldots, p_{n^2+1}$ of length $n^2+1$. Your goal is to find a monotone subsequence (either increasing or decreasing) of the hidden permutation, with length exactly $n+1$. It can be proved that every permutation of length $n^2 + 1$ contains a monotone subsequence of length $n+1$. For more information about the proof, you can check out <a href="https://en.wikipedia.org/wiki/Erdos-Szekeres theorem">this Wikipedia page</a>.</p>

<p>To find it, you can make at most $n$ <strong>skyscraper queries</strong> to the interactor, which is defined as follows:</p>

<ul>
<li>You provide a set of $k$ indices as a strictly increasing sequence: $i_1, i_2, \ldots, i_k$.</li>
<li>The interactor considers the values of the hidden permutation at these indices: $p_{i_1}, p_{i_2}, \ldots, p_{i_k}$.</li>
<li>The interactor then returns the indices corresponding to the <strong>visible skyscrapers</strong> from this set. An index $i_j$ is visible if its value $p_{i_j}$ is greater than the values of all preceding elements in your query, i.e., $p_{i_j} &gt; p_{i_m}$ for all $1 \le m &lt; j$. This is equivalent to finding the indices of the left-to-right maxima of the sequence $(p_{i_1}, \ldots, p_{i_k})$.</li>
</ul>

<p>After making at most $n$ queries, you must report a valid monotone subsequence of length <strong>exactly</strong> $n+1$.</p>

<p>Note that the permutation $p$ is fixed <strong>before</strong> any queries are made and does not depend on the queries.</p>

<hr>
<p><sup>*</sup>A permutation of length $m$ is an array consisting of $m$ distinct integers from $1$ to $m$ in arbitrary order. For example, $[2,3,1,5,4]$ is a permutation, but $[1,2,2]$ is not a permutation ($2$ appears twice in the array), and $[1,3,4]$ is also not a permutation ($m=3$ but there is $4$ in the array).</p>

### 입력

<p>Each test contains multiple test cases. The first line contains the number of test cases $t$ ($1 \le t \le 5000$). The description of the test cases follows.</p>

<p>The first and only line of each test case contains a single integer $n$ ($1 \le n \le 100$).</p>

<p>It is guaranteed that the sum of $n^2+1$ over all test cases does not exceed $10\,001$.</p>

### 출력



### 힌트

<p>For the first test case, $n=1$. The hidden permutation is $p=[1, 2]$.</p>

<ul>
<li>For the query <code>? 2 1 2</code>, the visible skyscrapers are at indices $1$ and $2$. The interactor returns <code>2 1 2</code>.</li>
<li>An increasing subsequence of length $2$ at indices $1, 2$ is reported.</li>
</ul>

<p>For the second test case, $n=2$. The hidden permutation is $p=[5, 3, 4, 1, 2]$.</p>

<ul>
<li>For the query <code>? 3 1 2 3</code>, the visible skyscraper is at index $1$. The interactor returns <code>1 1</code>.</li>
<li>For the query <code>? 3 2 3 5</code>, the visible skyscrapers are at indices $2$ and $3$. The interactor returns <code>2 2 3</code>.</li>
<li>A decreasing subsequence of length $3$ at indices $1, 3, 4$ is reported.</li>
</ul>

<p><em>Although Faker will play the role of interactor, the interactor will never lie to you.</em></p>