# [Platinum V] Irregular Cakes (Small) - 12475

[문제 링크](https://www.acmicpc.net/problem/12475)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 23, 정답: 18, 맞힌 사람: 16, 정답 비율: 100.000%

### 분류

이분 탐색, 기하학, 매개 변수 탐색, 다각형의 넓이

### 문제 설명

<p>Mary the Mathematician has a bakery that she founded some years ago, but after all this time she has become bored with always baking the same rectangular and circular cakes. For her next birthday, she wants to bake an&nbsp;<em>irregular</em>&nbsp;cake, which is defined as the area between two &quot;polylines&quot; between x=0 and x=<strong>W</strong>. These polylines will be called the lower boundary and the upper boundary.</p>

<p><img src="https://onlinejudgeimages.s3.amazonaws.com/problem/12475/images-38.png" style="border:0px; opacity:0.9; vertical-align:middle" /></p>

<p>Formally, a polyline is defined by a sequence of points (P<sub>0</sub>, P<sub>1</sub>, ..., P<sub>n</sub>) going from left to right. Consecutive points are connected to form a sequence of line segments, which together make up the polyline.</p>

<p>Today is Mary&#39;s birthday and she has baked an irregular cake bounded by two polylines with&nbsp;<strong>L</strong>&nbsp;points and&nbsp;<strong>U</strong>&nbsp;points respectively. After singing &quot;Happy Birthday,&quot; she wants to make&nbsp;<strong>G</strong>-1 vertical cuts to split the cake into&nbsp;<strong>G</strong>&nbsp;slices with equal area. She can then share these cake slices with all her guests. However, the irregular cake shape makes this task pretty tricky. Can you help her decide where to make the cuts?</p>

### 입력

<p>The first line of the input gives the number of test cases,&nbsp;<strong>T</strong>.&nbsp;<strong>T</strong>&nbsp;test cases follow. Each test case begins with a line containing four integers:&nbsp;<strong>W</strong>&nbsp;(the cake&#39;s width),&nbsp;<strong>L</strong>&nbsp;(the number of points on the lower boundary),&nbsp;<strong>U</strong>&nbsp;(the number of points on the upper boundary) and&nbsp;<strong>G</strong>&nbsp;(the number of guests at the party).</p>

<p>This is followed by&nbsp;<strong>L</strong>&nbsp;lines specifying the lower boundary. The i-th line contains two integers x<sub>i</sub>&nbsp;and y<sub>i</sub>, representing the coordinates of the i-th point on the lower boundary. This is followed by&nbsp;<strong>U</strong>&nbsp;more lines specifying the upper boundary. The j-th line here contains two integers x<sub>j</sub>&nbsp;and y<sub>j</sub>, representing the coordinates of the j-th point on the upper boundary.</p>

<h3>Limits</h3>

<ul>
	<li>1 &le;&nbsp;<strong>T</strong>&nbsp;&le; 100.</li>
	<li>1 &le;&nbsp;<strong>W</strong>&nbsp;&le; 1000.</li>
	<li>2 &le;&nbsp;<strong>L</strong>&nbsp;&le; 100.</li>
	<li>2 &le;&nbsp;<strong>U</strong>&nbsp;&le; 100.</li>
	<li>All coordinates will be integers between -1000 and 1000, inclusive.</li>
	<li>The x-coordinate of the leftmost point of both boundaries will be 0.</li>
	<li>The x-coordinate of the rightmost point of both boundaries will be&nbsp;<strong>W</strong>.</li>
	<li>Points in the same boundary will be sorted increasingly by x-coordinate.</li>
	<li>Points in the same boundary will have different x-coordinates.</li>
	<li>The lower boundary will always be strictly below the upper boundary for all x between 0 and&nbsp;<strong>W</strong>, inclusive. (In other words, the lower boundary will have a smaller y-coordinate than the upper boundary at every x position.)</li>
	<li>2 &le;&nbsp;<strong>G</strong>&nbsp;&le; 3.</li>
</ul>

### 출력

<p>For each test case, output&nbsp;<strong>G</strong>&nbsp;lines. The first line should be &quot;Case #x:&quot; where x is the case number (starting from 1). The next&nbsp;<strong>G</strong>-1 lines should contain the x-coordinates at which cuts must be made, ordered from the leftmost cut to the rightmost cut.</p>

<p>Answers with a relative or absolute error of at most 10<sup>-6</sup>&nbsp;will be considered correct.</p>