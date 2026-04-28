# [Bronze I] Record Breaker - 23909

[문제 링크](https://www.acmicpc.net/problem/23909)

### 성능 요약

시간 제한: 20 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 212, 정답: 104, 맞힌 사람: 86, 정답 비율: 48.315%

### 분류

구현

### 문제 설명

<p>Isyana is given the number of visitors at her local theme park on&nbsp;<b>N</b>&nbsp;consecutive days. The number of visitors on the i-th day is&nbsp;<b>V<sub>i</sub></b>. A day is&nbsp;<i>record breaking</i>&nbsp;if it satisfies both of the following conditions:</p>

<ul>
	<li>The number of visitors on the day is strictly larger than the number of visitors on each of the previous days.</li>
	<li>Either it is the last day, or the number of visitors on the day is strictly larger than the number of visitors on the following day.</li>
</ul>

<p>Note that the very first day could be a record breaking day!</p>

<p>Please help Isyana find out the number of record breaking days.</p>

### 입력

<p>The first line of the input gives the number of test cases,&nbsp;<b>T</b>.&nbsp;<b>T</b>&nbsp;test cases follow. Each test case begins with a line containing the integer&nbsp;<b>N</b>. The second line contains&nbsp;<b>N</b>&nbsp;integers. The i-th integer is&nbsp;<b>V<sub>i</sub></b>.</p>

### 출력

<p>For each test case, output one line containing&nbsp;<code>Case #x: y</code>, where&nbsp;<code>x</code>&nbsp;is the test case number (starting from 1) and&nbsp;<code>y</code>&nbsp;is the number of record breaking days.</p>

### 제한

<ul>
	<li>1 &le;&nbsp;<b>T</b>&nbsp;&le; 100.</li>
	<li>0 &le;&nbsp;<b>V<sub>i</sub></b>&nbsp;&le; 2 &times; 10<sup>5</sup>.</li>
</ul>

### 힌트

<p>In Sample Case #1, the bold and underlined numbers in the following represent the record breaking days: 1&nbsp;<b><u>2</u></b>&nbsp;0&nbsp;<b><u>7</u></b>&nbsp;2 0 2 0.</p>

<p>In Sample Case #2, only the last day is a record breaking day.</p>

<p>In Sample Case #3, the first, the third, and the sixth days are record breaking days.</p>

<p>In Sample Case #4, there is no record breaking day.</p>