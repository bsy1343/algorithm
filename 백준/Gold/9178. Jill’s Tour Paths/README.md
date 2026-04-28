# [Gold V] Jill’s Tour Paths - 9178

[문제 링크](https://www.acmicpc.net/problem/9178)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 69, 정답: 35, 맞힌 사람: 19, 정답 비율: 46.341%

### 분류

백트래킹, 그래프 이론, 그래프 탐색, 정렬

### 문제 설명

<p>Every year, Jill takes a bicycle tour between two villages. There are different routes she can take between these villages, but she does have an upper limit on the distance that she wants to travel. Given a map of the region indicating the cities and the roads between them (and their distances), Jill would like to have a list of the various routes between the selected cities that will meet her distance requirements. Your task is to write a program that will produce a list of these routes, in increasing order of distance.</p>

<p>We make the following assumptions.</p>

<ul>
	<li>At most one road connects any pair of villages, and this road is two-way and has a non-zero positive distance.</li>
	<li>There are no roads that lead directly from a village back to the same village.</li>
	<li>Jill is only concerned about a one-way trip. That is, she is not concerned about returning to the village from which she starts her tour.</li>
	<li>Jill will not visit any village more than once during the tour.</li>
	<li>The farthest Jill will ever travel is 9999 units</li>
</ul>

### 입력

<p>The input will contain several possible cases, each including a route map, identification of the start and destination villages, and the maximum distance Jill is willing to travel.</p>

<p>Each case appears in the input as a set of integers separated by blanks and/or ends of lines. The order and interpretation of these integers in each case is as follows:</p>

<ul>
	<li>NV &ndash; the number of villages in the route map. This number will be no larger than 20.</li>
	<li>NR &ndash; the number of roads that appear in the route map. Each road connects a distinct pair of villages.</li>
	<li>NR triples, one for each road, containing C1, C2, and DIST &ndash; C1 and C2 identify two villages connected by a road, and DIST gives the distance between these villages on that road.</li>
	<li>SV, DV &ndash; the numbers associated with the start and destination villages; the villages are numbered 1 to NV.</li>
	<li>MAXDIST &ndash; the maximum distance Jill is willing to travel (one way).</li>
</ul>

<p>The data for the last case will be followed by a single integer with the value &ndash;1.</p>

### 출력

<p>For each case, display the case number (1, 2, &hellip;) on the first line of output. Then, each on a separate additional line, list the routes that Jill might take preceded by the length of the route. Order the routes first by length, from shortest to longest. Within routes having the same length, order them in increasing lexicographic order. The sample input and output provide suitable examples, and the formatting shown there should be followed closely (each village number should be separated by a single space).</p>

<p>Separate the output for consecutive cases by a single blank line.</p>

<p>불가능한 경우에는 &quot; NO ACCEPTABLE TOURS&quot;를 출력한다.</p>