# [Platinum V] Generator Dream - 33662

[문제 링크](https://www.acmicpc.net/problem/33662)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 2048 MB

### 통계

제출: 22, 정답: 13, 맞힌 사람: 13, 정답 비율: 65.000%

### 분류

비트마스킹, 수학, 이분 탐색, 정수론

### 문제 설명

<p>Rem is playing a game that relies on random bits and is starting to get annoyed by all the random chance. Rem wants to win, not to gamble! So, Rem wants your help in avoiding the randomness as much as possible.</p>

<p>The game generates randomness by starting with a secret seed $x$ and a known prime $p$. Then the game generates a sequence of "random" numbers $x_1,x_2,\dots ,x_i, \dots$ and "random" bits $b_1,b_2, \dots ,b_i, \dots$ by defining</p>

<p style="text-align: center;">$x_i:=2^{i-1}x \bmod p$, and $b_i:=x_i \bmod 2$.</p>

<p>Rem has been playing for a while, and thinks they have enough information to guess the secret $x$. Given $p$ and the first $\left\lceil\log_2⁡(p)\right\rceil$ "random" bits, return the secret $x$ for Rem.</p>

### 입력

<p>Input consists of a prime number $p$, ($2≤p&lt;10^9$) and a binary string $b_1b_2\cdots b_{\left\lceil\log_2⁡(p)\right\rceil}$ as described above.</p>

### 출력

<p>Display the value of $x$ reduced modulo $p$. That is, the value of the secret seed $x$.</p>