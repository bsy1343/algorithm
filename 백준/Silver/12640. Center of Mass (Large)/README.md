# [Silver I] Center of Mass (Large) - 12640

[문제 링크](https://www.acmicpc.net/problem/12640)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 176, 정답: 63, 맞힌 사람: 56, 정답 비율: 38.621%

### 분류

수학, 기하학, 삼분 탐색, 물리학

### 문제 설명

<p>You are studying a swarm of&nbsp;<strong>N</strong>&nbsp;fireflies. Each firefly is moving in a straight line at a constant speed. You are standing at the center of the universe, at position&nbsp;(0, 0, 0). Each firefly has the same mass, and you want to know how close the center of the swarm will get to your location (the origin).</p>

<p>You know the position and velocity of each firefly at t = 0, and are only interested in&nbsp;t &ge; 0. The fireflies have constant velocity, and may pass freely through all of space, including each other and you. Let M(t) be the location of the center of mass of the&nbsp;<strong>N</strong>&nbsp;fireflies at time t. Let d(t) be the distance between your position and M(t) at time t. Find the minimum value of d(t), d<sub>min</sub>, and the earliest time when d(t) = d<sub>min</sub>, t<sub>min</sub>.</p>

### 입력

<p>The first line of input contains a single integer&nbsp;<strong>T</strong>, the number of test cases. Each test case starts with a line that contains an integer&nbsp;<strong>N</strong>, the number of fireflies, followed by&nbsp;<strong>N</strong>&nbsp;lines of the form</p>

<pre>
x y z vx vy vz</pre>

<p>Each of these lines describes one firefly: (x, y, z) is its initial position at time t = 0, and (vx, vy, vz) is its velocity.</p>

<p>Limits</p>

<ul>
	<li>All the numbers in the input will be integers.</li>
	<li>1 &le;&nbsp;<strong>T</strong>&nbsp;&le; 100</li>
	<li>The values of x, y, z, vx, vy and vz will be between -5000 and 5000, inclusive.</li>
	<li>3 &le;&nbsp;<strong>N</strong>&nbsp;&le; 500</li>
</ul>

### 출력

<p>For each test case, output</p>

<pre>
Case #X: d<sub>min</sub> t<sub>min</sub></pre>

<p>where&nbsp;<strong>X</strong>&nbsp;is the test case number, starting from 1. Any answer with absolute or relative error of at most 10<sup>-5</sup>&nbsp;will be accepted.</p>

### 힌트

<p>Given&nbsp;<strong>N</strong>&nbsp;points (x<sub>i</sub>, y<sub>i</sub>, z<sub>i</sub>), their center of the mass is the point (x<sub>c</sub>, y<sub>c</sub>, z<sub>c</sub>), where:</p>

<pre>
x<sub>c</sub> = (x<sub>1</sub> + x<sub>2</sub> + ... + x<sub>N</sub>) / N
y<sub>c</sub> = (y<sub>1</sub> + y<sub>2</sub> + ... + y<sub>N</sub>) / N
z<sub>c</sub> = (z<sub>1</sub> + z<sub>2</sub> + ... + z<sub>N</sub>) / N</pre>