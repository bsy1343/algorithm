# [Platinum I] Barricades - 8386

[문제 링크](https://www.acmicpc.net/problem/8386)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 54, 정답: 30, 맞힌 사람: 28, 정답 비율: 54.902%

### 분류

깊이 우선 탐색, 다이나믹 프로그래밍, 트리에서의 다이나믹 프로그래밍, 그래프 이론, 그래프 탐색, 트리

### 문제 설명

<p>Byteland is an island with a number of cities connected by two-way roads. Road network is designed in such a way, that there is exactly one possibility to drive between any pair of cities (without turning back).</p>

<p>Unfortunately, hard times have come - Byteland is preparing for a war. The Lead Strategiest of Byteland is preparing a plan of defence of Byteland, which takes into account creation of a&nbsp;<i>special security zone</i>. The zone will be created by blocking some of the existing roads in Byteland in such a way, that it won&#39;t be possible to drive through these roads. In order to make the zone completely secure, following rules have to be fulfilled:</p>

<ul>
	<li>from each city inside the zone it has to be possible to drive to any other city inside that zone,</li>
	<li>it is not possible to get from a city outside of the zone to the city inside the zone,</li>
	<li>zone has to consist of exactly <em>k</em>&nbsp;cities.</li>
</ul>

<p>Many different solutions to the problem are being considered - for different values of&nbsp;<em>k</em>, it is required to determine how many roads have to be blocked at minimum, to obtain a special security zone of size&nbsp;<em>k</em>&nbsp;(consisting of exactly&nbsp;<em>k</em>&nbsp;cities). Help the Lead Strategiest of Byteland - write a program which for specified value of&nbsp;<em>k</em>&nbsp;calculates required number of barricades.</p>

<p>Write a program which:</p>

<ul>
	<li>reads from the standard input description of the roads in Byteland and the set of queries (different&nbsp;<em>k</em>&nbsp;values),</li>
	<li>for each query program should determine the minimal possible number of barricades that are sufficient to construct a&nbsp;<i>special security zone</i>&nbsp;of required size,</li>
	<li>writes result to the standard output.</li>
</ul>

### 입력

<p>The first line of the standard input contains one integer <em>n</em>&nbsp;(1 &le; n &le; 3 000), representing the number of cities in Byteland. Cities are numbered with numbers 1, 2, ..., <em>n</em>.</p>

<p>Each of the following <em>n</em> - 1&nbsp;lines of the standard input contains pair of integers <em>a</em>, <em>b</em>&nbsp;(1 &le; <em>a</em>, <em>b</em> &le; <em>n</em>) separated with single space. Pair <em>a</em>, <em>b</em>&nbsp;represents a direct road connecting cities <em>a</em>&nbsp;and <em>b</em>. Each pair of cities is connected with at most one direct road.</p>

<p>In the following line of the standard input there is an integer <em>m</em>&nbsp;(1 &le; <em>m</em> &le; <em>n</em>) - it is the number of queries to process. Each of the following <em>m</em>&nbsp;lines contains one integer <em>k<sub>i</sub></em>&nbsp;(<em>k<sub>i</sub></em> &isin; {1, 2, 3, ..., <em>n</em>}). It represents query number <em>i</em>&nbsp;- the number of cities that have to be inside&nbsp;<em>i</em>&#39;th special security zone.</p>

### 출력

<p>Your program should write to the standard output exactly <em>m</em>&nbsp;numbers, each of them in a separate line. The number in <em>i</em>&#39;th line should be:</p>

<ul>
	<li>-1, if creation of a special security zone of size <em>k<sub>i</sub></em>&nbsp;is not possible,</li>
	<li>the minimal number of roads that have to be blocked in order to construct a special security zone of size&nbsp;<em>k<sub>i</sub></em>&nbsp;otherwise.</li>
</ul>