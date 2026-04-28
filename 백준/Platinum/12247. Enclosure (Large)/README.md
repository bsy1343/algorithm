# [Platinum II] Enclosure (Large) - 12247

[문제 링크](https://www.acmicpc.net/problem/12247)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 11, 정답: 9, 맞힌 사람: 8, 정답 비율: 100.000%

### 분류

수학

### 문제 설명

<p>Your task in this problem is to find out the minimum number of stones needed to place on an N-by-M rectangular grid (N horizontal line segments and M vertical line segments) to enclose at least K intersection points. An intersection point is enclosed if either of the following conditions is true:</p>

<ol>
	<li>A stone is placed at the point.</li>
	<li>Starting from the point, we cannot trace a path along grid lines to reach an empty point on the grid border through empty intersection points only.</li>
</ol>

<p>For example, to enclose 8 points on a 4x5 grid, we need at least 6 stones. One of many valid stone layouts is shown below. Enclosed points are marked with an &quot;x&quot;.</p>

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/12247.%E2%80%85Enclosure%E2%80%85(Large)/d03bcef8.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/12247.%E2%80%85Enclosure%E2%80%85(Large)/d03bcef8.png" data-original-src="https://onlinejudgeimages.s3.amazonaws.com/problem/12246/images-61.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:150px; width:181px" /></p>

### 입력

<p>The first line of the input gives the number of test cases, <strong>T</strong>. <strong>T</strong> lines follow. Each test case is a line of three integers: <strong>N</strong> <strong>M</strong> <strong>K</strong>.</p>

<p>Limits</p>

<ul>
	<li>1 &le; <strong>T</strong> &le; 100.</li>
	<li>1 &le; <strong>N</strong>.</li>
	<li>1 &le; <strong>M</strong>.</li>
	<li>1 &le; <strong>K</strong> &le; <strong>N</strong> &times; <strong>M</strong>.</li>
	<li><strong style="line-height:1.6em">N</strong><span style="line-height:1.6em"> &times; </span><strong style="line-height:1.6em">M</strong><span style="line-height:1.6em"> &le; 1000.</span></li>
</ul>

### 출력

<p>For each test case, output one line containing &quot;Case #x: y&quot;, where x is the test case number (starting from 1) and y is the minimum number of stones needed.</p>