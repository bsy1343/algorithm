# [Gold III] Subway - 4372

[문제 링크](https://www.acmicpc.net/problem/4372)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 5, 정답: 4, 맞힌 사람: 4, 정답 비율: 100.000%

### 분류

수학

### 문제 설명

<p>Subway trains are meant to move people as quickly, safely, and comfortably as possible from station to station. Although the train drivers&#39; unions may not agree, computer operated trains accomplish these goals more effectively than human operated trains. You are to determine the optimal control strategy to move the train from one station to another within the constraints imposed by safety and comfort considerations, as well as the physical limitations of the train itself.<br />
The parameters to the problem are all positive integers not greater than 1000.</p>

<ul>
	<li>d - the distance between stations, in metres</li>
	<li>m - the maximum allowable speed of the train, in metres/sec</li>
	<li>a - the maximum absolute acceleration of the train, in metres/sec<sup>2</sup></li>
	<li>j - the maximum absolute jerk, in metres/sec<sup>3</sup></li>
</ul>

<p>The train must be completely stopped at each station and must move in one direction at speeds not exceeding m. Acceleration can be positive (forward) or negative (backwards) but its absolute value must not exceed a. The last parameter, jerk, is the rate of change of acceleration in either direction. That is, acceleration cannot increase or decrease at greater than this rate. This parameter prevents toppling the standing passengers.</p>

### 입력

<p>There are several test cases. For each test case, standard input has a single line with d, m, a, j.&nbsp;</p>

### 출력

<p>For each test case, standard output should contain a single line giving the minimum time in seconds, to the nearest 0.1 second, required to move between the stations.</p>