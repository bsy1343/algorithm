# [Silver IV] You Can't Get There From Here - 6959

[문제 링크](https://www.acmicpc.net/problem/6959)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 38, 정답: 19, 맞힌 사람: 15, 정답 비율: 46.875%

### 분류

구현, 시뮬레이션

### 문제 설명

<p>In a primitive video game, a spot bounces around within a rectangular grid. The southwest corner of the grid has coordinates $(0,0)$ and the northeast corner has coordinates $(r,c)$ where $0 &lt; r \le 10$ and $0 &lt; c \le 10$. The southeast corner has coordinates $(0,c)$ and the northwest corner has coordinates $(r,0)$. The spot always travels on the diagonal; that is, in one of the directions <code>NE</code>, <code>NW</code>, <code>SE</code>, <code>SW</code>. The outer edges of the grid serve as mirrors: after visiting a position on the edge of the grid the spot &quot;bounces&quot; off according to the normal rules of reflection (Snell&#39;s Law). For example, if the spot were travelling <code>NE</code> and hit the east edge of the grid, it would change direction to <code>NW</code>. If the spot were to hit the corner of the grid it would change to the opposite direction.</p>

<p>Given a grid size, two points $A$ and $B$ lying on the grid, and an initial direction, you are to determine if the spot moves from $A$ to $B$ and, if so, how far the spot moves (in terms of number of grid positions) before reaching $B$ the first time.</p>

### 입력

<p>The input consists of an integer $n$, followed by $n$ data sets. Each data set begins with a line containing $r$ and $c$, followed by two lines containing the coordinates of points $A$ and $B$ respectively, followed by one line containing <code>NE</code>, <code>NW</code>, <code>SE</code>, or <code>SW</code> - the initial direction of travel.</p>

### 출력

<p>For each case, print a sentence as shown below indicating whether or not $B$ can be reached, and, if it can, how far the spot moves before reaching $B$.</p>