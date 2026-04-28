# [Gold III] Server Relocation - 4842

[문제 링크](https://www.acmicpc.net/problem/4842)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 26, 정답: 10, 맞힌 사람: 10, 정답 비율: 45.455%

### 분류

그래프 이론, 그래프 탐색, 너비 우선 탐색, 데이크스트라

### 문제 설명

<p>Michael has a powerful computer server that has hundreds of parallel processors and terabytes of main memory and disk space. Many important computations run continuously on this server, and power must be supplied to the server without interruption.</p>

<p>Michael&#39;s server must be moved to accommodate new servers that have been purchased recently. Fortunately, Michael&#39;s server has two redundant power supplies&minus;&minus;&minus;as long as at least one of the two power supplies is connected to an electrical outlet, the server can continue to run. When the server is connected to an electrical outlet, it can be moved to any location which is not further away from the outlet than the length of the cord used to connect to the outlet.</p>

<p>Given which outlet Michael&#39;s server is plugged into initially and finally, and the locations of outlets in the server room, you should determine the smallest number of times you need to plug a cord into an electrical outlet in order to move the server while keeping the server running at all times. Note that, in the initial and final configuration, only one cord is connected to the power outlet.</p>

### 입력

<p>The first line of input is an integer giving the number of cases to follow. For each case, the first line is of the form</p>

<p>OUTLETS OUTLET_INITIAL OUTLET_FINAL LENGTH1 LENGTH2</p>

<p>where</p>

<ul>
	<li>OUTLETS is the number of outlets in the server room (2 &lt;= OUTLETS &lt;= 1000).</li>
	<li>OUTLET_INITIAL is the index (starting from 1) of the outlet the server is initially connected to.</li>
	<li>OUTLET_FINAL is the index (starting from 1) of the outlet the server is finally connected to.</li>
	<li>LENGTH1 and LENGTH2 are the positive lengths of the two power cords, with at most three digits of precision after the decimal point (0 &lt; LENGTH1, LENGTH2 &lt;= 30000).</li>
</ul>

<p>These are followed by OUTLETS lines giving the integer coordinates of the wall outlets, one per line, with the k&minus;th line giving the location of the k&minus;th outlet. All coordinates are specified as two integers (x&minus; and y&minus;coordinates) separated by a space, with absolute values at most 30000. You may assume that all coordinates are distinct, and that the initial outlet and the final outlet are different.</p>

### 출력

<p>For each case, print the minimum number of times you need to plug a cord into an electrical outlet in order to move the server to the final location while keeping the server running at all times. If this is not possible, print &quot;Impossible&quot;.</p>