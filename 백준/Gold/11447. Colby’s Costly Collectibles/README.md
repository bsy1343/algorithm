# [Gold III] Colby’s Costly Collectibles - 11447

[문제 링크](https://www.acmicpc.net/problem/11447)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 258, 정답: 125, 맞힌 사람: 105, 정답 비율: 53.846%

### 분류

기하학, 구현, 다각형의 넓이, 시뮬레이션

### 문제 설명

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/11447.%E2%80%85Colby%E2%80%99s%E2%80%85Costly%E2%80%85Collectibles/dfb7d48c.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/11447/1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="float:right; height:261px; width:230px" />At the Colby&rsquo;s Costly Collectibles workshop, special jewels are manufactured. In his production process Colby first creates a large grid of stones, each of which has the shape of an equilateral triangle. From this grid he cuts out all kinds of shapes which he sells as pieces of jewellery. Customers can choose their preferred shape according to the following basic rules:</p>

<ol>
	<li>Cuts can only be made along the edges of the triangles.</li>
	<li>The jewel must consist of one piece. A connection at a vertex is too weak, so the triangles must be connected by their edges.</li>
	<li>The jewel cannot contain any holes.</li>
</ol>

<p>To illustrate the production process, a typical jewel is depicted in the figure on the right. This corresponds with the third test case in the samples below.</p>

<p>Since the customer has to pay per triangle, Colby has asked you to help him calculate the number of triangles used. You are given a description of the jewel&rsquo;s outer boundary. Note that it follows from rules 2 and 3 that the boundary will never intersect or touch itself.</p>

### 입력

<p>The input starts with a line containing an integer T, the number of test cases. Then for each test case:</p>

<ul>
	<li>One line with a single integer C, the number of cuts made. This number satisfies 3 &le; C &le; 100.</li>
	<li>Then C lines follow, describing the boundary of the jewel in counterclockwise orientation. Each line starts with a single letter x, y or z, denoting the direction in which to move, followed by an integer denoting the number of steps. The directions correspond with the axes depicted below:<br />
	<img alt="" src="%EB%B0%B1%EC%A4%80/Gold/11447.%E2%80%85Colby%E2%80%99s%E2%80%85Costly%E2%80%85Collectibles/70b6b203.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/11447/2.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:65px; width:92px" /><br />
	To further illustrate this, the first test case below describes a single triangle, starting from the lower left corner:<br />
	<img alt="" src="%EB%B0%B1%EC%A4%80/Gold/11447.%E2%80%85Colby%E2%80%99s%E2%80%85Costly%E2%80%85Collectibles/fb40e533.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/11447/3.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:48px; width:55px" /><br />
	(First take one step in the x direction, then one step in the z direction and finally one step in the negative y direction.)</li>
</ul>

<p><span style="line-height:1.6em">The boundary will never touch itself. It will always end up where it started and the total length of the boundary will not exceed 1000. The path starts at a vertex and the endpoint of every segment will again be a vertex. (In other words, no two consecutive edges in the input will be in the same direction, not even the first and the last edge.)</span></p>

### 출력

<p>For each test case, output one line with a single integer N, the number of triangles.</p>