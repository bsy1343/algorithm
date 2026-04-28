# [Platinum I] Revenge of the Endless BFS - 15526

[문제 링크](https://www.acmicpc.net/problem/15526)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 49, 정답: 24, 맞힌 사람: 19, 정답 비율: 52.778%

### 분류

수학, 그래프 이론, 자료 구조, 이분 탐색, 최단 경로, 매개 변수 탐색, 분할 정복을 이용한 거듭제곱, 희소 배열, 플로이드–워셜, 비트 집합

### 문제 설명

<p>Mr. Endo wanted to write the code that performs breadth-first search (BFS), which is a search algorithm to explore all vertices on a <strong><em>directed</em></strong> graph. An example of pseudo code of BFS is as follows:</p>

<pre>
1: <em>current</em> &larr; {<em>start_vertex</em>}
2: <em>visited</em> &larr; <em>current</em>
3: while <em>visited</em> &ne; the set of all the vertices
4:   <em>found</em> &larr; {}
5:   for <em>u</em> in <em>current</em>
6:     for each <em>v</em> such that there is an edge from <em>u</em> to <em>v</em>
7:       <em>found</em> &larr; <em>found</em> &cup; {<em>v</em>}
8:   <em>current</em> &larr; <em>found</em> ∖ <em>visited</em>
9:   <em>visited</em> &larr; <em>visited</em> &cup; <em>found</em></pre>

<p>However, Mr. Endo apparently forgot to manage visited vertices in his code. More precisely, he wrote the following code:</p>

<pre>
1: <em>current</em> &larr; {<em>start_vertex</em>}
2: while <em>current</em> &ne; the set of all the vertices
3:   <em>found</em> &larr; {}
4:   for <em>u</em> in <em>current</em>
5:     for each <em>v</em> such that there is an edge from <em>u</em> to <em>v</em>
6:       <em>found</em> &larr; <em>found</em> &cup; {<em>v</em>}
7:   <em>current</em> &larr; <em>found</em></pre>

<p>You may notice that for some graphs, Mr. Endo&#39;s program will not stop because it keeps running infinitely. Notice that it does not necessarily mean the program cannot explore all the vertices within finite steps. Your task here is to make a program that determines whether Mr. Endo&#39;s program will stop within finite steps for a given directed graph in order to point out the bug to him. Also, calculate the minimum number of loop iterations required for the program to stop if it is finite. Since the answer might be huge, thus print the answer modulo 10<sup>9</sup> + 7, which is a prime number.</p>

### 입력

<p>The input consists of a single test case formatted as follows.</p>

<pre>
N M
u<sub>1</sub> v<sub>1</sub>
.
.
.
u<sub>M</sub> v<sub>M</sub></pre>

<p>The first line consists of two integers <em>N</em> (2 &le; <em>N</em> &le; 500) and <em>M</em> (1 &le; <em>M</em> &le; 200,000), where <em>N</em> is the number of vertices and <em>M</em> is the number of edges in a given directed graph, respectively. The <em>i</em>-th line of the following <em>M</em> lines consists of two integers <em>u<sub>i</sub></em> and <em>v<sub>i</sub></em> (1 &le; <em>u<sub>i</sub></em>, <em>v<sub>i</sub></em> &le; <em>N</em>), which means there is an edge from <em>u<sub>i</sub></em> to <em>v<sub>i</sub></em> in the given graph. The vertex 1 is the start vertex, i.e. <em>start_vertex</em> in the pseudo codes. You can assume that the given graph also meets the following conditions.</p>

<ul>
	<li>The graph has no self-loop, i.e., <em>u<sub>i</sub></em> &ne; <em>v<sub>i</sub></em> for all 1 &le; <em>i</em> &le; <em>M</em>.</li>
	<li>The graph has no multi-edge, i.e., (<em>u<sub>i</sub></em>, <em>v<sub>i</sub></em>) &ne; (<em>u<sub>j</sub></em>, <em>v<sub>j</sub></em>) for all 1 &le; <em>i</em> &lt; <em>j</em> &le; <em>M</em>.</li>
	<li>For each vertex <em>v</em>, there is at least one path from the start vertex 1 to <em>v</em>.</li>
</ul>

### 출력

<p>If Mr. Endo&#39;s wrong BFS code cannot stop within finite steps for the given input directed graph, print -1 in a line. Otherwise, print the minimum number of loop iterations required to stop modulo 10<sup>9</sup> + 7.</p>