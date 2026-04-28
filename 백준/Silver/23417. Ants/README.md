# [Silver IV] Ants - 23417

[문제 링크](https://www.acmicpc.net/problem/23417)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 256 MB

### 통계

제출: 28, 정답: 22, 맞힌 사람: 15, 정답 비율: 83.333%

### 분류

구현

### 문제 설명

<p>Treasure hunting is a challenge that takes an inventive mind. Behold! &lt;&lt;Ants&gt;&gt;, a game that will peak your creativity!</p>

<p>The game is played in a $n \times m$ field, with chairs in some of its cells. There is also an anthill in the field. Beginning from the first second, ants crawl out, one per second, each aiming for its favorite chair. They take the shortest route; it takes an ant one second to move from a cell to any of its neighbor cells. Two cells are considered neighbors if they share a common edge. Having reached its favorite chair, the ant annihilates with joy. All that&#39;s left to the player is to observe and count the number of ants coming to their end on each second.</p>

<p>The ant is a tiny creature, and chairs do not block its movement in any way. There can be a chair in any of the game field cells, including the cell with the anthill.</p>

### 입력

<p>The first line of the input file contains five integers $n$, $m$, $k$, $r$, $c$  --- the field size, number of chairs and anthill coordinates, respectively ($1 \le n, m \le 100$, $1 \le k \le n \cdot m$, $1 \le r \le n, 1 \le c \le m$).</p>

<p>Next comes the description of the field --- a rectangular table of $n$ lines and $m$ columns. Each cell of the table contains a non-negative integer $i$ ($i \le k$). If $i = 0$, the cell is empty, otherwise it contains a chair with the number $i$.</p>

<p>It is guaranteed that all integers from $1$ to $k$ occur in this table once. The favorite chair of the ant which crawls out of the anthill on the $i$th second has the number $i$.</p>

### 출력

<p>In the first line of the output file, print the integer $e$ --- the number of events describing the self-annihilation of ants. In the following $e$ lines, describe the events --- two integers per each --- the number of the second and the number of ants that have annihilated during that second. Moments in time must be strictly ascending, and the number of ants in each event must be positive.</p>