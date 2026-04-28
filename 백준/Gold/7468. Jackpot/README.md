# [Gold II] Jackpot - 7468

[문제 링크](https://www.acmicpc.net/problem/7468)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 64 MB

### 통계

제출: 13, 정답: 3, 맞힌 사람: 3, 정답 비율: 37.500%

### 분류

브루트포스 알고리즘

### 문제 설명

<p>The <em>Great Dodgers</em> company has recently developed a brand-new playing machine.</p>

<p>You put a coin into the machine and pull the handle. After that it chooses some integer number. If the chosen number is zero you win a jackpot. In the other case the machine tries to divide the chosen number by the lucky numbers $p_1, p_2, \dots ,p_n$. If at least one of the remainders is zero &mdash; you win.</p>

<p><em>Great Dodgers</em> want to calculate the probability of winning on their machine. They tried to do it, but failed. So <em>Great Dodgers</em> hired you to write a program that calculates the corresponding probability.</p>

<p>Unfortunately, probability theory does not allow you to assume that all integer numbers have equal probability. But one mathematician hinted you that the required probability can be approximated as the following limit:</p>

<p>$$\lim_{k \rightarrow \infty } {\frac{S_k}{2k+1}}\text{.}$$</p>

<p>Here $S_k$ is the number of integers between $-k$ and $k$ that are divisible by at least one of the lucky numbers.</p>

### 입력

<p>Input file contains $n$ &mdash; the number of lucky numbers (1 &le; $n$ &le; 16), followed by $n$ lucky numbers (1 &le; $p_i$ &le; 10<sup>9</sup>).</p>

### 출력

<p>It is clear that the requested probability is rational. Output it as an irreducible fraction.</p>

<p>On the first line of the output file print the numerator of the winning probability. On the second line print its denominator. Both numerator and denominator must be printed without leading zeroes. Remember that the fraction must be irreducible.</p>