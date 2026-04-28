# [Silver I] 3D Space Exploration - 5986

[문제 링크](https://www.acmicpc.net/problem/5986)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 220, 정답: 123, 맞힌 사람: 103, 정답 비율: 59.884%

### 분류

그래프 이론, 그래프 탐색, 너비 우선 탐색, 깊이 우선 탐색, 격자 그래프, 플러드 필

### 문제 설명

<p>Farmer John&#39;s cows have finally blasted off from earth and are now floating around space in their Moocraft. The cows want to reach their fiery kin on Io, a moon of Jupiter, but to do so they first must navigate the dangerous asteroid belt.</p>

<p>Bessie is piloting the craft and must guide it through this treacherous N x N x N (1 &lt;= N &lt;= 100) sector of space. All asteroids in this sector comprise some number of 1 x 1 x 1 blocks of space-rock connected along their faces (two blocks sharing only a vertex or only an edge count as two distinct asteroids).</p>

<p>Please help Bessie by counting the number of distinct asteroids in the field.</p>

<p>Consider a 3 x 3 x 3 space where the first slice of space looks like this, with &#39;M&#39; indicating the starting location of the Moocraft (1,1,1) and &#39;D&#39; is the destination at (3,3,3). In these maps, these markers serve mostly as map orientation rather than providing useful information to solve the problem.</p>

<p>In these diagrams and also in the input file, the *&#39;s represent asteroid chunks and each &#39;.&#39; represents a vast void of empty space.</p>

<pre>
   Close slice    Middle slice     Far Slice     Assembled with overlaps
     +---+            +---+          +---+                  +---+ Far
     |M..|            |..*|          |...|                  |...|
     |.*.|            |.*.|          |.*.|                +---+.|
     |...|            |*..|          |..D|                |..*|D|
     +---+            +---+          +---+              +---+.|-+
                                                        |M..|.|
                                                        |.*.|-+
                                                        |...|
                                                  Close +---+</pre>

<p>Visual inspection shows three asteroids, including a long one through the middle of the map. Here&#39;s a map with the asteroid pieces labelled:</p>

<pre>
                                 +---+ Far
                                 /|...|
                                / |.1.|
                               /  |...|
                              /   +---+
                             +---+   /
                            /|..3|  /  
                           / |.1.| /
                          /  |2..|/
                         /   +---+
                        +---+   /
                        |...|  /
                        |.1.| /
                        |...|/
                  Close +---+</pre>

### 입력

<ul>
	<li>Line 1: A single integer: N</li>
	<li>Lines 2..N^2+1: Line i-1 contains line 1 + ((k+1)%N) of slice int ((i+N-1)/N ): N characters</li>
</ul>

<p>&nbsp;</p>

### 출력

<ul>
	<li>Line 1: A single integer indicating the number of asteroids in the field</li>
</ul>

<p>&nbsp;</p>