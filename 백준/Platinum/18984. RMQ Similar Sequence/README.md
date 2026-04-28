# [Platinum I] RMQ Similar Sequence - 18984

[문제 링크](https://www.acmicpc.net/problem/18984)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 256 MB

### 통계

제출: 34, 정답: 24, 맞힌 사람: 19, 정답 비율: 73.077%

### 분류

수학, 트리, 정수론, 확률론, 모듈로 곱셈 역원, 데카르트 트리

### 문제 설명

<p>Chiaki has a sequence $A=\{a_1,a_2,\dots,a_n\}$. Let $\mathbf{RMQ}(A, l, r)$ be the minimum $i$ ($l \le i \le r$) such that $a_i$ is the maximum value in $a_l, a_{l+1}, \dots, a_{r}$.</p>

<p>Two sequences $A$ and $B$ are called <em>RMQ Similar</em>, if they have the same length $n$ and for every $1 \le l \le r \le n$, $\mathbf{RMQ}(A, l, r) = \mathbf{RMQ}(B, l, r)$.</p>

<p>For a given the sequence $A=\{a_1,a_2,\dots,a_n\}$, define the weight of a sequence $B=\{b_1,b_2,\dots,b_n\}$ be $\sum\limits_{i=1}^{n} b_i$ (i.e. the sum of all elements in $B$) if sequence $B$ and sequence $A$ are RMQ Similar, or $0$ otherwise. If each element of $B$ is a real number chosen independently and uniformly at random between $0$ and $1$, find the expected weight of $B$.</p>

### 입력

<p>There are multiple test cases. The first line of input contains an integer $T$, indicating the number of test cases. For each test case:</p>

<p>The first line contains an integer $n$ ($1 \le n \le 10^6$) -- the length of the sequence.</p>

<p>The second line contains $n$ integers $a_1, a_2, \dots, a_n$ ($1 \le a_i \le n$) denoting the sequence.</p>

<p>It is guaranteed that the sum of all n does not exceed $3 \times 10^6$.</p>

### 출력

<p>For each test case, output the answer as a value of a rational number modulo $10^9 + 7$.</p>

<p>Formally, it is guaranteed that under given constraints the probability is always a rational number $\frac{p}{q}$ ($p$ and $q$ are integer and coprime, $q$ is positive), such that $q$ is not divisible by $10^9 + 7$. Output such integer a between $0$ and $10^9 + 6$ that $p - aq$ is divisible by $10^9 + 7$.</p>