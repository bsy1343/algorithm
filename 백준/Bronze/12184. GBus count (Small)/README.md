# [Bronze II] GBus count (Small) - 12184

[문제 링크](https://www.acmicpc.net/problem/12184)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 207, 정답: 170, 맞힌 사람: 149, 정답 비율: 81.868%

### 분류

구현

### 문제 설명

<p>There exist some cities that are built along a straight road. The cities are numbered 1, 2, 3... from left to right.</p>

<p>There are&nbsp;<b>N</b>&nbsp;GBuses that operate along this road. For each GBus, we know the range of cities that it serves: the i-th gBus serves the cities with numbers between&nbsp;<b>A<sub>i</sub></b>&nbsp;and&nbsp;<b>B<sub>i</sub></b>, inclusive.</p>

<p>We are interested in a particular subset of&nbsp;<b>P</b>&nbsp;cities. For each of those cities, we need to find out how many GBuses serve that particular city.</p>

### 입력

<p>The first line of the input gives the number of test cases,&nbsp;<b>T</b>. Then,&nbsp;<b>T</b>&nbsp;test cases follow; each case is separated from the next by one&nbsp;<u>blank</u>&nbsp;line. (Notice that this is unusual for Kickstart data sets.)</p>

<p>In each test case:</p>

<ul>
	<li>The first line contains one integer&nbsp;<b>N</b>: the number of GBuses.</li>
	<li>The second line contains 2<b>N</b>&nbsp;integers representing the ranges of cities that the buses serve, in the form&nbsp;<b>A<sub>1</sub>&nbsp;B<sub>1</sub>&nbsp;A<sub>2</sub>&nbsp;B<sub>2</sub>&nbsp;A<sub>3</sub>&nbsp;B<sub>3</sub></b>&nbsp;...&nbsp;<b>A<sub>N</sub>&nbsp;B<sub>N</sub></b>. That is, the first GBus serves the cities numbered from&nbsp;<b>A<sub>1</sub></b>&nbsp;to&nbsp;<b>B<sub>1</sub></b>&nbsp;(inclusive), and so on.</li>
	<li>The third line contains one integer&nbsp;<b>P</b>: the number of cities we are interested in, as described above. (Note that this is not necessarily the same as the total number of cities in the problem, which is not given.)</li>
	<li>Finally, there are&nbsp;<b>P</b>&nbsp;more lines; the i-th of these contains the number&nbsp;<b>C<sub>i</sub></b>&nbsp;of a city we are interested in.</li>
</ul>

### 출력

<p>For each test case, output one line containing&nbsp;<code>Case #x: y</code>, where&nbsp;<code>x</code>&nbsp;is the number of the test case (starting from 1), and&nbsp;<code>y</code>&nbsp;is a list of&nbsp;<b>P</b>&nbsp;integers, in which the i-th integer is the number of GBuses that serve city&nbsp;<b>C<sub>i</sub></b>.</p>

### 제한

<ul>
	<li>1 &le;&nbsp;<b>T</b>&nbsp;&le; 10.</li>
	<li>1 &le;&nbsp;<b>N</b>&nbsp;&le; 50</li>
	<li>1 &le;&nbsp;<b>A<sub>i</sub></b>&nbsp;&le; 500, for all i.</li>
	<li>1 &le;&nbsp;<b>B<sub>i</sub></b>&nbsp;&le; 500, for all i.</li>
	<li>1 &le;&nbsp;<b>C<sub>i</sub></b>&nbsp;&le; 500, for all i.</li>
	<li>1 &le;&nbsp;<b>P</b>&nbsp;&le; 50.</li>
</ul>

### 힌트

<p>In Sample Case #1, there are four GBuses. The first serves cities 15 through 25, the second serves cities 30 through 35, the third serves cities 45 through 50, and the fourth serves cities 10 through 20. City 15 is served by the first and fourth buses, so the first number in our answer list is 2. City 25 is served by only the first bus, so the second number in our answer list is 1.</p>