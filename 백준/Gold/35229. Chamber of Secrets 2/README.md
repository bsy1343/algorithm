# [Gold IV] Chamber of Secrets 2 - 35229

[문제 링크](https://www.acmicpc.net/problem/35229)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 2048 MB

### 통계

제출: 7, 정답: 5, 맞힌 사람: 5, 정답 비율: 100.000%

### 분류

그래프 이론, 그리디 알고리즘, 해 구성하기, 홀짝성

### 문제 설명

<p>You are playing the game Henry Spotter and the Chamber of Secrets 2.</p>

<p>You want to unlock the next level, the Chamber of Secrets. The entry door contains $n$ panels, each displaying a sequence of $m$ symbols. The product $nm$ is even. The system generates these sequences from a <strong>secret permutation</strong> using the following four-step process:</p>

<ul>
<li>first, it starts from a secret permutation $[p_1, p_2, \dots , p_{nm/2}]$;</li>
<li>then, it repeats the secret permutation by concatenating it with itself, forming the array $[b_1, b_2, \dots , b_{nm}]$;</li>
<li>then, it splits this array into $n$ consecutive blocks, i.e., disjoint subarrays of length $m$;</li>
<li>then, it shuffles these blocks in arbitrary order across the panels.</li>
</ul>

<p>You are given the final $n$ panel sequences produced by the system. The $i$-th panel shows $[a_{i,1}, a_{i,2}, \dots , a_{i,m}]$. Your task is to recover one possible original secret permutation $[p_1, p_2, \dots , p_{nm/2} ]$. For the given input, at least one solution exists. If multiple secret permutations are valid, output any one of them.</p>

<p>The concatenation of two arrays $[x_1, x_2, \dots , x_{k_1} ]$, $[y_1, y_2, \dots , y_{k_2} ]$ is the array $[x_1, x_2, \dots , x_{k_1} , y_1, y_2, \dots , y_{k_2} ]$ of length $k_1 + k_2$.</p>

<p>A permutation of length $l$ is an array consisting of $l$ distinct integers from $1$ to $l$ in arbitrary order. For example, $[2, 3, 1, 5, 4]$ is a permutation, but $[1, 2, 2]$ is not a permutation ($2$ appears twice in the array), and $[1, 3, 4]$ is also not a permutation ($l = 3$ but there is $4$ in the array).</p>

### 입력

<p>Each test contains multiple test cases. The first line contains the number of test cases $t$ ($1 ≤ t ≤ 100$). The description of the test cases follows.</p>

<p>The first line of each test case contains two integers $n$, $m$ ($1 ≤ n ≤ 70$, $1 ≤ m ≤ 70$) — the number of panels, and the length of each displayed sequence.</p>

<p>The $i$-th of the next $n$ lines contains $m$ integers $a_{i,1}, a_{i,2}, \dots , a_{i,m}$ ($1 ≤ a_{i,j} ≤ nm/2$), representing the sequence shown on the $i$-th panel.</p>

<p>Note that there are no constraints on the sum of $n$ and $m$ over all test cases.</p>

### 출력

<p>For each test case, output a single line containing a secret permutation $[p_1, p_2, \dots , p_{nm/2} ]$ such that the process described above can produce the $n$ panel sequences $[a_{i,1}, a_{i,2}, \dots , a_{i,m}]$. For the given input, at least one solution exists.</p>