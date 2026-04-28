# [Platinum III] Believer - 19304

[문제 링크](https://www.acmicpc.net/problem/19304)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 13, 정답: 8, 맞힌 사람: 7, 정답 비율: 87.500%

### 분류

그리디 알고리즘, 수학, 매개 변수 탐색

### 문제 설명

<p>Do you believe in dragons? Imagine that one of them wakes you up at night and asks the following:</p>

<p>Let&#39;s consider sequences of positive integers $a = \langle a_1, a_2, \ldots, a_k \rangle$.</p>

<p>Let $f(a, x)$ be the number of occurrences of $x$ in $a$. For example, $f(\langle 1, 4, 1, 1 \rangle, 1) = 3$.</p>

<p>Let $c(y)$ be the number of ones in the binary expansion of $y$. For example, $c(13) = c(1101_2) = 3$.</p>

<p>Let $b(a) = \sum \limits_{i \in a} c(f(a, i))$. For example, $b(\langle 1, 4, 1, 1 \rangle) = c(3) + c(1) = 2 + 1 = 3$.</p>

<p>For the given value of $n$, find the maximum value of $b(a)$ over all sequences with $\sum \limits_{i=1}^{k} a_i = n$.</p>

<p>What would you answer?</p>

### 입력

<p>The first line of the input contains a single integer $t$ ($1 \le t \le 10^3$) --- the number of test cases.</p>

<p>Each of the next $t$ lines contains a single integer $n$ ($1 \le n \le 10^{18}$).</p>

### 출력

<p>For each test case in order of input, output a single integer --- the answer to the problem.</p>

### 힌트

<p>In the first example test case, one possible sequence with $b(a) = 3$ is $a = \langle 1, 4, 1, 1 \rangle$.</p>