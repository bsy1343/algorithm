# [Gold II] Japanese Writing - 3591

[문제 링크](https://www.acmicpc.net/problem/3591)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 128 MB

### 통계

제출: 20, 정답: 9, 맞힌 사람: 7, 정답 비율: 63.636%

### 분류

구현, 그래프 이론, 정렬

### 문제 설명

<p>Michael had visited ACM ICPC World Finals 2007 in Tokyo, Japan and became fascinated with Japanese writing. He decided to study hieroglyphs, but in order to check his knowledge he needs a piece of software that can verify correctness of his writing. This program takes a description of a correct shape of the hieroglyph, several Michael&rsquo;s attempts to write it, and judges each attempt as correct or incorrect.</p>

<p>In this problem hieroglyphs are represented as a collection of strokes, each stroke being a straight line on a Cartesian plane. The order of strokes is irrelevant for the hieroglyph shape, but the direction of each stroke is relevant. There are eight relevant directions: straight right, upper-right, straight up, upper-left, straight left, lower-left, straight down, and lower-right.</p>

<p>Two writings are considered to represent the same shape if one-to-one correspondence can be established between the strokes and all the endpoints of the strokes, so that direction of strokes and relative positions of pairs of points are preserved. Preservation of relative positions is important for any pair of points, even if they are not connected with a stroke. However, relative positions are important only with respect to eight relevant directions described above.</p>

<p>For example, here is a hieroglyph similar to Latin letter A with 5 endpoints connected with 3 strokes and several other correct writings of the same shape:</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/3591.%E2%80%85Japanese%E2%80%85Writing/8dd8317c.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/3591.%E2%80%85Japanese%E2%80%85Writing/8dd8317c.png" data-original-src="https://upload.acmicpc.net/5933423b-acd1-42d0-a631-63a5aced55d7/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 443px; height: 117px;" /></p>

<p>Note, that intersections of strokes are not relevant. Here are several incorrect writings of the same shape:</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/3591.%E2%80%85Japanese%E2%80%85Writing/50b2175c.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/3591.%E2%80%85Japanese%E2%80%85Writing/50b2175c.png" data-original-src="https://upload.acmicpc.net/acf1dec9-c6f2-4105-8c73-4a95931f2c70/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 606px; height: 117px;" /></p>

<p>These writings are not correct for the following reasons:</p>

<ul>
	<li>Writing 5 has an extra point, so one-to-one correspondence between endpoints cannot be established.</li>
	<li>In writing 6 point d is straight up from point a but it should be to the upper-right of it.</li>
	<li>In writing 7 stroke d &minus; e goes in the wrong direction.</li>
	<li>In writing 8 point c is lower-right from point a but it should be straight to the right of it.</li>
	<li>Writing 9 has an extra a &minus; d stroke, so one-to-one correspondence between strokes cannot be established.</li>
</ul>

### 입력

<p>The first line of the input file contains a single integer n (2 &le; n &le; 20) &mdash; the number of writings in the input file. It is followed by descriptions of n writings.</p>

<p>Each writing starts with a line with a single integer number m<sub>i</sub> (1 &le; m<sub>i</sub> &le; 100) &mdash; the number of strokes in i-th writing. It is followed by m<sub>i</sub> lines that describe strokes for i-th writing. Each stroke is represented&nbsp;by a line with four integer numbers xa<sub>ij</sub>, ya<sub>ij</sub>, xb<sub>ij</sub>, and yb<sub>ij</sub> (&minus;1000 &le; xa<sub>ij</sub>, ya<sub>ij</sub>, xb<sub>ij</sub>, yb<sub>ij</sub> &le; 1000) &mdash; coordinates of endpoints. xa<sub>ij</sub>, ya<sub>ij</sub>&nbsp;are coordinates of the beginning of j-th stroke and xb<sub>ij</sub>, yb<sub>ij</sub>&nbsp;are coordinates of the end of j-th stroke. The beginning and the end of the stroke are distinct points. Any two endpoints are connected by at most one stroke.</p>

### 출력

<p>Compare the shapes of writings from 2-nd to n-th with the shape of the first writing and write to the output file n &minus; 1 lines with the result of each comparison of a single line. Write <code>CORRECT</code> if the corresponding writing represents the same shape as the first one or <code>INCORRECT</code> otherwise.</p>