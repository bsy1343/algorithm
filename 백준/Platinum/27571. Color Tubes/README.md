# [Platinum III] Color Tubes - 27571

[문제 링크](https://www.acmicpc.net/problem/27571)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 60, 정답: 23, 맞힌 사람: 21, 정답 비율: 39.623%

### 분류

구현, 해 구성하기, 많은 조건 분기

### 문제 설명

<p>There is a new puzzle generating buzz on social media---Color Tubes.  The rules are relatively simple: you are given $n+1$ tubes filled with $3n$ colored balls.  Each tube can hold at most 3 balls, and each color appears on exactly 3 balls (so there are $n$ colors).</p>

<p>Using a series of moves, you are supposed to reach a Color Tubes state---each tube should either hold 3 balls of a single color or it should be empty.</p>

<p>The only move allowed is to take the top ball from one tube and place it into a different tube that has room for it (i.e. holds at most two balls before the move).</p>

<p>You want to write a program to solve this puzzle for you. Initially, you are not interested in an optimal solution, but you want your program to be good enough to solve any puzzle configuration using at most $20n$ moves.</p>

### 입력

<p>The first line of input contains a single integer $n$ ($1 \leq n \leq 1\,000$), which is the number of colors.  </p>

<p>Each of the next $n+1$ lines contains three integers $b$, $m$ and $t$ ($0 \le b,m,t \le n$), which are the descriptions of each tube, where $b$ is the color of the ball on the bottom, $m$ is the color of the ball in the middle, and $t$ is the color of the ball on the top. </p>

<p>The tubes are numbered from $1$ to $n+1$ and are listed in order. The colors are numbered from $1$ to $n$. The number $0$ describes an empty space.  It is guaranteed that no empty space will be below a colored ball.</p>

### 출력

<p>On the first line output an integer $m$, the number of moves that your program will use to solve the puzzle. Remember, $m$ has to be at most $20n$.  </p>

<p>On the next $m$ lines, output two space-separated integers $u$ and $v$ that describe a move ($1 \le u,v \le n+1$). In each move, you are taking the uppermost ball out of tube $u$ and placing it in tube $v$, where it will fall until it hits the uppermost ball already in that tube, or the bottom of the tube if the tube is empty.</p>

<p>Your solution will be deemed incorrect if it uses more than $20n$ moves, or any of the moves are not allowed, or the final configuration is not a Color Tubes state.</p>