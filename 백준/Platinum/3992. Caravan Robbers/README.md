# [Platinum II] Caravan Robbers - 3992

[문제 링크](https://www.acmicpc.net/problem/3992)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 328, 정답: 62, 맞힌 사람: 49, 정답 비율: 17.314%

### 분류

이분 탐색, 볼록 껍질을 이용한 최적화, 매개 변수 탐색

### 문제 설명

<p>Long long ago in a far far away land there were two great cities and The Great Caravan Road between them. Many robber gangs &ldquo;worked&rdquo; on that road.</p>

<p>By an old custom the i-th band robbed all merchants that dared to travel between a<sub>i</sub> and b<sub>i</sub> miles of The Great Caravan Road. The custom was old, but a clever one, as there were no two distinct i and j such that a<sub>i</sub> &le; a<sub>j</sub> and b<sub>j</sub> &le; b<sub>i</sub>. Still when intervals controlled by two gangs intersected, bloody fights erupted occasionally. Gang leaders decided to end those wars. They decided to assign each gang a new interval such that all new intervals do not intersect (to avoid bloodshed), for each gang their new interval is subinterval of the old one (to respect the old custom), and all new intervals are of equal length (to keep things fair).</p>

<p>You are hired to compute the maximal possible length of an interval that each gang would control after redistribution.</p>

### 입력

<p>The first line contains n (1 &le; n &le; 100 000) &mdash; the number of gangs. Each of the next n lines contains information about one of the gangs &mdash; two integer numbers a<sub>i</sub> and b<sub>i</sub> (0 &le; a<sub>i</sub> &lt; b<sub>i</sub> &le; 1 000 000). Data provided in the input file conforms to the conditions laid out in the problem statement.</p>

### 출력

<p>Output the maximal possible length of an interval in miles as an irreducible fraction p/q.</p>

### 힌트

<p>In the above example, one possible set of new intervals that each gang would control after redistribution is given below.</p>

<ul>
	<li>The first gang would control an interval between 7/2 = 3.5 and 12/2 = 6 miles which has length of 5/2 and is a subinterval of its original (2, 6).</li>
	<li>The second gang would control an interval between 2/2 = 1 and 7/2 = 3.5 miles which has length of 5/2 and is a subinterval of its original (1, 4).</li>
	<li>The third gang would control an interval between 16/2 = 8 and 21/2 = 10.5 miles which has length of 5/2 and is a subinterval of its original (8, 12).</li>
</ul>