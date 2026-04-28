# [Silver II] Highly Composite Permutations - 19408

[문제 링크](https://www.acmicpc.net/problem/19408)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 146, 정답: 85, 맞힌 사람: 58, 정답 비율: 56.863%

### 분류

수학, 정수론, 해 구성하기

### 문제 설명

<p>Positive integer $x$ is called <em>composite</em> if it has strictly more than two positive integer divisors. For example, integers 4, 30 and 111 are composite, while 1, 7 and 239 are not.</p>

<p>Integer sequence $p = \langle p_1, p_2, \ldots, p_n \rangle$ is called a <em>permutation of length $n$</em> if it contains every integer between 1 and $n$, inclusive, exactly once.</p>

<p>We&#39;ll call permutation $p = \langle p_1, p_2, \ldots, p_n \rangle$ <em>highly composite</em> if for every $i$ between 1 and $n$, inclusive, the sum of the first $i$ elements of $p$ (that is, $p_1 + p_2 + \ldots + p_i$) is composite.</p>

<p>Given a single integer $n$, find a highly composite permutation of length $n$.</p>

### 입력

<p>The only line of the input contains a single integer $n$ ($1 \le n \le 100$).</p>

### 출력

<p>If no highly composite permutation of length $n$ exists, output a single integer $-1$. Otherwise, output $n$ integers $p_1, p_2, \ldots, p_n$ such that $p = \langle p_1, p_2, \ldots, p_n \rangle$ is a highly composite permutation.</p>

<p>If there are multiple highly composite permutations of length $n$, you may output any of them.</p>

### 힌트

<p>In the first example test case, the first element of the permutation, 9, is composite, the sum of the first two elements of the permutation, $9 + 13 = 22$, is composite, the sum of the first three elements of the permutation, $9 + 13 + 6 = 28$, is composite, and so on.</p>

<p>In the second example test case, only two permutations of the required length exist, $\langle 1, 2 \rangle$ and $\langle 2, 1 \rangle$, and neither of them is highly composite.</p>