# [Platinum I] HIPERPROSTOR - 5815

[문제 링크](https://www.acmicpc.net/problem/5815)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 64 MB

### 통계

제출: 100, 정답: 28, 맞힌 사람: 19, 정답 비율: 29.688%

### 분류

데이크스트라, 그래프 이론, 수학, 최단 경로

### 문제 설명

<p>In the distant future, food is transported between planets via one-way trade routes. Each route directly connects two planets and has a known transit time.&nbsp;</p>

<p>The traders&#39; guild plans to add some new routes utilizing a recently discovered technology &ndash; hyperspace travel. Travelling via hyperspace is also one-directional. Since it is still experimental, hyperspace travel time is not yet known, however it is known not to depend on distances between planets, so each hyperspace route will take an equal amount of time to traverse.&nbsp;</p>

<p>The picture below shows an example of three interconnected planets with transit times shown. The planets are labelled with positive integers, and the hyperspace travel time is denoted by &ldquo;x&rdquo; (the picture corresponds to the second example input):&nbsp;</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/5815.%E2%80%85HIPERPROSTOR/b34a15b4.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/5815.%E2%80%85HIPERPROSTOR/b34a15b4.png" data-original-src="https://upload.acmicpc.net/355c6bd2-a158-47a2-a2e9-d8313b4d3dfc/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 270px; height: 157px;" /></p>

<p>Transit time is measured in days and is always a positive integer.&nbsp;</p>

<p>The traders&#39; guild wishes to analyze the consequences of introducing the new routes: for some two planets A and B, they want to know what are all the possible values of the shortest path total transit time from A to B, for all possible values of x. For example, in the situaton above, shortest path travel from planet 2 to planet 1 could take 5 (if x &ge; 5), 4, 3, 2, or 1 day (if x &lt; 5).&nbsp;</p>

### 입력

<p>The first line of input contains the two integers P and R, the number of planets and the number of routes, respectively (1 &le; P &le; 500, 0 &le; R &le; 10 000).&nbsp;</p>

<p>Each of the following R lines contains two integers C and D, the planet labels (1 &le; C, D &le; P, C &ne; D), and T, the travel time from C to D. For conventional routes, T is an integer (1 &le; T &le; 1 000 000), and for hyperspace routes, T is the character &ldquo;x&rdquo;. Multiple lines can exist between the same two planets.&nbsp;</p>

<p>The following line contains the integer Q, the number of queries (1 &le; Q &le; 10).&nbsp;</p>

<p>Each of the following Q lines contains two integers A and B, the planet labels (A &ne; B) representing a query by the traders&#39; guild: &ldquo;what are the possible values of shortest path transit time from A to B?&rdquo;.&nbsp;</p>

### 출력

<p>The output must contain Q rows, one per query.&nbsp;</p>

<p>Each row must contain two integers: the number of different values and their sum. If the number of different values is unbounded, output only &quot;inf&quot; in that row. If there is no path from A to B, the number of different values and their sum is 0.</p>

### 힌트

<p>Clarification of the first example:</p>

<ol>
	<li>There is no possible path from 2 to 1.&nbsp;</li>
	<li>For any positive integer x, the shortest path from 1 to 3 takes 2x time, so the solution is &quot;inf&quot;.&nbsp;</li>
	<li>The shortest path from 1 to 4 can take 3 (for x = 1), 6 (for x = 2), or 8 (for x &gt;= 3) time. 3+6+8=17&nbsp;</li>
</ol>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/5815.%E2%80%85HIPERPROSTOR/a72885ec.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/5815.%E2%80%85HIPERPROSTOR/a72885ec.png" data-original-src="https://upload.acmicpc.net/1bb62512-4984-4f1d-a067-56bd59f9474f/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 377px; height: 94px;" /></p>