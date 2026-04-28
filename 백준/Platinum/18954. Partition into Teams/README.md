# [Platinum II] Partition into Teams - 18954

[문제 링크](https://www.acmicpc.net/problem/18954)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 13, 정답: 9, 맞힌 사람: 9, 정답 비율: 75.000%

### 분류

수학, 정수론, 조합론, 모듈로 곱셈 역원, 페르마의 소정리, 뤼카 정리

### 문제 설명

<p>A company of $n$ people decided to play a game. Each person can either join red team, join blue team, or become a spectator. Each person makes a decision independently and picks one of the three options with equal probability. The team which gets more players will win the game; the game ends in a draw in case both teams have an equal number of players. Let us denote the probability of red team winning by $t$. Find $(t \cdot 3^{n}) \bmod p$, where $p$ is prime.</p>

### 입력

<p>The only line of the input contains two integers $n$ and $p$ ($1 \le n \le 10^{18}$, $5 \le p &lt; 10^{6}$, $p$ is prime).</p>

### 출력

<p>Print one integer: the answer to the problem.</p>