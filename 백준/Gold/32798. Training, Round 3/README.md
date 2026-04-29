# [Gold I] Training, Round 3 - 32798

[문제 링크](https://www.acmicpc.net/problem/32798)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 2048 MB

### 통계

제출: 35, 정답: 20, 맞힌 사람: 16, 정답 비율: 51.613%

### 분류

수학, 정수론, 조합론, 페르마의 소정리

### 문제 설명

<p>Ashley is training for another programming contest on Brandon's Online Judge.</p>

<p>Ashley has $k$ weeks left to train for her next programming contest. Her coach, Tom, is very busy and is no longer curating specific problems for Ashley to train on. At the start of every week, Tom picks $p$ distinct problems independently and uniformly at random from the bank of $n$ problems that Brandon's Online Judge has and assigns them for Ashley to work on. Tom generates a total of $k$ sets of problems in this manner.</p>

<p>Ashley diligently solves every problem that Tom picks out. However, she gets annoyed if there exist two different weeks that share at least one problem in common, because she wants to solve unique problems.</p>

<p>Compute the probability that Ashley becomes annoyed.</p>

### 입력

<p>The first and only line of input contains three integers, $n$ $(1 \le n \le 10^7)$, $k$ $(1 \le k \le 10^7)$, and $p$ $(1 \le p \le n)$.</p>

### 출력

<p>Let $p$ be the probability that Ashley becomes annoyed. It can be shown that $p$ can be written as a rational number $\frac{x}{y}$ with $\gcd(x, y) = 1$ and $y \not\equiv 0 \pmod{998244353}$. Define $r$ to be the unique integer in $[0, 998244353)$ such that $r \cdot y \equiv x \pmod{998244353}$. Output $r$.</p>

<p>It can be shown that, under the constraints provided, $r$ is guaranteed to exist and also be unique.</p>

### 힌트

<p>In the first sample, we can show that the probability Ashley becomes annoyed is $\frac{7}{9}$. Note that $110916040 \cdot 9 \equiv 7 \pmod {998244353}$, therefore the output for that test case is $110916040$.</p>

<p>In the second sample, we can show that Ashley always becomes annoyed. Note that $1 \cdot 1 \equiv 1 \pmod {998244353}$, therefore the output for that test case is $1$.</p>

<p>In the third sample, we can show that Ashley never becomes annoyed. Note that $0 \cdot 1 \equiv 0 \pmod {998244353}$, therefore the output for that test case is $0$.</p>