# [Platinum I] 36 Puzzle - 19180

[문제 링크](https://www.acmicpc.net/problem/19180)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 64 MB

### 통계

제출: 115, 정답: 17, 맞힌 사람: 14, 정답 비율: 15.730%

### 분류

애드 혹, 해 구성하기, 구현, 시뮬레이션

### 문제 설명

<p>A <em>36-puzzle</em>&nbsp;consists of 36 square tiles. These squares form one $6 \times 6$ square. Each of the tiles is labeled with either a letter of the Latin alphabet or an Arabic digit. The objective of the game is to place the squares in the following order:</p>

<pre>
abcdef
ghijkl
mnopqr
stuvwx
yz0123
456789</pre>

<p>This must be achieved by performing a sequence of moves. In each move, all squares in one row or column can be shifted cyclically. For example, in the above position, after shifting the first row by two positions to the right, one gets:</p>

<pre>
efabcd
ghijkl
mnopqr
stuvwx
yz0123
456789</pre>

<p>Given some order of the squares, find any sequence of moves that achieves the desired order.</p>

### 입력

<p>The input consists of six lines. Each line contains six characters: lowercase letters or digits. The $i$-th line describes labels on squares in the $i$-th row. Each possible label will appear exactly once. You can assume that for the test data, there will be always exist a solution.</p>

### 출력

<p>Print the descriptions of moves. A description of a single move consists of the row or column number $i$ ($1 \le i \le 6$), the direction of the shift $d$ ($d$ should be &quot;<code>L</code>&quot; for shifting a row to the left, &quot;<code>R</code>&quot; for shifting a row to the right, &quot;<code>U</code>&quot; for shifting a column upwards or &quot;<code>D</code>&quot; for shifting a column downwards) and $k$, the number of squares to shift by ($1 \le k \le 5$). Consecutive moves must be printed on separate lines.</p>