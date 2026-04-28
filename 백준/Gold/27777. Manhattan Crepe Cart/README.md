# [Gold II] Manhattan Crepe Cart - 27777

[문제 링크](https://www.acmicpc.net/problem/27777)

### 성능 요약

시간 제한: 20 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 11, 정답: 7, 맞힌 사람: 7, 정답 비율: 63.636%

### 분류

이분 탐색, 그리디 알고리즘, 누적 합, 정렬, 스위핑

### 문제 설명

<p>There are a lot of great streetside food vendors in Manhattan, but without a doubt, the one with the tastiest food is the Code Jam Crepe Cart!</p>

<p>You want to find the cart, but you do not know where it is, except that it is at some street intersection. You believe that people from across Manhattan are currently walking toward that intersection, so you will try to identify the intersection toward which the most people are traveling.</p>

<p>For the purposes of this problem, Manhattan is a regular grid with its axes aligned to compass lines and bounded between 0 and <b>Q</b>, inclusive, on each axis. There are west-east streets corresponding to gridlines y = 0, y = 1, y = 2, &hellip;, y = <b>Q</b> and south-north streets corresponding to gridlines x = 0, x = 1, x = 2, &hellip;, x = <b>Q</b>, and people move only along these streets. The points where the lines meet &mdash; e.g., (0, 0) and (1, 2) &mdash; are intersections. The shortest distance between two intersections is measured via the <a href="https://en.wikipedia.org/wiki/Taxicab_geometry">Manhattan distance</a> &mdash; that is, by the sum of the absolute horizontal difference and the absolute vertical difference between the two sets of coordinates.</p>

<p>You know the locations of <b>P</b> people, all of whom are standing at intersections, and the compass direction each person is headed: north (increasing y direction), south (decreasing y direction), east (increasing x direction), or west (decreasing x direction). A person is moving toward a street intersection if their current movement is on a shortest path to that street intersection within the Manhattan grid. For example, if a person located at (x<sub>0</sub>, y<sub>0</sub>) is moving north, then they are moving toward all street intersections that have coordinates (x, y) with y &gt; y<sub>0</sub>.</p>

<p>You think the crepe cart is at the intersection toward which the most people are traveling. Moreover, you believe that more southern and western parts of the island are most likely to have a crepe cart, so if there are multiple such intersections, you will choose the one with the smallest non-negative <code>x</code> coordinate, and if there are multiple such intersections with that same <code>x</code> coordinate, the one among those with the smallest non-negative <code>y</code> coordinate. Which intersection will you choose?</p>

### 입력

<p>The first line of the input gives the number of test cases, <b>T</b>. <b>T</b> test cases follow. Each test case starts with one line containing two integers <b>P</b> and <b>Q</b>: the number of people, and the maximum possible value of an x or y coordinate in Manhattan, as described above. Then, there are <b>P</b> more lines. The i-th of those lines contains two integers <b>X<sub>i</sub></b> and <b>Y<sub>i</sub></b>, the current location (street corner) of a person, and a character <b>D<sub>i</sub></b>, the direction that person is headed. <b>D<sub>i</sub></b> is one of the uppercase letters <code>N</code>, <code>S</code>, <code>E</code>, or <code>W</code>, which stand for north, south, east, and west, respectively.</p>

### 출력

<p>For each test case, output one line containing <code>Case #t: x y</code>, where <code>t</code> is the test case number (starting from 1) and <code>x</code> and <code>y</code> are the horizontal and vertical coordinates of the intersection where you believe the crepe cart is located.</p>

### 제한

<ul>
	<li>1 &le; <b>T</b> &le; 100.</li>
	<li>1 &le; <b>P</b> &le; 500.</li>
	<li>0 &le; <b>X<sub>i</sub></b> &le; <b>Q</b>, for all i.</li>
	<li>0 &le; <b>Y<sub>i</sub></b> &le; <b>Q</b>, for all i.</li>
	<li>For all i, if <b>X<sub>i</sub></b> = 0, <b>D<sub>i</sub></b> &ne; <code>W</code>.</li>
	<li>For all i, if <b>Y<sub>i</sub></b> = 0, <b>D<sub>i</sub></b> &ne; <code>S</code>.</li>
	<li>For all i, if <b>X<sub>i</sub></b> = <b>Q</b>, <b>D<sub>i</sub></b> &ne; <code>E</code>.</li>
	<li>For all i, if <b>Y<sub>i</sub></b> = <b>Q</b>, <b>D<sub>i</sub></b> &ne; <code>N</code>.</li>
</ul>

### 힌트

<p>In Sample Case #1, there is only one person, and they are moving north from (5, 5). This means that all street corners with y &ge; 6 are possible locations for the crepe cart. Of those possibilities, we choose the one with lowest x &ge; 0 and then lowest y &ge; 6.</p>

<p>In Sample Case #2, there are four people, all moving toward location (2, 5). There is no other location that has as many people moving toward it.</p>

<p>In Sample Case #3, six of the eight people are moving toward location (0, 4). There is no other location that has as many people moving toward it.</p>