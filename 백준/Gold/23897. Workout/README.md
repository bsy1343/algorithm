# [Gold III] Workout - 23897

[문제 링크](https://www.acmicpc.net/problem/23897)

### 성능 요약

시간 제한: 20 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 45, 정답: 38, 맞힌 사람: 33, 정답 비율: 82.500%

### 분류

이분 탐색, 매개 변수 탐색

### 문제 설명

<p>Tambourine has prepared a fitness program so that she can become more fit! The program is made of&nbsp;<b>N</b>&nbsp;sessions. During the i-th session, Tambourine will exercise for&nbsp;<b>M<sub>i</sub></b>&nbsp;minutes. The number of minutes she exercises in each session are&nbsp;<i>strictly increasing</i>.</p>

<p>The&nbsp;<i>difficulty</i>&nbsp;of her fitness program is equal to the maximum difference in the number of minutes between any two consecutive training sessions.</p>

<p>To make her program less difficult, Tambourine has decided to add up to&nbsp;<b>K</b>&nbsp;additional training sessions to her fitness program. She can add these sessions anywhere in her fitness program, and exercise any positive integer number of minutes in each of them. After the additional training session are added, the number of minutes she exercises in each session must still be strictly increasing. What is the minimum difficulty possible?</p>

### 입력

<p>The first line of the input gives the number of test cases,&nbsp;<b>T</b>.&nbsp;<b>T</b>&nbsp;test cases follow. Each test case begins with a line containing the two integers&nbsp;<b>N</b>&nbsp;and&nbsp;<b>K</b>. The second line contains&nbsp;<b>N</b>&nbsp;integers, the i-th of these is&nbsp;<b>M<sub>i</sub></b>, the number of minutes she will exercise in the i-th session.</p>

### 출력

<p>For each test case, output one line containing&nbsp;<code>Case #x: y</code>, where&nbsp;<code>x</code>&nbsp;is the test case number (starting from 1) and&nbsp;<code>y</code>&nbsp;is the minimum difficulty possible after up to&nbsp;<b>K</b>&nbsp;additional training sessions are added.</p>

### 제한

<ul>
	<li>1 &le;&nbsp;<b>T</b>&nbsp;&le; 100.</li>
	<li>For at most 10 test cases, 2 &le;&nbsp;<b>N</b>&nbsp;&le; 10<sup>5</sup>.</li>
	<li>For all other test cases, 2 &le;&nbsp;<b>N</b>&nbsp;&le; 300.</li>
	<li>1 &le;&nbsp;<b>M<sub>i</sub></b>&nbsp;&le; 10<sup>9</sup>.</li>
	<li><b>M<sub>i</sub></b>&nbsp;&lt;&nbsp;<b>M<sub>i+1</sub></b>&nbsp;for all i.</li>
</ul>