# [Platinum V] Islands - 5379

[문제 링크](https://www.acmicpc.net/problem/5379)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 128 MB

### 통계

제출: 60, 정답: 19, 맞힌 사람: 11, 정답 비율: 47.826%

### 분류

그래프 이론, 기하학, 최단 경로, 데이크스트라, 플로이드–워셜

### 문제 설명

<p>The financial crisis in Greece has major consequences for the Greeks, especially for those who live on one of the many islands. Some of them can not even afford to travel from one island to another by boat. They avoid having to go to another island as much as possible, but if they really must, they have to swim.</p>

<p>Since swimming is very exhausting and potentially dangerous, they would like to minimize the distance they have to swim as much as possible. In that regard, swimming directly from island A to B may not be the best option. Instead, it might be more beneficial to swim from A to C, then cross island C on foot, before swimming from C to B. The ideal travel plan could in fact involve a lot of islands.</p>

<p>You are given a collection of islands, modeled as simple polygons. Determine, for two given islands, the smallest possible total distance one needs to swim in order to get from the one island to the other. The total distance covered on land is of no importance.</p>

### 입력

<p>On the first line one positive number: the number of test cases, at most 100. After that per test case:</p>

<ul>
	<li>one line with one integer n (2 &le; n &le; 50): the number of islands.</li>
	<li>one line with two space-separated integers s and d (1 &le; s, d &le; n; s &ne; d): the islands that are the start and destination of the intended journey, respectively.</li>
	<li>per island:</li>
	<li>one line with one integer m (3 &le; m &le; 50): the number of vertices of the polygon describing the island.</li>
	<li>m lines with two space-separated integers x<sub>i</sub> and y<sub>i</sub> (-10 000 &le; x<sub>i</sub>, y<sub>i</sub> &le; 10 000): the coordinates of the i-th vertex of the polygon.</li>
</ul>

<p>The polygons (islands) are non-self-intersecting and do not overlap or touch each other. The vertices of the polygons are given in counterclockwise order.</p>

### 출력

<p>Per test case:</p>

<ul>
	<li>one line with one floating point number: the minimum distance one needs to swim in order to get from the start to the destination, rounded to three decimal places.</li>
</ul>

<p>The test cases are such that an absolute error of at most 10<sup>-6</sup> in the final answer does not influence the result of the rounding.</p>

### 힌트

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/5379.%E2%80%85Islands/3a0dd054.png" data-original-src="https://www.acmicpc.net/upload/images2/island.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:218px; width:225px" /></p>

<p>The island group as described by the second test case in the sample input. Indicated is the optimal path from the bottom left island to the top right one, which is the path that minimizes the total distance covered over water (indicated by the dashed lines).</p>