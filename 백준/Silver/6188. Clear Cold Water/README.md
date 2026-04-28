# [Silver II] Clear Cold Water - 6188

[문제 링크](https://www.acmicpc.net/problem/6188)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 395, 정답: 209, 맞힌 사람: 165, 정답 비율: 60.440%

### 분류

그래프 이론, 그래프 탐색, 트리, 너비 우선 탐색, 깊이 우선 탐색

### 문제 설명

<p>The steamy, sweltering summers of Wisconsin&#39;s dairy district stimulate the cows to slake their thirst. Farmer John pipes clear cold water into a set of N (3 &lt;= N &lt;= 99999; N odd) branching pipes conveniently numbered 1..N from a pump located at the barn. As the water flows through the pipes, the summer heat warms it. &nbsp;Bessie wants to find the coldest water so she can enjoy the weather more than any other cow.</p>

<p>She has mapped the entire set of branching pipes and noted that they form a tree with its root at the farm and furthermore that every branch point has exactly two pipes exiting from it. Surprisingly, every pipe is exactly one unit in length; of course, all N pipes connect up in one way or another to the pipe-tree.</p>

<p>Given the map of all the pipe connections, make a list of the distance from the barn for every branching point and endpoint. Bessie will use the list to find the very coldest water.</p>

<p>The endpoint of a pipe, which might enter a branching point or might be a spigot, is named by the pipe&#39;s number. The map contains C (1 &lt;= C &lt;= N) connections, each of which specifies three integers: the endpoint E_i (1 &lt;= E_i &lt;= N) of a pipe and two branching pipes B1_i and B2_i (2 &lt;= B1_i &lt;= N; 2 &lt;= B2_i &lt;= N). Pipe number 1 connects to the barn; the distance from its endpoint to the barn is 1.</p>

### 입력

<ul>
	<li>Line 1: Two space-separated integers: N and C</li>
	<li>Lines 2..C+1: Line i+1 describes branching point i with three space-separated integers: E_i, B1_i, and B2_i</li>
</ul>

<p>&nbsp;</p>

### 출력

<ul>
	<li>Lines 1..N: Line i of the output contains a single integer that is the distance from the barn to the endpoint of pipe i</li>
</ul>

### 힌트

<p>The input above describes this pipe map:</p>

<pre>
                   +------+
                    | Barn |
                    +------+
                       | 1
                       *
                    2 / \ 3
                         *
                      4 / \ 5</pre>

<p>Pipe 1 is always distance 1 from the barn. Pipes 2 and 3 connect directly to pipe 1 and thus are distance 2 from the barn. Pipes 4 and 5, which connect to pipe 3, are distance 3 from the barn.</p>