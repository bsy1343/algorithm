# [Gold III] Playing Field - 30138

[문제 링크](https://www.acmicpc.net/problem/30138)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 7, 정답: 6, 맞힌 사람: 5, 정답 비율: 100.000%

### 분류

다이나믹 프로그래밍, 기하학, 수학, 다각형의 넓이, 누적 합

### 문제 설명

<p>My kid&#39;s school cleared a large field on their property recently to convert it into a playing area. The field is polygonal. The school administration decided to separate the field into two areas by building a straight picket fence between the area for the older kids and the area for the younger kids. The fence would go between two non-adjacent vertices of the polygonal field, and given the shape of the field, all such possible fences would lie strictly and entirely within the field.</p>

<p>Naturally, the smaller of the two areas would go to the younger kids. So can you help the school determine what the area of the smaller play-area would be for different fence positions?</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/4ae0425f-bdac-48a9-b6df-6fc8f7818864/-/preview/" /></p>

### 입력

<p>The first line contains 2 numbers N denoting the number of points in the convex polygon and Q denoting the number of possible locations of straight line fences.</p>

<p>The next N lines contain 2 integers each. The ith line contains the integers x<sub>i</sub> y<sub>i</sub> denoting the coordinates of the ith point of the polygon. The points are given in clockwise order.</p>

<p>The next Q lines contain 2 integers a b denoting that a straight line fence is to be drawn connecting a and b.</p>

### 출력

<p>Output Q lines one corresponding to each query. For each query, output the area of the smaller region for the corresponding query rounded to 1 decimal place. Always have 1 digit after the decimal place, so if the answer is 1, output it as 1.0 instead. Always have at least one digit before the decimal point also.</p>

### 제한

<ul>
	<li>4 &le; N &le; 50000</li>
	<li>1 &le; Q &le; 50000</li>
	<li>-20,000,000 &le; x,y &le; 20,000,000</li>
	<li>0 &le; a &lt; b-1</li>
	<li>b &lt; N</li>
</ul>

### 힌트

<p>The polygon is given by the points (0,0) (0,1) (1,2) (1,0).</p>

<p>In the first query, we join the points (0,1) and (1,0) which leads to the 2 areas given by (0,0) (0,1) (1,0) and (0,1) (1,2) (1,0). The first triangle has an area of 0.5 and the second triangle has an area of 1. The minimum of these 2 is 0.5.</p>

<p>In the second query, we join the points (0,0) and (1,2) which leads to the 2 areas given by (0,0) (0,1) (1,2) and (0,0) (1,2) (1,0). The first triangle has an area of 0.5 and the second triangle has an area of 1. The minimum of these 2 is 0.5.</p>