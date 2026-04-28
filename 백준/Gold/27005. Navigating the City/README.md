# [Gold IV] Navigating the City - 27005

[문제 링크](https://www.acmicpc.net/problem/27005)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 47, 정답: 31, 맞힌 사람: 27, 정답 비율: 65.854%

### 분류

너비 우선 탐색, 그래프 이론, 그래프 탐색, 문자열

### 문제 설명

<p>A dip in the milk market has forced the cows to move to the city. The only employment available is in the venerable field of taxi-driving. Help the cows learn their way around the city.</p>

<p>Given a city map with E (1 &le; E &le; 40) east/west street locations and N (1 &le; N &le; 30) north/south street locations, create instructions for a taxi driver to navigate from the start of his route (marked &#39;S&#39;) to the end (marked &#39;E&#39;). Each instruction is a direction (one of &#39;N&#39;, &#39;E&#39;, &#39;S&#39;, or &#39;W&#39;) followed by a space followed by an integer that tells how many blocks to drive in that direction. If multiple routes are available, your program should output the shortest route. The shortest route is guaranteed to exist and be unique.</p>

<p>The map is depicted as a grid of &#39;+&#39;s that represent intersections and a set of roads depicted as &#39;-&#39; and &#39;|&#39;. Buildings and other obstacles are shown as &#39;.&#39;s. Here is a typical map:</p>

<pre>
+-+-+.+-+-+
|...|.....|
+-+.+-+-+-+
..|.......|
S-+-+-+.E-+</pre>

<p>The taxi should go east, north, west, north, east two blocks, and so on. See the output format and sample solution below for its complete route.</p>

### 입력

<ul>
	<li>Line 1: Two space-separated integers, N and E.</li>
	<li>Lines 2..2*N: These lines each contain 2*E-1 characters and encode the map of the street. Every other input line gives the data for the east/west streets; the remaining lines show the north/south streets. The format should be clear from the example.</li>
</ul>

### 출력

<ul>
	<li>Lines 1..?: Each line contains a direction letter and a number of blocks to travel in that direction.</li>
</ul>