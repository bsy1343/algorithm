# [Gold IV] gCampus (Small) - 12078

[문제 링크](https://www.acmicpc.net/problem/12078)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 48, 정답: 24, 맞힌 사람: 22, 정답 비율: 50.000%

### 분류

데이크스트라, 그래프 이론, 최단 경로

### 문제 설명

<p>Company G has a main campus with&nbsp;<strong>N</strong>&nbsp;offices (numbered from 0 to&nbsp;<strong>N</strong>&nbsp;- 1) and&nbsp;<strong>M</strong>bidirectional roads (numbered from 0 to&nbsp;<strong>M</strong>&nbsp;- 1). The ith road connects a pair of offices (U<sub>i</sub>, V<sub>i</sub>), and it takes C<sub>i</sub>&nbsp;minutes to travel on it (in either direction).</p>

<p>A path between two offices X and Y is a series of one or more roads that starts at X and ends at Y. The time taken to travel a path is the sum of the times needed to travel each of the roads that make up the path. (It&#39;s guaranteed that there is at least one path connecting any two offices.)</p>

<p>Company G specializes in efficient transport solutions, but the CEO has just realized that, embarrassingly enough, its own road network may be suboptimal! She wants to know which roads in the campus are&nbsp;<em>inefficient</em>. A road is inefficient if and only if it is not included in&nbsp;<strong>any</strong>&nbsp;shortest paths between&nbsp;<strong>any</strong>&nbsp;offices.</p>

<p>Given the graph of offices and roads, can you help the CEO find all of the inefficient roads?</p>

### 입력

<p>The first line of the input gives the number of test cases,&nbsp;<strong>T</strong>.&nbsp;<strong>T</strong>&nbsp;test cases follow. Each case begins with one line with two integers&nbsp;<strong>N</strong>&nbsp;and&nbsp;<strong>M</strong>, indicating the number of offices and roads. This is followed by&nbsp;<strong>M</strong>&nbsp;lines containing three integers each:&nbsp;<strong>U<sub>i</sub></strong>,&nbsp;<strong>V<sub>i</sub></strong>&nbsp;and&nbsp;<strong>C<sub>i</sub></strong>, indicating the ith road is between office&nbsp;<strong>U<sub>i</sub></strong>&nbsp;and office&nbsp;<strong>V<sub>i</sub></strong>, and it takes&nbsp;<strong>C<sub>i</sub></strong>&nbsp;minutes to travel on it.</p>

<h3>Limits</h3>

<ul>
	<li>0 &lt;&nbsp;<strong>C<sub>i</sub></strong>&nbsp;&le; 1000000.</li>
	<li>1 &le;&nbsp;<strong>T</strong>&nbsp;&le; 10.</li>
	<li>1 &le;&nbsp;<strong>N = M</strong>&nbsp;&le; 100.</li>
</ul>

### 출력

<p>For each test case, output one line containing &quot;Case #x:&quot;, where x is the test case number (starting from 1). Then output the road numbers of all of the inefficient roads, in increasing order, each on its own line. (Note that road 0 refers to the first road listed in a test case, road 1 refers to the second road, etc.)</p>