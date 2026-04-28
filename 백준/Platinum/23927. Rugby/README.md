# [Platinum V] Rugby - 23927

[문제 링크](https://www.acmicpc.net/problem/23927)

### 성능 요약

시간 제한: 서브태스크 참고 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 47, 정답: 28, 맞힌 사람: 24, 정답 비율: 60.000%

### 분류

수학, 삼분 탐색

### 문제 설명

<p>On a far away planet, rugby is played in the two dimensional Cartesian coordinate system without bounds. The players can occupy integer grid points only and they can move to the neighboring grid points in any of the four cardinal directions. Specifically, if a player is currently at the point (X, Y), then they can move to either of the points (X+1, Y), (X-1, Y), (X, Y+1), or (X, Y-1) in a single step.</p>

<p>After the game,&nbsp;<b>N</b>&nbsp;players are scattered throughout the coordinate system such that any grid point is empty or occupied by one or more players. They want to gather for a picture and form a perfect horizontal line of&nbsp;<b>N</b>&nbsp;grid points, one player per point, all occupied points next to each other. Formally, the players have to move so as to occupy the grid points (X, Y), (X+1, Y), (X+2, Y), ..., (X+<b>N</b>-1, Y) for some coordinates X and Y. What is the minimum total number of steps the players should make to form a perfect line if they are free to choose the position of the line in the coordinate system and the ordering of players is not important?</p>

### 입력

<p>The first line of the input gives the number of test cases&nbsp;<b>T</b>.&nbsp;<b>T</b>&nbsp;test cases follow. The first line of each test case gives the number of players&nbsp;<b>N</b>. The subsequent&nbsp;<b>N</b>&nbsp;lines give the initial coordinates of the players. The i-th of these lines contains two integers&nbsp;<b>X<sub>i</sub></b>&nbsp;and&nbsp;<b>Y<sub>i</sub></b>, which describe the initial position of i-th player (1 &le; i &le;&nbsp;<b>N</b>).</p>

### 출력

<p>For each test case, output one line containing&nbsp;<code>Case #x: y</code>, where&nbsp;<code>x</code>&nbsp;is the test case number (starting from 1) and&nbsp;<code>y</code>&nbsp;is the minimum total number of steps that the players need to make in order to form a perfect horizontal line.</p>

### 제한

<ul>
	<li>1 &le;&nbsp;<b>T</b>&nbsp;&le; 100.</li>
</ul>

### 힌트

<p>In the first test case, one of many optimal solutions is obtained by the second player moving two steps to the left and three steps down to the point (2, 1).</p>

<p>In the second test case, a perfect line can be formed with a total of four steps if the first player moves to the point (0, 2) and the third player moves to the point (2, 2).</p>