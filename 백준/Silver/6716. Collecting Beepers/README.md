# [Silver II] Collecting Beepers - 6716

[문제 링크](https://www.acmicpc.net/problem/6716)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 124, 정답: 81, 맞힌 사람: 64, 정답 비율: 71.910%

### 분류

브루트포스 알고리즘, 백트래킹

### 문제 설명

<p>Karel is a robot who lives in a rectangular coordinate system where each place is designated by a set of integer coordinates (x and y). Your job is to design a program that will help Karel pick up a number of beepers that are placed in her world. To do so you must direct Karel to the position where each beeper is located. Your job is to write a computer program that finds the length of the shortest path that will get Karel from her starting position, to each of the beepers, and return back again to the starting position.</p>

<p>Karel can only move along the x and y axis, never diagonally. Moving from one position</p>

### 입력

<p>First there will be a line containing the number of scenarios you are asked to help Karel in. For each scenario there will first be a line containing the size of the world. This will be given as two integers (x-size and y-size). Next there will be one line containing two numbers giving the starting position of Karel. On the next line there will be one number giving the number of beepers. For each beeper there will be a line containing two numbers giving the coordinates of each beeper.</p>

### 출력

<p>The output will be one line per scenario, giving the minimum distance that Karel has to move to get from her starting position to each of the beepers and back again to the starting position.</p>

### 제한

<ul>
	<li>1 &le; size of world &le; 9</li>
	<li>1 &le; number of beepers &le; 8</li>
	<li>1 &le; x, y &le; size of world</li>
</ul>