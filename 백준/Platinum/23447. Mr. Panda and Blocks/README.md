# [Platinum V] Mr. Panda and Blocks - 23447

[문제 링크](https://www.acmicpc.net/problem/23447)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 256 MB

### 통계

제출: 15, 정답: 9, 맞힌 사람: 8, 정답 비율: 57.143%

### 분류

애드 혹, 해 구성하기

### 문제 설명

<p>Mr. Panda recently received a bucket of toy blocks as his birthday gift. Each block is a $1 \times 1\times 2$ cuboid, which is constructed by a pair of face-to-face $1 \times 1 \times 1$ colored cubes. There are $n$ types of colors, labeled as $1, 2, \ldots, n$.</p>

<p>Mr. Panda checked all of the blocks, and he found that he had just $\frac{n \times (n+1)}{2}$ blocks and each of these blocks was painted with a unique pair of colors. That is, for each pair of colors $(i, j)$ $(1 \leq i \leq j \leq n)$, he had exactly one block with one cube colored $i$, and the other colored $j$.</p>

<p>Mr. Panda plans to build a fantastic castle with these blocks today.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/23447.%E2%80%85Mr.%E2%80%85Panda%E2%80%85and%E2%80%85Blocks/35d3d7f7.png" data-original-src="https://upload.acmicpc.net/cf42a707-1c90-4ad6-8f36-82cd305686e7/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 394px; height: 250px;" /></p>

<p>Firstly, he defines an attribute called <em>connected</em>:</p>

<ol>
	<li>&nbsp;If cube A shares a face with cube B, they are connected.</li>
	<li>&nbsp;If cube A and cube B are connected, and cube B and cube C are connected, then cube A and cube C are connected.</li>
	<li>&nbsp;If all pairs of cubes in the castle are connected, the castle is connected.</li>
</ol>

<p>Then he comes up with the following requirements:</p>

<ol>
	<li>The whole castle should be connected.</li>
	<li>For any color $i$, if only consider the cubes with that color, the sub-castle formed by these cubes should also be connected.</li>
</ol>

<p>However, after many attempts, Mr. Panda still cannot build such a castle. So he turns to you for help. Could you please help Mr. Panda to build a castle which meets all his requirements?</p>

### 입력

<p>The first line of the input gives the number of test cases, $T$ ($1 \leq T \leq 10$). $T$ test cases follow.</p>

<p>For each test case, one line contains an integer $n$ ($1 \leq n \leq 200$), representing the number of colors.</p>

### 출력

<p>For each test case, first output one line containing &quot;<code>Case #x:</code>&quot;, where <code>x</code> is the test case number (starting from 1).</p>

<p>If it&#39;s impossible to build a castle that satisfies Mr. Panda&#39;s requirements, output a single line containing &quot;NO&quot; (quotes for clarity).</p>

<p>If it&#39;s possible to build the castle, first output a single line containing &quot;YES&quot; (quotes for clarity).</p>

<p>Then, output $\frac{n \times (n+1)}{2}$ lines describing the coordinates of all the blocks. Each of these lines should be outputted in the form of $i,j,x_i,y_i,z_i,x_j,y_j,z_j$ $(1 \leq i \leq j \leq n, 0 \leq x_i, y_i, z_i, x_j, y_j, z_j \leq 10^{9}$), which means for the block $(i,j)$, the cube with color $i$ is located at $(x_i,y_i,z_i)$ and the other cube with color $j$ is located at $(x_j,y_j,z_j)$. You should make sure that each pair of $(i, j)$ occurs exactly once in your answer.</p>

<p>In case there is more than one solution, any of them will be accepted.</p>