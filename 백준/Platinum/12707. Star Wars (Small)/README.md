# [Platinum IV] Star Wars (Small) - 12707

[문제 링크](https://www.acmicpc.net/problem/12707)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 29, 정답: 19, 맞힌 사람: 19, 정답 비율: 70.370%

### 분류

이분 탐색, 기하학, 3차원 기하학, 수학, 매개 변수 탐색, 스위핑, 삼분 탐색

### 문제 설명

<p>Near the planet Mars, in a faraway galaxy eerily similar to our own, there is a fight to the death between the imperial forces and the rebels. The rebel army has&nbsp;<strong>N</strong>&nbsp;ships which we will consider as points&nbsp;<em>(x<sub>i</sub>, y<sub>i</sub>, z<sub>i</sub>)</em>. Each ship has a receiver with power&nbsp;<strong>p<sub>i</sub></strong>. The rebel army needs to be able to send messages from the central cruiser to all the ships, but they are tight on finances, so they cannot afford a strong transmitter.</p>

<p>If the cruiser is placed at&nbsp;<em>(x, y, z)</em>, and one of the other ships is at&nbsp;<em>(x<sub>i</sub>, y<sub>i</sub>, z<sub>i</sub>)</em>&nbsp;and has a receiver of power&nbsp;<strong>p<sub>i</sub></strong>, then the power of the cruiser&#39;s transmitter needs to be at least:</p>

<pre>
<code>(|x<sub>i</sub> - x| + |y<sub>i</sub> - y| + |z<sub>i</sub> - z|) / p<sub>i</sub>
</code></pre>

<p>Your task is to find the position for the cruiser that minimizes the power required for its transmitter, and to output that power.</p>

### 입력

<p>The first line of input gives the number of cases,&nbsp;<strong>T</strong>.&nbsp;<strong>T</strong>&nbsp;test cases follow.</p>

<p>Each test case contains on the first line the integer&nbsp;<strong>N</strong>, the number of ships in the test case.&nbsp;</p>

<p><strong>N</strong>&nbsp;lines follow, each line containing four integer numbers&nbsp;<strong>x<sub>i</sub></strong>,&nbsp;<strong>y<sub>i</sub></strong>,&nbsp;<strong>z<sub>i</sub></strong>&nbsp;and&nbsp;<strong>p<sub>i</sub></strong>, separated by single spaces. These are the coordinates of the i-th ship, and the power of its receiver. There may be more than one ship at the same coordinates.</p>

<p>Limits</p>

<ul>
	<li>1 &le;&nbsp;<strong>T</strong>&nbsp;&le; 10</li>
	<li>0 &le;&nbsp;<strong>x<sub>i</sub></strong>,&nbsp;<strong>y<sub>i</sub></strong>,&nbsp;<strong>z<sub>i</sub></strong>&nbsp;&le; 10<sup>6</sup></li>
	<li>1 &le;&nbsp;<strong>p<sub>i</sub></strong>&nbsp;&le; 10<sup>6</sup></li>
	<li>1 &le;&nbsp;<strong>N</strong>&nbsp;&le; 10</li>
</ul>

### 출력

<p>For each input case, you should output:</p>

<pre>
Case #<strong>X</strong>: <strong>Y</strong></pre>

<p>where&nbsp;<strong>X</strong>&nbsp;is the number of the test case and&nbsp;<strong>Y</strong>&nbsp;is the minimal power that is enough to reach all the fleet&#39;s ships. Answers with a relative or absolute error of at most 10<sup>-6</sup>&nbsp;will be considered correct.</p>

### 힌트

<p>In the first test case, the four ships have coordinates (0, 0, 0), (1, 2, 0), (3, 4, 0), (2, 1, 0) and powers 1, 1, 1, 1 respectively. We can place a cruiser with the power 3.5 at the coordinates (1.5, 2, 0) which will be able to reach all the ships.</p>

<p>In the second case we can place the cruiser right on top of the ship, with transmitter power 0.</p>