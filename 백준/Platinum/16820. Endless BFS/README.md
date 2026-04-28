# [Platinum IV] Endless BFS - 16820

[문제 링크](https://www.acmicpc.net/problem/16820)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 67, 정답: 25, 맞힌 사람: 23, 정답 비율: 76.667%

### 분류

그래프 이론, 그래프 탐색, 너비 우선 탐색, 최단 경로, 홀짝성

### 문제 설명

<p>Mr. Endo wanted to write the code that performs breadth-first search (BFS), which is a search algorithm to explore all vertices on an undirected graph. An example of pseudo code of BFS is as follows:</p>

<pre class="mathjax">
1: $current \leftarrow \{start\_vertex\}$
2: $visited \leftarrow current$
3: while $visited \ne$ the set of all the vertices
4:   $found \leftarrow \{\}$
5:   for $v$ in $current$
6:     for each $u$ adjacent to $v$
7:       $found \leftarrow found \cup \{u\}$
8:   $current \leftarrow found \setminus visited$
9:   $visited \leftarrow visited \cup found$</pre>

<p>However, Mr. Endo apparently forgot to manage visited vertices in his code. More precisely, he wrote the following code:</p>

<pre class="mathjax">
1: $current \leftarrow \{start\_vertex\}$
2: while $current \ne$ the set of all the vertices
3:   $found \leftarrow \{\}$
4:   for $v$ in $current$
5:     for each $u$ adjacent to $v$
6:       $found \leftarrow found \cup \{u\}$
7:   $current \leftarrow found$</pre>

<p>You may notice that for some graphs, Mr. Endo&#39;s program will not stop because it keeps running infinitely. Notice that it does not necessarily mean the program cannot explore all the vertices within finite steps. See example 2 below for more details.Your task here is to make a program that determines whether Mr. Endo&#39;s program will stop within finite steps for a given graph in order to point out the bug to him. Also, calculate the minimum number of loop iterations required for the program to stop if it is finite.</p>

### 입력

<p>The input consists of a single test case formatted as follows.</p>

<pre class="mathjax">
$N$ $M$
$U_{1}$ $V_{1}$
$\vdots$
$U_{M}$ $V_{M}$</pre>

<p>The first line consists of two integers $N$ ($2 \le N \le 100{,}000$) and $M$ ($1 \le M \le 100{,}000$), where $N$ is the number of vertices and $M$ is the number of edges in a given undirected graph, respectively. The $i$-th line of the following $M$ lines consists of two integers $U_{i}$ and $V_{i}$ ($1 \le U_{i}, V_{i} \le N$), which means the vertices $U_{i}$ and $V_{i}$ are adjacent in the given graph. The vertex 1 is the start vertex, i.e. $start\_vertex$ in the pseudo codes. You can assume that the given graph also meets the following conditions.</p>

<ul>
	<li>The graph has no self-loop, i.e., $U_{i} \ne V_{i}$ for all $1 \le i \le M$.</li>
	<li>The graph has no multi-edge, i.e., $\{U_{i}, V_{i}\} \ne \{U_{j}, V_{j}\} $ for all $1 \le i &lt; j \le M$.</li>
	<li>The graph is connected, i.e., there is at least one path from $U$ to $V$ (and vice versa) for all vertices $1 \le U, V \le N$.</li>
</ul>

### 출력

<p>If Mr. Endo&#39;s wrong BFS code cannot stop within finite steps for the given input graph, print -1 in a line. Otherwise, print the minimum number of loop iterations required to stop.</p>