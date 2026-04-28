# [Gold II] Stable Wall - 23906

[문제 링크](https://www.acmicpc.net/problem/23906)

### 성능 요약

시간 제한: 20 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 77, 정답: 52, 맞힌 사람: 44, 정답 비율: 70.968%

### 분류

그래프 이론, 방향 비순환 그래프, 위상 정렬

### 문제 설명

<p>Apollo is playing a game involving&nbsp;polyominos. A polyomino is a shape made by joining together one or more squares edge to edge to form a single connected shape. The game involves combining&nbsp;<b>N</b>&nbsp;polyominos into a single rectangular shape without any holes. Each polyomino is labeled with a unique character from&nbsp;<code>A</code>&nbsp;to&nbsp;<code>Z</code>.</p>

<p>Apollo has finished the game and created a rectangular wall containing&nbsp;<b>R</b>&nbsp;rows and&nbsp;<b>C</b>&nbsp;columns. He took a picture and sent it to his friend Selene. Selene likes pictures of walls, but she likes them even more if they are&nbsp;<i>stable</i>&nbsp;walls. A wall is stable if it can be created by adding polyominos one at a time to the wall so that each polyomino is always&nbsp;<i>supported</i>. A polyomino is supported if each of its squares is either on the ground, or has another square below it.</p>

<p>Apollo would like to check if his wall is stable and if it is, prove that fact to Selene by telling her the order in which he added the polyominos.</p>

### 입력

<p>The first line of the input gives the number of test cases,&nbsp;<b>T</b>.&nbsp;<b>T</b>&nbsp;test cases follow. Each test case begins with a line containing the two integers&nbsp;<b>R</b>&nbsp;and&nbsp;<b>C</b>. Then,&nbsp;<b>R</b>&nbsp;lines follow, describing the wall from top to bottom. Each line contains a string of&nbsp;<b>C</b>&nbsp;uppercase characters from&nbsp;<code>A</code>&nbsp;to&nbsp;<code>Z</code>, describing that row of the wall.</p>

### 출력

<p>For each test case, output one line containing&nbsp;<code>Case #x: y</code>, where&nbsp;<code>x</code>&nbsp;is the test case number (starting from 1) and&nbsp;<code>y</code>&nbsp;is a string of&nbsp;<b>N</b>&nbsp;uppercase characters, describing the order in which he built them. If there is more than one such order, output any of them. If the wall is not stable, output&nbsp;<code>-1</code>&nbsp;instead.</p>

### 제한

<ul>
	<li>1 &le;&nbsp;<b>T</b>&nbsp;&le; 100.</li>
	<li>1 &le;&nbsp;<b>R</b>&nbsp;&le; 30.</li>
	<li>1 &le;&nbsp;<b>C</b>&nbsp;&le; 30.</li>
	<li>No two polyominos will be labeled with the same letter.</li>
	<li>The input is guaranteed to be valid according to the rules described in the statement.</li>
</ul>

### 힌트

<p>In sample case #1, note that&nbsp;<code>ZOMA</code>&nbsp;is another possible answer.</p>

<p>In sample case #2 and sample case #3, the wall is not stable, so the answer is&nbsp;<code>-1</code>.</p>

<p>In sample case #4, the only possible answer is&nbsp;<code>EDCBA</code>.</p>