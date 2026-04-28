# [Platinum II] Stone Game - 23494

[문제 링크](https://www.acmicpc.net/problem/23494)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 256 MB

### 통계

제출: 10, 정답: 5, 맞힌 사람: 5, 정답 비율: 55.556%

### 분류

다이나믹 프로그래밍, 게임 이론, 수학

### 문제 설명

<p>Chiaki finds the following interesting stone game: two players start with two non-empty piles of stones. In each turn, the player can choose a pile with an even number of stones and move half of the stones of this pile to the other pile. The game ends if a player cannot move, or if we reach a previously reached position. In the first case, the player who cannot move loses. In the second case, the game is declared a draw.&nbsp;</p>

<p>Given two positive integers $n$ and $m$, Chiaki would like to know the number of pairs $(a, b)$ ($1 \le a \le n, 1 \le b \le m)$ such that if initially the two piles have $a$ and $b$ stones respectively, then the first player has a winning strategy, or the game ends with a draw, or the second player has a winning strategy. Since this number may be very large, you are only asked to calculate it modulo $10^9+7$.</p>

### 입력

<p>There are multiple test cases. The first line of the input contains an integer $T$, indicating the number of test cases. For each test case:</p>

<p>The first line contains a binary string $s$ ($1 \le |s| \le 10^6$) -- the &nbsp;binary representation of $n$ without leading zeros.</p>

<p>The second line contains a binary string $t$ ($1 \le |t| \le 10^6$) -- the &nbsp;binary representation of $m$ without leading zeros.</p>

<p>It is guaranteed that the sum of the length of binary strings in all test cases will not exceed $2 \times 10^6$.</p>

### 출력

<p>For each test case, output three integers: the number of pairs $(a, b)$ such that first player wins, the game ends with a draw or the second player wins, correspondingly.</p>

### 힌트

<p>For the first sample:</p>

<ul>
	<li>The pairs when first player wins: $(2, 2)$, $(2, 4)$, $(2, 6)$, $(4, 2)$, $(4, 6)$, $(6, 2)$, $(6, 4)$, $(6, 6)$.</li>
	<li>The pairs when the game ends with draw: $(1, 2)$, $(1, 4)$, $(1, 6)$, $(2, 1)$, $(2, 3)$, $(2, 5)$, $(2, 7)$, $(3, 2)$, $(3, 4)$, $(3, 6)$, $(4, 1)$, $(4, 3)$, $(4, 5)$, $(4, 7)$, $(5, 2)$, $(5, 4)$, $(5, 6)$, $(6, 1)$, $(6, 3)$, $(6, 5)$, $(6, 7)$, $(7, 2)$, $(7, 4)$, $(7, 6)$.</li>
	<li>The pairs when the second player wins: $(1, 1)$, $(1, 3)$, $(1, 5)$, $(1, 7)$, $(3, 1)$, $(3, 3)$, $(3, 5)$, $(3, 7)$, $(4, 4)$, $(5, 1)$, $(5, 3)$, $(5, 5)$, $(5, 7)$, $(7, 1)$, $(7, 3)$, $(7, 5)$, $(7, 7)$.</li>
</ul>