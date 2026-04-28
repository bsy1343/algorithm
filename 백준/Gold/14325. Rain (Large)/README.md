# [Gold I] Rain (Large) - 14325

[문제 링크](https://www.acmicpc.net/problem/14325)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 172, 정답: 105, 맞힌 사람: 91, 정답 비율: 62.759%

### 분류

구현, 자료 구조, 그래프 이론, 그래프 탐색, 너비 우선 탐색, 우선순위 큐

### 문제 설명

<p>There&#39;s an island in the sea. The island can be described as a matrix with&nbsp;R&nbsp;rows and&nbsp;C&nbsp;columns, with&nbsp;H[i][j]&nbsp;indicating the height of each unit cell. Following is an example of a 3*3 island:</p>

<pre>
3 5 5
5 4 5
5 5 5
</pre>

<p>Sometimes, a heavy rain falls evenly on every cell of this island. You can assume that an arbitrarily large amount of water falls. After such a heavy rain, some areas of the island (formed of one or more unit cells joined along edges) might collect water. This can only happen if, wherever a cell in that area shares an edge (not just a corner) with a cell outside of that area, the cell outside of that area has a larger height. (The surrounding sea counts as an infinite grid of cells with height 0.) Otherwise, water will always flow away into one or more of the neighboring areas (for our purposes, it doesn&#39;t matter which) and eventually out to sea. You may assume that the height of the sea never changes. We will use W[i][j] to denote the heights of the island&#39;s cells after a heavy rain. Here are the heights of the example island after a heavy rain. The cell with initial height 4 only borders cells with higher initial heights, so water will collect in it, raising its height to 5. After that, there are no more areas surrounded by higher cells, so no more water will collect. Again, note that water cannot flow directly between cells that intersect only at their corners; water must flow along shared edges.<br />
Following is the height of the example island after rain:</p>

<pre>
3 5 5
5 5 5
5 5 5
</pre>

<p>Given the matrix of the island, can you calculate the total increased height sum(W[i][j]-H[i][j]) after a heavy rain?</p>

<ul>
</ul>

### 입력

<p>The first line of the input gives the number of test cases,&nbsp;T.&nbsp;T&nbsp;test cases follow.<br />
The first line of each test case contains two numbers&nbsp;R&nbsp;and&nbsp;C&nbsp;indicating the number of rows and columns of cells on the island. Then, there are&nbsp;R&nbsp;lines of&nbsp;C&nbsp;positive integers each. The j-th value on the i-th of these lines gives&nbsp;H[i][j]: the height of the cell in the i-th row and the j-th column.</p>

<p>Limits</p>

<ul>
	<li>1 &le;&nbsp;T&nbsp;&le; 100.</li>
	<li>1 &le;&nbsp;H[i][j]&nbsp;&le; 1000.</li>
	<li>1 &le;&nbsp;R&nbsp;&le; 50.</li>
	<li>1 &le;&nbsp;C&nbsp;&le; 50.</li>
</ul>

### 출력

<p>For each test case, output one line containing&nbsp;<code>Case #x: y</code>, where&nbsp;<code>x</code>&nbsp;is the test case number (starting from 1) and&nbsp;<code>y</code>&nbsp;is the total increased height.</p>

### 힌트

<p>Case 1 is explained in the statement.</p>

<p>In case 2, the island looks like this after the rain:</p>

<pre>
5 5 5 1
5 2 2 5
5 2 5 5
5 2 5 8
</pre>

<p>Case 3 remains unchanged after the rain.</p>