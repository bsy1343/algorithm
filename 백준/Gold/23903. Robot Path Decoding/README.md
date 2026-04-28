# [Gold III] Robot Path Decoding - 23903

[문제 링크](https://www.acmicpc.net/problem/23903)

### 성능 요약

시간 제한: 10 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 21, 정답: 19, 맞힌 사람: 18, 정답 비율: 90.000%

### 분류

수학, 구현, 자료 구조, 문자열, 시뮬레이션, 파싱, 스택

### 문제 설명

<p>Your country&#39;s space agency has just landed a rover on a new planet. The planet&#39;s surface can be thought of as a grid of squares containing 10<sup>9</sup>&nbsp;columns (numbered starting from 1 from west to east) and 10<sup>9</sup>&nbsp;rows (numbered starting from 1 from north to south). Let (w, h) denote the square in the w-th column and the h-th row. The rover begins on the square (1, 1).</p>

<p>The rover can be maneuvered around on the surface of the planet by sending it a&nbsp;<i>program</i>, which contains a string of characters representing movements in the four cardinal directions. The robot executes each character of the string in order. The rover moves according to the following rules:</p>

<ul>
	<li><code>N</code>: Move one unit north.</li>
	<li><code>S</code>: Move one unit south.</li>
	<li><code>E</code>: Move one unit east.</li>
	<li><code>W</code>: Move one unit west.</li>
</ul>

<p>There is also a special instruction&nbsp;<code>X(Y)</code>, where&nbsp;<code>X</code>&nbsp;is a number between 2 and 9 (inclusive) and&nbsp;<code>Y</code>&nbsp;is a non-empty subprogram. This denotes that the robot should repeat the subprogram&nbsp;<code>Y</code>&nbsp;a total of&nbsp;<code>X</code>&nbsp;times. For example:</p>

<ul>
	<li><code>2(NWE)</code>&nbsp;is equivalent to&nbsp;<code>NWENWE</code>.</li>
	<li><code>3(S2(E))</code>&nbsp;is equivalent to&nbsp;<code>SEESEESEE</code>.</li>
	<li><code>EEEE4(N)2(SS)</code>&nbsp;is equivalent to&nbsp;<code>EEEENNNNSSSS</code>.</li>
</ul>

<p>Since the planet is a spheroid, the first and last columns are adjacent, so moving east from column 10<sup>9</sup>&nbsp;will move the rover to column 1 and moving south from row 10<sup>9</sup>&nbsp;will move the rover to row 1. Similarly, moving west from column 1 will move the rover to column 10<sup>9</sup>&nbsp;and moving north from row 1 will move the rover to row 10<sup>9</sup>. Given a program that the robot will execute, determine the final position of the robot after it has finished all its movements.</p>

### 입력

<p>The first line of the input gives the number of test cases,&nbsp;<b>T</b>.&nbsp;<b>T</b>&nbsp;lines follow. Each line contains a single string: the program sent to the rover.</p>

### 출력

<p>For each test case, output one line containing&nbsp;<code>Case #x: w h</code>, where&nbsp;<code>x</code>&nbsp;is the test case number (starting from 1) and&nbsp;<code>w h</code>&nbsp;is the final square (w, h) the rover finishes in.</p>

### 제한

<ul>
	<li>1 &le;&nbsp;<b>T</b>&nbsp;&le; 100.</li>
	<li>The string represents a valid program.</li>
	<li>The length of each program is between 1 and 2000 characters inclusive.</li>
</ul>

### 힌트

<p>In Sample Case #1, the rover moves three units south, then three units east.</p>

<p>In Sample Case #2, the rover moves one unit north. Since the planet is a torus, this moves it into row 10<sup>9</sup>.</p>

<p>In Sample Case #3, the program given to the rover is equivalent to&nbsp;<code>NSSSNEEN</code>.</p>

<p>In Sample Case #4, the program given to the rover is equivalent to&nbsp;<code>NWNWNWWEEEEWWEEEEWNWNWNWWEEEEWWEEEEW</code>.</p>