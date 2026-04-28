# [Silver I] City Tour (Small) - 12545

[문제 링크](https://www.acmicpc.net/problem/12545)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 45, 정답: 31, 맞힌 사람: 23, 정답 비율: 63.889%

### 분류

그래프 이론, 브루트포스 알고리즘, 백트래킹

### 문제 설명

<p>During summer time, old cities in Europe are swarming with tourists who roam the streets and visit points of interest.&nbsp;</p>

<p>Many old cities were built organically and not according to some architecture plan, but, strangely, their growth exhibits a similar pattern: the cities started from three points of interest, with each pair being connected by a bidirectional street; then, gradually, new points of interest were added. Any new point of interest was connected by two new bidirectional streets to two different previous points of interest which were already directly connected by a street.</p>

<p>A tourist visiting such a city would like to do a tour visiting as many points of interest as possible. The tour can start at any point of interest and must end at the same point of interest. The tour may visit each street at most once and each point of interest at most once (with the exception of the first point of interest which is visited exactly twice).</p>

<p>You are given the description of how the city grew. Find the largest number of different points of interest a single tour can visit in this city.</p>

### 입력

<p>The first line of the input file contains the number of cases,&nbsp;<strong>T</strong>.&nbsp;<strong>T</strong>&nbsp;test cases follow.</p>

<p>Each case begins with the integer&nbsp;<strong>N</strong>&nbsp;- the total number of points of interest in the city. Points are denoted with numbers from 1 to&nbsp;<strong>N</strong>; numbers 1, 2, and 3 denote the three original points when the city started, while numbers 4, ...,&nbsp;<strong>N</strong>&nbsp;denote the other points in the order they were added to the city.</p>

<p>The next&nbsp;<strong>N</strong>-3 lines each contain a pair of space-separated integers&nbsp;<strong>A</strong>,&nbsp;<strong>B</strong>, indicating that the corresponding point of interest was connected by streets to points&nbsp;<strong>A</strong>&nbsp;and&nbsp;<strong>B</strong>. First of these lines corresponds to point number 4, second to point number 5, etc.</p>

<h3>Limits</h3>

<ul>
	<li>1 &le;&nbsp;<strong>T</strong>&nbsp;&le; 50.</li>
	<li>4 &le;&nbsp;<strong>N</strong>&nbsp;&le; 15.</li>
</ul>

### 출력

<p>For each test case, output one line containing &quot;Case #x: y&quot;, where x is the case number (starting from 1) and y is the largest number of points of interest a tour can visit in this city.</p>