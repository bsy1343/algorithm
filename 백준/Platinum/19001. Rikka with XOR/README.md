# [Platinum IV] Rikka with XOR - 19001

[문제 링크](https://www.acmicpc.net/problem/19001)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 27, 정답: 9, 맞힌 사람: 8, 정답 비율: 40.000%

### 분류

런타임 전의 전처리

### 문제 설명

<p>When Rikka was a little girl, she met a hard but interesting problem &quot;A good task to defend AK&quot;. This problem used some properties of XOR (exclusive OR, denoted by &quot;$\oplus$&quot; as a binary operation).</p>

<p>Time flies, six years have passed. Rikka has become a college student. Today, Rikka recollected this problem, and she suddenly understood that she knows little about XOR. So she wanted to come up with some problems about XOR and try to solve them.</p>

<p>Most of the problems were very simple, except one of them. Soon, Rikka found it too difficult. So she asked you to give her some help.</p>

<p>Here is the problem. Given two integers $n$ and $m$, calculate $\prod\limits_{i = 0}^{m} (n \oplus i)$. The answer may be very large, so just find it modulo $1\,500\,000\,001$ (which is a prime number).</p>

### 입력

<p>The first line contains a single integer $t$ ($1 \leq t \leq 20$), the number of test cases.</p>

<p>Each test case is given on a separate line which contains two integers $n$ and $m$ ($1 \leq m &lt; n \leq 10^9$).</p>

### 출력

<p>For each test case, print a single integer: the answer modulo $1\,500\,000\,001$.</p>