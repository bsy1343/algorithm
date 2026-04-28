# [Silver II] Satellite Photographs - 26999

[문제 링크](https://www.acmicpc.net/problem/26999)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 197, 정답: 162, 맞힌 사람: 150, 정답 비율: 81.967%

### 분류

그래프 이론, 그래프 탐색, 너비 우선 탐색, 깊이 우선 탐색, 격자 그래프, 플러드 필

### 문제 설명

<p>Farmer John purchased satellite photos of W x H pixels of his farm (1 &le; W &le; 80, 1 &le; H &le; 1000) and wishes to determine the largest &#39;contiguous&#39; (connected) pasture. Pastures are contiguous when any pair of pixels in a pasture can be connected by traversing adjacent vertical or horizontal pixels that are part of the pasture. (It is easy to create pastures with very strange shapes, even circles that surround other circles.)</p>

<p>Each photo has been digitally enhanced to show pasture area as an asterisk (&#39;*&#39;) and non-pasture area as a period (&#39;.&#39;). Here is a 10 x 5 sample satellite photo:</p>

<pre>
..*.....**
.**..*****
.*...*....
..****.***
..****.***</pre>

<p>This photo shows three contiguous pastures of 4, 16, and 6 pixels. Help FJ find the largest contiguous pasture in each of his satellite photos.</p>

### 입력

<ul>
	<li>Line 1: Two space-separated integers: W and H</li>
	<li>Lines 2..H+1: Each line contains W &quot;*&quot; or &quot;.&quot; characters representing one raster line of a satellite photograph.</li>
</ul>

### 출력

<ul>
	<li>Line 1: The size of the largest contiguous field in the satellite photo.</li>
</ul>