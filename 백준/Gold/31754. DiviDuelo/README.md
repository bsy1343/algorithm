# [Gold II] DiviDuelo - 31754

[문제 링크](https://www.acmicpc.net/problem/31754)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 83, 정답: 42, 맞힌 사람: 40, 정답 비율: 70.175%

### 분류

게임 이론, 수학, 정수론

### 문제 설명

<p>The Intense Challenges Players Club (ICPC) is hosting a DiviDuelo tournament.</p>

<p>DiviDuelo is a new two-player, turn-based game. In DiviDuelo, a number $N$ is selected and the list of its divisors is written. For example, if $N = 10$ is selected, the list of numbers $1$, $2$, $5$, $10$ is written. Players alternate turns picking one still unpicked divisor from the list each turn, until all divisors have been picked.</p>

<p>The winner is determined by the greatest common divisor (GCD) of the numbers picked by the starting player. If the GCD <u>is not</u> equal to $1$, the starting player wins. Otherwise, if the GCD is equal to $1$, the other player wins.</p>

<p>The ICPC needs your help to prepare some statistics about the games played in the tournament. Given the value of $N$, determine if the starting player can win the game assuming both players play optimally.</p>

### 입력

<p>The input consists of a single line that contains an integer $N$ ($1 &le; N &le; 10^{12}$) indicating the number selected for the game.</p>

### 출력

<p>Output a single line with the uppercase letter &ldquo;<code>Y</code>&rdquo; if the starting player can win the game and the uppercase letter &ldquo;<code>N</code>&rdquo; otherwise, assuming both players play optimally.</p>