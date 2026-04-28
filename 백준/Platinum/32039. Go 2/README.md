# [Platinum I] Go 2 - 32039

[문제 링크](https://www.acmicpc.net/problem/32039)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 1024 MB

### 통계

제출: 16, 정답: 5, 맞힌 사람: 5, 정답 비율: 62.500%

### 분류

자료 구조, 분리 집합, 오프라인 쿼리

### 문제 설명

<p>It&#39;s the evening before the first day of CEOI 2024 and Křem&iacute;lek and Vochomůrka are in their room, nervous about what&#39;s to come. To pass the time, they decided to play a game of Go. Sadly, neither of them brought a Go board. Luckily Křem&iacute;lek always carries a matchbox in his pocket and Vochomůrka has an infinite grid in his backpack, which means they can play Go 2!</p>

<p>As the name implies, Go 2 differs from Go in two major ways: The board, and the rules.</p>

<p>Go 2 is played on a square grid. Players take turns placing matches on the grid. A match may be placed on any edge between two squares. If placing a match creates an enclosed area, the player that placed it receives a number of points equal to the area of the enclosed space, and the match is removed. Otherwise, the player receives no points and the match remains on the grid. It is prohibited to place a match in the position where a match was placed previously, even if that match has been removed.</p>

<p>Since computing areas of complex shapes can be difficult, Křem&iacute;lek and Vochomůrka would like your help with evaluating their game. You will receive the list of all matches placed during their game (ordered as they were played). For each match, you should compute the number of points it was worth.</p>

### 입력

<p>The first line of input contains the integer $N$ &mdash; the number of matches placed. $N$ lines follow, one per match. Each of them contains two numbers, $x_i$ and $y_i$, and a character $c_i$, separated by spaces. Each corner is identified by an $x$ and $y$ coordinate. If $c$ is <code>x</code>, then the match is placed on the edge between $(x, y)$ and $(x + 1, y)$. If $c$ is <code>y</code>, then the match is placed on the edge between $(x, y)$ and $(x, y + 1)$.</p>

### 출력

<p>Your program should output $N$ lines, one for each match. It should contain a single number $s_i$ &mdash; the number of points the match was worth.</p>

### 제한

<ul>
	<li>$1 \leq N \leq 3 \cdot 10^5$</li>
	<li>$0 \leq x_i, y_i \leq 10^8$ (for each $i$ such that $1 \leq i \leq N$)</li>
	<li>$0 \leq s_i \leq 10^8$ (for each $i$ such that $1 \leq i \leq N$)</li>
</ul>