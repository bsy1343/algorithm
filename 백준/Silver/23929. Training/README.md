# [Silver III] Training - 23929

[문제 링크](https://www.acmicpc.net/problem/23929)

### 성능 요약

시간 제한: 15 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 59, 정답: 47, 맞힌 사람: 39, 정답 비율: 76.471%

### 분류

그리디 알고리즘, 정렬, 누적 합, 슬라이딩 윈도우

### 문제 설명

<p>As the football coach at your local school, you have been tasked with picking a team of exactly&nbsp;<b>P</b>&nbsp;students to represent your school. There are&nbsp;<b>N</b>&nbsp;students for you to pick from. The i-th student has a&nbsp;<i>skill rating</i>&nbsp;<b>S<sub>i</sub></b>, which is a positive integer indicating how skilled they are.</p>

<p>You have decided that a team is&nbsp;<i>fair</i>&nbsp;if it has exactly&nbsp;<b>P</b>&nbsp;students on it and they all have the same skill rating. That way, everyone plays as a team. Initially, it might not be possible to pick a fair team, so you will give some of the students one-on-one coaching. It takes one hour of coaching to increase the skill rating of any student by 1.</p>

<p>The competition season is starting very soon (in fact, the first match has already started!), so you&#39;d like to find the minimum number of hours of coaching you need to give before you are able to pick a fair team.</p>

### 입력

<p>The first line of the input gives the number of test cases,&nbsp;<b>T</b>.&nbsp;<b>T</b>&nbsp;test cases follow. Each test case starts with a line containing the two integers&nbsp;<b>N</b>&nbsp;and&nbsp;<b>P</b>, the number of students and the number of students you need to pick, respectively. Then, another line follows containing&nbsp;<b>N</b>&nbsp;integers&nbsp;<b>S<sub>i</sub></b>; the i-th of these is the skill of the i-th student.</p>

### 출력

<p>For each test case, output one line containing&nbsp;<code>Case #x: y</code>, where&nbsp;<code>x</code>&nbsp;is the test case number (starting from 1) and&nbsp;<code>y</code>&nbsp;is the minimum number of hours of coaching needed, before you can pick a fair team of&nbsp;<b>P</b>&nbsp;students.</p>

### 제한

<ul>
	<li>1 &le;&nbsp;<b>T</b>&nbsp;&le; 100.</li>
	<li>1 &le;&nbsp;<b>S<sub>i</sub></b>&nbsp;&le; 10000, for all i.</li>
	<li>2 &le;&nbsp;<b>P</b>&nbsp;&le;&nbsp;<b>N</b>.</li>
</ul>

### 힌트

<p>In Sample Case #1, you can spend a total of 6 hours training the first student and 8 hours training the second one. This gives the first, second and third students a skill level of 9. This is the minimum time you can spend, so the answer is 14.</p>

<p>In Sample Case #2, you can already pick a fair team (the first and second student) without having to do any coaching, so the answer is 0.</p>

<p>In Sample Case #3,&nbsp;<b>P</b>&nbsp;=&nbsp;<b>N</b>, so every student will be on your team. You have to spend 6 hours training the third student, so that they have a skill of 7, like everyone else. This is the minimum time you can spend, so the answer is 6.</p>