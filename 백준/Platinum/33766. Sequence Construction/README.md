# [Platinum IV] Sequence Construction - 33766

[문제 링크](https://www.acmicpc.net/problem/33766)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 2048 MB

### 통계

제출: 133, 정답: 54, 맞힌 사람: 48, 정답 비율: 40.336%

### 분류

애드 혹, 해 구성하기

### 문제 설명

<p>Lately, the cows on Farmer John's farm have been infatuated with watching the show Apothecowry Dairies. The show revolves around a clever bovine sleuth CowCow solving problems of various kinds. Bessie found a new problem from the show, but the solution won't be revealed until the next episode in a week! Please solve the problem for her.</p>

<p>You are given integers $M$ and $K$ $(1 \leq M \leq 10 ^ 9, 1 \leq K \leq 31)$. Please choose a positive integer $N$ and construct a sequence $a$ of $N$ non-negative integers such that the following conditions are satisfied:</p>

<ul>
	<li>$1 \le N \le 100$</li>
	<li>$a_1 + a_2 + \dots + a_N = M$</li>
	<li>$\text{popcount}(a_1) \oplus \text{ popcount}(a_2) \oplus \dots \oplus \text{ popcount}(a_N) = K$</li>
</ul>

<p>If no such sequence exists, print $-1$.</p>

<p>$\dagger \text{ popcount}(x)$ is the number of bits equal to $1$ in the binary representation of the integer $x$. For instance, the popcount of $11$ is $3$ and the popcount of $16$ is $1$.</p>

<p>$\dagger \oplus$ is the bitwise xor operator.</p>

<p>The input will consist of $T$ ($1 \le T \le 5 \cdot 10^3$) independent test cases.</p>

### 입력

<p>The first line contains $T$.</p>

<p>The first and only line of each test case has $M$ and $K$.</p>

<p>It is guaranteed that all test cases are unique.</p>

### 출력

<p>Output the solutions for $T$ test cases as follows:</p>

<p>If no answer exists, the only line for that test case should be $-1$.</p>

<p>Otherwise, the first line for that test case should be a single integer $N$, the length of the sequence -- ($1 \le N \le 100$).</p>

<p>The second line for that test case should contain $N$ space-separated integers that satisfy the conditions -- ($0 \le a_i \le M$).</p>