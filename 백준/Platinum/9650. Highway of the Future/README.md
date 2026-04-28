# [Platinum I] Highway of the Future - 9650

[문제 링크](https://www.acmicpc.net/problem/9650)

### 성능 요약

시간 제한: 10 초, 메모리 제한: 128 MB

### 통계

제출: 62, 정답: 9, 맞힌 사람: 9, 정답 비율: 21.951%

### 분류

(분류 없음)

### 문제 설명

<p>It is the year 23413 and the quantum road authority (QRA) needs your help designing a new quantum highway. The biggest difference between a quantum highway and a regular highway is that quantum cars can switch lanes instantly, i.e. at t<sub>1</sub> a quantum car can be in one lane, while (as long as t<sub>1</sub> &ne; t<sub>2</sub>) at t<sub>2</sub> it can be in another.</p>

<p>Of course, in the year 23413 the future prediction authority (FPA) has information on exactly who will be using this new highway. For each quantum car that will travel along your quantum highway, the FPA supplies you with a value t, which is the time at which the quantum car will enter your highway, and a value v which represents the speed at which the quantum car will travel along your quantum highway.</p>

<p>The length of your highway will be 100 length units. In one time unit, a quantum car going at a speed of v speed units, will have travelled exactly v length units. The size of a quantum car is negligible compared to the length of your highway; it should be considered as a point.</p>

<p>Your job is to make sure that there will be no collisions on this quantum highway. Quantum cars are equipped with very sophisticated collision prevention mechanisms: as long as there are enough lanes in your quantum highway, cars will &ldquo;magically&rdquo; switch lanes to avoid collisions. A collision still occurs if, at any time, the number of cars at a particular position along the highway exceeds the number of lanes. Such collisions can happen even at the exact begin or end of the highway, as the sample cases illustrate.</p>

<p>What is the least number of lanes required to make sure there will be no collisions?</p>

### 입력

<p>For each test case:</p>

<ul>
	<li>A line containing one integer n (1 &le; n &le; 35 000): the number of quantum cars that will travel on your highway.</li>
	<li>n lines containing two integers:
	<ul>
		<li>t<sub>i</sub>: the time at which quantum car i enters your quantum highway (1 &le; t<sub>i</sub> &le; 10 000).</li>
		<li>v<sub>i</sub>: the speed of quantum car i (1 &le; v<sub>i</sub> &le; 100).</li>
	</ul>
	</li>
</ul>

### 출력

<p>For each test case, print one line containing one integer: the number of lanes required to make sure there will be no collisions.</p>