# [Platinum III] PlayerUnknown's Battlegrounds - 23142

[문제 링크](https://www.acmicpc.net/problem/23142)

### 성능 요약

시간 제한: 1.5 초, 메모리 제한: 256 MB

### 통계

제출: 29, 정답: 12, 맞힌 사람: 11, 정답 비율: 50.000%

### 분류

다이나믹 프로그래밍, 자료 구조, 분할 정복, 스택, 데카르트 트리

### 문제 설명

<p>When Rikka was playing PUBG (PlayerUnknown&#39;s Battlegrounds), she could not win the game. So she decided to use some techniques this time. With the techniques, now Rikka can see clearly where all players are in the game.</p>

<p>In the game, the map can be denoted as a grid of size $n \times m$. Rikka uses software that can rate the enemy&#39;s combat value based on their performance. Now, there is exactly one enemy in each square, and all enemies&#39; combat values form a permutation of integers from $1$ to $n \cdot m$. Since Rikka is quite a green hand, she always cares about the weakest enemies (the less the enemy&#39;s combat value is, the weaker the enemy is).</p>

<p>We denote the square at row $i$, column $j$ as $(i,j)$. A subgrid can be defined by $((x_1,y_1), (x_2,y_2))$, where $1 \le x_1 \le x_2 \le n$ and $1 \le y_1 \le y_2 \le m$, and the subgrid itself is the squares $(x, y)$ for which $x_1 \le x \le x_2$ and $y_1 \le y \le y_2$. Two subgrids $((x_1,y_1), (x_2,y_2))$ and $((x_1&#39;,y_1&#39;), (x_2&#39;,y_2&#39;))$ are the same if and only if $((x_1,y_1),(x_2,y_2)) = ((x_1&#39;,y_1&#39;),(x_2&#39;,y_2&#39;))$.</p>

<p>For now, Rikka wants to know how many subgrids are there such that the weakest enemy&#39;s combat value in them is equal to $x$. Help her find the answers for all $x = 1, 2, \ldots, n \cdot m$.</p>

### 입력

<p>The first line of input contains two integers $n$ and $m$ ($1 \le n, m \le 300$).</p>

<p>Then follow $n$ lines. The $i$-th of them contains $m$ integers, where the $j$-th integer is the combat value of the enemy in $(i, j)$. It is guaranteed that the values form a permutation of integers from $1$ to $n \cdot m$.</p>

### 출력

<p>Print $n \cdot m$ lines, with one integer on each line.</p>

<p>The integer on the $i$-th line is the answer for $x = i$.</p>