# [Silver III] Bus Routes - 23902

[문제 링크](https://www.acmicpc.net/problem/23902)

### 성능 요약

시간 제한: 10 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 71, 정답: 52, 맞힌 사람: 46, 정답 비율: 70.769%

### 분류

그리디 알고리즘

### 문제 설명

<p>Bucket is planning to make a very long journey across the countryside by bus. Her journey consists of&nbsp;<b>N</b>&nbsp;bus routes, numbered from 1 to&nbsp;<b>N</b>&nbsp;in the order she must take them. The buses themselves are very fast, but do not run often. The i-th bus route only runs every&nbsp;<b>X<sub>i</sub></b>&nbsp;days.</p>

<p>More specifically, she can only take the i-th bus on day&nbsp;<b>X<sub>i</sub></b>, 2<b>X<sub>i</sub></b>, 3<b>X<sub>i</sub></b>&nbsp;and so on. Since the buses are very fast, she can take multiple buses on the same day.</p>

<p>Bucket must finish her journey by day&nbsp;<b>D</b>, but she would like to start the journey as late as possible. What is the latest day she could take the first bus, and still finish her journey by day&nbsp;<b>D</b>?</p>

<p>It is guaranteed that it is possible for Bucket to finish her journey by day&nbsp;<b>D</b>.</p>

### 입력

<p>The first line of the input gives the number of test cases,&nbsp;<b>T</b>.&nbsp;<b>T</b>&nbsp;test cases follow. Each test case begins with a line containing the two integers&nbsp;<b>N</b>&nbsp;and&nbsp;<b>D</b>. Then, another line follows containing&nbsp;<b>N</b>&nbsp;integers, the i-th one is&nbsp;<b>X<sub>i</sub></b>.</p>

### 출력

<p>For each test case, output one line containing&nbsp;<code>Case #x: y</code>, where&nbsp;<code>x</code>&nbsp;is the test case number (starting from 1) and&nbsp;<code>y</code>&nbsp;is the latest day she could take the first bus, and still finish her journey by day&nbsp;<b>D</b>.</p>

### 제한

<ul>
	<li>1 &le;&nbsp;<b>T</b>&nbsp;&le; 100.</li>
	<li>1 &le;&nbsp;<b>X<sub>i</sub></b>&nbsp;&le;&nbsp;<b>D</b>.</li>
	<li>1 &le;&nbsp;<b>N</b>&nbsp;&le; 1000.</li>
	<li>It is guaranteed that it is possible for Bucket to finish her journey by day&nbsp;<b>D</b>.</li>
</ul>

### 힌트

<p>In Sample Case #1, there are&nbsp;<b>N</b>&nbsp;= 3 bus routes and Bucket must arrive by day&nbsp;<b>D</b>&nbsp;= 10. She could:</p>

<ul>
	<li>Take the 1st bus on day 6 (<b>X<sub>1</sub></b>&nbsp;= 3),</li>
	<li>Take the 2nd bus on day 7 (<b>X<sub>2</sub></b>&nbsp;= 7) and</li>
	<li>Take the 3rd bus on day 8 (<b>X<sub>3</sub></b>&nbsp;= 2).</li>
</ul>

<p>In Sample Case #2, there are&nbsp;<b>N</b>&nbsp;= 4 bus routes and Bucket must arrive by day&nbsp;<b>D</b>&nbsp;= 100. She could:</p>

<ul>
	<li>Take the 1st bus on day 99 (<b>X<sub>1</sub></b>&nbsp;= 11),</li>
	<li>Take the 2nd bus on day 100 (<b>X<sub>2</sub></b>&nbsp;= 10),</li>
	<li>Take the 3rd bus on day 100 (<b>X<sub>3</sub></b>&nbsp;= 5) and</li>
	<li>Take the 4th bus on day 100 (<b>X<sub>4</sub></b>&nbsp;= 50),</li>
</ul>

<p>In Sample Case #3, there is&nbsp;<b>N</b>&nbsp;= 1 bus route and Bucket must arrive by day&nbsp;<b>D</b>&nbsp;= 1. She could:</p>

<ul>
	<li>Take the 1st bus on day 1 (<b>X<sub>1</sub></b>&nbsp;= 1).</li>
</ul>