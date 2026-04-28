# [Silver III] Chairs - 26235

[문제 링크](https://www.acmicpc.net/problem/26235)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 31, 정답: 22, 맞힌 사람: 21, 정답 비율: 70.000%

### 분류

구현, 정렬

### 문제 설명

<p>Ostap and Kisa found themselves at a chair sale. They are facing two problems. First, they must leave the sale as soon as possible, because their rival company, represented by father Theodore, is breathing down their necks; second, they must get all chairs at the sale.</p>

<p>The sale site is a rectangular table of $N$ rows and $M$ columns, with some of its cells occupied by chairs that need to be collected. Initially our enterpreneurs are in the top-left corner  --- the cell with the coordinates $(1, 1)$, and the exit is located in the bottom-right corner  --- the cell with the coordinates $(N, M)$. A single move can transfer them from a given sell to any of adjacent by a side cells. Passing through a cell with a chair, they take the chair with them. Find a shortest path from the starting to the ending cell. Among all such paths, find one passing through all cells with chairs, or find out if such a path doesn&#39;t exist.</p>

### 입력

<p>The first line contains three integers: $N$, $M$, $K$  --- size of the table and the number of chairs,  respectively ($2 \le N, M \le 100$, $0 \le K \le 1000$).</p>

<p>The following $K$ lines of the input data each contain two integers: $X_i$  --- the number of the row in which the $i$-th chair is located, and $Y_i$  --- the number of the column in which the $i$-th chair is located ($1 \le X_i \le N$, $1 \le Y_i \le M$). A single cell cannot contain multiple chairs.</p>

### 출력

<p>If collecting all chairs along any single shortest path is impossible, print a single word  &lt;&lt;<code>Impossible</code>&gt;&gt; (without brackets) in the output file.</p>

<p>If such a path exists, print it as a line containing the sequence of moves, with each move coded by a single symbol according to the following:</p>

<ul>
	<li><code>R</code>  --- move right;</li>
	<li><code>D</code>  --- move down;</li>
</ul>

<p>If several solutions are possible, print the lexicographically smallest solution.</p>