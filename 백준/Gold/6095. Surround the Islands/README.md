# [Gold IV] Surround the Islands - 6095

[문제 링크](https://www.acmicpc.net/problem/6095)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 35, 정답: 15, 맞힌 사람: 15, 정답 비율: 55.556%

### 분류

자료 구조, 분리 집합, 그래프 이론, 그래프 탐색

### 문제 설명

<p>Farmer John has bought property in the Caribbean and is going to try to raise dairy cows on a big farm composed of islands. Set in his ways, he wants to surround all the islands with fence.</p>

<p>Each island in the farm has the shape of a polygon. He fences the islands one side at a time (between a consecutive pair of vertices) and proceeds clockwise around a given island with his fencing operations. Since he wants to fence all the islands, he must at some point travel to any other islands using a boat.</p>

<p>He can start fencing at any vertex and, at any vertex he encounters, travel to some vertex on another island, fence all the way around it, and then IMMEDIATELY return back to the same vertex on the original island using the same path he traveled before. Each boat trip has a cost defined by a supplied matrix.</p>

<p>The islands are described by a set of N (3 &lt;= N &lt;= 500) pairs of vertices V1,V2 (1 &lt;= V1 &lt;= N; 1 &lt;= V2 &lt;= N) although you must figure out how to assemble them into islands. The vertices are conveniently numbered 1..N.</p>

<p>The cost of traveling by boat between each pair of vertices is given by a symmetric cost matrix whose elements fall in the range 0..1000.</p>

<p>What is the minimum cost of surrounding the islands with the fence?</p>

### 입력

<ul>
	<li>Line 1: A single integer: N</li>
	<li>Lines 2..N+1: Each line describes an island&#39;s border with two space-separated integers: V1 and V2</li>
	<li>Lines N+2..2*N+1: Line i-N-1 contains N integers that describe row i of the cost matrix: Row_i</li>
</ul>

### 출력

<ul>
	<li>Line 1: A single integer that specifies the minimum cost of building the fence</li>
</ul>

<p>&nbsp;</p>

### 힌트

<pre>
  1        10            4
    xxxxxxx              x
   xxxxxxxxx            xxxx
7 xxxxxxxxxxx 6        xxxxxxx
 xxxxxxxxxxx       11 xxxxxxxxxx 5
  xxxxxxx
   xxx
  3         12 xxxxxxx 2
              xxxxxxxx
              xxxxxxxx
             xxxxxxxxx
             xxxxxxxxx
            xxxxxxxxxx
            xxxxxxxxxx
          8 xxxxxxxxxx 9</pre>

<p>The example describes three islands: {1,7,3,6,10}, {4,5,11} and {2,9,8,12}. The travel costs are provided as a matrix. For example, the travel cost from vertex 1 to 2 is 15.</p>

<p>There is more than one solution. One is: FJ starts from vertex 3 then 7 and stops at 1, travels to 11 followed by 4,5,11. He then returns back to 1, and travels to 12 followed by 2,9,8,12. Finally, he returns back to 1 and continues with 10,6,3,7. The costs are 8 * 2 = 16 for traveling from 1 to 11 and returning back, and 7 * 2 = 14 for traveling from 1 to 12 and back -- a total cost of 30.</p>

<p>&nbsp;</p>