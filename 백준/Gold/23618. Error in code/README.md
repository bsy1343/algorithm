# [Gold I] Error in code - 23618

[문제 링크](https://www.acmicpc.net/problem/23618)

### 성능 요약

시간 제한: 5 초 (추가 시간 없음), 메모리 제한: 256 MB

### 통계

제출: 45, 정답: 14, 맞힌 사람: 13, 정답 비율: 36.111%

### 분류

다이나믹 프로그래밍, 그래프 이론, 최단 경로, 플로이드–워셜

### 문제 설명

<p>A rookie programmer wrote a program in C++.</p>

<ul>
	<li>First, the program reads the adjacency matrix of an undirected graph for $N$ nodes and writes it into an array of 32-bit integers $g$. After reading the value $g[u][v]$ equals one if the graph has an edge between the nodes $u$ and $v$, or $9999$, if there is no edge (for $1 \leq u \neq v \leq N$). The main diagonal in the matrix consists of zeroes.</li>
	<li>After reading the graph the following piece of code in the program is run:
	<pre>
for (int w = 1; w &lt; N; w = w + 1) {
&nbsp; &nbsp; for (int u = 1; u &lt; N; u = u + 1) {
&nbsp; &nbsp; &nbsp; &nbsp; for (int v = 1; v &lt; N; v = v + 1) {
&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; g[u][v] = min(g[u][v], g[u][w] + g[w][v]);
&nbsp; &nbsp; &nbsp; &nbsp; }
&nbsp; &nbsp; }
}</pre>
	</li>
	<li>After that, the resulting matrix is written into a file.</li>
</ul>

<p>The programmer launched his program on a set of graphs, and after some tedious waiting finally decided to take a look at the results. Which were, of course, disappointing. You guessed right --- the programmer wanted to calculate the matrix of the shortest distances between all nodes in the graph. However, the program was flawed. The programmer can fix everything himself, but waiting for the program to recalculate the results takes too much precious time. We suggest that you write a program that takes the results of the unlucky programmer&#39;s code and returns a matrix of the shortest distances.</p>

### 입력

<p>The first line of the input file contains a single integer $N$ ($1 \leq N \leq 2\,000$). The $i$th of the following $N$ lines contains a sequence of $N$ numbers, with the $j$th number equal to the value $g[i][j]$ after running the algorithm provided above ($0 \le g[i][j] \le 9999$).</p>

### 출력

<p>Print $N$ lines. The $i$th line must contain a sequence of space-separated numbers, with the $j$th number equal to the length of the shortest path in the graph between the nodes $i$ and $j$, or the number $9999$, if there is no path between these two nodes.</p>