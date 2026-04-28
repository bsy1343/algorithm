# [Platinum V] Blindfold - 6920

[문제 링크](https://www.acmicpc.net/problem/6920)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 17, 정답: 13, 맞힌 사람: 7, 정답 비율: 87.500%

### 분류

브루트포스 알고리즘

### 문제 설명

<p>Rose and Colin are playing a game in their backyard. Since the backyard is rectangular, we can think of it as a grid with $r$ rows and $c$ columns. Rose and Colin place obstacles on some of the squares.</p>

<p>The game is played as follows:</p>

<p>Colin covers his eyes with a blindfold then Rose carries him to some grid square in the backyard. She sets him down so that he is facing north, south, east, or west. Colin does not know this initial position or direction. Rose then instructs Colin to make a series of $m$ moves through the backyard. Each move is one of:</p>

<ul>
	<li><code>F</code> - moves forward one grid square in the direction that he is facing, or</li>
	<li><code>L</code> - turns 90 degrees counter-clockwise, remaining on the same square, or</li>
	<li><code>R</code> - turns 90 degrees clockwise, remaining on the same square.</li>
</ul>

<p>After making these moves, Colin is standing at some final position. He must now figure out where he is standing. You will help him by writing a program to determine all possible final positions. Assume that Colin&#39;s initial position, final position, and all intermediate positions lie within the backyard but never in a square that contains an obstacle. You may also assume that Colin is always facing a direction that is parallel to the sides of the backyard (north, south, east, or west).</p>

### 입력

<p>The input begins with $r$ and $c$ $(1 \le r \le 375; 1 \le c \le 80)$, each on a separate line. Next are $r$ lines of $c$ characters describing the backyard: a <code>.</code> denotes a grid square that Colin may walk through; an <code>X</code> denotes a grid square with an obstacle. Below the grid is the number $m$ $(0 \le m \le 30\,000)$ followed by $m$ lines describing Colin&#39;s moves. Each line has a single character: <code>F</code>, <code>L</code>, or <code>R</code>.</p>

### 출력

<p>Your program should output the backyard grid, indicating all possible final positions with <code>*</code>.</p>