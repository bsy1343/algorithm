# [Gold III] Lucky Light - 9121

[문제 링크](https://www.acmicpc.net/problem/9121)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 12, 정답: 7, 맞힌 사람: 7, 정답 비율: 58.333%

### 분류

스위핑

### 문제 설명

<p>We have a (point) light source at position (xL, yL) with yL &gt; 0, and a finite series of line segments, all of finite non-zero length, given by the coordinates of their two endpoints. These endpoints are all different. The line segments are all situated above the x-axis (y &gt; 0).</p>

<p>The segments cast their shadows onto the x-axis. We assume that the shadows of two segments either do not overlap at all, or have an overlap that has some non-zero width (they do not just touch). We also assume that for each segment its shadow is more than just one point, i.e., there is no segment that is directed toward the light source. The height of the light source (yL) is at least 1 unit larger than the y-coordinates of the endpoints of the line segments. This guarantees that indeed each line segment has a bounded shadow on the x-axis.</p>

<p>The collection of shadows divides the x-axis into dark and lighted areas (intervals). The problem is to determine the number of lighted areas &mdash; which is at least 2 (if there is at least one line segment, otherwise it is 1).</p>

<p>In the picture below the three line segments A, B and C cause three lighted areas, as indicated.</p>

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/9121.%E2%80%85Lucky%E2%80%85Light/f15d1e38.png" data-original-src="https://onlinejudgeimages.s3.amazonaws.com/problem/9121/%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7%202016-06-13%20%EC%98%A4%ED%9B%84%206.08.48.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:176px; width:469px" /><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/9121.%E2%80%85Lucky%E2%80%85Light/f15d1e38.png" data-original-src="https://onlinejudgeimages.s3.amazonaws.com/problem/9121/%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7%202016-06-13%20%EC%98%A4%ED%9B%84%206.08.48.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:176px; width:469px" /></p>

### 입력

<p>The first line of the input file contains a single number: the number of test cases to follow. Each test case has the following format:</p>

<ul>
	<li>One line with one integer n with 0 &le; n &le; 100: the number of line segments.</li>
	<li>One line with two integers x<sub>L</sub> and y<sub>L</sub>, the coordinates of the light source, separated by a single space. The coordinates satisfy &minus;100 &le; x<sub>L</sub> &le; 100 and 1 &le; y<sub>L</sub> &le; 1,000.</li>
	<li>n lines, each containing four integers x<sub>i</sub>, y<sub>i</sub>, u<sub>i</sub> and v<sub>i</sub>, separated by single spaces, that specify x- and y-coordinates of the two endpoints (x<sub>i</sub>, y<sub>i</sub>) and (u<sub>i</sub>, v<sub>i</sub>) of the ith line segment, where &minus;100 &le; x<sub>i</sub>, u<sub>i</sub> &le; 100 and 0 &lt; y<sub>i</sub>, v<sub>i</sub> &lt; y<sub>L</sub>, for 1 &le; i &le; n.</li>
</ul>

### 출력

<p>For every test case in the input file, the output should contain a single number, on a single line: the number of lighted areas.</p>

### 힌트

<p>The first test case below corresponds to the picture in the problem description. The second test case has two crossing line segments.</p>