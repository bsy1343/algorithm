# [Gold III] Find Poly - 32019

[문제 링크](https://www.acmicpc.net/problem/32019)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 9, 정답: 7, 맞힌 사람: 7, 정답 비율: 77.778%

### 분류

자료 구조, 깊이 우선 탐색, 분리 집합, 그래프 이론, 그래프 탐색, 파싱, 문자열

### 문제 설명

<p>Consider a set of line segments in a 2D plane.</p>

<p>For any set of line segments $L$, define $P(L)$ as the set of all endpoints of the line segments in $L$.</p>

<p>Two line segments are said to be <em>connected</em> if they share an endpoint.</p>

<p>Given a set of line segments $U$, we say that a <em>geometric figure</em> (&quot;figure&quot; for short) is a set $S$ of one or more line segments, $S \subseteq U$, for which</p>

<ol>
	<li>for any two points $p_1$ and $p_2$ in $P(S)$, we can reach $p_2$ from $p_1$ by tracing along one or more connected line segments, and</li>
	<li>for every line segment $e$ in $S$, all line segments of $U$ that are connected to $e$ are also in $S$.</li>
</ol>

<p>A <em>polygon</em> is a geometric figure $S$ for which it is possible to trace a path starting from some endpoint $p$ and ending at $p$ using every line segment in $S$ exactly once and visiting each point in $P(S)$ other than $p$, exactly once, visiting $p$ only at the beginning and end of the path.</p>

<p>See figure 1 which has 10 figures of which $a$, $b$, $e$, and $f$ are polygons. The dots are the end points of the line segments.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/32019.%E2%80%85Find%E2%80%85Poly/3506ea92.png" data-original-src="https://upload.acmicpc.net/96647987-ecdf-467b-be84-4e4cab9ea1ac/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 512px; height: 500px;" /></p>

<p style="text-align: center;">Figure 1: 10 figures, 4 polygons</p>

<p>Note that $b$ is self-intersecting but that the intersection is not at the end points of the intersecting line segments. Similarly $c$ and $d$ as well as $e$ and $f$ intersect but are not connected.</p>

<p>Your task is to count the total number of figures and identify how many are polygons.</p>

### 입력

<p>The input is a series of lines terminated by end-of-file. Each line will have one or more line segments of the form:</p>

<pre>
(x1,y1),(x2,y2);</pre>

<p>where <code>(x1,y1)</code> is one end point and <code>(x2,y2)</code> is the other end point.  $0 \leq x1, y1, x2, y2 \leq 99$.  All coordinates are integers.</p>

<p>The separator characters, &quot;(),;&quot;, may be preceded or followed by white space.  A line may be at most $100$ characters long.</p>

<p>There will be at most $200$ line segments.  A given line segment will only appear once in the input and none will be of length $0$.</p>

<p>Line segments are not directed so the order of the end points in the line segment is not significant. The order of the line segments in the input is also not significant.</p>

### 출력

<p>Print a single line containing two integers separated by a single space. The first number should be the total number of figures and the second should be the number of polygons found.</p>

<p>In the first example below, the points correspond to the picture in Figure 1.</p>