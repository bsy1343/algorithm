# [Gold IV] Mooyo Mooyo - 16768

[문제 링크](https://www.acmicpc.net/problem/16768)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 2173, 정답: 1067, 맞힌 사람: 795, 정답 비율: 49.625%

### 분류

구현, 그래프 이론, 그래프 탐색, 시뮬레이션, 너비 우선 탐색, 깊이 우선 탐색

### 문제 설명

<p>With plenty of free time on their hands (or rather, hooves), the cows on Farmer John&#39;s farm often pass the time by playing video games. One of their favorites is based on a popular human video game called Puyo Puyo; the cow version is of course called Mooyo Mooyo.</p>

<p>The game of Mooyo Mooyo is played on a tall narrow grid $N$ cells tall ($1 \leq N \leq 100$) and 10 cells wide. Here is an example with $N = 6$:</p>

<pre>
0000000000
0000000300
0054000300
1054502230
2211122220
1111111223
</pre>

<p>Each cell is either empty (indicated by a 0), or a haybale in one of nine different colors (indicated by characters 1..9). Gravity causes haybales to fall downward, so there is never a 0 cell below a haybale.</p>

<p>Two cells belong to the same connected region if they are directly adjacent either horizontally or vertically, and they have the same nonzero color. Any time a connected region exists with at least $K$ cells, its haybales all disappear, turning into zeros. If multiple such connected regions exist at the same time, they all disappear simultaneously. Afterwards, gravity might cause haybales to fall downward to fill some of the resulting cells that became zeros. In the resulting configuration, there may again be connected regions of size at least $K$ cells. If so, they also disappear (simultaneously, if there are multiple such regions), then gravity pulls the remaining cells downward, and the process repeats until no connected regions of size at least $K$ exist.</p>

<p>Given the state of a Mooyo Mooyo board, please output a final picture of the board after these operations have occurred.</p>

### 입력

<p>The first line of input contains $N$ and $K$ ($1 \leq K \leq 10N$). The remaining $N$ lines specify the initial state of the board.</p>

### 출력

Please output $N$ lines, describing a picture of the final board state.

### 힌트

<p>In the example above, if $K = 3$, then there is a connected region of size at least $K$ with color 1 and also one with color 2. Once these are simultaneously removed, the board temporarily looks like this:</p>

<pre>
0000000000
0000000300
0054000300
1054500030
2200000000
0000000003
</pre>

<p>Then, gravity takes effect and the haybales drop to this configuration:</p>

<pre>
0000000000
0000000000
0000000000
0000000000
1054000300
2254500333
</pre>

<p>Again, there is a region of size at least $K$ (with color 3). Removing it yields the final board configuration:</p>

<pre>
0000000000
0000000000
0000000000
0000000000
1054000000
2254500000
</pre>