# [Gold IV] Gears - 11612

[문제 링크](https://www.acmicpc.net/problem/11612)

### 성능 요약

시간 제한: 4 초, 메모리 제한: 256 MB

### 통계

제출: 57, 정답: 25, 맞힌 사람: 25, 정답 비율: 53.191%

### 분류

수학, 그래프 이론, 그래프 탐색, 너비 우선 탐색, 이분 그래프

### 문제 설명

<p>A set of gears is installed on the plane. You are given the center coordinate and radius of each gear, which are all integer-valued. For a given source and target gear, indicate what happens to the target gear if you attempt to turn the source gear. Possibilities are:</p>

<ul>
	<li>The source gear cannot move, because it would drive some gear in the arrangement to turn in both directions.</li>
	<li>The source gear can move, but it is not connected to the target gear.</li>
	<li>The source gear turns the target gear, at a certain ratio</li>
</ul>

<p>If the source gear cannot move, give this result, even if the source and target gears are not connected.</p>

### 입력

<p>The first line of input contains a single positive integer n (2 &le; n &le; 1,000), the total number of gears. Following this will be n lines, one per gear, containing three space-separated integers x<sub>i</sub>, y<sub>i</sub>, and r<sub>i</sub> (&minus;10<sup>4</sup> &le; x<sub>i</sub>, y<sub>i</sub> &le; 10<sup>4</sup> , 1 &le; r<sub>i</sub> &le; 10<sup>4</sup>), indicating the center coordinate and the radius of the ith gear. Assume the tooth count for each gear is sufficiently high that the gears always mesh correctly. It is guaranteed that the gears do not overlap with each other. The input gear is the first gear in the list, and the output gear is the last gear in the list.</p>

### 출력

<p>If the input gear cannot move, print, on a single line, &ldquo;<code>The input gear cannot move.</code>&rdquo; (without the quotation marks).</p>

<p>If the input gear can move but is not connected to the output gear, print, on a single line, &ldquo;<code>The input gear is not connected to the output gear.</code>&rdquo; (without the quotation marks).</p>

<p>Otherwise, print, on a single line, the ratio the output gear rotates with respect to the input gear in the form of &ldquo;<code>##:##</code>&rdquo; (without the quotation marks), in reduced form. If the output gear rotates in the opposite direction as the input gear, write the ratio as a negative ratio. For example, if the output gear rotates clockwise three times as the input gear rotates counterclockwise twice, the output should be <code>-3:2</code>.</p>