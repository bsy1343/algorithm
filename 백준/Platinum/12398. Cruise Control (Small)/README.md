# [Platinum III] Cruise Control (Small) - 12398

[문제 링크](https://www.acmicpc.net/problem/12398)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 33, 정답: 5, 맞힌 사람: 4, 정답 비율: 100.000%

### 분류

다이나믹 프로그래밍, 정렬, 비트마스킹, 스위핑, 비트필드를 이용한 다이나믹 프로그래밍

### 문제 설명

<p><em>Cruise control</em>&nbsp;is a system that allows a car to go at a constant speed, while the driver controls only the steering wheel. The driver can, of course, turn off the cruise control to avoid collisions.&nbsp;</p>

<p>In this problem, we will consider a one-way road with two lanes, and&nbsp;<strong>N</strong>&nbsp;cars using cruise control on the road. Each car is 5 meters long and goes at some constant speed. A car can change lanes at any time if it would not cause the car to collide with some other car (touching does not count as collision). Assume that changing lanes is instantaneous and simply causes the car to switch to the other lane. We are interested in whether any driver will have to turn off cruise control eventually to avoid a collision, or is it possible for all of them to drive (possibly switching lanes, but at constant speed) without collisions indefinitely. Note that even though changing lanes is instantaneous, two cars driving side by side&nbsp;<em>cannot</em>&nbsp;exchange places by changing lanes at the same time.</p>

### 입력

<p>The first line of the input file gives the number of test cases,&nbsp;<strong>T</strong>.&nbsp;&nbsp;<strong>T</strong>&nbsp;test cases follow. Each test case begins with the number&nbsp;<strong>N</strong>.&nbsp;<strong>N</strong>&nbsp;lines follow, each describing a single car. Each line contains a character&nbsp;<strong>C<sub>i</sub></strong>&nbsp;(denoting whether the car is initially in the left or the right lane), two integers describing the speed&nbsp;<strong>S<sub>i</sub></strong>&nbsp;of the car (in meters per second), and the initial position&nbsp;<strong>P<sub>i</sub></strong>&nbsp;of the car (in meters), denoting the distance between the rear end of the car and some fixed line across the road. All the cars are moving away from this line, and no car is behind the line.</p>

<h3>Limits</h3>

<ul>
	<li>1 &le;&nbsp;<strong>T</strong>&nbsp;&le; 30.&nbsp;</li>
	<li>1 &le;&nbsp;<strong>S<sub>i</sub></strong>&nbsp;&le; 1000.&nbsp;</li>
	<li>0 &le;&nbsp;<strong>P<sub>i</sub></strong>&nbsp;&le; 10000.&nbsp;</li>
	<li>Each of the&nbsp;<strong>C<sub>i</sub></strong>&nbsp;characters will be either&nbsp;<em>L</em>, denoting the left lane, or&nbsp;<em>R</em>, denoting the right lane.</li>
	<li>Initially the cars&#39; positions are such that they do not collide, that is, if two cars&nbsp;<em>i</em>&nbsp;and&nbsp;<em>j</em>&nbsp;have the same initial starting lane (that is,&nbsp;<em>C<sub>i</sub>&nbsp;= C<sub>j</sub></em>), then&nbsp;<em>|P<sub>i</sub>&nbsp;- P<sub>j</sub>| &ge; 5</em>.</li>
	<li>1 &le;&nbsp;<strong>N</strong>&nbsp;&le; 6.</li>
</ul>

### 출력

<p>For each test case output one line containing &quot;Case #x: y&quot;, where x is the case number (starting from 1) and y is either the word &quot;Possible&quot; (quotes for clarity only), if the cars can drive at the given constant speeds indefinitely, or the maximum number of seconds they can drive before somebody has to change speed to avoid a collision. Answers accurate to within 10<sup>-5</sup>&nbsp;absolute or relative error will be accepted.</p>

### 힌트

<p>In the first case, the faster car can shift over to the right lane and easily overtake the slower one. In the second case, the two cars driving side-by-side at 100 m/s will reach the car going 50 m/s in 10 seconds, and somebody will have to change speed, as both lanes will be blocked.</p>